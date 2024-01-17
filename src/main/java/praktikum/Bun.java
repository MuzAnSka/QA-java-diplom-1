package praktikum;


/**
 * Модель булочки для бургера.
 * Булочке можно дать название и назначить цену.
 */
public class Bun {

    public java.lang.String name;
    public float price;

    public Bun(java.lang.String name, float price) {
        this.name = name;
        this.price = price;
    }


    public java.lang.String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

}