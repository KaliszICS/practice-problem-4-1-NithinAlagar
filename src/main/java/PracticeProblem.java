/**
	* File: Lesson 4.1: While Loops and accumulators
	* Author: Nithin.A
	*	Date Created: April 3, 2023
	*	Date Last Modified: April 8, 2026
	*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}
	public static String seriesInclusive(int num){
		if (num <= 0){
			return "";
		}
        String result = "1";
		int i = 1;
		while (i<num){
		    i++;
			result = result + " " + i;
		}
		return result;
	}

	public static String seriesExclusive(int num){
		if (num<=0){
			return "";
		}
		String result = "0";
		int i = 0;
		while (i<num-1){
		    i++;
			result = result + " " + i;
		}
		return result;
	}

}
