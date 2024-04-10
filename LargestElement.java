class LargestElement
{
  public static void main(String arg[])
  {
	  int[] array = {23,55,3,78,65,56};
	  int max=array[0];
	  
	  for(int i=0;i<array.length;i++)
	  {
		  if(max<array[i])
		  {
			  max = array[i];
		  }
	  }
	   System.out.println("Largest element present in given array: " + max);  
  }
}