package assignments;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		int letter = 0, space = 0, num = 0, specChar = 0;

		char[] arr = test.toCharArray();
		for (int i = 0; i < arr.length; i++) 
		{
			if (Character.isLetter(arr[i])) 
			{
				letter = letter + 1;
			} 
			else if (Character.isDigit(arr[i]))
			{
				num = num + 1;
			} 
			else if (Character.isSpaceChar(arr[i]))
			{
				space = space + 1;
			}
			else 
			{
				specChar = specChar + 1;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specChar);
	}

}
