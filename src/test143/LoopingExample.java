package test143;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print 1 to 10 using while loop

		int num = 1;

		while (num < 11) {

			System.out.println(num);
			num = num + 1;

		}
		System.out.println("End of while loop");

		// Print 10 to 1 using while loop

		int num1 = 10;

		while (num1 > 0) {
			if (num1 == 5) {

				System.out.println("Stop");
				num1--;
				break;
			}
			System.out.println(num1);
			num1--;
		}
		System.out.println("End of second while loop");
	}
}