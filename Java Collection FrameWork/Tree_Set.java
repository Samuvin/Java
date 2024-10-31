import java.util.*;

/*
TreeSet is part of the Java Collections Framework and is a 
collection that implements the Set interface. It is used to store elements
in a sorted order, ensuring that no duplicate elements are present. 
The elements in a TreeSet are ordered according to their natural ordering 
or by a specified comparator. The operations on a TreeSet, 
such as insertion, deletion, and access, have a time complexity of O(log n).
*/

public class Tree_Set {
    public static void main(String[] args) {
        // Initialize a TreeSet with some elements
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(12, 3, 4, 5, 6, 7, 510));

        // Display the TreeSet
        System.out.println("Initial TreeSet: " + treeSet);

        // Add elements
        treeSet.add(10);
        System.out.println("After adding 10: " + treeSet);
        
        // Attempt to add a duplicate
        treeSet.add(12); // Won't add since it's a duplicate
        System.out.println("After trying to add duplicate 12: " + treeSet);

        // Remove elements
        treeSet.remove(3);
        System.out.println("After removing 3: " + treeSet);

        // Check if an element exists
        System.out.println("Contains 6? " + treeSet.contains(6));
        System.out.println("Contains 20? " + treeSet.contains(20));

        // Size and emptiness
        System.out.println("Size of TreeSet: " + treeSet.size());
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

        // Getting the first and last elements
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // Using ceiling and floor
        System.out.println("Ceiling of 8: " + treeSet.ceiling(8)); // Nearest greater or equal
        System.out.println("Floor of 8: " + treeSet.floor(8)); // Nearest less or equal

        // Polling elements
        System.out.println("Polling first: " + treeSet.pollFirst());
        System.out.println("After polling first: " + treeSet);
        System.out.println("Polling last: " + treeSet.pollLast());
        System.out.println("After polling last: " + treeSet);

        // Clear the TreeSet
        treeSet.clear();
        System.out.println("After clearing, is TreeSet empty? " + treeSet.isEmpty());

        // Re-initialize the TreeSet for further demonstrations
        treeSet.addAll(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Re-initialized TreeSet: " + treeSet);

        // Subset example
        SortedSet<Integer> subSet = treeSet.subSet(20, 40);
        System.out.println("Subset from 20 to 40 (exclusive): " + subSet);

        // Head set example
        SortedSet<Integer> headSet = treeSet.headSet(30);
        System.out.println("Head set up to 30 (exclusive): " + headSet);

        // Tail set example
        SortedSet<Integer> tailSet = treeSet.tailSet(30);
        System.out.println("Tail set from 30 (inclusive): " + tailSet);

        // Descending set example
        NavigableSet<Integer> descendingSet = treeSet.descendingSet();
        System.out.println("Descending set: " + descendingSet);

        // Iterating through the TreeSet
        System.out.println("Iterating through TreeSet:");
        for (Integer num : treeSet) {
            System.out.println(num);
        }

        // Checking if TreeSet is sorted
        System.out.println("TreeSet is sorted: " + treeSet);



        //Treeset is implemting Collections
        Collection<Integer>pq=new TreeSet<>();
        //we can initialize like this but we can only use the functionlities of the collection only
        SortedSet<Integer>set1=new TreeSet<>();
    }
}
