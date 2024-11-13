package lab_task;

class Deposit {

    String name, note, date;
    int amount;

    Deposit(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    Deposit(String name, int amount, String note) {
        this.name = name;
        this.amount = amount;
        this.note = note;
    }

    Deposit(String name, int amount, String note, String date) {
        this.name = name;
        this.amount = amount;
        this.note = note;
        this.date = date;
    }

    void display() {
        System.out.println("------------------");
        System.out.println("Account Name: " + name);
        System.out.println("Deposited: " + amount + " BDT");
        System.out.println("Note: " + note);
        System.out.println("Date: " + date);
    }
}

public class Problem06 {

    public static void main(String[] args) {
        Deposit sd = new Deposit("Ema", 50000);
        sd.display();
        Deposit d1 = new Deposit("Ema", 25000, "Performance bonus");
        d1.display();
        Deposit d2 = new Deposit("Ema", 1300, "Birthday gift from Aunt Lucy", "2024-09-10");
        d2.display();

        System.out.println();
    }
}
