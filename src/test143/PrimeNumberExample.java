package test143;

public class PrimeNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 13;
		boolean flag = true;
		for (int i = 2; i < number; i++) {
			int rem = number % i;

			if (rem == 0) {
				flag = false;
				break;

			}
		}
		if (flag == true) {
			System.out.println("Num is prime num ");
		} else {
			System.out.println("num is not a prime num");
		}
	}
}
