package Builder;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import Buider.Invoice;
import Buider.InvoiceBuilder;
import Buider.ShoppingBuilder;

public class InvoiceBuilderTest {

    @Test
    public void testConstructor() {
        Date date = new Date();
        Invoice invoiceTest = new InvoiceBuilder(1).client("ADRIAN").total(200).date(date).shop(new ShoppingBuilder(1).amount(2).cost(200).build()).build();
        assertEquals(1,invoiceTest.getId());
        assertEquals("ADRIAN",invoiceTest.getClient());
        assertEquals(200,invoiceTest.getTotal(),200);
        assertEquals(date,invoiceTest.getDate());
        assertEquals(1,invoiceTest.getShoppingList().size());
        assertEquals(1,invoiceTest.getShopping(0).getId());
        assertEquals(2,invoiceTest.getShopping(0).getAmount());
        assertEquals(200,invoiceTest.getShopping(0).getCost(),200);
        
    }

}
