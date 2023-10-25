public class DynamicStack extends CustomImplementationStack{

    public DynamicStack(){
        super(); //it will call CustomStack()
    }

    public DynamicStack(int size){
        super(size);//it will call CustomStack(int size)
    }

    @Override
    public boolean push(int item){
        if (this.isFull()){
            //double the array size
            int[] temp = new int[data.length*2];

            //copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data =temp;
            //now the array is not full
            //insert item using the normal push method

        }
        return super.push(item);
    }
    public static void main(String[] args) throws Exception{
        DynamicStack stack = new DynamicStack(5);
        stack.push(34);
        stack.push(25);
        stack.push(78);
        stack.push(12);
        stack.push(9);
        stack.push(63);
        stack.push(100);
        stack.push(42);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
