import java.util.ArrayList;

public class firstcode {

    public static void main(String[] args) {
        // String , Float, Integer
        ArrayList<Integer> List=new ArrayList<>();
        ArrayList<String> List1=new ArrayList<>();
        ArrayList<Float> List2=new ArrayList<>();
        // Add operation
        List.add(1); // Time complexity-->>>> O(1)
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(4,11);
        List.add(5,12); 
        System.out.println(List);
        System.out.println("The size of the array list");
        System.out.println(List.size());
        System.out.println("Print all the elements of the arrayList");
        for(int i=0;i<List.size();i++){
            System.out.print(List.get(i) + " ");
        }
        System.out.println();
         // get operation
        int ele=List.get(2);
        System.out.println(ele);

        // remove operation
         List.remove(2);
        System.out.println(List);

        // setIndex operation
        List.set(0, 0);
        System.out.println(List);

        // contain element operation

        System.out.println(List.contains(2));
        System.out.println(List.contains(12));

        // String list:
        List1.add("Ravi");
        List1.add("Rahul");
        List1.add("Pankaj");
        System.out.println(List1);
    }
}