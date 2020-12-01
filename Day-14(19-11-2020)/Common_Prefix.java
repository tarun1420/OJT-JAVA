package day_9;

import java.util.Scanner;

public class Common_Prefix {

	public static String CommonPrefix(String[] strs) {
	    if(strs==null || strs.length ==0){
	        return "";
	    }
	 
	    if(strs.length == 1){
	        return strs[0];
	    }
	 
	    int i=0;
	    while(true){
	        boolean flag = true;
	        for(int j=1; j<strs.length; j++){
	            if(strs[j].length()<=i || strs[j-1].length() <=i 
	               || strs[j].charAt(i) != strs[j-1].charAt(i)){
	                flag = false;
	                break;
	            }               
	        }
	 
	        if(flag){
	            i++;
	        }else{
	            break;
	        }
	    }
	 
	    return strs[0].substring(0, i);
	}
	 public static void main(String args[]) 
	    { 
	        String arr[] = {"Comma","Common", "Code"}; 
	        int n = arr.length; 
	  
	        String ans = CommonPrefix(arr); 
	          
	        if (ans.length() > 0) 
	            System.out.println("The longest common Prefix is " + ans); 
	        else 
	            System.out.println("There is no common prefix"); 
	    } 
	} 