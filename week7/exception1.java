import java.util.Scanner;
class exception1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int []a,b;
		int l,m,n;
		float x;

		System.out.println("Enter the length of First 1-D array:");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter First 1-D array:");
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();

		System.out.println("Enter the length of Second 1-D array:");
		m=sc.nextInt();
		b=new int[m];
		System.out.println("Enter Second 1-D array:");
		for(int j=0;j<m;j++)
		b[j]=sc.nextInt();

		if(n>m)
		l=n;
		else if(m>n)
		l=m;
		else
		l=n;

		for(int i=0;i<l;i++)
		{
			try
			{
				x=a[i]/b[i];
				System.out.printf("x: "+x);
			}

			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("index out of bound");
			}

			catch(ArithmeticException e)
			{
				System.out.println("Cannot devide by zero");
			}
		}
	}
}
