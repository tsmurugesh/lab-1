/**
*@author Tanvi Murugesh
*@version 1.0
*/
public class NewMath{
	public static void main(String[] args){

			/*
			* initialize all primitive types
			*/
			short s = 100;
			long l = 30850382L;
			double d = 45.754;

			/*
			* displays values of the objects to the user
			*/
			System.out.println("s is " + s);
			System.out.println("l is " + l);
			System.out.println("d is " + d);

			/*
			* multiplication
			*/
			System.out.println("s times s is " + (s*s));
			System.out.println("s times l is " + (s*l));
			System.out.println("s times d is " + (s*d));
			System.out.println("l times l is " + (l*l));
			System.out.println("l times d is " + (l*d));
			System.out.println("d times d is " + (d*d));

			/*
			* subtraction
			*/
			System.out.println("s minus s is " + (s-s));
			System.out.println("s minus l is " + (s-l));
			System.out.println("s minus d is " + (s-d));
			System.out.println("l minus s is " + (l-s));
			System.out.println("l minus l is " + (l-l));
			System.out.println("l minus d is " + (l-d));
			System.out.println("d minus s is " + (d-s));
			System.out.println("d minus l is " + (d-l));
			System.out.printf("d minus d is %.0f\n", d-d);

	}
}