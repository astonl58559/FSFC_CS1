package switchstatementexercise;

import java.util.Scanner;

public class Exercise {

	private static Scanner sc;

	public static void main(String[] args) {
		// 
	
		int age;
	sc = new Scanner(System.in);
	System.out.println("How old are you");
	
age=sc.nextInt(15); 
	
if(age>=17)
	System.out.println("It is legal for you to drive");
	else
	System.out.println("It is illegal for you to drive");
	}
	
	


	}


