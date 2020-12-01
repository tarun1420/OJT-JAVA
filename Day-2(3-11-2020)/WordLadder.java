package com;

import java.util.*;

public class WordLadder {
    static int length(String start, String target, Set<String> D) 
    { 
        //Searching in Dictionary D
        if (!D.contains(target)) 
            return 0; 

        //To store the first word length
        int n = 0, wordlength = start.length(); 

        // Push the starting word into the queue 
        Queue<String> Q = new LinkedList<>(); 
        Q.add(start); 

        // While the queue is non-empty 
        while (!Q.isEmpty()) 
        { // Increase the chain length 
            ++n; 
            // Current size of the queue 
            int len = Q.size(); 
            for (int i = 0; i < len; ++i) 
            { 
                char []word = Q.peek().toCharArray(); 
                Q.remove(); 
                for (int pos = 0; pos < wordlength; ++pos) 
                { 
                    char orig_char = word[pos]; 
                    for (char c = 'a'; c <= 'z'; ++c) 
                    { 
                        word[pos] = c; 
                        if (String.valueOf(word).equals(target)) 
                            return n + 1; 
                        if (!D.contains(String.valueOf(word))) 
                            continue; 
                        D.remove(String.valueOf(word)); 
                        Q.add(String.valueOf(word)); 
                    } 
                    word[pos] = orig_char; 
                } 
            } 
        } 
      return 0; 
    } 
  // Driver code 
    public static void main(String[] args) 
    { 
        // making dictionary 
        Set<String> D = new HashSet<String>(); 
        D.add("act"); 
        D.add("bat"); 
        D.add("fan"); 
        D.add("tan"); 
        D.add("put"); 
        D.add("pan"); 
        D.add("tes"); 
        System.out.println("Dictionary"+D);
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting word");
        String start = sc.nextLine(); 
        System.out.println("Enter the Ending word");
        String target = sc.nextLine(); 
        System.out.print("Length of shortest chain is: "+ length(start, target, D)); 
    } 
    } 