package switchstatement;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char grade ='C';
switch(grade)
{
case 'A':
	System.out.println("Excellent!");
	break;
case 'B':
case 'C':
	System.out.println("Well Done!");
break;
case 'D':
	System.out.println("You Passed");
break;
case 'F':
System.out.println("Better Try Again");
break;
default:
	System.out.println("Invalid grade");
}
System.out.println("Your grade is " + grade);
}
	}


