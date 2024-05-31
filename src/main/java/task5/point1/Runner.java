package task5.point1;

import java.util.ArrayList;
import java.util.List;

class Runner {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            integerList.add((int) (Math.random() * 11));
        }

        System.out.println("List - " + integerList);

        List<Integer> noDuplicatesList = integerList.stream()
                        .distinct()
                        .toList();
        System.out.println("No duplicates list - " + noDuplicatesList);

        List<Integer> evenOnlyStream = noDuplicatesList.stream()
                    .filter(el -> el % 2 == 0)
                    .toList();
        System.out.println("even numbers only - " + evenOnlyStream);

        Integer sum = evenOnlyStream.stream()
                    .reduce(Integer::sum)
                    .orElse(0);
        System.out.println("Sum - " + sum);

        // Без вывода промежуточных результатов
        Integer sum2 = integerList.stream()
                .distinct()
                .filter(el -> el % 2 == 0)
                .reduce(Integer::sum)
                .orElse(0);
        System.out.println("Sum - " + sum2);
    }
}
