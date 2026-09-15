import java.util.ArrayList;
import java.util.List;

public class Node {
    public String label;
    public Node parent;
    public List<Node> children;

    public Node(String label) {
        this.label = label;
        this.children = new ArrayList<>();
    }

    public void addChild(Node child) {
        this.children.add(child);
    }

    public void bfs(){
        List<Node> queue = new ArrayList<>();
        queue.add(this);

        for (int i=0; i < queue.size(); i++){
            Node node = queue.get(i);
            System.out.println(node.label + " ");
            queue.addAll(node.children);
        }
    }
}