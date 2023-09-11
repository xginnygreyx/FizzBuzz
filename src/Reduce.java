public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int cntr = 0;
        do{
            if (n%2 == 0)
            {
                n = n/2;
                cntr++;
            }
            else {
                n = n -1;
                cntr++;
            }

        }while (n>0);
        System.out.println("It took us " +cntr+ " steps to get from 100 to 0.");
    }
}
