class BubbleSort
{
 public static void main(String arg[])
 {
	 int array[] = {23,45,7,89,10,12};
	 int temp;
	 for(int i=0;i<array.length;i++)
	 {
		 int flag=0;
		 for(int j=0;j<array.length-1;j++)
		 {
			if(array[j]>array[j+1])
			{
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				flag=1;
			}
		 }
		 if(flag==0)
			 break;
		 
		 
	 }
	 
	 System.out.println("Afer Sort the array");
	 
	 for(int i=0;i<array.length;i++)
	 {
		 System.out.print(array[i]+" ");
	 }
 }
}