public class main {
    public static void main(String[] args) {
        int amount = 1100; // клиент пополнил счет
        boolean isPaid = true;

        int bonus = isPaid ? 100 : 0;
        int account = amount / bonus;


        System.out.println(" Итоговый счет = " + (amount + bonus + account));
        System.out.println(" Бонус = " + (account));

    }
}

