### isUnique : 
Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?

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