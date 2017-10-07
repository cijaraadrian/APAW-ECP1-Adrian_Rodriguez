package Factory_Singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class Factory_SingletonTest {

    @Test
    public void test() {
        InvoiceManager invoice = InvoiceManager.getInvoiceManager();
        assertEquals(invoice, InvoiceManager.getInvoiceManager());
    }

}
