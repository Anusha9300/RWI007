public class FrequencyElements {
    public static void main(String[] args) {
        int[] array = {23, 5, 7, 23, 9, 8, 5, 5};

        for (int i = 0; i < array.length; i++) {
            int count = 1; // Initialize count for each element
            if (array[i] != -1) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        // Mark the element as visited
                        array[j] = -1;
                    }
                }
                System.out.println("Element: " + array[i] + ", Frequency: " + count);
            }
        }
    }
}
