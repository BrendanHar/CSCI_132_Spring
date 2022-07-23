package Projects.Project02;

public class ElectionPool {

    LinkedList candidates;
    Node stunTemp;
    Node cowTemp;
    int size;


    ElectionPool(LinkedList input, int n){
        this.candidates = input;
        this.size = n;
    }



    public void stun(int k){
        Node temp = candidates.getFirst();

        for (int i = 1; i < k; i++){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
        System.out.println();
        System.out.println("removed node: " + temp.getData());
        System.out.println();
        candidates.deleteNode(temp);


    }

    public void cow(int m){
        Node temp = candidates.getEnd();


        for (int i = 1; i < m; i++){
            System.out.println(temp.getData());
            temp = temp.getPrev();
        }
        System.out.println();
        System.out.println("cow removed node: " + temp.getData());
        System.out.println();
        candidates.deleteNode(temp);

    }


    public void election( int n, int k, int m){
        stunTemp = candidates.getEnd();
        cowTemp = candidates.getFirst();

        System.out.println("Removed candidates from being elected");
        while (size > 2){
            if (sameCheck(stunTemp, cowTemp,k, m) == true){

                System.out.print("Stunned and cowed node = " + stunTemp.getData());
                this.candidates.deleteNode(stunTemp);
                size --;

            }
            else{
                for (int j = 0; j < k; j++){
                    this.stunTemp = stunTemp.getNext();
                }
                System.out.print(stunTemp.getData() + "\t");
                this.candidates.deleteNode(stunTemp);
                size --;
                for (int x = 0; x < m; x++){
                    this.cowTemp = cowTemp.getPrev();
                }
                System.out.println( cowTemp.getData());
                this.candidates.deleteNode(cowTemp);
                size --;
            }

        }

        System.out.println();
        System.out.println("Worthy Candidates");


    }

    public boolean sameCheck(Node stun, Node cow, int k, int m) {
        boolean check = false;
        Node stunCheck = stun;
        Node cowCheck = cow;


        for (int j = 0; j < k; j++) {
            stunCheck = stunCheck.getNext();
        }
        for (int x = 0; x < m; x++) {
            stunCheck = stunCheck.getPrev();
        }

        if (stunCheck == cowCheck){
            check = true;
        }

        return check;
    }

}
