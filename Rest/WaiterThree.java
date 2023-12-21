package Rest;

public class WaiterThree extends Waiter {
    boolean isSenior;

    public WaiterThree(String name, boolean isSenior) {
        super(name); // Виклик конструктора батьківського класу
        this.isSenior = isSenior;
    }

    @Override
    public void serveTable(int tableNumber) {
        System.out.println("WaiterThree " + name + " is serving table " + tableNumber);
    }

    @Override
    public void additionalMethod() {
        System.out.println("WaiterThree " + name + " has overridden the additional method");
    }
}
