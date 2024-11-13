package lab_task;

// Subtract two numbers.
import java.util.Scanner;

public class Problem02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a - b);
        sc.close();
    }
}
