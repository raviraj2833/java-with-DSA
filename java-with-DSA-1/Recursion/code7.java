public class code7 {
    public static int firstOcc(int [] arr,int i){
        int key=2;
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr, i+1);
    }
    public static void main(String[] args) {

        int[] arr={1,2,2,4,6,5,5,5};
        System.out.println(firstOcc(arr, 0));
    }
}
