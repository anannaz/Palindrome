import java.util.Scanner;

public class Palindrome{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Vvedite slovo"); //sysout
		String s;
		s = sc.next();
		sc.close();
		System.out.print(s+" "+isPalindrome(s));			
		}

	public static String reverseString(String s){
		String reverse = "";
			for (int i=s.length()-1; i>=0; i--) {
			reverse += s.charAt(i);
		}
		return reverse;
	}	
	public static boolean isPalindrome(String s){

		return s.equals(reverseString(s));

	}
	
}

