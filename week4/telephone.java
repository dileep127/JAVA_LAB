import java.util.Scanner;


class telephone
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n,i;
		System.out.println("Input the number of customer:");
		n=in.nextInt();
		customer c[]=new customer[n];
		System.out.printf("Input the details of %d customers\n",n);
		for(i=0;i<n;i++)
		{
			System.out.println("Input the name:");
			String name=in.next();
			System.out.println("Input the id:");
			int id=in.nextInt();
			System.out.println("Input the telephone number:");
			int pno=in.nextInt();
			System.out.println("Input the bill number:");
			int bno=in.nextInt();
			System.out.println("Inputthe number of calls:");
			int n_call=in.nextInt();
			c[i]=new customer(name,id,pno,bno,n_call);
		}

		System.out.println(" customers Details:");
		for(i=0;i<n;i++)
		{
			c[i].cal_bil_amt();
			c[i].display();
		}
	}
}


class customer
{
	private String name;
	private int id,pno,bno,n_call;
	private double b_amt;


	customer(String na,int c_id,int p_no,int b_no,int cal )
	{
		name=na;
		id=c_id;
		pno=p_no;
		bno=b_no;
		n_call=cal;
	}


	void cal_bil_amt()
	{
		int rem;
		if(n_call<=100)
		{
			b_amt=100;
		}
		else
		{
			rem=n_call-100;
			if(rem<=50)
			{
				b_amt=100+(rem*0.60);
			}
			else if(rem<=100)
			{
				b_amt=100+(50*0.60)+((rem-50)*0.5);
			}
			else
			{
				b_amt=100+(50*0.60)+(50*0.5)+((rem-100)*0.40);
			}
		}
	}
	void display()
	{

		System.out.println("Customer Name:"+name);
		System.out.printf("Customer id:%d",id);
		System.out.printf("\nTelephone number:%d",pno);
		System.out.printf("\nBill number:%d",bno);
		System.out.printf("\nNumber of calls:%d",n_call);
		System.out.printf("\nBill amont:%f\n",b_amt);

	}
}
