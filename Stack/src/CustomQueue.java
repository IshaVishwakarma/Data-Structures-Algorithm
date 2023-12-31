import java.util.Queue;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE =10;

    int end =-0;


    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
        return end==data.length;
    }
    public boolean isEmpty(){
        return end==0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("The queue is empty");
        }

        int remvoed = data[0];

        //shift the elements after removing
        //the elements will be shifted to the left starting with the index of 1

        for (int i = 1; i < end; i++) {
            data[i-1]=data[i];


        }
        end--;
        return remvoed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Thw queue is Empty");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("END");
    }



    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue(5);
        queue.insert(45);
        queue.insert(63);
        queue.insert(78);
        queue.insert(98);
        queue.insert(23);

        queue.display();

        System.out.println(queue.remove());
        queue.display();

        System.out.println(queue.front());


    }

}
