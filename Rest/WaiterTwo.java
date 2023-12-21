package Rest;

public class WaiterTwo extends Waiter {
    int experienceYears;

    public WaiterTwo(String name, int experienceYears) {
        super(name); 
        this.experienceYears = experienceYears;
    }

    @Override
    public void serveTable(int tableNumber) {
        System.out.println("WaiterTwo " + name + " with " + experienceYears + " years of experience is serving table " + tableNumber);
    }

    @Override
    public void additionalMethod() {
        System.out.println("WaiterTwo " + name + " has overridden the additional method");
    }
}


