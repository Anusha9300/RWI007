class CopyArray
{
 public static void main(String args[])
 {
	int[] array1 = {2,7,6,8,4,9};
	int[] array2 = new int[array1.length];
	
	 // Copying elements from array1 to array2
	 for(int i=0;i<array1.length;i++)
	 {
		 array2[i] = array1[i]; 
	 }
	 
	 //Display array2 copy elements
	 for(int i=0; i<array2.length;i++)
	 {
		 System.out.print(array2[i]+ " ");
	 }
 }
}