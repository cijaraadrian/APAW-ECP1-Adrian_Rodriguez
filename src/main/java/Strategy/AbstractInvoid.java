package Strategy;

import java.util.Date;
import java.util.List;

import Buider.Shopping;

public abstract class AbstractInvoid {

    private int id;

    private double total;

    private Date date;

    private String client;

    private List<Shopping> shop;

    public abstract void setIva();

    public void SetId(int id) {
        this.id = id;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setShop(Shopping shop) {
        this.shop.add(shop);
    }

    public void addShop(Shopping shop) {
        this.shop.add(this.shop.size() + 1, shop);
    }

    public List<Shopping> getListShop() {
        return this.shop;
    }

    public double getTotal() {
        return this.total;
    }

}
