package problems.ch1.pro_4;

public class StringContainOnlyNumbers {
	
	private static final String SAMPLE = "123432k";
	
	public static void main(String[] args) {
		boolean isDigit = containsOnlyDigits(SAMPLE);
		System.out.println("The given value : "+SAMPLE+" is "+((isDigit)?"a digit":"not a digit"));
	}
	
	// Best way and recommended way
	public static boolean containsOnlyDigits(String value) {
		for(int i=0;i<value.length();i++) {
			if(!Character.isDigit(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
