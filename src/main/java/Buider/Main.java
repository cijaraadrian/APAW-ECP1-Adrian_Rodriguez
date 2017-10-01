package Buider;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Invoice invoiceTest = new InvoiceBuilder(1).
                client("ADRIAN").total(200).
                date(new Date()).
                shop(new ShoppingBuilder(1).amount(2).cost(200).build()).
                build();
        invoiceTest = new InvoiceBuilder().build();
    }

}
