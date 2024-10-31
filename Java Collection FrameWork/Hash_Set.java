import java.util.HashSet;
/*
Hash Table 
Overview
A hash table is a data structure that stores key-value pairs 
for efficient data retrieval. It uses a hash function to compute an 
index into an array of buckets or slots, from which the desired value can be found.

Key Concepts
    Bucket:
    Each location in the hash table is called a bucket. 
    A bucket can hold either a key-value pair or multiple pairs (in case of collisions).

Initial Size:
The default size of a hash table is typically 16.
The size of the hash table can automatically adjust (resize) as elements are added.

Hash Function:
A hash function is used to compute the index for inserting a value into the hash table.
The goal of the hash function is to distribute keys uniformly across the available buckets.

Time Complexity:
Inserting, deleting, and searching for values in a hash table ideally operates in constant time (O(1)).
However, this performance can degrade if there are many collisions.

Collision Handling:
Collisions occur when two keys hash to the same index.
There are two primary methods to handle collisions: open addressing and chaining.

Collision Resolution Techniques

Open Addressing:
When a collision occurs, the algorithm finds the next available bucket in the array.
This involves searching sequentially through the array until an empty bucket is found.
It is important to maintain a balance, where no more than 75% of the table is used, leaving 25% empty for future insertions.
Ideally, a 50% filled and 50% empty ratio is preferred for optimal performance.

Chaining:
In this method, each bucket contains a linked list (or another data structure) to hold multiple key-value pairs.
When a collision occurs, the new value is simply added to the linked list at the corresponding bucket index.
To find a value, traverse the linked list at that index until the desired key is found.

Resizing
The size of the hash table can dynamically increase when the number of elements exceeds a certain threshold (commonly 75% of the current capacity).
When resizing, a new larger array is created, and all existing key-value pairs are rehashed into the new array based on the hash function.

Summary
Hash tables are powerful data structures that offer average-case constant 
time complexity for key operations such as insertions, deletions, and 
lookups. Understanding how to manage collisions, either through open addressing 
or chaining, is crucial for maintaining the performance of a hash table. 
Proper sizing and resizing strategies ensure that the hash table remains 
efficient as it grows.

*/

/**
 * Hash_Set demonstrates the usage of HashSet in Java.
 * HashSet is part of the Java Collections Framework and is used to store unique elements.
 * It provides constant time performance for basic operations (add, remove, contains).
 */
public class Hash_Set {
    public static void main(String[] args) {
        // Create a HashSet with default initial capacity (16) and load factor (0.75)
        HashSet<Integer> hashSet = new HashSet<>();
        
        // Adding elements to the HashSet
        hashSet.add(10); // Adds 10
        hashSet.add(20); // Adds 20
        hashSet.add(20); // Duplicate element, will not be added

        // Create a HashSet with a specified initial capacity
        HashSet<Integer> hashSet1 = new HashSet<>(20); // Initial capacity of 20
        hashSet1.add(30);
        hashSet1.add(40);
        
        // Create a HashSet with specified initial capacity and load factor
        HashSet<Integer> hashSet2 = new HashSet<>(20, 0.25f); // Only 25% of the hashtable will be used
        for (int i = 1; i <= 5; i++) {
            hashSet2.add(i * 10); // Adding 10, 20, 30, 40, 50
        }

        // Display HashSet contents
        System.out.println("hashSet: " + hashSet);
        System.out.println("hashSet1: " + hashSet1);
        System.out.println("hashSet2: " + hashSet2);

        // Basic operations
        // Check if an element is present
        System.out.println("Contains 20 in hashSet? " + hashSet.contains(20)); // true
        System.out.println("Contains 50 in hashSet2? " + hashSet2.contains(50)); // false

        // Remove an element
        hashSet.remove(10);
        System.out.println("After removing 10: " + hashSet);

        // Size of the HashSet
        System.out.println("Size of hashSet: " + hashSet.size());
        System.out.println("Size of hashSet1: " + hashSet1.size());
        System.out.println("Size of hashSet2: " + hashSet2.size());

        // Check if the HashSet is empty
        System.out.println("Is hashSet empty? " + hashSet.isEmpty());

        // Clear the HashSet
        hashSet.clear();
        System.out.println("After clearing, is hashSet empty? " + hashSet.isEmpty()); // true

        // Add multiple elements using addAll
        HashSet<Integer> anotherSet = new HashSet<>();
        anotherSet.addAll(hashSet1);
        System.out.println("anotherSet after addAll: " + anotherSet);

        // Iterate through the HashSet using for-each loop
        System.out.println("Iterating through hashSet1:");
        for (Integer value : hashSet1) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Using forEach method with a lambda expression
        System.out.println("Using forEach with lambda:");
        hashSet1.forEach(value -> System.out.print(value + " "));
        System.out.println();

        // Check for intersection with another set
        HashSet<Integer> intersectionSet = new HashSet<>(hashSet1);
        intersectionSet.retainAll(hashSet2); // Keeps only elements that are also in hashSet2
        System.out.println("Intersection of hashSet1 and hashSet2: " + intersectionSet);

        // Check for union of two sets
        HashSet<Integer> unionSet = new HashSet<>(hashSet1);
        unionSet.addAll(hashSet2); // Adds all elements from hashSet2
        System.out.println("Union of hashSet1 and hashSet2: " + unionSet);
    }
}
