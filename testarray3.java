import java.util.*;
class testarray3
{
	void k()
	{
		Scanner ob1=new Scanner(System.in);
		int[][] a=new int[10][10];
                int i,j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]=ob1.nextInt();
			}
		}
		for(i=0;i<2;i++)
		{
			System.out.println();
			for(j=0;j<2;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
		}
	}
	public static void main(String args[])
	{
		testarray3 ob=new testarray3();
		ob.k();
		
	}
}