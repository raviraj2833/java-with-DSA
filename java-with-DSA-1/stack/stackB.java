import java.util.*;
public class stackB {
    static class stack{
        static ArrayList<Integer> list=new ArrayList<>();

        // isempty condition
        public static boolean isEmpty(){
            return list.size()==0;
        }

        //push condition
        public static void push(int data){
            list.add(data);
        }
        // pop
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size()-1);
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
