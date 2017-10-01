package Buider;

import java.util.Date;
import java.util.List;

public class Invoice {
    
    private int id;
    
    private double total;
    
    private Date date;
    
    private String client;
    
    private List<Shopping> shop;
    
    public Invoice (int id ) {
        this.id = id;
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
    
    public void setClient (String client) {
        this.client = client;
    }
    
    public void setShop(List<Shopping> shop) {
        this.shop = shop;
    }
    
    public void addShop(Shopping shop) {
        this.shop.add(this.shop.size()+1, shop);
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
}
