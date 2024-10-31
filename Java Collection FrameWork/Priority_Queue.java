import java.util.*;


//class MyComp implements Comparator<Integer>
//{
//    public int compare(Integer o1,Integer o2)
//    {
//        if(o1<o2)
//            return 1;
//        if(o1>o2)
//            return -1;
//        return 0;
//    }
//}

class MyComp implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        return o2 - o1; // Max-Heap comparison (higher value has higher priority)
    }
}

public class Priority_Queue {
    public static void main(String[] args) {
        // Default Priority Queue (Min-Heap)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(10);
        minHeap.offer(12);
        minHeap.offer(123);
        minHeap.offer(432);
        minHeap.offer(43243);

        // Display the elements in the min-heap
        System.out.println("Min-Heap Elements (Priority Queue):");
        minHeap.forEach((q) -> System.out.print(q + " "));
        System.out.println();

        // Peek the minimum element
        System.out.println("Peek Min Element: " + minHeap.peek());

        // Poll (remove) the minimum element
        System.out.println("Polling Min Element: " + minHeap.poll());
        System.out.println("After Polling Min-Heap:");
        minHeap.forEach((q) -> System.out.print(q + " "));
        System.out.println();

        // Max-Heap using custom comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new MyComp());
        maxHeap.offer(10);
        maxHeap.offer(12);
        maxHeap.offer(123);
        maxHeap.offer(432);
        maxHeap.offer(43243);

        // Display the elements in the max-heap
        System.out.println("Max-Heap Elements:");
        maxHeap.forEach((q) -> System.out.print(q + " "));
        System.out.println();

        // Peek the maximum element
        System.out.println("Peek Max Element: " + maxHeap.peek());

        // Poll (remove) the maximum element
        System.out.println("Polling Max Element: " + maxHeap.poll());
        System.out.println("After Polling Max-Heap:");
        maxHeap.forEach((q) -> System.out.print(q + " "));
        System.out.println();

        // Additional Operations
        System.out.println("Size of Min-Heap: " + minHeap.size());
        System.out.println("Is Min-Heap empty? " + minHeap.isEmpty());
        System.out.println("Removing all elements from Min-Heap...");

        // Clearing the Min-Heap
        minHeap.clear();
        System.out.println("Is Min-Heap empty after clear? " + minHeap.isEmpty());

        // Re-populating the Max-Heap for further operations
        maxHeap.offer(100);
        maxHeap.offer(200);
        maxHeap.offer(300);

        // Checking if an element exists
        System.out.println("Does Max-Heap contain 200? " + maxHeap.contains(200));
        System.out.println("Does Max-Heap contain 400? " + maxHeap.contains(400));

        // Displaying all elements in max-heap
        System.out.println("Final Max-Heap Elements:");
        maxHeap.forEach((q) -> System.out.print(q + " "));
        System.out.println();

        // Converting the max-heap to an array
        Integer[] array = maxHeap.toArray(new Integer[0]);
        System.out.println("Max-Heap as Array: " + Arrays.toString(array));
    }
}
