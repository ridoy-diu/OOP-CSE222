package lab_task;

import java.util.Scanner;

public class Problem04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (int i = 1; i <= row; ++i) {
            for (int j = 1; j <= row; ++j) {
                if (i + j <= row) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int j = 2; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
