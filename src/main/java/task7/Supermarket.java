package task7;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Supermarket {

    private static final Random random = new Random();
    private final ExecutorService executor = Executors.newCachedThreadPool();
    private final Map<String, Integer> goods;

    public Supermarket() {
        this.goods = Map.of(
                "Помидор", 10,
                "Огурец", 5,
                "Хлеб", 15,
                "Колбаса", 20,
                "Сок", 30,
                "Яблоко", 3
        );
    }

    public void open() {
        System.out.println("Магазин открылся");
        int sleepSecondsCount = 120;

        for (int i = 0; i < sleepSecondsCount; i++) {
            int buyersCount = random.nextInt(3);

            for (int j = 0; j < buyersCount; j++) {
                Buyer buyer = new Buyer(this.goods);
                executor.submit(buyer::enterToMarket);
            }

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        close();
    }

    private void close() {
        System.out.println("Магазин закрывается");
        executor.shutdown();

        try {
            if (!executor.awaitTermination(30, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Магазин закрылся");
    }
}
