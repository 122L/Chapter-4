package exercises;

public class computeBilling {
    final static double TAX = 1.08;



    public static double computeBilling(double amt, double quantity, double coupon) {

        double bill = amt * quantity;
        bill = bill - coupon;
        bill = bill * TAX;

        return bill;

    }
    public static double computeBilling(double amt, double quantity) {
        double bill = amt * quantity;
        bill = bill * TAX;

        return bill;

    }
    public static double computeBilling(double amt) {
        double bill = amt * TAX;
        return bill;

    }
}
