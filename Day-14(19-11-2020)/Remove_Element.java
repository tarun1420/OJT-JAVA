package day_8;

import java.util.List; 
import java.util.ArrayList; 
  
public class Remove_Element 
{ 
    public static void main(String[] args) 
    { 
        List<Integer> al = new ArrayList<>(); 
        al.add(20); 
        al.add(30); 
        al.add(1); 
        al.add(2); 
  
        // This makes a call to remove(int) and  
        // removes element 20. 
        al.remove(1); 
          
        // Now element 30 is moved one position back 
        // So element 30 is removed this time 
        al.remove(1); 
  
        System.out.println("Modified ArrayList : " + al); 
    } 
} 
