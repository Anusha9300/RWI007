import java.util.ArrayList;

public class Arrayremove
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
        // Remove the third element (index 2)
        int indexToRemove = 2;
        
            // Shift elements to the left
            for (int i = indexToRemove; i < arrayList.size() - 1; i++) {
                arrayList.set(i, arrayList.get(i + 1));
            }
            
            // Decrease the size of the ArrayList
            arrayList.remove(arrayList.size() - 1);

        // Print the updated ArrayList
       System.out.println("Element: " + arrayList);
    }
}
