package Factory_Singleton;

public class InvoiceManager {

    private static InvoiceManager invoiceManagerSingleton;

    private AbstractInvoice invoice;

    private InvoiceCreator invoiceCreator;

    private InvoiceManager() {
    }

    public static InvoiceManager getInvoiceManager() {
        if (InvoiceManager.invoiceManagerSingleton == null) {
            InvoiceManager.invoiceManagerSingleton = new InvoiceManager();
        }
        return InvoiceManager.invoiceManagerSingleton;
    }

    public void SetCreator(InvoiceCreator creator) {
        this.invoiceCreator = creator;
    }

    public void CreateInvoice() {
        this.invoice = this.invoiceCreator.CreateInvoice();
    }

    public AbstractInvoice getInvoice() {
        return this.invoice;
    }

}
