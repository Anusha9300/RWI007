class ReverseArray
{
	public static void main(String arg[])
	{
		int[] array = {2,8,19,45,6,45};
		
		System.out.println("Original Array");
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		System.out.println("After reverse Array");
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i]+ " ");
		}
	}
}