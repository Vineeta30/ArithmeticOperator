import java.util.Scanner;

public class calculator {
	public static void main(String args[]) {
		char op;
		double num1,num2,result;
		
		Scanner input= new Scanner(System.in);
		System.out.println("Choose an operator: +, -, *, or /");
		op=input.next().charAt(0);
				
		System.out.println("Enter first number");
		num1=input.nextDouble();
		
		System.out.println("Enter second number");
		num2=input.nextDouble();
		
		if(op=='+') {
			result=num1+num2;
			System.out.println("Result is" + result);
			
		}
		else if(op=='-') {
			result=num1-num2;
			System.out.println("Result is" + result);
		}
		else if(op=='*') {
			result=num1*num2;
			System.out.println("Result is" + result);
		}
		else if(op=='/'){
			result=num1/num2;	
			System.out.println("Result is" + result);
		}
		
		input.close();
		
	}

}
