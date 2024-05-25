package task3.point3;

import java.util.*;

class Runner {

    private static boolean hasAllUniqueCharacters(String str) {

        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        return set.size() == str.length();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String newLine = scanner.nextLine();

            if (hasAllUniqueCharacters(newLine)) {
                System.out.println("word - " + newLine);
                return;
            }
        }
        System.out.println("There are no such words");
    }
}