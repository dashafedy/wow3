public class main {
    public static void main(String[] args) {
        int amount = 1100; // клиент пополнил счет
        boolean payment = true;

        int bonus = payment ? 100 : 0;
        int x = amount / bonus;


        System.out.println( " Итоговый счет = " + (amount + bonus + x) );
        System.out.println(" Бонус = " + (x));

        }
    }

