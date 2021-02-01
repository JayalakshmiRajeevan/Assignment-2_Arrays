package arrays_assigment;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting 
{
	public static void main(String[] args)
	{
		Scanner d=new Scanner(System.in);
		System.out.println("enter array size");
		int[] a=new int[d.nextInt()];
		System.out.println("enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=d.nextInt();
		}
		System.out.println("Before sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
