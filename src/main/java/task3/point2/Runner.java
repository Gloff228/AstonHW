package task3.point2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int avgLength = 0;
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String newLine = scanner.nextLine();
            avgLength += newLine.length();
            strList.add(newLine);
        }
        avgLength /= 3;

        for (String str : strList) {
            if (str.length() < avgLength) {
                System.out.println(str + "\nlength = " + str.length());
            }
        }
    }
}