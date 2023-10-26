package questions;

import java.util.Stack;

//IMPLEMENT QUEUES USING TWO STACKS
public class Implementqueues {

        private Stack<Integer> first;
        private Stack<Integer> second;

        public Implementqueues() {
            first = new Stack<>();
            second = new Stack<>();
        }

        public void add(int item) {
            first.push(item);
        }

        public int remove() {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
            int removed = second.pop();

            while (!second.isEmpty()) {
                first.push(second.pop());
            }
            return removed;
        }

        public int peek() throws Exception {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
            int peeked = second.peek();

            while (!second.isEmpty()) {
                first.push(second.pop());
            }
            return peeked;
        }


        public boolean isEmpty() {
            return first.isEmpty();
        }

        //REMOVE EFFICENT
    public void Add(int item){
            while (!first.isEmpty()){
                second.push(first.pop());
            }

            first.push(item);

            while (!second.isEmpty()){
                first.push(second.pop());
            }
    }

    public int removeefficently(int item){
            return first.pop();
    }

    public int peekeff(int item){
            return first.pop();
    }


    public static void main(String[] args) {
        Implementqueues queue = new Implementqueues();
        queue.add(3);
        queue.add(5);
        queue.add(9);
        queue.add(12);
        queue.add(15);
        queue.add(78);
        System.out.println(queue.remove());

    }

}
