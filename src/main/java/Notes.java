/**
	* File: Lesson 4.1: While Loops and accumulators
	* Author: Mr. Kalisz
	*	Date Created: April 3, 2023
	*	Date Last Modified: April 3, 2023
	*/
class Notes {
	public static void main(String args[]) {
			//review if statements

		// int num;
		// num = 1;

		// if (num == 5) {
		// 	System.out.println(num);
		// }

		// System.out.println("Rest of our code");

		//while loop syntax

		int num;
		num = 1;

		//DONT DO THIS - INFINITE LOOP IT NEVER STOPS
		// while (num == 5) {
		// 	System.out.println(num);
		// }


		while (num < 5) {
			System.out.println(num);
			//Make this loop eventually false
			num = num + 1;
		}

		//num = 5
		while (num >= 0) {
			System.out.println("The number is current " + num);
			num = num - 1;
		}

		//num = -1
		//This is an infinite loop because 2 will get skipped
		// while (num != 2) {
		// 	System.out.println(num);
		// 	num = num + 2;
		// }

		System.out.println("Rest of our code");

		//accumulators

		num = 0;
		String word;
		word = "";

		int num1;
		num1 = 0;

		while (num1 < 1000) {
			num = num + num1;
			num1 = num1 + 1;
		}

		System.out.println(num);

		num1 = 0;

		while (num1 < 10) {
			word = word + num1;
			num1 = num1 + 1;
		}

		System.out.println(word);

	}
}