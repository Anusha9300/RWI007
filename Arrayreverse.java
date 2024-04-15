import java.util.ArrayList;

public class Arrayreverse
 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add some elements to the ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);
		
		for(int i=arrayList.size()-1;i>=0;i--)
		{
			System.out.print(arrayList.get(i)+" ");
		}
	}
 }