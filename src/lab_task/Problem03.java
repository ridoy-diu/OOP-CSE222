package lab_task;

// Find the remainder of two numbers.
import java.util.Scanner;

public class Problem03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        System.out.println(dividend % divisor);
        sc.close();
    }
}
