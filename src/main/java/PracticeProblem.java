import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String string = in.nextLine();
		System.out.println(Integer.parseInt(5+string) + 5);
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String string = in.nextLine();
		System.out.println(Double.parseDouble(4+string+3) + 3.4);
		
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String string = in.nextLine();
		System.out.println(!Boolean.parseBoolean(string));
		
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String string = in.nextLine();
		System.out.println((char)(Integer.parseInt(string+3) + 2));		
		
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String string = in.nextLine();
		System.out.println((double)(Integer.parseInt(string+1) /2));
		
	}

	public static void q6() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String string = in.nextLine();
		System.out.println((int)(Double.parseDouble(1+string)));
		
		
	}

}
