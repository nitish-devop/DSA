import java.util.ArrayList;
import java.util.Scanner;

public class Subset {
   
    // method to generate Subsets of String
    public static ArrayList<String> subseq(String str){
        ArrayList<String> sol = new ArrayList<>();
        helper(str, 0, "", sol);
        return sol;
    }

    public static void helper(String str,int index,String subseq,ArrayList<String> sol){
        if(index == str.length()){
            sol.add(subseq);
            return;
        }

        // Include current character
        char ch = str.charAt(index);
        helper(str, index+1, subseq+ch, sol);

        // exclude
        helper(str, index+1, subseq, sol);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        ArrayList<String> ans = subseq(str);
        // for(String val : ans){
        //     System.out.println(val);
        // }
        System.out.println(ans.toString());


    }
}
