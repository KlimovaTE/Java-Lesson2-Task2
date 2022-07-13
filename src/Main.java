public class Main {
    public static void main(String[] args) {

        int initialBalance = 10000;
        int depositAmount = 1000;
        int bonus = 0;
        int finalBalance;

        if (depositAmount >= 1000) {
            bonus = depositAmount / 100;
        }
        finalBalance = initialBalance + depositAmount + bonus;
        System.out.println("Итоговый счет: " + finalBalance + " рублей");
        System.out.println("Начислено бонусных рублей: " + bonus);
    }
}