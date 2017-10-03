package Strategy;

public class ErpContext {

    private AbstractInvoid invoice;

    public ErpContext(AbstractInvoid invoice) {
        this.invoice = invoice;
    }

    public void setIva() {
        invoice.setIva();
    }

}
