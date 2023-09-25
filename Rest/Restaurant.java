package Rest;

public class Restaurant {
    String name; // назва
    int openingYear; // рік відкриття
    String location; // локація


    public Restaurant(String name,int openingYear, String location) { // конструктор
        this.name = name;
        this.openingYear = openingYear;
        this.location = location;
    }

    void info() {  // інформація ппо ресторан
        System.out.println("Назва ресторану - " + name);
        System.out.println("Локація: " + location);
        System.out.println("Рік відкриття - " + openingYear);
    }
    int yearExist(){  // рік існування ресторану
        int y = 2023 - openingYear;
        return y;
    }
}
