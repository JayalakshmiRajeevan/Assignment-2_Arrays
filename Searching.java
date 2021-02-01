package arrays_assigment;

public class Searching
{
	public static void main(String[] args) 
	{
		int arr[]={1,4,34,56,7};
		int key=56;
		int pos=-1;
		int location=0;
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				pos=1;
				location=i+1;
			}
		}
		if(pos==-1)
		{
			System.out.println(pos);

		}
		else
		{
			System.out.println("element found at "+location);
		}
	}

}
