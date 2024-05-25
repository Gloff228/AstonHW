package task4.point1;

import java.util.ArrayList;
import java.util.List;

class Runner {

    public static void main(String[] args) {
        // Создаем коллекцию
        List<String> countryList = new ArrayList<>();

        // Добавляем 3 страны
        countryList.add("Russia");
        countryList.add("China");
        countryList.add("Japan");
        System.out.println(countryList);

        // Заменяем 2 элемент
        countryList.set(1, "USA");
        System.out.println(countryList);

        // Удаляем 2 элемент
        countryList.remove(1);
        System.out.println(countryList);

        // Удаляем по значению
        countryList.remove("Japan");
        System.out.println(countryList);

        // Выводим индекс
        System.out.println(countryList.indexOf("Russia"));

        // Проверяем, содержится ли элемент в коллекции
        System.out.println(countryList.contains("Russia"));
    }
}
