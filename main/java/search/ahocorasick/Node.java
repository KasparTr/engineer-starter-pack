package search.ahocorasick;

public class Node {
    public String value;
    public String output;
    public Node leftChild;
    public Node rightChild;
    public Node failNode;

    Node(String value){
        this.value = value;

    }

    public void setLeftChild(Node child){
        this.leftChild = child;
    }

    public void setRightChild(Node child){
        this.rightChild = child;
    }

}
