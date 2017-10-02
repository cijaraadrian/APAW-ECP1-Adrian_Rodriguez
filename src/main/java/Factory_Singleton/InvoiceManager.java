package Factory_Singleton;

public class InvoiceManager {
    
    private AbstractInvoice invoice;
    
    private InvoiceCreator invoiceCreator;
    
    public void SetCreator( InvoiceCreator creator ) {
        this.invoiceCreator = creator;
    }
    
    public void CreateInvoice() {
        this.invoice = this.invoiceCreator.CreateInvoice();
    }
    
    public AbstractInvoice getInvoice() {
        return this.invoice;
    }

}
