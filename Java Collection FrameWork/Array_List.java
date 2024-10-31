import java.util.*;
import java.util.stream.Collectors;

public class Array_List 
{
    public static void main(String[] args) {
        // 1. Initialization
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50)); // Initialization using Arrays.asList
        ArrayList<Integer> list1 = new ArrayList<>(List.of(60, 70, 80));             // Initialization using List.of (Java 9+)

        // 2. Adding Elements
        list.add(25);                    // Add an element to the end
        list.add(1, 15);                 // Add element at index
        list.addAll(list1);              // Add all elements from list1 to list
        list.addAll(3, List.of(5, 35));  // Add multiple elements at index 3
        System.out.println("List after additions: " + list);

        // 3. Accessing Elements
        System.out.println("Contains 20? " + list.contains(20));           // Check if element exists
        System.out.println("Element at index 1: " + list.get(1));          // Access element by index
        System.out.println("First occurrence of 10: " + list.indexOf(10)); // Get first index of element
        System.out.println("Last occurrence of 10: " + list.lastIndexOf(10));

        // 4. Modifying Elements
        list.set(3, 100);                // Modify element at index 3
        System.out.println("List after modification: " + list);

        // 5. Removing Elements
        list.remove(Integer.valueOf(30));  // Remove specific element
        list.remove(2);                    // Remove element by index
        list.removeAll(List.of(40, 50));   // Remove all occurrences of specified elements
        list.removeIf(n -> n > 60);        // Remove elements matching a condition
        System.out.println("List after removals: " + list);

        // 6. Additional List Checks
        System.out.println("List size: " + list.size());                    // Get size of the list
        System.out.println("Is the list empty? " + list.isEmpty());         // Check if the list is empty
        System.out.println("List contains all of list1? " + list.containsAll(list1)); // Check if list contains all elements of list1

        // 7. Extracting Portions of the List
        List<Integer> sublist = list.subList(1, 3); // Get a sublist from index 1 to 2
        System.out.println("Sublist: " + sublist);

        // 8. Iterating Over the List
        System.out.print("Using for-loop: ");
        for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + " ");
        System.out.println();

        System.out.print("Using enhanced for-loop: ");
        for (Integer x : list) System.out.print(x + " ");
        System.out.println();

        System.out.print("Using lambda expression: ");
        list.forEach(x -> System.out.print(x + " "));
        System.out.println();

        System.out.print("Using method reference: ");
        list.forEach(System.out::print);
        System.out.println();

        // 9. Using Iterator and ListIterator
        System.out.print("Using Iterator: ");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();

        System.out.print("Using ListIterator (forward and backward): ");
        ListIterator<Integer> listIt = list.listIterator();
        while (listIt.hasNext()) System.out.print(listIt.next() + " ");
        System.out.println();
        while (listIt.hasPrevious()) System.out.print(listIt.previous() + " ");
        System.out.println();

        // 10. Sorting and Reversing
        list.sort(Comparator.naturalOrder());        // Sort in ascending order
        System.out.println("List sorted in ascending order: " + list);
        list.sort(Comparator.reverseOrder());        // Sort in descending order
        System.out.println("List sorted in descending order: " + list);
        Collections.reverse(list);                   // Reverse the list
        System.out.println("List after reversing: " + list);

        // 11. Using Streams and Functional Operations
        List<Integer> evenNumbers = list.stream()
                                        .filter(n -> n % 2 == 0)
                                        .collect(Collectors.toList());  // Collect even numbers
        System.out.println("Even numbers: " + evenNumbers);

        List<Integer> squaredNumbers = list.stream()
                                           .map(n -> n * n)
                                           .collect(Collectors.toList()); // Square each element
        System.out.println("Squared numbers: " + squaredNumbers);

        int sum = list.stream().mapToInt(Integer::intValue).sum();       // Sum all elements
        System.out.println("Sum of elements: " + sum);

        // 12. Parallel Stream for Multi-threaded Processing
        System.out.print("Parallel Stream: ");
        list.parallelStream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 13. Checking Equality of Lists
        ArrayList<Integer> list2 = new ArrayList<>(list);
        System.out.println("Are list and list2 equal? " + list.equals(list2));

        // 14. Clearing the List and Checking Emptiness
        list.clear(); // Clear all elements
        System.out.println("List after clear(): " + list);
        System.out.println("Is list empty? " + list.isEmpty());
    }
}

