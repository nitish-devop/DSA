import java.util.ArrayList;

class HelloWorld {
    public static void main(String[] args) {
        String wordList1[] = {"word1","word2","word3","word4"};

        String wordList2[] = {"word4","word5","word6","word7"};

        ArrayList<String> ans = new ArrayList<>();

        

        for(String word : wordList1) {
            ans.add(word);
        }

        for(String word : wordList2) {
            ans.add(word);
        }

        System.out.println(ans);
        
    }
}