import java.util.LinkedHashMap;
import java.util.Map;

/*
Overview
A Linked HashMap is a data structure that combines the features of a 
hash table and a doubly linked list. 
It is designed to maintain the order of insertion of keys while providing 
efficient data retrieval and manipulation operations.

Structure
    Key-Value Storage: 
        Each entry in the Linked HashMap stores a key and its associated 
        value.
    Hash Table: 
        The keys are stored in a hash table, which allows for efficient 
        data retrieval using a hash function.
    Doubly Linked List: 
        Each entry has two pointers:
    next: points to the next entry in the linked list.
    prev: points to the previous entry in the linked list.
    Buckets: The hash table consists of multiple buckets, and each bucket can hold one or more entries. If a bucket becomes full, entries are stored in a linked list format.

Collision Handling
    When a collision occurs (i.e., when two keys hash to the same bucket), the new entry 
    is added to the linked list of that bucket.
Loading Factor: 
    The default loading factor is set to 75%. This means that when 75% of the buckets 
    are filled, the hash table may resize to maintain performance and minimize collisions.
Empty Buckets: 
    At least half of the buckets should remain empty to allow for effective collision resolution.

Insertion and Deletion
Insertion: 
    When a new key-value pair is inserted:
    If the number of entries exceeds the predefined limit (e.g., 10), the oldest entry (the first inserted key) is deleted to make space for the new entry.
    This behavior helps maintain a constant size while preserving the order of insertion.
Order Maintenance: The order of keys is maintained based on their insertion sequence. This is particularly useful for scenarios where the order of access is important, such as in cache memory implementations.
Least Recently Used (LRU): In the context of caching, the least recently used key can be deleted when the capacity is reached.
Performance Characteristics


Time Complexity:

Insertion: O(1)   - Average case.
Retrieval (Get)   : O(1) - Average case.
Deletion (Remove) : O(1) - Average case.

Space Complexity  : 
    The space complexity is O(n), where n is the number of entries stored in the map.
Use Cases
    ->The Linked HashMap is commonly used in scenarios where:
    ->The order of insertion must be preserved.
    ->Efficient data retrieval is required.
    ->Implementing cache mechanisms (e.g., LRU cache).
*/

public class Linked_Hash_Map {
    public static void main(String[] args) {
        // Basic LinkedHashMap example
        System.out.println("=== Basic LinkedHashMap ===");
        basicLinkedHashMapExample();

        // Access order LinkedHashMap example
        System.out.println("\n=== Access Order LinkedHashMap ===");
        accessOrderLinkedHashMapExample();

        // Limited size LinkedHashMap example
        System.out.println("\n=== Limited Size LinkedHashMap ===");
        limitedSizeLinkedHashMapExample();
    }

    // Example demonstrating the basic functionality of LinkedHashMap
    private static void basicLinkedHashMapExample() {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5);
        
        // Inserting elements
        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");
        lhm.put(6, "F"); // Will replace the first element because of load factor

        // Displaying elements
        System.out.println("Elements in LinkedHashMap:");
        lhm.forEach((k, v) -> System.out.print(k + " - " + v + " , "));

        // Accessing elements to demonstrate order maintenance
        System.out.println("\nAccessing keys 5 and 2:");
        lhm.get(5);
        lhm.get(2);
        
        // Displaying elements again to show order maintenance
        System.out.println("Elements after accessing some keys:");
        lhm.forEach((k, v) -> System.out.print(k + " - " + v + " , "));
    }

    // Example demonstrating access order in LinkedHashMap
    private static void accessOrderLinkedHashMapExample() {
        LinkedHashMap<Integer, String> lhm1 = new LinkedHashMap<>(5, 0.75f, true);
        
        // Inserting elements
        lhm1.put(1, "A");
        lhm1.put(2, "B");
        lhm1.put(3, "C");
        lhm1.put(4, "D");
        lhm1.put(5, "E");
        lhm1.put(6, "F"); // Will replace the first element because of load factor

        // Displaying elements
        System.out.println("Elements in Access Order LinkedHashMap:");
        lhm1.forEach((k, v) -> System.out.print(k + " - " + v + " , "));

        // Accessing elements to demonstrate access order
        System.out.println("\nAccessing keys 3 and 2:");
        lhm1.get(3);
        lhm1.get(2);
        
        // Displaying elements again to show access order maintenance
        System.out.println("Elements after accessing some keys:");
        lhm1.forEach((k, v) -> System.out.print(k + " - " + v + " , "));
    }

    // Example demonstrating limiting size of LinkedHashMap
    private static void limitedSizeLinkedHashMapExample() {
        LinkedHashMap<Integer, String> lhm2 = new LinkedHashMap<Integer, String>() {
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                // Remove the eldest entry if the size exceeds 5
                return size() > 5;
            }
        };
        
        // Inserting elements
        lhm2.put(1, "A");
        lhm2.put(2, "B");
        lhm2.put(3, "C");
        lhm2.put(4, "D");
        lhm2.put(5, "E");
        lhm2.put(6, "F"); // This will cause "A" to be removed

        // Displaying elements after limiting size
        System.out.println("Elements in Limited Size LinkedHashMap:");
        lhm2.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
