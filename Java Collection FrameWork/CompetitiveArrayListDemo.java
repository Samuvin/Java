import java.util.*;
import java.util.stream.Collectors;

public class CompetitiveArrayListDemo {
    public static void main(String[] args) {
        // 1. Initialization
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // 2. Frequency Counting using a Map
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency map: " + frequencyMap);

        // 3. Cumulative Sum (Prefix Sum Array)
        ArrayList<Integer> prefixSum = new ArrayList<>(list.size());
        int sum = 0;
        for (int num : list) {
            sum += num;
            prefixSum.add(sum);
        }
        System.out.println("Prefix Sum Array: " + prefixSum);

        // 4. Finding Minimum and Maximum
        int minElement = Collections.min(list);
        int maxElement = Collections.max(list);
        System.out.println("Min element: " + minElement);
        System.out.println("Max element: " + maxElement);

        // 5. Binary Search (list must be sorted)
        Collections.sort(list); // Ensure sorted order for binary search
        int target = 5;
        int index = Collections.binarySearch(list, target);
        System.out.println("Index of target " + target + " using binary search: " + (index >= 0 ? index : "Not found"));

        // 6. Modifying list in reverse order (useful for backtracking algorithms)
        System.out.print("Reversed list iteration: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // 7. Remove Duplicates (Using Set)
        ArrayList<Integer> listWithDuplicates = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        ArrayList<Integer> uniqueList = new ArrayList<>(new HashSet<>(listWithDuplicates));
        System.out.println("List after removing duplicates: " + uniqueList);

        // 8. Shuffle (randomly shuffle elements)
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        // 9. Rotate List (using Collections.rotate)
        Collections.rotate(list, 2); // Rotates elements to the right by 2 positions
        System.out.println("List after rotation by 2: " + list);

        // 10. Fill list with a single value
        Collections.fill(list, -1);  // Fills entire list with -1
        System.out.println("List after filling with -1: " + list);

        // 11. Sliding Window Sum (calculate sum over a sliding window of size k)
        int windowSize = 3;
        ArrayList<Integer> slidingSums = new ArrayList<>();
        int windowSum = 0;
        for (int i = 0; i < list.size(); i++) {
            windowSum += list.get(i);
            if (i >= windowSize - 1) {
                slidingSums.add(windowSum);
                windowSum -= list.get(i - windowSize + 1);
            }
        }
        System.out.println("Sliding window sums of size " + windowSize + ": " + slidingSums);

        // 12. Conversion to Array (useful in competitive programming for faster indexing)
        Integer[] array = list.toArray(new Integer[0]);
        System.out.println("Converted Array: " + Arrays.toString(array));

        // 13. Count Occurrences of a Specific Element
        int count = Collections.frequency(list, 5);
        System.out.println("Frequency of 5 in list: " + count);

        // 14. List Transformation using Streams (Example: doubling elements)
        ArrayList<Integer> doubledList = list.stream()
                                             .map(n -> n * 2)
                                             .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Doubled List: " + doubledList);

        // 15. Remove Elements in Range
        list.addAll(Arrays.asList(5, 6, 7, 8, 9));  // Re-populating list
        list.subList(2, 5).clear(); // Remove elements from index 2 to 4
        System.out.println("List after removing elements from index 2 to 4: " + list);

        // 16. Checking for Consecutive Sequences (useful for finding if list contains consecutive numbers)
        Collections.sort(list);
        boolean isConsecutive = true;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) != list.get(i - 1) + 1) {
                isConsecutive = false;
                break;
            }
        }
        System.out.println("Is list consecutive? " + isConsecutive);

        list.removeIf(n -> n >= 3 && n <= 7); // Removes elements from 3 to 7 inclusive
    }
}
