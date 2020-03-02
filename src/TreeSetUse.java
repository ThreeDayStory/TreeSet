/********************************
* Created by: Jessie Griffin 	*
* Date: March 1, 2020		    *
* Course: 202010-COP-3330-01Z	*
* Professor: John Wiggins		*
* Assignment: Eclipse Project 2	*
* ******************************/

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Collections;

public class TreeSetUse {
	public static void main(String args[]) {
		
	    Scanner input = new Scanner(System.in);
	    String string; 
		
	    System.out.println("Enter a sentence:");
	    string = input.nextLine();
		
	    String[] words = string.split(" ");
		
	    SortedSet<String> treeSet = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
				
	    Collections.addAll(treeSet, words);
		
	    printSet(treeSet);
		
	    input.close();
	}
	
	private static void printSet(SortedSet<String> treeSet) {
		
	    for (String word : treeSet) {
		    System.out.printf("%s\n", word);
		}
	}
}
