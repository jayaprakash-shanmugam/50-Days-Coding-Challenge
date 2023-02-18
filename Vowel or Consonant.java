[PROBLEM] : Take an input character from the user and check whether the given input is a vowel or consonant. 
Input : A Output : Vowel 
Input : m Output : Consonant 
Input : 3 Output : Invalid Input

SOLUTION [JAVA]
---------------

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=((sc.nextLine().charAt(0)));
		char z=Character.toUpperCase(c);
		if(z=='A' || z=='E' || z=='I' || z=='O' || z=='U')
        System.out.println("Vowel");
        else
        {
            if((c>=65 && c<=90) || (c>=97 && c<=122) ) // Checking if character is special character.
            System.out.println("Consonant");
            else
            System.out.println("Invalid Input.");
        }
	}
}
