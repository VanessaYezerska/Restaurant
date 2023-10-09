package Rest;

public class Restaurant {
    String name; // назва
    int openingYear; // рік відкриття
    String location; // локація


    public Restaurant(String name, int openingYear, String location) { // конструктор
        this.name = name;
        this.openingYear = openingYear;
        this.location = location;
    }


     void info() {  // інформація ппо ресторан
       System.out.println("Назва ресторану - " + name);
       System.out.println("Локація: " + location);
      System.out.println("Рік відкриття - " + openingYear);
     }

    int yearExist() {  // рік існування ресторану
        int y = 2023 - openingYear;
        return y;
    }

    double yearExist(double openingYear) { //перевизначений метод
        double y = 2023 - openingYear;
        return y;
    }

    public static void specialDish() { //статичний метод
        System.out.println("Спеціальна страва ресторану: Стейк з лосося");
    }
}