package Buider;

public class ShoppingBuilder {

    private int id;

    private Shopping Shopping;

    public ShoppingBuilder() {
        this.id = 1;
        this.Shopping = new Shopping(this.id);
    }

    public ShoppingBuilder(int id) {
        this.id = id;
        this.Shopping = new Shopping(this.id);
    }

    public ShoppingBuilder amount(int amount) {
        this.Shopping.setAmount(amount);
        return this;
    }

    public ShoppingBuilder cost(double cost) {
        this.Shopping.setCost(cost);
        return this;
    }

    public Shopping build() {
        return this.Shopping;
    }

}
