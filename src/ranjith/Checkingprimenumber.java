package ranjith;

import java.util.Scanner;

public class Checkingprimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number:");
		
		int num=s.nextInt();
		s.close();
		boolean isPrime=true;

		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				isPrime=false;
				break;}}
				if(isPrime) 
					System.out.println(num + "is a prime number");
			
				else 
					System.out.println(num + "is not a prime number");
				
		
	}

}
