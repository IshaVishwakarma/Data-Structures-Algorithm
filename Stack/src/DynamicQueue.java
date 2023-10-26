public class DynamicQueue extends CircularQueue {
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super((size));
    }

    @Override
    public boolean insert(int item){
        if (this.isFull()){
            //double the array size
            int[] temp = new int[data.length*2];

            //copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front+i)%data.length];
            }
            front=0;
            end= data.length;
            data =temp;


        }
        return super.insert(item);
    }

    public static void main(String[] args) throws Exception {
        DynamicQueue queue = new DynamicQueue(5);
        queue.insert(65);
        queue.insert(63);
        queue.insert(78);
        queue.insert(98);
        queue.insert(23);

        queue.display();
        System.out.println(queue.remove());
        queue.display();
        queue.insert(45);
        queue.display();
        queue.insert(85);
        queue.insert(74);
        queue.insert(96);
        queue.insert(12);
        queue.insert(46);
        queue.display();

    }
}
