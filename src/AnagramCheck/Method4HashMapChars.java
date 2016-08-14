/* if you sort either array, the solution becomes O(n log n). 
 * but if you use a hashmap, it's O(n). tested and working.*/
package AnagramCheck;

import java.util.HashMap;
import java.util.Map;

public class Method4HashMapChars {
	public static void main(String[] args) {

		String a = "apaa";
		String b = "aaap";
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
	static boolean isAnagram(String a, String b) {
		char[] word1 = a.toCharArray();
		char[] word2 = b.toCharArray();

		Map<Character, Integer> lettersInWord1 = new HashMap<Character, Integer>();

		for (char c : word1) {
		    int count = 1;
		    if (lettersInWord1.containsKey(c)) {
		        count = lettersInWord1.get(c) + 1;
		    }
		    lettersInWord1.put(c, count);
		}

		for (char c : word2) {
		    int count = -1;
		    if (lettersInWord1.containsKey(c)) {
		        count = lettersInWord1.get(c) - 1;
		    }
		    lettersInWord1.put(c, count);
		}

		for (char c : lettersInWord1.keySet()) {
		    if (lettersInWord1.get(c) != 0) {
		        return false;
		    }
		}

		return true;
	}
}
