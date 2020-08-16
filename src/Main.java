public class Main {
    public static void main(String[] args) {
       int present = (int) 1;
       long amount = 800;
       long bonus = (long) ((amount * present) / 100);
       long limit = 1000;
        if (amount > limit) {
           amount = limit;
            System.out.println(bonus);

        }

    }


}
