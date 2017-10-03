package Strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrategyTest {

    @Test
    public void test() {
        ErpContext erp = new ErpContext(new Invoice21());
        ErpContext erp1 = new ErpContext(new Invoice10());
        assertEquals("Aplicando el 21 % de iva", erp.setIva());
        assertEquals("Aplicando el 10 % de iva", erp1.setIva());

    }

}
