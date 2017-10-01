package Builder;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import Buider.Invoice;
import Buider.InvoiceBuilder;
import Buider.ShoppingBuilder;

public class InvoiceBuilderTest {

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor() {
        Invoice invoiceTest = new InvoiceBuilder(1).client("ADRIAN").total(200).date(new Date()).shop(new ShoppingBuilder(1).amount(2).cost(200).build()).build();
        assertEquals("ADRIAN",invoiceTest.getClient());
        assertEquals(200,invoiceTest.getTotal());
        
    }

}
