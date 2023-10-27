package questions;

import java.util.Queue;

//IMPLEMENTING QUEUE USING LINKEd LIST
public class ImplementingQueue {
    class QNode {
        int key;
        QNode next;

        public  QNode(int key) {
            this.key = key;
            this.next=null;

        }
    }

    class Queue{
        QNode front , rear;
        public Queue(){
            this.front=this.rear=null;
        }
        void enqueue(int key){
            QNode temp = new QNode(key);
            //if queue is empty then front and rear is empty
            if (this.rear==null){
                this.front=this.rear=temp;
                return;
            }
            this.rear.next=temp;
            this.rear=temp;
        }

        void dequeue(){
            //if queue is empty return null
            if (this.front==null){
                return;
            }
            QNode temp =this.front;
            this.front=this.front.next;

            //if front becomes null change rear also
            if (this.front==null){
                this.rear=null;
            }
        }
    }
}
