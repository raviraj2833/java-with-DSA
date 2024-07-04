import java.util.*;
public class input_array {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements you want to store:");
        n=sc.nextInt();
        // Create an array
        int array[]=new int[10];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array of an elements are");
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }

    }
    
}
