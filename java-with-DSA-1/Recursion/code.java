public class code {
  public static void printDec(int n){
    if(n==1){
        System.out.println(1);
        return;
    }
    System.out.print(n+" ");
    printDec(n-1);
  }

    public static void main(String[] args) {
         int n=100;
         System.out.println("number from n to 1");
        printDec(n);
    
    }
}