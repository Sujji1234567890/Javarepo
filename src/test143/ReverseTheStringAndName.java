package test143;

public class ReverseTheStringAndName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hello Vishwanathsai Thodupunoori";
		String result = "";
		
		for(int i=str1.length()-1;i>=0;i--) {
			
			result = result + str1.charAt(i);
		}
		
		System.out.println("Reverse string is " +result);
		}

	}

