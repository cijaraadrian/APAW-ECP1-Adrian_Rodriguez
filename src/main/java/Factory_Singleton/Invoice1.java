package Factory_Singleton;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Buider.Shopping;

public class Invoice1 extends AbstractInvoice {

    private int id;

    private double total;

    private Date date;

    private String client;

    private List<Shopping> shop;

    public Invoice1() {
        this.id = 0;
    }

    public Invoice1(int id) {
        this.id = id;
        this.shop = new ArrayList<Shopping>();
    }

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

    public int getId() {
        return this.id;
    }

    public double getTotal() {
        return this.total;
    }

    public Date getDate() {
        return this.date;
    }

    public String getClient() {
        return this.client;
    }

    public Shopping getShopping(int idShopping) {
        return this.shop.get(idShopping);
    }

    public List<Shopping> getShoppingList() {
        return this.shop;
    }

    @Override
    public void write() {
        System.out.println("I am Invoice1");
    }
}
