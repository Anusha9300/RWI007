import java.util.ArrayList;

public class Arrayiterate
{
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add some String elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Elderberry");
        System.out.println(arrayList);
        // Iterate through the ArrayList without using predefined functions
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String element = arrayList.get(i);
            System.out.println("Element :"+ element);
        }
    }
}
 