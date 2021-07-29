import java.util.Scanner;

class square extends Thread
{
	int num;

	square(int n)
	{
		num=n;
	}

	public void run()
	{
		for(int i=1;i<=num;i++)
		{
			System.out.printf("sqaure is: "+i*i);
			try
			{
				sleep(100);
			}
			catch(Exception e)
            {}
		}
    }
}

class cube extends Thread
{
	int num;

	cube(int n)
	{
		num=n;
    }

    public void run()
    {
		for(int i=1;i<=num;i++)
		{
			System.out.printf("Cube is: "+i*i*i);
			try
			{
				sleep(100);
            }
            catch(Exception e)
            {}
		}
    }
}

class thread1
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n");
		n=in.nextInt();

		square s1=new square(n);
		cube c1=new cube(n);
		s1.start();
		c1.start();
    }
}



