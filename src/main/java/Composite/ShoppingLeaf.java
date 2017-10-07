package Composite;

public class ShoppingLeaf extends NodeComponent {
    private int id;
    private int amount;
    private double cost;
    
    public ShoppingLeaf(String id) {
        this.SetName(id);
    }
    
    @Override
    public String view() {
        return "Shopping "+this.getName();
    }
    

}
