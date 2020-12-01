package day_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Group_Anagram {
	public static List<List<String>> groupAnagrams(String[] strs) {
	    List<List<String>> result = new ArrayList<List<String>>();
	 
	    HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	    for(String str: strs){
	        char[] arr = new char[26];
	        for(int i=0; i<str.length(); i++){
	            arr[str.charAt(i)-'a']++;
	        }
	        String ns = new String(arr);
	 
	        if(map.containsKey(ns)){
	            map.get(ns).add(str);
	        }else{
	            ArrayList<String> al = new ArrayList<String>();
	            al.add(str);
	            map.put(ns, al);
	        }
	    }
	 
	    result.addAll(map.values());
	 System.out.println(result);
	    return result;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	     System.out.println("Enter the length of array");
	     int length = s.nextInt();
	     String [] myArray = new String[length];
	     System.out.println("Enter the elements of array");
	     for(int i=0; i<length; i++ ) {
	        myArray[i] = s.nextLine();
	     }
	     groupAnagrams(myArray);
	}

}