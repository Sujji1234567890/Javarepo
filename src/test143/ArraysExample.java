package test143;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {10,20,30,40,50};
		
		System.out.println(" Length of the array is " + arr1.length);
		System.out.println("The first value inside the array is " + arr1[0]);
		System.out.println("The last values of the array is " + arr1[arr1.length-1]);
		
		String[] arr2 = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		System.out.println("Value at 2nd position is " +  arr2[1]);
		
		String str = "Clean World Green World Happy World";
		
		String[] arr3 = str.split(" "); // {'Clean","World","Green","World"}
		System.out.println("The number of words in the string is " + arr3.length);

	}

}

