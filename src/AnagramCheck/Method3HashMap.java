package AnagramCheck;

import java.util.*;

public class Method3HashMap {


	public static void main(String[] args) {

		String a = "aa";
		String b = "aaa";
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
	static boolean isAnagram(String a, String b) {
		
		char[] a_array = a.toUpperCase().toCharArray();
		char[] b_array = b.toUpperCase().toCharArray();
		
		if(a_array.length!=b_array.length){
			return false;
		}
		
		Map<Character, Integer> hs =  new HashMap<Character, Integer> ();
		
		for(int i=0;i< a_array.length;i++ ){
			if(hs.containsKey(a_array[i])){
				hs.put(a_array[i], hs.get(a_array[i])+1);
			}else{
				hs.put(a_array[i], 1);
			}
		}
		
		for(int i=0;i< b_array.length;i++ ){
			if(hs.containsKey(b_array[i])){
				hs.put(a_array[i], hs.get(a_array[i])-1);
			}else{
				return false;
			}
		}
		
		for(char c:a_array){
			if(hs.get(c)!=0){
				return false;
			}
		}

		
		return true;
	}

}
