import java.util.Stack;

public class ques1 {
    public static void pushAtbottom(Stack<Integer>s,int data){
       if(s.isEmpty()){
        s.push(data);
        return;
       }
       int top=s.pop();
       pushAtbottom(s, data);
       s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtbottom(s,5);
        pushAtbottom(s,9);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
