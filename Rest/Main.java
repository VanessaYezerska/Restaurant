package Rest;

 class Main {
    public static void main(String[] args) {

        Restaurant restaurant  = new Restaurant();
        Chef chef = new Chef("Олексій",8,25000,"Кичма");
        SuChef suChef = new SuChef("Олена",5,18000,"Червінка");
        Dish dish1 = new Dish();
        Dish dish2 = new Dish();
        WaiterTwo waiterTwo = new WaiterTwo("Захар",5);
        Waiter waiter = new Waiter("Іван");
        WaiterThree waiterThree = new WaiterThree("Анна",true);
        People people = new People();



        waiter.serveTable(5);
        waiterTwo.additionalMethod();
        waiterTwo.greetCustomer();
        waiterThree.greetCustomer();
        waiterThree.serveTable(7);

//        restaurant.setName("Скіфія");
//        restaurant.setOpeningYear(2019);
//        restaurant.setLocation("Львів");


//        dish1.setName("Грецький салат");
//        dish1.setPrice(140);
//        dish1.setVegetarian(true);
//        dish1.setWeight(200);

//        dish2.setName("Паста Карбонара");
//        dish2.setPrice(220);
//        dish2.setVegetarian(false);
//        dish2.setWeight(300);



//        restaurant.getInfo();
//        waiter1.infoWaiter();
//        waiter1.guestService();
//        suChef.info();
//        Restaurant.specialDish();
//        Chef.specialDish();
//        Dish.specialDish();
//        dish1.info();
//        System.out.println("Вага " + dish1.weightMeal() + "г");
//        System.out.println(restaurant.yearExist(2019) + " роки існування");
//        System.out.println("Зарплата - " + chef.salaryChef(20000));
//        System.out.println("Вага " + dish1.weightMeal(150) + "г");
//        dish2.info();
//        dish1.processDishInstance(dish2);
//        System.out.println(restaurant.yearExist() + " роки існування");
//        chef.info();
//        System.out.println("Зарплата - " + chef.salaryChef() + "грн");
//
  }
}

