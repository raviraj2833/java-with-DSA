// Find the subsets of String("abc"):--->>>
public class code2 {
    public static void findSubset(String str,String ans,int i){
        // base class
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        // backtracking -- choice 
        //yes 
        findSubset(str, ans+str.charAt(i), i+1);
        //No
        findSubset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        findSubset(str," ", 0);
    }
}