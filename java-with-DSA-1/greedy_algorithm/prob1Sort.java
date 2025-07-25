import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class prob1Sort {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        
        // implement 2D arr
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        // lambda function --->> shortfrom
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

        // end time basis sort
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        // first activity
        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }
        System.out.println("max activities:"+maxAct+" ");
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
    
}
