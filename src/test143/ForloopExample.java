package test143;

public class ForloopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int num = 1; num < 11; num++) {

			System.out.println(num);
		}
		System.out.println("End of for loop");

		for (int num1 = 10; num1 > 0; num1 -= 2) {

			System.out.println(num1);
		}
		System.out.println("End of the second for  loop");

		System.out.println("Table of 2");

		int num = 2;
		for (int i = 1; i < 11; i++) {
			System.out.println(num * i);
			// System.out.printf("%d * %d = %d \n" , num , i, num*i);
		}
		System.out.println("End Table of 2");

		int[] arr1 = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("element values is " + arr1[i]);
		}
		
		//for each loop
		
		for(int val:arr1) {
		System.out.println("value is" + val);
	}
		String str1 = "Dhanvi at hoem kukatpally hyderabad";
		for (int i=0;i<str1.length();i++) {
			System.out.println("character value is " + str1.charAt(i));
		}
		
		
	}
}
