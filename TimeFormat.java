public class TimeFormat {
	public static void main(String[] args) {
		
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		// Determine AM or PM
		String period = "AM";
		if (hours >= 12) {
			period = "PM";
		}

		// Convert to 12-hour format
		if (hours > 12) {
			hours = hours - 12;
		}

		// Format minutes with leading zero if needed
		String minutesString = "";
		if (minutes < 10) {
			minutesString = "0" + minutes;
		} else {
			minutesString = "" + minutes;
		}

		// Print the result
		System.out.println(hours + ":" + minutesString + " " + period);
	}
}