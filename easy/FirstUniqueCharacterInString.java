//Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
//Example
//    s = "leetcode"          s = "loveleetcode",       s="pogba"
//      return 0.                return 2.              return -1.

/* 
Brute Force : For every char in string, loop through other chars and check if it is non repeated.
Time Complexity = O(n^2) - Quadratic, Very inefficient

Optimal Solution : Use a hashmap<characters, occurances> to keep track of the occurances of each characters in a string.
                   Loop through the String and find the first character that has occurances = 1 and return
Time Complexity : O(2n) = O(n) - Linear, Acceptable by Orgs
*/


class Solution {
    public int firstUniqChar(String s) {
        
    HashMap<Character, Integer> map= new HashMap<Character, Integer>();
    
        for(int i = 0; i < s.length(); i++){
            char c =s.charAt(i);
            if(!map.containsKey(c))
            {
                map.put(c,1);
            }
            else
            {
                map.put(c,map.get(c)+1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.get(c) == 1){
                return i;
             }          
         }
        return -1;
    }
}   
