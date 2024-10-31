import java.util.Enumeration;
import java.util.Hashtable;

// Hashtable Documentation:
        
        // 1. Legacy Class
        //    - `Hashtable` is a legacy class that was widely used in earlier versions of Java.
        //    - Part of the original Java 1.0 release, before the introduction of the Collections Framework in Java 2.
        
        // 2. Non-Generic by Default
        //    - In older versions, `Hashtable` could only store objects.
        //    - It treats everything as `Object`, meaning all keys and values were `Object` by default.
        //    - To retrieve values, casting to the appropriate type was required:
        //        Example: `String value = (String) ht.get(key);`

        // 3. Generics Support (Java 5+)
        //    - Since Java 5, `Hashtable` supports generics, allowing for type-safe entries.
        //    - Example: `Hashtable<Integer, String> ht = new Hashtable<>();`

        // 4. Iteration Mechanism
        //    - Unlike newer collection types (`HashMap`, `ArrayList`, etc.), `Hashtable` doesn’t have an `Iterator` by default.
        //    - Instead, it uses `Enumeration` for traversing elements, which is also part of Java’s legacy code.

        // 5. Enumeration for Traversal
        //    - `Enumeration` is used to iterate through `Hashtable` entries.
        //    - You can retrieve keys using `keys()` and values using `elements()`:


public class Hash_Table {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable ht1=new Hashtable();
        //used in older version
        //generic type consider both as objects
        //Consider Everything as a object
        //Returns object
        //when retrieveing need to typecast
        //No iterator available
        //It has enumerator it will iterate through all elements

        //Generic Version
        Hashtable<Integer, String> ht = new Hashtable<>();

        // 1. put(K key, V value) - Adds key-value pairs to the Hashtable
        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(5, "E");
        System.out.println("Initial Hashtable: " + ht);

        // 2. get(Object key) - Retrieves the value for a specified key
        System.out.println("Value for key 1: " + ht.get(1));

        // 3. remove(Object key) - Removes the key-value pair for a specified key
        ht.remove(5);
        System.out.println("After removing key 5: " + ht);

        // 4. contains(Object value) - Checks if a specific value is present
        System.out.println("Contains value 'C'? " + ht.contains("C"));

        // 5. containsKey(Object key) - Checks if a specific key is present
        System.out.println("Contains key 2? " + ht.containsKey(2));

        // 6. containsValue(Object value) - Checks if a specific value is present (similar to contains)
        System.out.println("Contains value 'B'? " + ht.containsValue("B"));

        // 7. clear() - Removes all entries from the Hashtable
        // ht.clear();
        // System.out.println("After clearing Hashtable: " + ht);

        // 8. isEmpty() - Checks if the Hashtable is empty
        System.out.println("Is Hashtable empty? " + ht.isEmpty());

        // 9. size() - Returns the number of entries in the Hashtable
        System.out.println("Size of Hashtable: " + ht.size());

        // 10. keys() - Returns an Enumeration of all keys in the Hashtable
        Enumeration<Integer> keys = ht.keys();
        System.out.print("Keys in Hashtable: ");
        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + " ");
        }
        System.out.println();

        // 11. elements() - Returns an Enumeration of all values in the Hashtable
        Enumeration<String> values = ht.elements();
        System.out.print("Values in Hashtable: ");
        while (values.hasMoreElements()) {
            System.out.print(values.nextElement() + " ");
        }
        System.out.println();

        // 12. putIfAbsent(K key, V value) - Adds a key-value pair if the key is not already present
        ht.putIfAbsent(3, "Z"); // Won't add since key 3 already exists
        ht.putIfAbsent(6, "F"); // Adds since key 6 is absent
        System.out.println("After putIfAbsent: " + ht);

        // 13. compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
        ht.compute(2, (k, v) -> v + "Z");
        System.out.println("After compute on key 2: " + ht);

        // 14. computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
        ht.computeIfAbsent(7, k -> "G");
        System.out.println("After computeIfAbsent on key 7: " + ht);

        // 15. computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
        ht.computeIfPresent(7, (k, v) -> v + "H");
        System.out.println("After computeIfPresent on key 7: " + ht);

        // Summary of the Hashtable
        System.out.println("Final Hashtable: " + ht);
    }
}
