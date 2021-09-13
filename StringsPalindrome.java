package assignments;

public class StringsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="LEVEL";
		String rev = "";
		for (int i=name.length()-1;i >= 0; i--) 
		{
			rev=rev+name.charAt(i);
		}
		if(name.equals(rev))
		{
			System.out.println(name+ "  is a palindrome");
		}
			else
			{
			System.out.println(name+ "  is not a palindrome");
			}
			}

}
