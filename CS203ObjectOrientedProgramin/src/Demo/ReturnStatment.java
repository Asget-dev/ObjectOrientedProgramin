package Demo;

public class ReturnStatment {

	public static void main(String[] args) {
		printMessage();
		int sum = add(5, 4);
		System.out.println(sum);
		String shouthing = caps("Way are you reading my diary mom?!");
		System.out.println(shouthing);
		int[] awesomeArray = fimmeArrayFromInts(3, 7, 1);
		System.out.println(awesomeArray[0]);
		System.out.println(awesomeArray[1]);
		System.out.println(awesomeArray[2]);
	}

	public static void printMessage() {
		System.out.println("This is our method");
	}

	public static int add(int x, int y) {
		// System.out.println(x + y);//you have to use void
		return x + y;
	}

	public static String caps(String s) {
		return s.toUpperCase();
	}

	public static int[] fimmeArrayFromInts(int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		return array;
	}

}
