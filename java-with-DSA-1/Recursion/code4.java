public class code4 {
    public static int sum(int n){
       if(n==1){
        return 1;
       }
        int fn2=sum(n-1);
        int fn=n+fn2;
        return fn;
       }
    public static void main(String[] args) {
        int n=5;
        int r=sum(n);
        System.out.print("Sum of natural number upto n:"+r+" ");
    
}
}