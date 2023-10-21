package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        while (input != 42) {
            input = scanner.nextInt();
            if (input != 42) {
                System.out.println(input);
            }
        }
    }
}