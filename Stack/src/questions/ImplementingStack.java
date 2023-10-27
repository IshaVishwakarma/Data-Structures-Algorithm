package questions;

import static java.lang.System.exit;

//Implementing Stack using linked list
public class ImplementingStack {
    static class StackUsingLinkedList {
        private class Node {
            int data;
            Node link;

        }

        Node top;

        StackUsingLinkedList() {
            this.top = null;
        }

        public void push(int x) {
            Node temp = new Node();

            //check if the stack if full or not
            if (temp == null) {
                System.out.println("Heap Overflow");
                return;
            }
            temp.data = x;
            temp.link = top;
            top = temp;


        }

        public boolean isEmpty() {
            return top == null;
        }

        public int peek() {

            //check if the stack is empty or not
            if (!isEmpty()) {
                return top.data;
            } else {
                System.out.println("Stack is empty");
                return -1;
            }
        }

        public void pop() {
            //check if stack is underflow
            if (top == null) {
                System.out.println("Stack Underflow");
                return;
            }

            top = (top).link;

        }

        public void display() {
            //check if the stack is underflow
            if (top == null) {
                System.out.println("Stack Underflow");
                exit(1);
            } else {
                Node temp = top;
                while (temp != null) {
                    System.out.print(temp.data);
                    temp = temp.link;
                    if (temp != null) {
                        System.out.print("->");
                    }
                }
            }
        }

    }




        public static void main(String[] args) {
            StackUsingLinkedList obj = new StackUsingLinkedList();
            // insert Stack value
            obj.push(11);
            obj.push(22);
            obj.push(33);
            obj.push(44);

            // print Stack elements
            obj.display();

            // print Top element of Stack
            System.out.printf("\nTop element is %d\n",
                    obj.peek());

            // Delete top element of Stack
            obj.pop();
            obj.pop();

            // print Stack elements
            obj.display();

            // print Top element of Stack
            System.out.printf("\nTop element is %d\n",
                    obj.peek());
        }
    }





