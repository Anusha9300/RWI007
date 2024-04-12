class DuplicateElements
{
	public static void main(String arg[])
	{
	 int array[] = {4,6,3,2,4,5,9,8,3,7,5};
	 
		System.out.println("Duplicate Element are");
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<=array.length-1;j++)
			{
				if(array[i]==array[j])
				{
			       System.out.print(array[j]+" ");
				}
			}
		}
		
	}
}