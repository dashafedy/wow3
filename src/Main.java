public class Main {

    public static void main(String[] args) {
        int amount = 1100;
        int add = 1500;


        int bonus = add > 1000 ? add / 100 : 0;
        int finalAmount = amount + add + bonus;


        System.out.println(" Итоговый счет = " + finalAmount);
        System.out.println(" Бонус = " + bonus);

    }
}

