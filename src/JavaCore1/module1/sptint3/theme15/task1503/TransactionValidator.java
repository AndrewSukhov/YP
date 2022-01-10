package JavaCore1.module1.sptint3.theme15.task1503;

public class TransactionValidator {
    // объявите константы
    public static final Double MIN_AMOUNT = 1d;
    public static final Double MAX_AMOUNT = 5000d;

    // объявите метод isValidAmount()
    public static boolean isValidAmount(double amount){
        // внутри метода добавьте проверки на минимальную и максимальную сумму перевода
        if (amount < MIN_AMOUNT){
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        } else if (amount > MAX_AMOUNT){
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        } else {
            return true;
        }
    }
}
