package problems.ch1.pro_3;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReversingLetterAndWord_Java8 {

	private static final Pattern PATTERN = Pattern.compile(" +");

	private static final String PARAGRAPH = "reverse only the letters of each word";

	public static void main(String[] args) {

		String reversedString = PATTERN.splitAsStream(PARAGRAPH).map(str -> new StringBuilder(str).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(reversedString);
	}
}
