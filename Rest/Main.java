package Rest;

 class Main {
    public static void main(String[] args) {

        Restaurant restaurant  = new Restaurant();
        Chef chef = new Chef();
        Dish dish1 = new Dish();
        Dish dish2 = new Dish();
        Waiter waiter1 = new Waiter();

        restaurant.setName("Скіфія");
        restaurant.setOpeningYear(2019);
        restaurant.setLocation("Львів");

        chef.setName("Олексій");
        chef.setExperienceYears(5);
        chef.setSalary(20000);

        dish1.setName("Грецький салат");
        dish1.setPrice(140);
        dish1.setVegetarian(true);
        dish1.setWeight(200);

        dish2.setName("Паста Карбонара");
        dish2.setPrice(220);
        dish2.setVegetarian(false);
        dish2.setWeight(300);



        restaurant.getInfo();
        waiter1.infoWaiter();
        waiter1.guestService();
        Restaurant.specialDish();
        Chef.specialDish();
        Dish.specialDish();
        dish1.info();
        System.out.println("Вага " + dish1.weightMeal() + "г");
        System.out.println(restaurant.yearExist(2019) + " роки існування");
        System.out.println("Зарплата - " + chef.salaryChef(20000));
        System.out.println("Вага " + dish1.weightMeal(150) + "г");
        dish2.info();
        dish1.processDishInstance(dish2);
        System.out.println(restaurant.yearExist() + " роки існування");
        chef.info();
         System.out.println("Зарплата - " + chef.salaryChef() + "грн");

    }

    }


    