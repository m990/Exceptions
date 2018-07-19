package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double devide(double num1, double num2) {
		if (num2 == 0.0) {
			throw new IllegalArgumentException();
		}
		return num1 / num2;
	}

	public static String reverseString(String s) {
		if (s.isEmpty()) {
			throw new IllegalStateException();
		}
		char[] chrArr = s.toCharArray();
		String[] newArr = new String[chrArr.length];
		for (int i = chrArr.length - 1; i >= 0; i--) {
			System.out.println(chrArr[i]);
			newArr[i] = ("" + chrArr[i]);
		}
		System.out.println("\n");
		String fullString = "";

		for (int i = newArr.length-1; i >= 0; i--) {
			fullString += newArr[i];
		}
		
		System.out.println(fullString);
		
		System.out.println(newArr);
		return fullString;
	}
}
