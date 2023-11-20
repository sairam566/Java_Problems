package problems.ch1.pro_3;

public class ReversingLetterAndWord_Normal {

	private static final String WHITESPACE = " ";

	public static void main(String[] args) {
		String paragraph = "reverse only the letters of each word";
		StringBuilder builder = new StringBuilder();
		String[] words = paragraph.split(WHITESPACE);
		for(String word : words) {
			for(int position=word.length()-1;position>=0;position--) {
				builder.append(word.charAt(position));
			}
			builder.append(WHITESPACE);
		}
		System.out.println(builder.toString());
		// esrever ylno eht srettel fo hcae drow 
	}

}
