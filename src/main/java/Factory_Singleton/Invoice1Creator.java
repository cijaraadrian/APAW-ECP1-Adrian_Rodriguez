package Factory_Singleton;

public class Invoice1Creator extends InvoiceCreator{

    @Override
    public AbstractInvoice CreateInvoice() {
        return new Invoice1();
    }

}
