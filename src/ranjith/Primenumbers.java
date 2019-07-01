package ranjith;

public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=20;i<=40;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;}}
				
				if(isPrime) {
					System.out.println(i);
				
			}
		}

	}

}
