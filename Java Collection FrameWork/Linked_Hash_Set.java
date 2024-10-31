import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hash_Set 
{
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        
        // 1. add(E e) - Adds the specified element to this set if it's not already present
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("E");
        lhs.add("A"); // Duplicate element, won't be added again

        System.out.println("Original LinkedHashSet: " + lhs);

        // 2. remove(Object o) - Removes the specified element from the set if it exists
        lhs.remove("D");
        System.out.println("After removing 'D': " + lhs);

        // 3. contains(Object o) - Returns true if the set contains the specified element
        System.out.println("Contains 'B': " + lhs.contains("B"));
        System.out.println("Contains 'D': " + lhs.contains("D"));

        // 4. isEmpty() - Returns true if the set is empty
        System.out.println("Is the LinkedHashSet empty? " + lhs.isEmpty());

        // 5. size() - Returns the number of elements in the set
        System.out.println("Size of LinkedHashSet: " + lhs.size());

        // 6. iterator() - Returns an iterator over the elements in the set
        Iterator<String> iterator = lhs.iterator();
        System.out.print("LinkedHashSet elements using iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 7. clear() - Removes all elements from the set
        lhs.clear();
        System.out.println("After clearing LinkedHashSet: " + lhs);
    }
}
