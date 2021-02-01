package arrays_assigment;

import java.util.Arrays;

public class ArrayMerge
{
	public void merge()
	{
		int a[]={2,3,6,1};
		int b[]={5,2,8,6};
		int a1=a.length;
		int b1=b.length;
		int c1=a1+b1;
		int c[]=new int[a1+b1];
		int i=0;
		while(i<a1)
		{
			c[i]=a[i];
			i++;
		}
		int j=0;
		while(j<b1)
		{
			c[i++]=b[j++];
		}
		System.out.println("After merging:");
		for(i=0;i<c1;i++)
		{
			System.out.print(" "+c[i]);
		}
	}
	public static void main(String[] args)
	{
		ArrayMerge op=new ArrayMerge();
		op.merge();
	}
}
