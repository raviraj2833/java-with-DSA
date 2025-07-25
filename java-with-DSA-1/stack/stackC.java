import java.util.ArrayList;
public class stackC {

    static class Node{
        int data;
        Node next;
        Node(int data){
        this.data=data;
        this.next=null;
      }
    }
    static class stack{
       static Node head=null;

       // empty
       public static boolean isEmpty(){
        return head==null;
       }

       // push
       public static void push(int data){
        Node newnode=new Node(data);
        if(isEmpty()){
            head= newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
       }

       // pop
       public static int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
       }
       // peek
       public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
       }
    }
    public static void main(String[] args) {
        stack s=new stack();
        s.push(3);
        s.push(2);
        s.push(1);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
