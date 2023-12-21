package Rest;

 class Waiter implements WaiterService{
     // Змінні класу Waiter
     String name;

     // Конструктор класу WaiterOne
     public Waiter(String name) {
         this.name = name;
     }

     // Реалізація методу інтерфейсу для обслуговування столів
     @Override
     public void serveTable(int tableNumber) {
         System.out.println("WaiterOne " + name + " is serving table " + tableNumber);
     }

     // Реалізація методу інтерфейсу для вітання клієнта
     @Override
     public void greetCustomer() {
         System.out.println("WaiterOne " + name + " is greeting the customer");
     }

     // Перевантажений метод для класу WaiterOne
     public void additionalMethod() {
         System.out.println("WaiterOne " + name + " has an additional method");
     }
 }


