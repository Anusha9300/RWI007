class NumberOfElements
{
	public static void main(String arg[])
	{
	
		int[] array = {5,6,56,7,8,3,76,8,83};
		
		int count=0;
		
		for(int i=0;i<array.length;i++)
		{
			count++;
		}
		
		 System.out.println("Number of elements in array: " + count);  
	}
}