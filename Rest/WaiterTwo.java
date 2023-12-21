package Rest;

public class WaiterTwo extends Waiter{
    // Додаткові змінні класу WaiterTwo
    int experienceYears;

    // Конструктор класу WaiterTwo
    public WaiterTwo(String name, int experienceYears) {
        super(name); // Виклик конструктора батьківського класу
        this.experienceYears = experienceYears;
    }

    // Перевантажений метод з інтерфейсу для обслуговування столів
    @Override
    public void serveTable(int tableNumber) {
        System.out.println("WaiterTwo " + name + " with " + experienceYears + " years of experience is serving table " + tableNumber);
    }

    // Перевизначений метод з класу WaiterOne
    @Override
    public void additionalMethod() {
        System.out.println("WaiterTwo " + name + " has overridden the additional method");
    }
}


