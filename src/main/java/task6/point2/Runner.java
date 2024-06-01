package task6.point2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class Runner {

    private static String readLineFromConsole() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    private static void writeMessageInFile(String message, String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write(message.getBytes());

        fos.close();
    }

    private static void readMessageFromFile(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        String message = new String(fis.readAllBytes()).replaceAll(" ", "_");
        System.out.println(message);

        fis.close();
    }

    public static void main(String[] args) throws IOException {
        String message = readLineFromConsole();

        String filename = "tms.txt";
        writeMessageInFile(message, filename);
        readMessageFromFile(filename);
    }
}
