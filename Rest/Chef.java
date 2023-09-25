package Rest;

public class Chef {
    String name; // ім'я шефа
    int experienceYears; // досвід у роках
    double salary; // зарплата шефа

    public Chef(String name,int experienceYears,double salary){ // конструктор
        this.name = name;
        this.experienceYears = experienceYears;
        this.salary = salary;
    }
    void info(){ // інформація про шеф-кухаря
        System.out.println("Шуф-кухар - "+ name + " з досвідом роботи "+ experienceYears + " років");
    }
    double salaryChef(){ // зарплата шеф-кухаря
        return salary;
    }
}
