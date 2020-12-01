package com;

import java.util.Stack;

public class ERPN {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        for(String ch : tokens){
            if(ch.equals("+")){
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num1+num2);
            }else if(ch.equals("-")){
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2-num1);
            }else if(ch.equals("*")){
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num1*num2);
            }else if(ch.equals("/")){
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2/num1);
            }else{
                st.push(Integer.parseInt(ch));
            }
        }
        return st.pop();
    }
//main method to run the program
public static void main(String [] args){
    String[] st = new String[]{"1","2","+","5","*"};
    System.out.println(evalRPN(st));
}
}