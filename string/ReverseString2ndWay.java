package string;

//Homework
import java.util.Scanner;

public class ReverseString2ndWay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			s2 = s.charAt(i) + s2;
		}
		System.out.println(s2);
		sc.close();

	}
}
