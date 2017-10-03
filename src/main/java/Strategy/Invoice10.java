package Strategy;

public class Invoice10 extends AbstractInvoid {

    private int IVA = 10;

    @Override
    public void setIva() {
        super.setTotal((super.getTotal() * this.IVA / 100));
    }

}
