// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);

		// Generate three random integers in the range [0, lim)
		int a = (int) (Math.random() * lim);
		int b = (int) (Math.random() * lim);
		int c = (int) (Math.random() * lim);

		// Print the original numbers
		System.out.println(a + " " + b + " " + c);

		// Find the minimum value: min(a, b, c)
		int min = Math.min(a, Math.min(b, c));

		// Find the maximum value: max(a, b, c)
		int max = Math.max(a, Math.max(b, c));

		// Find the middle value: sum - min - max
		int middle = a + b + c - min - max;

		// Print the numbers in ascending order
		System.out.println(min + " " + middle + " " + max);
	}
}
