package com.kalai.phase1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num1,num2,result ;
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value");
		num1= sc.nextInt();
		System.out.println("Enter the second value");
		num2=sc.nextInt();
		System.out.println("Enter the opertaor : + ,- ,*,/,%");
		operator = sc.next().charAt(0);
		
		switch(operator){
		case '+' :
			result = num1+num2;
			System.out.println("Addition:"+ result );
			break;
		case '-' :
			result = num1-num2;
			System.out.println("Subraction: "+ result);
			break;
		case '*':
			result = num1*num2;
			System.out.println("Multiplication: "+ result);
			break;
		case '/' :
			result = num1/num2;
			System.out.println("Division: "+ result);
			break;
		case '%' :
			result = num1%num2;
			System.out.println("Modulo:" + result);
			break;
		default:
			System.out.println("Invalid Operator");
			
		}

	}

}
