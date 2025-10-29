// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);

		// Convert rate from percentage to decimal
		rate = rate / 100.0;

		// Calculate future value using the formula: futureValue = currentValue * (1 + rate)^n
		double futureValue = currentValue * Math.pow(1 + rate, n);

		// Print the result
		System.out.println("After " + n + " years, $" + currentValue + " saved at " + Double.parseDouble(args[1]) + "% will yield $" + (int) futureValue);
	}
}