package Projects.Project02;

public class Node {

    private int data;
    private Node next;
    private Node prev;


    public Node(int temp){
        this.data = temp;
    }

    public void setNext(Node temp){
        this.next = temp;
    }

    public void setPrev(Node temp){
        this.prev = temp;
    }

    public Node getNext(){
        return this.next;
    }

    public Node getPrev(){
        return this.prev;
    }

    public void setData(int temp){
        this.data = temp;
    }

    public int getData(){
        return this.data;
    }

}
