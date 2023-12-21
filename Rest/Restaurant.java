package Rest;

 class Restaurant{
     private String name; // назва
     private int openingYear; // рік відкриття
     private String location; // локація


     Restaurant(String name, int openingYear, String location) { // конструктор
         this.name = name;
         this.openingYear = openingYear;
         this.location = location;
     }

   //  Restaurant() {
   //  }

     void getInfo() {
         System.out.println("назва ресторану - " + getName());
         System.out.println("рік відкриття - " + getOpeningYear());
     }




    int yearExist() {  // рік існування ресторану
        int y = 2023 - openingYear;
        return y;
    }

    double yearExist(double openingYear) { //перевизначений метод
        double y = 2023 - openingYear;
        return y;
    }

     static void specialDish() { //перевантаження статичного методу
        System.out.println("Спеціальна страва ресторану: Стейк з лосося");

    }
     void info() {  // інформація ппо ресторан
         System.out.println("Назва ресторану - " + name);
         System.out.println("Локація: " + location);
         System.out.println("Рік відкриття - " + openingYear);
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getOpeningYear() {
         return openingYear;
     }

     public void setOpeningYear(int openingYear) {
         this.openingYear = openingYear;
     }

     public String getLocation() {
         return location;
     }

     public void setLocation(String location) {
         this.location = location;
     }
 }