package arrays_assigment;

public class LargestAndSmallest 
{
	public static void main(String[] args)
	{
		int[] arr={3,1,6,5,2,12,25};
		int large=arr[0];
		int seclarge=0;
		int small=arr[0];
		int secsmall=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				seclarge=large;
				large=arr[i];
			}
			if(seclarge<arr[i]&&arr[i]!=large)
			{
				seclarge=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<small)
			{
				secsmall=small;
				small=arr[i];
			}
			if(secsmall>arr[i]&&arr[i]!=small)
			{
				secsmall=arr[i];
			}
		}
			System.out.println("Largest number is "+large);
			System.out.println("Second largest number is "+seclarge);
			System.out.println("Smallest number is "+small);
			System.out.println("Second smallest number is "+secsmall);
	}
}
