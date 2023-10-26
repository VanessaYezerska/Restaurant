package Rest;

 class Chef {
     private String getName;
     private String name;
     private int experienceYears; // досвід у роках
     private double salary;


     Chef(String name,int experienceYears,double salary){ // конструктор
        this.name = name;
        this.experienceYears = experienceYears;
        this.salary = salary;
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


     public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }

     public int getExperienceYears() {
         return experienceYears;
     }

     public void setExperienceYears(int experienceYears) {
         this.experienceYears = experienceYears;
     }

     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }
 }
