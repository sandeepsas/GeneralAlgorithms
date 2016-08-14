package AnagramCheck;

import java.util.*;

public class Method1Trivial {

	public static void main(String[] args) {

		String a = "aaaaa";
		String b = "aa";
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
	static boolean isAnagram(String a, String b) {

		List<Character> charList = new ArrayList<Character>();

		for(int i=0;i<a.length();i++){
			charList.add(a.charAt(i));
		}
		for(int i=0;i<b.length();i++){
			if(charList.contains(b.charAt(i))){
				int indexToRemove = charList.indexOf(b.charAt(i));
				charList.remove(indexToRemove);
			}else{
				return false;
			}
		}

		return true;
	}

}
