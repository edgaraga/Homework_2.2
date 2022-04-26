public class Main {
    public static void main(String[] args) {

        int initialAccount = 200; //начальный счет
        int depositAmount = 1387; //сумма пополнения
        int bonusAmount; //сумма бонуса
        int finalScore;  //итоговый счет

        if (depositAmount > 1000) {
            finalScore = initialAccount + depositAmount + depositAmount / 100;
            bonusAmount = depositAmount / 100;
        } else {
            finalScore = initialAccount + depositAmount;
            bonusAmount = 0;
        }
        System.out.println("На вашем счете: " + finalScore + "р");
        System.out.println("Сумма бонусов: " + bonusAmount + "р");
    }
}
