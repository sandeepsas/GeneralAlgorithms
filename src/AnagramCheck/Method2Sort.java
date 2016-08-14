package AnagramCheck;

import java.util.Arrays;

public class Method2Sort {

	public static void main(String[] args) {

		String a = "anagram";
		String b = "margana";
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
	static boolean isAnagram(String a, String b) {
		
		char[] a_array = a.toUpperCase().toCharArray();
		char[] b_array = b.toUpperCase().toCharArray();
		Arrays.sort(a_array);
		Arrays.sort(b_array);
		
		return (Arrays.equals(a_array, b_array)?true:false);
	}

		
}
