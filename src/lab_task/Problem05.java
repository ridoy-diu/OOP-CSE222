package lab_task;

// Get User input in this code-
import java.util.Scanner;

class Teacher {

    String name = "Noori";
    int age = 50;
    private int salary = 2000000000;

    public void showName() {
        System.out.println(name);
    }

    public void showAge() {
        System.out.println(age);
    }

    public void getSalary() {
        System.out.println(salary);
    }

    public void setSalary(int s) {
        salary = s;
    }
}

class Student {

    String name = "Sourav";
    int age = 23;
    double cgpa = 4.00;

    public void showName() {
        System.out.println(name);
    }

    public void showAge() {
        System.out.println(age);
    }

    public void showCgpa() {
        System.out.println(cgpa);
    }
}

public class Problem05 {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Student s1 = new Student();

        System.out.println("---Before taking input---");
        t1.showName();
        t1.showAge();
        t1.getSalary();
        s1.showName();
        s1.showAge();
        s1.showCgpa();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Teacher's name, age & salary - ");
        t1.name = sc.nextLine();
        t1.age = sc.nextInt();
        sc.nextLine();
        t1.setSalary(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter Student's name, age & cgpa - ");
        s1.name = sc.nextLine();
        s1.age = sc.nextInt();
        s1.cgpa = sc.nextDouble();

        System.out.println("---After taking input---");

        t1.showName();
        t1.showAge();
        t1.getSalary();
        s1.showName();
        s1.showAge();
        s1.showCgpa();

        sc.close();
    }
}
