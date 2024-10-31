import java.util.BitSet;

public class Bit_set 
{
    public static void main(String[] args) {
        // Create two BitSet instances
        BitSet bs1 = new BitSet();
        BitSet bs2 = new BitSet();

        // Set bits for BitSet 1
        bs1.set(0);  // Set bit at index 0
        bs1.set(2);  // Set bit at index 2
        bs1.set(4);  // Set bit at index 4
        bs1.set(6);  // Set bit at index 6
        bs1.set(8);  // Set bit at index 8
        bs1.set(10); // Set bit at index 10

        System.out.println("BitSet 1: " + bs1); // Prints the set bits

        // Check if specific bits are set
        System.out.println("Is bit 1 set in BitSet 1? " + bs1.get(1)); // false
        System.out.println("Is bit 2 set in BitSet 1? " + bs1.get(2)); // true

        // Set bits for BitSet 2
        bs2.set(0);
        bs2.set(2);
        bs2.set(3);
        bs2.set(6);
        bs2.set(8);
        bs2.set(10);

        System.out.println("BitSet 2: " + bs2); // Prints the set bits

        // Bitwise AND operation
        BitSet andResult = (BitSet) bs1.clone(); // Clone bs1 to keep original
        andResult.and(bs2);
        System.out.println("BitSet 1 AND BitSet 2: " + andResult); // Intersection

        // Bitwise OR operation
        BitSet orResult = (BitSet) bs1.clone(); // Clone bs1 to keep original
        orResult.or(bs2);
        System.out.println("BitSet 1 OR BitSet 2: " + orResult); // Union

        // Bitwise XOR operation
        BitSet xorResult = (BitSet) bs1.clone(); // Clone bs1 to keep original
        xorResult.xor(bs2);
        System.out.println("BitSet 1 XOR BitSet 2: " + xorResult); // Symmetric difference

        // Bitwise NOT operation
        BitSet notResult = (BitSet) bs1.clone(); // Clone bs1 to keep original
        notResult.flip(0, 11); // Flip bits from 0 to 10
        System.out.println("BitSet 1 NOT: " + notResult);

        // Clearing specific bits
        bs1.clear(2); // Clear specific bit
        System.out.println("BitSet 1 after clearing bit 2: " + bs1);

        // Checking the size of the BitSet
        System.out.println("Size of BitSet 1: " + bs1.size());
        System.out.println("Length of BitSet 1 (last set bit + 1): " + bs1.length());

        // Setting a range of bits
        bs1.set(12, 15); // Set bits 12, 13, 14
        System.out.println("BitSet 1 after setting range (12-15): " + bs1);

        // Getting the next set bit
        int nextSetBit = bs1.nextSetBit(0);
        System.out.println("Next set bit starting from index 0: " + nextSetBit); // 0

        // Getting all set bits
        System.out.print("All set bits in BitSet 1: ");
        for (int i = 0; i < bs1.size(); i++) {
            if (bs1.get(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line for better readability

        // Finding the cardinality (number of set bits)
        System.out.println("Number of set bits in BitSet 1: " + bs1.cardinality());
    }
}
