package Labs.Lab6;

public class ClsPQHeap {

    private int back;
    private int heap[];

    public ClsPQHeap (int amount){
        heap = new int[amount + 1];
        back = 0;
    }

    public boolean isEmpty(){
        boolean check;
            if (heap == null){
                check = true;
            }
            else{
                check = false;
            }
        return check;
    }

    public boolean isFull(){
        boolean check = false;
        if (back >= heap.length){
            check = true;
        }
        return check;
    }

    public void add(int x) {
        int temp;
        int num;
        if (isFull() == true){
            System.out.println("Did not add " + x + " array is full.");
        }
        else{
            back++;
            heap[back] = x;
            temp = back/2;
            int count;
            count = back;
            while(temp >=  1){
                if (heap[temp] > heap[count]) {
                    num = heap[temp];
                    heap[temp] = heap[count];
                    heap[count] = num;
                    count = temp;
                    temp = temp/2;
                }
                else{
                    count = temp;
                    temp = temp/2;
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < back; i++) {
            int num = i + 1;
            System.out.println( num + ". " + heap[num]);
        }
    }

    public static void main (String[] args) {

        int myArray[] = {15, 5, 8, 4, 9, 22, 17, 2, 14, 1};
        ClsPQHeap heap = new ClsPQHeap(myArray.length);
        for(int i = 0; i<myArray.length; i++){

            heap.add(myArray[i]);

            heap.print();
            System.out.println("");


        }
    }

}


