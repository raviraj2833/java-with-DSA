import java.util.*;
public class code {
    public static int Storewater(ArrayList<Integer>height){
        int maxwater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currwater=ht*width;
            maxwater=Math.max(maxwater,currwater);

            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
            rp--;
        }
    }
    return maxwater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(Storewater(height));
    }
}