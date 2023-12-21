package Rest;

 class Waiter implements WaiterService {
     String name;

     public Waiter(String name) {
         this.name = name;
     }

     @Override
     public void serveTable(int tableNumber) {
         System.out.println("WaiterOne " + name + " is serving table " + tableNumber);
     }

     @Override
     public void greetCustomer() {
         System.out.println("WaiterOne " + name + " is greeting the customer");
     }

     public void additionalMethod() {
         System.out.println("WaiterOne " + name + " has an additional method");
     }
 }


