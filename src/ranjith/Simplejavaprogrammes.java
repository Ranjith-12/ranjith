package ranjith;

public class Simplejavaprogrammes {
	public static void main(String[] args) {
	String S="Shekhar";
	int count=0;
	char[] input=S.toCharArray();
	System.out.println("duplicate characters are:");
	for(int i=0;i<S.length();i++) {
	for(int j=i+1;j<S.length();j++) {
	if(input[i]==input[j]) 
	{
		System.out.println(input[j]);
		count++;
		break;
		
		
	}
	}
		
	}
	}
	
	
	

}
