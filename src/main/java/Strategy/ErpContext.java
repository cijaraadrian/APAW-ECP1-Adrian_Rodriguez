package Strategy;

public class ErpContext {

    private AbstractInvoid invoice;

    public ErpContext(AbstractInvoid invoice) {
        this.invoice = invoice;
    }

    public String setIva() {
        return invoice.setIva();
    }

}
