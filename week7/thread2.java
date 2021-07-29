import java.util.Scanner;

class first extends Thread
{
	int a[][]=new int[3][3];
	int f_sum=0;

	first(int arr[][])
	{
		a=arr;
		start();
    }

	public void run()
	{
		for(int i=0;i<3;i++)
		{
				f_sum=f_sum+a[0][i];
	    }
	    System.out.printf("Sum of first row:%d\n",f_sum);
    }
}

class second extends Thread
{
	int a[][]=new int[3][3];
	int s_sum=0;

	second(int arr[][])
	{
		a=arr;
		start();
    }

	public void run()
	{
		for(int i=0;i<3;i++)
		{
				s_sum=s_sum+a[1][i];
	    }
	    System.out.printf("Sum of second row:%d\n",s_sum);
    }
}

class third extends Thread
{
	int a[][]=new int[3][3];
	int t_sum=0;

	third(int arr[][])
	{
		a=arr;
		start();
    }

	public void run()
	{
		for(int i=0;i<3;i++)
		{
				t_sum=t_sum+a[2][i];
	    }
	    System.out.printf("Sum of third row:%d\n",t_sum);
    }
}

class thread2
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a[][]=new int[3][3];
		int total;

		System.out.println("Enter the elements of 3*3 array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=in.nextInt();
	    	}
    	}

    	first r1=new first(a);
    	second r2=new second(a);
    	third r3=new third(a);

		try
		{
    		r1.join();
    		r2.join();
    		r3.join();
        }
        catch(Exception e)
        {}

    	total=r1.f_sum+r2.s_sum+r3.t_sum;

    	System.out.printf("Sum of the matrix is:%d\n",total);
    }
}