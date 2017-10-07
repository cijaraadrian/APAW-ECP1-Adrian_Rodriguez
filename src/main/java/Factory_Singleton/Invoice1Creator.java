package Factory_Singleton;

public class Invoice1Creator extends InvoiceCreator {

    public AbstractInvoice CreateInvoice() {
        return new Invoice1();
    }

}
