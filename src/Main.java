public class Main {

    public static void main(String[] args) {

        Node node = new Node(1);


        node.addNode(new Node(2));
        node.addNode(new Node(3));
        node.addNode(new Node(4));
        node.addNode(new Node(5));

        
        node.showInfo();
    }
}
