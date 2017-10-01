package Buider;

import java.util.Date;
import java.util.List;

public class InvoiceBuilder {

    private int id;
    
    private List<Shopping> shop;
    
    private Invoice invoice;
    
    public InvoiceBuilder() {
        this.id = 0;
        this.invoice = new Invoice(this.id);
    }
    
    public InvoiceBuilder(int id) {
        this.id = id;
        this.invoice = new Invoice (id);
        this.invoice.setShop(this.shop);
    }
    
    public InvoiceBuilder total(int total) {
        this.invoice.setTotal(total);
        return this;
    }
    
    public InvoiceBuilder date(Date date) {
        this.invoice.setDate(date);
        return this;
    }
    
    public InvoiceBuilder client(String client) {
        this.invoice.setClient(client);
        return this;
    }
    
    public InvoiceBuilder shop(Shopping shop) {
        this.invoice.setShop(this.shop);
        return this;
    }
    
    public Invoice build() {
        return this.invoice;
    }
}
