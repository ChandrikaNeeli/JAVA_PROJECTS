package chandu;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word:");
        String word=sc.nextLine();
        
        word=word.toLowerCase();
        
        Stack<Character>stack =new Stack<>();
        for(int i=0;i<word.length();i++) {
        	stack.push(word.charAt(i));
        }
        String reversed="";
        while(!stack.isEmpty()) {
        	reversed+=stack.pop();
        }
        if(word.equals(reversed)) {
        	System.out.println("The word is a palindrome.");
        }else {
        	System.out.println("The word is not a palindrome.");
        }
        sc.close();
	}
	

}
