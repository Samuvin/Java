import java.util.Arrays;


public class Array
{
    public static void main(String[] args) {
        // 1. Array Declaration and Initialization
        int[] arr1 = new int[10]; // Declare an array of size 10
        int[] arr2 = {1, 2, 3, 4}; // Initialize an array with values
        Integer[] arr3 = new Integer[]{5, 6, null, 8}; // Integer array (can have null values)

        // 2. Accessing Elements
        System.out.println("First element of arr2: " + arr2[0]); // Access the first element
        arr2[1] = 5; // Update the second element
        System.out.println("Updated arr2: " + Arrays.toString(arr2));

        // 3. Getting Length of an Array
        System.out.println("Length of arr2: " + arr2.length); // Get the length of the array

        // 4. Iterating Through an Array
        System.out.print("Elements of arr2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " "); // Print each element
        }
        System.out.println();

        // 5. Copying Arrays
        int[] copyOfArr1 = Arrays.copyOf(arr2, arr2.length); // Copy entire array
        int[] copyOfRange = Arrays.copyOfRange(arr2, 1, 3); // Copy elements from index 1 to 3
        System.out.println("Copy of arr2: " + Arrays.toString(copyOfArr1));
        System.out.println("Copy of range from arr2: " + Arrays.toString(copyOfRange));

        // 6. Filling Arrays
        Arrays.fill(arr1, 5); // Fill arr1 with 5s
        System.out.println("Filled arr1 with 5s: " + Arrays.toString(arr1));

        // 7. Sorting Arrays
        Arrays.sort(arr2); // Sort arr2 in ascending order
        System.out.println("Sorted arr2: " + Arrays.toString(arr2));

        // 8. Searching in Arrays
        int index = Arrays.binarySearch(arr2, 2); // Search for 2 in arr2
        System.out.println("Index of 2 in arr2: " + index);

        // 9. Comparing Arrays
        int comparisonResult = Arrays.compare(arr1, arr2); // Compare arr1 and arr2
        System.out.println("Comparison result of arr1 and arr2: " + comparisonResult);
        //Equals 0
        //First array has less elements -1
        //Second array has less elements 1
        //it will compare element by element
        //Which is greater if a is greater 1 same 0 else -1




        // 10. Checking Equality of Arrays
        boolean areEqual = Arrays.equals(arr1, arr2); // Check if arr1 is equal to arr2
        System.out.println("Are arr1 and arr2 equal? " + areEqual);

        // 11. Hash Code of an Array
        int hashCode = Arrays.hashCode(arr2); // Get hash code of arr2
        System.out.println("Hash code of arr2: " + hashCode);

        // 12. Deep Equality for Multi-dimensional Arrays
        int[][] multiArray1 = {{1, 2}, {3, 4}};
        int[][] multiArray2 = {{1, 2}, {3, 4}};
        boolean areDeepEqual = Arrays.deepEquals(multiArray1, multiArray2); // Check if both multi-dimensional arrays are equal
        System.out.println("Are multiArray1 and multiArray2 deep equal? " + areDeepEqual);

        // 13. Print String Representation of Arrays
        System.out.println("String representation of arr2: " + Arrays.toString(arr2));
        System.out.println("String representation of multi-dimensional array: " + Arrays.deepToString(multiArray1));

        // 14. Set All Elements Using a Generator Function
        int[] generatedArray = new int[5];
        Arrays.setAll(generatedArray, index -> index * 2); // Fill generatedArray with even numbers
        System.out.println("Generated array (even numbers): " + Arrays.toString(generatedArray));

        // 15. Prefix Computation
        Arrays.parallelPrefix(generatedArray, (left, right) -> left + right); // Prefix sum
        System.out.println("Array after parallel prefix sum: " + Arrays.toString(generatedArray));

        // 16. Parallel Set All
        Arrays.parallelSetAll(generatedArray, index -> index * 3); // Fill with multiples of 3
        System.out.println("Array filled with multiples of 3: " + Arrays.toString(generatedArray));
    }
}
