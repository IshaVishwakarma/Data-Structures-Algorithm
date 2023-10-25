public class CustomImplementationStack {
    protected int[] data;
    private static final int DEFAULT_SIZE =10;

    int ptr=-1;
    //This is called when the size of the stack is not given to us
    public CustomImplementationStack(){
        this(DEFAULT_SIZE);
    }
    //This os called when the size of the stack is given to us
    public CustomImplementationStack(int size){
        this.data= new int[size];

    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }
        int removed = data[ptr];
        return data[ptr--];

    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr==data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
    public static void main(String[] args) throws Exception{
        CustomImplementationStack stack = new CustomImplementationStack(5);
        stack.push(34);
        stack.push(25);
        stack.push(78);
        stack.push(12);
        stack.push(9);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //Now this will throw an exception
         //System.out.println(stack.pop());

    }
}
