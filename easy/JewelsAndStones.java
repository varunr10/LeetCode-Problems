/*
You're given strings J representing the types of stones that are jewels, and S representing the stones you have. 
Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. 
Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
 
Time Complexity : O(n)
*/

class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int numOfStones = 0;
        if(J.length() == 0 || S.length() == 0)
            return 0;
        
        for(int i = 0; i < S.length(); i++){
            
            if(J.indexOf(S.charAt(i)) != -1)
                numOfStones += 1;
        }
        return numOfStones;
    }
    
    //Solution using Hashset because lookups are O(1)
    //Reduces Big O from O(ab) to O(a+b)
     public int numJewelsInStones1(String J, String S) {
        int res = 0;
        Set setJ = new HashSet();
        for (char j: J.toCharArray())
            setJ.add(j);
        for (char s: S.toCharArray())
            if (setJ.contains(s)) res++;
        return res;
    }
}
