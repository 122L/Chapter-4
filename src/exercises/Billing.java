package exercises;

public class Billing {
    public static void main(String [] args) {
        double bill;

        bill = computeBilling.computeBilling(12,5,.2);
        display(bill);

    }
    public static void display(double bill) {
        System.out.println("" + bill);
    }
}
