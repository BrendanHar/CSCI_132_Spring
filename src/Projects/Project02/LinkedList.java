package Projects.Project02;

public class LinkedList {

    private Node first;
    private Node end;

    LinkedList(){
        first = null;
        end = null;
    }

    public void addAtStart(int x){
        Node temp = new Node(x);
        if (first == null){
            first = temp;
            end = temp;
            end.setNext(first);
            first.setPrev(end);
        }
        else {
            temp.setNext(first);
            first.setPrev(temp);
            first = temp;
            end.setNext(first);
            first.setPrev(end);
        }
    }

    public Node getFirst(){
        return this.first;
    }

    public Node getEnd(){
        return this.end;
    }

    public void printFromStart(){
        Node temp = first;
        Node firstAddress = first.getNext();

         do {
            System.out.println(temp.getData());
            temp = temp.getNext();
        } while (temp.getNext() != firstAddress);
    }


    public void searchFromStart(int elementToBeSearched){
        Node temp = first;
        Node firstAddress = first;

        do{
            if (temp.getData() == elementToBeSearched){
                System.out.println("Found " + elementToBeSearched);
                return;
            }
            temp.getNext();

        }while (temp != firstAddress);
        System.out.println("Didn't find " + elementToBeSearched);
    }

    public void deleteNode(Node x){
        if (x == first){
            first = x.getNext();
            x.getPrev().setNext(x.getNext());
            x.getNext().setPrev(x.getPrev());
        }
        if (x == end){
            end = x.getPrev();
            x.getPrev().setNext(x.getNext());
            x.getNext().setPrev(x.getPrev());
        }
        else{
            x.getPrev().setNext(x.getNext());
            x.getNext().setPrev(x.getPrev());
        }
    }
}
