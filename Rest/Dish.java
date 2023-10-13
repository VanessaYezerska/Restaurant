package Rest;

public class Dish {
    String name;
    double price;
    boolean isVegetarian; // чи є вегетеріанське
    int weight; // вага страви

    public Dish(String name, double price, boolean isVegetarian, int weight) { // конструктор
        this.name = name;
        this.price = price;
        this.isVegetarian = isVegetarian;
        this.weight = weight;
    }

    void info() {  // інформація про страву
        System.out.println(name);
        System.out.println("Ціна: " + price + " грн");
        System.out.println("Вегетаріанський: " + (isVegetarian ? "Так" : "Ні"));
    }

    int weightMeal() { // вага їжі
        return weight;
    }

    double weightMeal(double weight) { //перевизначений метод
        return weight;
    }

    public static void specialDish() { // перевантаження статичного методу
        System.out.println("Спеціальна страва дня: Паста Карбонара");
    }
    public void processDishInstance(Dish dish2) { // Виклик будь-якого методу із класу, екземпляр якого передано в якості параметру
        System.out.println("Обробка іншої страви:");
        System.out.println("Назва страви: " + dish2.name);
        System.out.println("Ціна: " + dish2.price);

    }

}
