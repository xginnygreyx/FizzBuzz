public class Multiples {
    public static void main(String[] args) {
        int cntr = 0;
        for (int i = 0; i <= 1000; i += 1) {
            if (i % 3 == 0 | i % 5 == 0) {
                cntr++;
            }
        }
        System.out.println("There are " + cntr + " multiples of 3 and 5 under 1000.");
    }
}
