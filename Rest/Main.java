package Rest;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Скіфія",2019,"Львів");
        Chef chef = new Chef("Олексій", 5, 20000);
        Dish dish1 = new Dish("Грецький салат", 140,true,200);
        Dish dish2 = new Dish("Паста Карбонара",220,false,300);

       //restaurant.info();
        //System.out.println(restaurant.yearExist() + " роки існування");
        //chef.info();
        //System.out.println("Зарплата - " + chef.salaryChef() + "грн");
        //dish.info();
        //System.out.println("Вага " + dish.weightMeal() + "г");
        System.out.println(restaurant.yearExist(2019) + " роки існування");
        System.out.println("Зарплата - " + chef.salaryChef(20000));
        System.out.println("Вага " + dish1.weightMeal(150) + "г");
        Restaurant.specialDish();
        Chef.specialDish();
        Dish.specialDish();
        dish2.info();
        dish1.processDishInstance(dish2);
    }

    }


    