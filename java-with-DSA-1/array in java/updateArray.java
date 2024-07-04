import java.util.Arrays;
public class updateArray {
    public static void main(String[] args) {
        int array[]=new int[]{1,2,3};
        System.out.println(array[2]);// output 1
        //  update an array
        array=new int[]{4,5,6};
        array[0]=8;
        System.out.println(Arrays.toString(array));

    }
    
}
