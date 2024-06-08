package task7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

class Buyer implements IBuyer, IUseBasket {

    private static final AtomicInteger buyersCount = new AtomicInteger(0);
    private final int buyerID;
    private Map<String, Integer> chosenGoods;
    private Map<String, Integer> availableGoods;
    private final Random random = new Random();

    public Buyer() {
        this.buyerID = buyersCount.getAndIncrement();
    }

    private void waitRandomTime() {
        try {
            Thread.sleep((long) (random.nextDouble(0.5, 2.0) * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterToMarket() {
        waitRandomTime();
        System.out.println("Buyer " + this.buyerID + " entered");

        takeBasket();
        searchForGoods();

        for (int i = 0; i < random.nextInt(1, 5); i++) {
            chooseGoods();
        }

        putGoodsToBasket();
        goOut();
    }

    public void searchForGoods() {
        this.availableGoods = Map.of(
                "Помидор", 10,
                "Огурец", 5,
                "Хлеб", 15,
                "Колбаса", 20,
                "Сок", 30,
                "Яблоко", 3);
    }

    @Override
    public void chooseGoods() {
        waitRandomTime();
        List<String> goodsNames = availableGoods.keySet().stream().toList();
        String randomGoodName = goodsNames.get(random.nextInt(goodsNames.size()));
        Integer randomGoodPrice = availableGoods.get(randomGoodName);

        chosenGoods.put(randomGoodName, randomGoodPrice);

        System.out.println("Buyer " + this.buyerID + " chose the good - " + randomGoodName);
    }

    @Override
    public void goOut() {
        waitRandomTime();
        System.out.println(
                "Buyer " + this.buyerID + " paid " + chosenGoods
                        .values()
                        .stream()
                        .reduce(Integer::sum)
                        .orElse(0)
        );
        System.out.println("Buyer " + this.buyerID + " came out");
    }

    @Override
    public void takeBasket() {
        waitRandomTime();
        this.chosenGoods = new HashMap<>();
        System.out.println("Buyer " + this.buyerID + " took basket");
    }

    @Override
    public void putGoodsToBasket() {
        waitRandomTime();
        System.out.println("Buyer " + this.buyerID + " put all goods to basket");
    }
}
