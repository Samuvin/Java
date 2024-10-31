import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Deque;
import java.util.PriorityQueue;

public class Linked_List {
    public static void main(String[] args) {
        // Basic Initialization with LinkedList and Deque
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list1 = new LinkedList<>(List.of(5, 3, 9, 7, 2));

        // Adding Elements
        list1.addFirst(10);     // O(1) - Add to the beginning
        list1.addLast(1);       // O(1) - Add to the end
        list1.add(2, 15);       // O(n) - Add at specific index
        System.out.println("After adding elements: " + list1);

        // Removing Elements
        list1.removeFirst();    // O(1) - Remove first element
        list1.removeLast();     // O(1) - Remove last element
        list1.remove(Integer.valueOf(9)); // O(n) - Remove specific value
        list1.remove(2);       // Removes by index
        System.out.println("After removing elements: " + list1);

        
        // Accessing First and Last Elements
        System.out.println("First Element: " + list1.getFirst());
        System.out.println("Last Element: " + list1.getLast());

       //  Peeking (retrieve without removing)
        System.out.println("Peek (first element): " + list1.peek());
        System.out.println("Peek Last: " + list1.peekLast());

        // Polling (retrieving and removing) First Element
        System.out.println("Poll (remove and return first): " + list1.poll());
        System.out.println("After poll: " + list1);
        System.out.println("Poll First: " + list1.pollFirst());
        System.out.println("Poll Last: " + list1.pollLast());
        
        // Check if list contains specific element
        System.out.println("List contains 10: " + list1.contains(10));
        
         // Cloning the LinkedList
        LinkedList<Integer> clonedList = (LinkedList<Integer>) list1.clone();
        System.out.println("Cloned List: " + clonedList);

        // Sorting the LinkedList
        Collections.sort(list1);
        System.out.println("Sorted List: " + list1);

        // Reversing the LinkedList
        Collections.reverse(list1);
        System.out.println("Reversed List: " + list1);

        // Convert LinkedList to Array
        Integer[] array = list1.toArray(new Integer[0]);
        System.out.println("Converted Array: " + java.util.Arrays.toString(array));

        // Clearing the LinkedList
        list1.clear();
        System.out.println("Is list1 empty after clear? " + list1.isEmpty());

        // Deque (Double-Ended Queue) Operations for Efficient Front and Back Operations
        Deque<Integer> deque = new LinkedList<>(list1);
        deque.offerFirst(20);   // Add at front (similar to addFirst)
        deque.offerLast(25);    // Add at back (similar to addLast)
        System.out.println("Deque after operations: " + deque);

        // Peek Operations - Useful for checking front without removing
        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());

        // Poll Operations - Retrieve and remove elements from both ends
        System.out.println("Poll First: " + deque.pollFirst());
        System.out.println("Poll Last: " + deque.pollLast());

        // Reversing for specific order (often required in two-pointer or BFS algorithms)
        Collections.reverse(deque);
        System.out.println("Reversed Deque: " + deque);

        // Using ListIterator for bidirectional traversal (efficient two-pointer technique)
        ListIterator<Integer> listIterator = list1.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();
        System.out.print("Backward traversal: ");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();

        // Frequency of Elements (Counting occurrences)
        int frequency = Collections.frequency(list1, 3);
        System.out.println("Frequency of 3: " + frequency);

        // Custom Sorting
        list1.sort((a, b) -> b - a); // Sort in descending order
        System.out.println("Sorted List in descending: " + list1);

        // Convert LinkedList to Array (often useful for faster random access)
        Integer[] array = list1.toArray(new Integer[0]);
        System.out.println("Array from LinkedList: " + java.util.Arrays.toString(array));

        // Using PriorityQueue with LinkedList for Dynamic Sorted Access
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(list1);
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();

        // Finding Max Element in LinkedList (O(n))
        int maxElement = Collections.max(list1);
        System.out.println("Max Element: " + maxElement);

        // Finding Min Element in LinkedList (O(n))
        int minElement = Collections.min(list1);
        System.out.println("Min Element: " + minElement);

        // Modifying LinkedList Efficiently for Specific Conditions
        // Remove even numbers for example
        list1.removeIf(n -> n % 2 == 0);
        System.out.println("List after removing even numbers: " + list1);

        // Using Deque as a Stack
        deque.push(100); // Push to the front (stack operation)
        System.out.println("Deque after push: " + deque);
        System.out.println("Pop from stack (Deque): " + deque.pop());

        // Clearing the list when done
        list1.clear();
        System.out.println("Is list1 empty? " + list1.isEmpty());


        // Using PriorityQueue with LinkedList (Min-Heap for Sorted Retrieval)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(list1);
        System.out.print("Elements in PriorityQueue: ");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();

        // Removing Elements by Condition (e.g., Remove all even numbers)
        list1.removeIf(n -> n % 2 == 0);
        System.out.println("List after removing even numbers: " + list1);

        // Using Deque as a Stack
        deque.push(100); // Push to the front (stack operation)
        System.out.println("Deque after push: " + deque);
        System.out.println("Pop from stack (Deque): " + deque.pop());

        // Using Queue Operations with LinkedList
        Queue<Integer> queue = new LinkedList<>(List.of(4, 5, 6));
        queue.offer(7);      // Adds to the queue (end)
        System.out.println("Queue after offer: " + queue);
        System.out.println("Queue poll (removes head): " + queue.poll());
        System.out.println("Queue peek (head element): " + queue.peek());

    }
}
