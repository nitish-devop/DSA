import java.util.ArrayList;

class HelloWorld {
    public static void printPermute(String s, String ans) {
        if(s.length()==0){
            System.out.println(ans);
            return ;
        }

        // scan entire array
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            // Store remainng string
            String rest = s.substring(0, i) + s.substring(i+1);

            // Recursive call
            printPermute(rest, ans+ch);
        }

    }
    public static void main(String[] args) {
        printPermute("123", "");
    }
}