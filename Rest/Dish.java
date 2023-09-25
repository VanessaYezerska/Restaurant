package Rest;

public class Dish {
    String name; // назва страви
    double price; // ціна страви
    boolean isVegetarian; // чи є вегетеріанське
    int weight; // вага страви

    public Dish(String name,double price,boolean isVegetarian, int weight){ // конструктор
        this.name = name;
        this.price = price;
        this.isVegetarian = isVegetarian;
        this.weight = weight;
    }
    void info(){  // інформація про страву
        System.out.println(name);
        System.out.println("Ціна: " + price + " грн");
        System.out.println("Вегетаріанський: " + (isVegetarian ? "Так" : "Ні" ));
    }
    int weightMeal(){ // вага їжі
        return weight;
    }

}
