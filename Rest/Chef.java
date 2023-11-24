package Rest;

 class Chef{
      String name;
      int experienceYears; // досвід у роках
      double salary;
      String surname;


     Chef(String name, int experienceYears, double salary, String surname){ // конструктор
        this.name = name;
        this.experienceYears = experienceYears;
        this.salary = salary;
        this.surname = surname;
    }
    Chef(){
    }
    void info() { // інформація про шеф-кухаря

        System.out.println("Шеф-кухар - "+ name + " з досвідом роботи "+ experienceYears + " років");
    }

    double salaryChef(){ // зарплата шеф-кухаря

         return salary;
    }
    int salaryChef(int salary){ // перевизначений метод

        return salary;
    }
     static void specialDish() { //перевантаження статичного методу

        System.out.println("Спеціальна страва шеф-кухаря: Курка теріякі");
    }



 }
