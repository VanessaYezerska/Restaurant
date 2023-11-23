package Rest;

 class Dish {
   private String name;
   private double price;
   private boolean isVegetarian; // чи є вегетеріанське
   private  int weight; // вага страви


     Dish(String name, double price, boolean isVegetarian, int weight) { // конструктор
        this.name = name;
        this.price = price;
        this.isVegetarian = isVegetarian;
        this.weight = weight;
    }

     Dish(){
     }

     void info() {  // інформація про страву
        System.out.println(name);
        System.out.println("Ціна: " + price + " грн");
        System.out.println("Вегетаріанський: " + (isVegetarian ? "Так" : "Ні"));
    }

    int weightMeal() { // вага їжі
        return weight;
    }

    double weightMeal(double weight) { //перевизначений метод
        return weight;
    }

    static void specialDish() { // перевантаження статичного методу
        System.out.println("Спеціальна страва дня: Паста Карбонара");
    }
     void processDishInstance(Dish dish2) { // Виклик будь-якого методу із класу, екземпляр якого передано в якості параметру
        System.out.println("Обробка іншої страви:");
        System.out.println("Назва страви: " + dish2.name);
        System.out.println("Ціна: " + dish2.price);

    }
     public void setVegetarian(boolean vegetarian)       {
         isVegetarian = vegetarian;
     }
     public boolean isVegetarian() {
         return isVegetarian;
     }

     public double getPrice() {
         return price;
     }

     public void setPrice(double price) {
         this.price = price;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }


     public int getWeight() {
         return weight;
     }

     public void setWeight(int weight) {
         this.weight = weight;
     }



 }
