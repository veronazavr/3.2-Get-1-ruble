public class Main {
    public static void main(String[] args) {
       int precent = (int) 0.1;
       long amount = 1000;
       long bonus = amount * precent / 100;
       long limit = 1000;
       if (amount > limit) {
           amount = limit;
       }

    }
}
