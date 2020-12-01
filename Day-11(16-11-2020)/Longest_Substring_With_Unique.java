package day_7;

import java.util.HashMap;

public class Longest_Substring_With_Unique{
public static int lengthOfLongestSubstringKDistinct(String s, int k) {
    int result = 0;
    int i=0;
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
 
    for(int j=0; j<s.length(); j++){
        char c = s.charAt(j);
        if(map.containsKey(c)){
            map.put(c, map.get(c)+1);
        }else{
            map.put(c, 1);
        }
 
        if(map.size()<=k){
            result = Math.max(result, j-i+1);
        }else{
            while(map.size()>k){
                char l = s.charAt(i);
                int count = map.get(l);
                if(count==1){
                    map.remove(l);
                }else{
                    map.put(l, map.get(l)-1);
                }
                i++;
            }
        }
 
    }
 
    return result;
}
 public static void main(String[] args) {  
    String s = "aabacbebebe";  
    int k = 3;  
    lengthOfLongestSubstringKDistinct(s, k);  
}  
}  
