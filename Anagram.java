package assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t1 = "listen";
		String t2 = "silent";
		
		char[] ch1 = t1.toCharArray();
		char[] ch2 = t2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean res =Arrays.equals(ch1, ch2);
		if(res) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}

}
