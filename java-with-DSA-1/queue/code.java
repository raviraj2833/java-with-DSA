import java.util.*;
public class code {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isempty(){
            return rear==-1;
        }
        // add operation in queue
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        // delete
        public static int remove(){
            if(isempty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }

        // peek 
        public static int peak(){
            if(isempty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
      Queue que=new Queue(6);
      que.add(1);
      que.add(2);
      que.add(3);

      while(!que.isempty()){
        System.out.println(que.peak());
        que.remove();
        
      }
    }
}
