package Rest;

public class Waiter {
    final String NAME = "Захар";
    final int AGE = 24;
    final double SALARY = 19000;


    public void infoWaiter() {
        System.out.println("Привіт, мене звати " + NAME + ".");
        System.out.println("Мені " + AGE + " роки.");
    }
    public void guestService() {
        final int N = 10; // к-ксть гостей
        final String MASSAGE = "Ласкаво просимо до нашого ресторану!";
        System.out.println(MASSAGE + " Ми обслуговуємо " + N + " гостей.");
    }
}