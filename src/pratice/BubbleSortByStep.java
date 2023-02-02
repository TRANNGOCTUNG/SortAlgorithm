package pratice;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size:");
        int size = scanner.nextInt();
        int [] list = new int[size];
        System.out.println("Enter: " + list.length + " Value");

        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
            System.out.println(Arrays.toString(list));
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
}
