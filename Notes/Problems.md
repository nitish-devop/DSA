### isUnique : 
Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?

1. ### Using sorting 
    Time complexity - O(N)
    Space Complexity - O(1)

```
public static boolean isUnique(String str) {
        //Convert String into character array
        char charArr[] = str.toCharArray();

        // Sort the character array
        Arrays.sort(charArr);
        
        // Store back new string from character array
        str = new String(charArr);
    
        // Scan entire string and search for any duplicate
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1))
                return false;
        }
        return true;
    }
```
    Time complexity - O(1)
    Space Complexity - O(1)

2. ### Using character set
```
public static boolean isUnique(String str) {
        if(str.length() > 128){
            return false;
        }
        
        // Make an boolean array for character checking
        boolean[] charSet = new boolean[128];
        
        for(int i=0;i<str.length();i++)
        {
            int val = str.charAt(i);
            if(charSet[val]){
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }
```

### Print Permuatation 
```
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
```