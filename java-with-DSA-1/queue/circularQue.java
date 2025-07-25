public class circularQue {
     static class CircularQue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        CircularQue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isempty(){
            return rear==-1 && front==-1;
        }
        public static boolean isfull(){
            return (rear+1)%size==front;
        }
        // add 
        public static void add(int data){
            if(isfull()){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        // remove
        public static int remove(){
            if(isempty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result=arr[front];
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        //peek
        public static int peek(){
            if(isempty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        CircularQue cq=new CircularQue(3);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        System.out.println(cq.remove());
        cq.add(4);
        System.out.println(cq.remove());
        cq.add(5);

        while(!cq.isempty()){
            System.out.println(cq.peek());
            cq.remove();
        }        
    }
}
