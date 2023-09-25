package Rest;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Скіфія",2019,"Львів");
        Chef chef = new Chef("Олексій", 5, 20000);
        Dish dish = new Dish("Грецький салат", 140,true,200);

        restaurant.info();
        System.out.println(restaurant.yearExist() + " роки існування");
        chef.info();
        System.out.println("Зарплата - " + chef.salaryChef() + "грн");
        dish.info();
        System.out.println("Вага " + dish.weightMeal() + "г");

    }

    }

