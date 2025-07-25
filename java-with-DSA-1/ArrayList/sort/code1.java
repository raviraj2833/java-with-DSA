import java.util.*;
public class code1 {

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(5);
        System.out.println(list);
        System.out.println("List are sorted");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("list are sorted in descending order");
        // descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}