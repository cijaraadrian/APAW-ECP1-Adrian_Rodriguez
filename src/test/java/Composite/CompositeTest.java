package Composite;
import static org.junit.Assert.*;

import org.junit.Test;

public class CompositeTest {

    @Test
    public void test() {
        InvoiceComposite node1 = new InvoiceComposite("Invoice1");
        node1.Insert(new ShoppingLeaf("1"));
        node1.Insert(new ShoppingLeaf("2"));
        
        InvoiceComposite node2 = new InvoiceComposite("Invoice2");
        node2.Insert(new InvoiceComposite("Invoice3"));
        
        assertEquals("Invoice1Shopping 1Shopping 2",node1.view());
        assertEquals("Invoice2Invoice3",node2.view());
    }

}
