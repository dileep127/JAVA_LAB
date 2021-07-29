import java.util.Scanner;
class e_grade
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.input();
		s1.calculate();
		s1.display();
	}
}
class Student
{
	Scanner in=new Scanner(System.in);

	int m[]=new int[3];
	String name;
	int rno;
	char grade;
	float per;

	void input()
	{
		System.out.println("Enter the Rno of student");
		rno=in.nextInt();
		System.out.println("Enter the name of the student:");
		name=in.next();
		for(int i=0;i<3;i++)
		{
			try
			{
				System.out.printf("Enter the marks of subject%d:",i+1);
				m[i]=in.nextInt();
				if(m[i]<0||m[i]>100)
				{
					throw new NumberFormatException();
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("Invalid mark entered");
			}
		}
	}

	void calculate()
	{
		per=(m[0]+m[1]+m[2])/3;

		if(per>=80)
		grade='A';
		else if(per>=60)
		grade='B';
		else if(per>=40)
		grade='C';
		else
		grade='D';
	}

	void display()
	{
		System.out.println("Name of student: "+name);
		System.out.println("Rno of student: "+rno);
		for(int i=0;i<3;i++)
		System.out.printf("Marks in subject%d: %f\n",i+1,m[i]);
		System.out.println("Percentage:"+per);
		System.out.println("Grade:"+grade);
	}
}



