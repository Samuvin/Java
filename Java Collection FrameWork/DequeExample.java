import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

//We can use deque class for queue deque and stack
//offerfirst  offerLast  pollFirst pollLast peekFirst  peekLast -> does not throw exception return a special value
//addFirst addLast removeFirst removeLast getFirst  getLast     -> Throw exception class
//we can add and remove from front and back
//all operations are constant time
//Internally use Array and they are fast


public class DequeExample {
    public static void main(String[] args) {
        // Initialize the ArrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // 1. Add elements to the deque
        System.out.println("Adding elements:");
        deque.offerLast(12);   // Add to the end
        deque.offerLast(122);
        deque.offerLast(123);
        deque.offerLast(124);
        deque.offerFirst(223);  // Add to the front
        deque.offerFirst(233);
        deque.offerFirst(243);
        deque.offerFirst(253);
        
        // Print the current state of the deque
        System.out.println("Current Deque: " + deque);

        // 2. Iterate through the elements
        System.out.print("Iterating through elements: ");
        for (Integer element : deque) {
            System.out.print(element + " ");
        }
        System.out.println();

        // 3. Polling (removing) elements
        System.out.println("Polling elements:");
        System.out.println("Poll First: " + deque.pollFirst());  // Remove from the front
        System.out.println("Poll Last: " + deque.pollLast());    // Remove from the end
        System.out.println("Deque after polling: " + deque);

        // 4. Peeking at elements
        System.out.println("Peeking elements:");
        System.out.println("Peek First: " + deque.peekFirst());  // View front element
        System.out.println("Peek Last: " + deque.peekLast());    // View end element

        // 5. Remove elements with removeFirst and removeLast
        System.out.println("Removing elements:");
        System.out.println("Remove First: " + deque.removeFirst()); // Throws exception if empty
        System.out.println("Remove Last: " + deque.removeLast());   // Throws exception if empty
        System.out.println("Deque after removals: " + deque);

        // 6. Converting to an array
        Integer[] array = deque.toArray(new Integer[0]);
        System.out.println("Array from Deque: " + Arrays.toString(array));

        // 7. Check size and emptiness
        System.out.println("Size of Deque: " + deque.size());
        System.out.println("Is Deque empty? " + deque.isEmpty());

        // 8. Reversing the Deque
        ArrayDeque<Integer> reversedDeque = new ArrayDeque<>();
        Iterator<Integer> iterator = deque.descendingIterator();  // Reverse iterator
        while (iterator.hasNext()) {
            reversedDeque.offerLast(iterator.next());
        }
        System.out.println("Reversed Deque: " + reversedDeque);

        // 9. Clearing the Deque
        deque.clear();
        System.out.println("Deque after clearing: " + deque);
        System.out.println("Is Deque empty after clear? " + deque.isEmpty());

        // 10. Re-adding elements
        deque.offerLast(5);
        deque.offerLast(10);
        deque.offerLast(15);
        System.out.println("Re-added Deque: " + deque);

        // 11. Using as a stack (LIFO operations)
        deque.push(20); // Push adds to the front (stack behavior)
        System.out.println("Deque after push (as stack): " + deque);
        System.out.println("Pop (remove from front): " + deque.pop());
        System.out.println("Deque after pop: " + deque);
    }
}
