import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Node {
    public String label;
    public Node parent;
    public List<Node> children;

    public Node(String label) {
        this.label = label;
        this.children = new ArrayList<>();
    }

    public void addChild(Node child) {
        child.parent = this;
        this.children.add(child);
    }

    public void BFS(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            System.out.println(currentNode.label);

            for (Node child : currentNode.children) {
                queue.add(child);
            }
        }
    }
}
