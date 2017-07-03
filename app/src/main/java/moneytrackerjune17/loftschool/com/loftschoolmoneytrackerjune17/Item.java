package moneytrackerjune17.loftschool.com.loftschoolmoneytrackerjune17;

import java.io.Serializable;

public class Item implements Serializable{
    public static final String TYPE_EXPENSE = "expense";
    public static final String TYPE_INCOME = "income";

    int price;
    int id;
    String name;
    String type;


    public Item(String name, int price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
}
