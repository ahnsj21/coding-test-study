package recursive.p5;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        Main main = new Main();
        main.dfs(root);

    }

    public void dfs(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        dfs(node.lt);
//        System.out.print(node.data + " ");
        dfs(node.rt);
//        System.out.print(node.data + " ");

    }
}

class Node {
    int data;
    Node lt;
    Node rt;

    public Node(int data) {
        this.data = data;
    }
}
