import java.util.*;

public class code {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1); list.add(2);
        mainlist.add(list);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(3); list2.add(4);
        mainlist.add(list2);

        // iterate of mainList
        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer>CurrList=mainlist.get(i);
            for(int j=0;j<CurrList.size();j++){
                System.out.print(CurrList.get(j)+" ");
            }
            System.out.println();
        }
    }
    
}
