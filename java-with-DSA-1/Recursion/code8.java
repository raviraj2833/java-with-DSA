public class code8 {
    public static int lastOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastOcc(arr, key, i + 1);
        if (isfound == -1 & arr[i] == key) {
            return i;
        }
        return isfound;
    }

    public static void main(String[] args) {
        int arr[] = { 1,1,1,1,1,1 };
        System.out.println(lastOcc(arr, 1, 0));

    }
}