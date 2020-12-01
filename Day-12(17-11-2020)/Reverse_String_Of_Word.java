package day_7;

public class Reverse_String_Of_Word 
{

 public static void main(String[] args)
 {
     String s[] = "i like this program very much". split(" ");
     String ans = "";
     for (int i = s.length - 1; i >= 0; i--) 
     {
         ans += s[i] + " ";
     }
     System.out.println("Reversed String:");
     System.out.println(ans.substring(0, ans.length() - 1));
 }
}