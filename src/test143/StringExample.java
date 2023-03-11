package test143;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "Vishwanath";
	    String name2 = "Sai";
        System.out.println("Num of char in string " + name1.length());
        System.out.println("The 3rd char in the string " + name1.charAt(3)); 
        System.out.println("The last char in the string " + name1.charAt(name1.length()-1));	
        System.out.println("The string in upper case is " + name1.toUpperCase()); 
	}
}