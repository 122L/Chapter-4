package exercises;

public class TwoDice {

    public static void main(String[] args) {
        final int HIGHEST_DIE_VALUE = 6;
        final int LOWEST_DIE_VALUE = 1;
        int randomValue1;
        int randomValue2;

        randomValue1 = ((int)(Math.random() * 6) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
        System.out.println(randomValue1);
        randomValue2 = ((int)(Math.random() * 6) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
        System.out.println(randomValue2);
    }
}
