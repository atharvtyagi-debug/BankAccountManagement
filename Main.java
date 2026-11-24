
public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(101, "Atharv", 5000);
        BankAccount acc2 = new BankAccount(102, "Rahul", 3000);

        System.out.println("Account 1");
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.displayDetails();

        System.out.println("\nAccount 2");
        acc2.deposit(1500);
        acc2.withdraw(500);
        acc2.displayDetails();
    }
}
