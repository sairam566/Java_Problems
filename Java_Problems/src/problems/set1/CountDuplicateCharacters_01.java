package problems.set1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Write a program that counts duplicate characters from a given string.
 */

public class CountDuplicateCharacters_01 {

	private static final String NAME = "sairamThadi";

	public static void main(String[] args) {
//		Map<Character, Integer> result = CountDuplicateCharacters_01.countDuplicateCharactersV2(NAME);
//		for (Map.Entry<Character, Integer> val : result.entrySet()) {
//			System.out.println(val.getKey() + " <-----> " + val.getValue());
//		}
		Map<Character, Long> result = CountDuplicateCharacters_01.countDuplicateCharactersV3_Lambda(NAME);
		System.out.println(Arrays.toString(result.entrySet().toArray()));
	}

	private static Map<Character, Integer> countDuplicateCharactersV1(String str) {
		if (str == null || str.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Character, Integer> result = new HashMap<>();

		// Loop through the array and count the
		for (int i = 0; i < str.length(); i++) {
			char chr = str.charAt(i);
			if (result.containsKey(chr)) {
				int val = result.get(chr);
				result.put(chr, ++val);
			} else {
				result.put(chr, 1);
			}
		}
		return result;
	}

	private static Map<Character, Integer> countDuplicateCharactersV2(String str) {
		if (str == null || str.isBlank()) {
			return Collections.emptyMap();
		}
		Map<Character, Integer> result = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char chr = str.charAt(i);
			result.compute(chr, (k, v) -> (v == null) ? 1 : ++v);
		}
		return result;
	}
	
	private static Map<Character, Long> countDuplicateCharactersV3_Lambda(String str) {
		if (str == null || str.isBlank()) {
			return Collections.emptyMap();
		}
		Map<Character, Long> result = str.chars().mapToObj(chr -> (char) chr)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		return result;
	}
}
