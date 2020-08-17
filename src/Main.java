public class Main {
    public static void main(String[] args) {
        int A = 100;   // Было
        int amount = 1100;  // Добавил
        int total;       // Итого
        int bonus;       // Бонус
        if (amount > 1000) {
            bonus = amount / 100;
            total = A + amount + bonus;
            System.out.println("Бонус" +total);
        } else {
            System.out.println("Бонус" +0);


        }


    }

    }

