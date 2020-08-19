public class Main {
    public static void main(String[] args) {
        int balans = 100;   // Было
        int amount = 1100;  // Добавил
        int total;       // Итого
        int bonus = 0;       // Бонус
        if (amount > 1000) {
            bonus = amount / 100;
            total = balans + amount + bonus;
            System.out.println(bonus);
        } else {
            System.out.println(bonus + 0);
        }


        }


    }



