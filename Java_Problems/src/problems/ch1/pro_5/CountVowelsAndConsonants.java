package problems.ch1.pro_5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowelsAndConsonants {

	private static final Set<Character> allVowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

	public static void main(String[] args) {
		
		String value = " Count Vowels & Consonants";
		
		System.out.println(countVowelsAndConsonants_V1(value));
	}

	// Count Vowels and Consonants
	public static Pair<Integer, Integer> countVowelsAndConsonants_V1(String value) {
		String val = value.toLowerCase();
		int vowelsCount = 0;
		int consonantsCount = 0;
		for (int i = 0; i < val.length(); i++) {
			char ch = val.charAt(i);
			if (allVowels.contains(ch)) {
				vowelsCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				consonantsCount++;
			}
		}
		return Pair.of(vowelsCount, consonantsCount);
	}
}
