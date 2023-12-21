package Rest;

public class WaiterThree extends Waiter {
    // Додаткові змінні класу WaiterThree
    boolean isSenior;

    // Конструктор класу WaiterThree
    public WaiterThree(String name, boolean isSenior) {
        super(name); // Виклик конструктора батьківського класу
        this.isSenior = isSenior;
    }

    // Перевантажений метод з інтерфейсу для обслуговування столів
    @Override
    public void serveTable(int tableNumber) {
        System.out.println("WaiterThree " + name + " is serving table " + tableNumber);
    }

    // Перевизначений метод з класу WaiterOne
    @Override
    public void additionalMethod() {
        System.out.println("WaiterThree " + name + " has overridden the additional method");
    }
}