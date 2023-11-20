package problems.ch1.pro_3;

import java.util.concurrent.TimeUnit;

public class ReversingLetterAndWord_Normal {

	private static final String WHITESPACE = " ";

	public static void main(String[] args) {
		String paragraph = "reverse only the letters of each word";
		StringBuilder builder = new StringBuilder();
		String[] words = paragraph.split(WHITESPACE);
		long startTime = System.nanoTime();
		for (String word : words) {
			for (int position = word.length() - 1; position >= 0; position--) {
				builder.append(word.charAt(position));
			}
			builder.append(WHITESPACE);
		}

		displayExecutionTime(System.nanoTime() - startTime);
		System.out.println(builder.toString());
		// esrever ylno eht srettel fo hcae drow
	}

	public static void displayExecutionTime(long time) {
		System.out.println("Execution time: " + time + " ns" + " ("
				+ TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
	}

}
