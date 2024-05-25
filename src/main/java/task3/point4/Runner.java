package task3.point4;

import java.util.*;

class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String newLine = scanner.nextLine();
        StringBuffer buffer = new StringBuffer();

        for (char c : newLine.toCharArray()) {
            buffer.append(c).append(c);
        }

        System.out.println(buffer);
    }
}