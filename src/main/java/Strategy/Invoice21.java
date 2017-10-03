package Strategy;

public class Invoice21 extends AbstractInvoid {

    private int IVA = 21;

    @Override
    public void setIva() {
        super.setTotal((super.getTotal() * this.IVA / 100));
    }

}
