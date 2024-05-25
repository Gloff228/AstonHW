package task4.point2;


import java.util.LinkedList;

class Runner {

    public static void main(String[] args) {
        // Создаем список
        LinkedList<String> countryList = new LinkedList<>();

        // Добавляем страны
        countryList.addFirst("Russia");
        countryList.addFirst("USA");
        countryList.addLast("Japan");
        countryList.addLast("China");
        System.out.println(countryList);

        // Удаляем из начала и из конца списка
        countryList.removeFirst();
        countryList.removeLast();
        System.out.println(countryList);

        // Выводим элемент из начала и конца
        System.out.println("First - " + countryList.getFirst());
        System.out.println("Last - " + countryList.getLast());
    }
}
