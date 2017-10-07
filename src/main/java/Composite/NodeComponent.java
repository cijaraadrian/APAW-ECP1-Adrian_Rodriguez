package Composite;

public abstract class NodeComponent {

    protected String name = "";

    public String getName() {
        return this.name;
    }

    public void SetName(String name) {
        this.name = name;
    }
    
    public abstract String view();

}
