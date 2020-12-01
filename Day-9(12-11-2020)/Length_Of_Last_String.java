package day_5;

import java.util.Scanner;

public class Length_Of_Last_String {
	public static int lengthOfLastWord(String s) { 
	    if(s==null || s.length() == 0)
	        return 0;
	 
	    int result = 0;
	    int len = s.length();
	 
	    boolean flag = false;
	    for(int i=len-1; i>=0; i--){
	        char c = s.charAt(i);
	        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
	            flag = true;
	            result++;
	        }else{
	            if(flag)
	               System.out.println(+result);
	        }
	    }
	 
	    return result;
	}
    //Driver Code
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Sentence");
    String s = sc.nextLine();
    lengthOfLastWord(s);
}
}