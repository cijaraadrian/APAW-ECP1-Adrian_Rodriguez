package Composite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoiceComposite extends NodeComponent {

    List<NodeComponent> nodes = new ArrayList<NodeComponent>();

    private int id;

    private double total;

    private Date date;

    private String client;

    public InvoiceComposite(String name) {
        this.SetName(name);
    }

    public void Insert(NodeComponent node) {
        this.nodes.add(node);
    }

    public List<NodeComponent> GetNodes() {
        return nodes;
    }

    public NodeComponent getNode(int position) {
        return this.nodes.get(position);

    }

    public String view() {

        String cad = this.getName();

        for (NodeComponent node : nodes) {
            cad += node.view();
        }
        return cad;
    }

}
