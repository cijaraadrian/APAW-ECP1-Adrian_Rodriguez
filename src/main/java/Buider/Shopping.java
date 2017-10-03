package Buider;

public class Shopping {

    private int id;

    private int amount;

    private double cost;

    public Shopping(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getId() {
        return this.id;
    }

    public int getAmount() {
        return this.amount;
    }

    public double getCost() {
        return this.cost;
    }

}
