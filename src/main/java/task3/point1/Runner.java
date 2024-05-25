package task3.point1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> strList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            strList.add(scanner.nextLine());
        }

        strList.sort(null);
        String maxStr = strList.get(2);
        String minStr = strList.get(0);

        System.out.println("max:");
        System.out.println(maxStr + "\nlength = " + maxStr.length());
        System.out.println("\nmin:");
        System.out.println(minStr + "\nlength = " + minStr.length());
    }
}
