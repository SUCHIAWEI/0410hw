public class Node {
    private int data;
      Node next = null;

    public  Node(){}
        public Node(int data1){
            this();

            setData(data1);
        }
            public void setData(int data1){
            data = data1;
            }
            public int getData(){
            return data;
            }

            public void addNode(Node node){
                if (next==null){
                    Node n = new Node(node.data);
                    next =n;
                }
                
            }

        public Node getNext() {
        return next;
        }

    public void showInfo(){
                System.out.println(data);
            }
}
