import java.util.Scanner;
class arrange
{
	public static void main(String args[])
	{
		String str,str1;
		String rea1,rea2;
		char []arr,arr1,arr2;
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		str=in.nextLine();

		arr=str.toCharArray();
		n=arr.length;

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					char temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

		str1=str.toLowerCase();
		arr1=str1.toCharArray();
		arr2=str.toCharArray();

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr1[j]>arr1[j+1])
				{
					char temp1,temp2;

					temp1=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp1;

					temp2=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=temp1;
				}
			}
		}

		rea1=String.valueOf(arr);
		rea2=String.valueOf(arr2);

		System.out.println("Output String (with case):"+rea1);
		System.out.println("Output String (without case):"+rea2);
	}
}

