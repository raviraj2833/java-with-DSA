import java.util.*;

public class hasing {

    public static void main(String[] args) {
        HashMap<String, Integer> Map = new HashMap<>();

        Map.put("India", 144);
        Map.put("China", 140);
        Map.put("US", 30);
        Map.put("Bangladesh", 20);
        System.out.println(Map);
        Map.put("India", 150);
        System.out.println(Map);
        // Search
        // if(Map.containsKey("India")){
        // System.out.println("Present in the map");
        // }
        // else{
        // System.out.println("Not present in the map");
        // }
        // System.out.println(Map.get("India"));
        // System.out.println(Map.get("Indonesia"));

        // iteration

        Set<String>keys=Map.keySet();
        for(String k:keys){
            System.out.println("Key="+k+",value="+Map.get(k));
        }

        // for (Map.Entry<String, Integer> e : Map.entrySet()) {
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue() );

        // }

        // int arr[]={12,12,34};
        // for(int i=0;i<3;i++){
        // System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        // for(int val : arr){
        // System.out.print(val + " ");
        // }
        // System.out.println( );

    }
}