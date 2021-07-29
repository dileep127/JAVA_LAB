import java.util.Scanner;
class string
{
	String inp;
	String rev="";

	string(String str)
	{
		inp=str;
	}

	void reverse()
	{
		for(int i=inp.length()-1;i>=0;i--)
		rev=rev+inp.charAt(i);
		System.out.println("Reversed String: "+rev);
	}

	void c_palindrome()
	{
		if(inp.equals(rev))
		System.out.println("String is palindrome");
		else
		System.out.println("String is not palindrome");
	}
}

class palindrome
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str;
		System.out.println("Enter the string");
		str=in.nextLine();
		string s1=new string(str);
		s1.reverse();
		s1.c_palindrome();
	}
}