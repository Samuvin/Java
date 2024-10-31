import java.util.*;

class Tree_map {
    public static void main(String[] args) {
        // 1. Basic Creation and Initialization
        TreeMap<Integer, String> map = new TreeMap<>();
        
        // 2. Creation with Custom Comparator
        // Reverse Order
        TreeMap<Integer, String> reverseMap = new TreeMap<>(Collections.reverseOrder());
        
        // Custom Comparator
        TreeMap<String, Integer> customMap = new TreeMap<>((a, b) -> {
            // Custom comparison logic
            return b.compareTo(a); // Reverse lexicographic order
        });

        // 3. Key Operations
        // Add or Update
        map.put(1, "One");
        map.put(2, "Two");
        
        // Get Value
        String value = map.get(1); // O(log n)
        
        // Remove
        map.remove(1); // O(log n)

        // 4. Checking Existence
        boolean hasKey = map.containsKey(1);
        boolean hasValue = map.containsValue("One");

        // 5. Navigation Methods
        // First and Last Key
        Integer firstKey = map.firstKey(); // O(log n)
        Integer lastKey = map.lastKey(); // O(log n)
        
        // First and Last Entry
        Map.Entry<Integer, String> firstEntry = map.firstEntry();
        Map.Entry<Integer, String> lastEntry = map.lastEntry();

        // 6. Ceiling and Floor Methods
        // Ceiling: Least key >= given key
        Integer ceilingKey = map.ceilingKey(3); // O(log n)
        Map.Entry<Integer, String> ceilingEntry = map.ceilingEntry(3);
        
        // Floor: Greatest key <= given key
        Integer floorKey = map.floorKey(3); // O(log n)
        Map.Entry<Integer, String> floorEntry = map.floorEntry(3);

        // 7. Higher and Lower Methods
        // Higher: Strictly greater key
        Integer higherKey = map.higherKey(3); // O(log n)
        Map.Entry<Integer, String> higherEntry = map.higherEntry(3);
        
        // Lower: Strictly lower key
        Integer lowerKey = map.lowerKey(3); // O(log n)
        Map.Entry<Integer, String> lowerEntry = map.lowerEntry(3);

        // 8. Submap Operations
        // Submap from key1 (inclusive) to key2 (exclusive)
        SortedMap<Integer, String> subMap = map.subMap(1, 5);
        
        // Navigable Submap with inclusive/exclusive options
        NavigableMap<Integer, String> navigableSubMap = 
            map.subMap(1, true, 5, false);

        // 9. Head and Tail Maps
        // Headmap: All entries < key
        SortedMap<Integer, String> headMap = map.headMap(3);
        NavigableMap<Integer, String> navigableHeadMap = map.headMap(3, true);
        
        // Tailmap: All entries >= key
        SortedMap<Integer, String> tailMap = map.tailMap(3);
        NavigableMap<Integer, String> navigableTailMap = map.tailMap(3, true);

        // 10. Descending Map and Key Set
        NavigableMap<Integer, String> descendingMap = map.descendingMap();
        NavigableSet<Integer> descendingKeySet = map.descendingKeySet();

        // 11. Polling Methods
        Map.Entry<Integer, String> pollFirst = map.pollFirstEntry(); // Removes first entry
        Map.Entry<Integer, String> pollLast = map.pollLastEntry();  // Removes last entry

        // 12. Practical Problem-Solving Techniques
        
        // Frequency Counter
        TreeMap<Integer, Integer> frequencyMap = new TreeMap<>();
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Range Frequency Query
        public int getRangeFrequency(TreeMap<Integer, Integer> map, int start, int end) {
            // Get the sum of frequencies between start and end
            return map.subMap(start, true, end, true)
                      .values()
                      .stream()
                      .mapToInt(Integer::intValue)
                      .sum();
        }

        // 13. Complex Comparator Example
        TreeMap<Pair, Integer> complexMap = new TreeMap<>((a, b) -> {
            // Compare based on multiple criteria
            if (a.first != b.first) {
                return Integer.compare(a.first, b.first);
            }
            return Integer.compare(a.second, b.second);
        });

        // 14. Merging Two TreeMaps
        public TreeMap<Integer, Integer> mergeMaps(TreeMap<Integer, Integer> map1, 
                                                   TreeMap<Integer, Integer> map2) {
            TreeMap<Integer, Integer> merged = new TreeMap<>(map1);
            map2.forEach((k, v) -> 
                merged.merge(k, v, (v1, v2) -> v1 + v2)
            );
            return merged;
        }
    }

    // Helper class for complex comparator example
    static class Pair {
        int first, second;
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    // Time Complexity Recap
    /*
    Most TreeMap operations: O(log n)
    - put()
    - get()
    - remove()
    - containsKey()
    - firstKey()
    - lastKey()
    - ceilingKey()
    - floorKey()
    - higherKey()
    - lowerKey()
    */

    // Space Complexity: O(n)
}