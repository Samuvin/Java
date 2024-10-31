import java.util.*;
import java.util.function.Function;
import java.util.stream.*; 
public class Hash_map 
{
    public static void main(String[] args) 
    {
        // 1. Basic Creation and Initialization
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> initialMap = new HashMap<>() {{
            put("initial", 100);
        }};

        // 2. Creation with Initial Capacity and Load Factor
        HashMap<String, Integer> customMap = new HashMap<>(16, 0.75f);

        // 3. Key Operations
        // Add or Update
        map.put("key", 10);
        map.putIfAbsent("key", 20); // Only if key doesn't exist

        // Get Value
        int value = map.get("key"); // Returns null if key not found
        int valueOrDefault = map.getOrDefault("key", 0); // Safe retrieval

        // Remove
        map.remove("key");
        map.remove("key", 10); // Remove only if key has specific value

        // 4. Checking Existence
        boolean hasKey = map.containsKey("key");
        boolean hasValue = map.containsValue(10);

        // 5. Iteration Techniques
        // Method 1: Iterate over keys
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Method 2: Iterate over entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Method 3: Java 8 forEach
        map.forEach((k, v) -> System.out.println(k + ": " + v));

        // 6. Advanced Manipulation
        // Merge Operation
        map.merge("key", 1, Integer::sum); // Add or update
        map.merge("key", 1, (oldValue, newValue) -> oldValue + newValue);

        // Compute If Absent
        map.computeIfAbsent("key", k -> calculateValue(k));

        // Compute If Present
        map.computeIfPresent("key", (k, v) -> v * 2);

        // 7. Frequency Counter (Most Common Use Case)
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // 8. Finding Most Frequent Element
        int mostFrequent = freqMap.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(null);
        System.out.println("Most Frequent Element: " + mostFrequent);

        // 9. Inverse Frequency Map
        HashMap<Integer, List<Integer>> inverseFreqMap = new HashMap<>();
        freqMap.forEach((num, freq) ->
            inverseFreqMap.computeIfAbsent(freq, k -> new ArrayList<>()).add(num)
        );

        // 10. Complex Key Techniques
        // HashMap with Custom Objects as Keys
        class Person {
            String name;
            int age;

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Person person = (Person) o;
                return age == person.age && Objects.equals(name, person.name);
            }

            @Override
            public int hashCode() {
                return Objects.hash(name, age);
            }
        }

        // 11. Grouping and Collecting
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        Map<Integer, List<String>> groupedByLength = words.stream()
            .collect(Collectors.groupingBy(String::length));

        // 12. Counting Techniques
        Map<String, Long> wordCounts = words.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // 13. Preallocate size if known
        HashMap<Integer, String> largeMap = new HashMap<>(1000000);

        // 14. Thread-Safe Version
        Map<String, Integer> concurrentMap = Collections.synchronizedMap(new HashMap<>());
    }

    // Utility method for computation
    private static int calculateValue(String key) {
        // Complex calculation logic
        return key.length();
    }

    // Two Sum Problem Implementation
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complementMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (complementMap.containsKey(complement)) {
                return new int[]{complementMap.get(complement), i};
            }
            complementMap.put(nums[i], i);
        }
        return new int[]{};
    }

    // Anagram Grouping
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            anagramMap.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(anagramMap.values());
    }
}


// Performance and Complexity Cheat Sheet
/*
Time Complexities:
- put(): O(1)
- get(): O(1)
- remove(): O(1)
- containsKey(): O(1)

Space Complexity: O(n)

Default Load Factor: 0.75
Default Initial Capacity: 16

Collision Resolution: Separate Chaining
*/

// Pro Tips for Competitive Programming
/*
1. Always use getOrDefault() for safe retrieval
2. Prefer computeIfAbsent() for lazy initialization
3. Use merge() for frequency counting
4. Consider space-time tradeoffs
5. Be cautious with mutable keys
6. Preallocate size for large maps
*/