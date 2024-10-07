import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class DataStructurePerformance {

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000, 1000000};
        for (int size : sizes) {
            System.out.println("Size: " + size);
            measureArray(size);
            measureArrayList(size);
            measureLinkedList(size);
            measureHashSet(size);
            System.out.println();
        }
    }

    private static void measureArray(int size) {
        long startTime, endTime;
        int[] array = new int[size];

        // Insertion
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        endTime = System.nanoTime();
        System.out.println("Array Insertion Time: " + (endTime - startTime) + " ns");

        // Lookup
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            int val = array[i];
        }
        endTime = System.nanoTime();
        System.out.println("Array Lookup Time: " + (endTime - startTime) + " ns");

        // Deletion
        startTime = System.nanoTime();
        array[size - 1] = 0; // Simulating deletion
        endTime = System.nanoTime();
        System.out.println("Array Deletion Time: " + (endTime - startTime) + " ns");
    }

    private static void measureArrayList(int size) {
        long startTime, endTime;
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Insertion
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList Insertion Time: " + (endTime - startTime) + " ns");

        // Lookup
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            int val = arrayList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList Lookup Time: " + (endTime - startTime) + " ns");

        // Deletion
        startTime = System.nanoTime();
        arrayList.remove(size - 1); // Simulating deletion
        endTime = System.nanoTime();
        System.out.println("ArrayList Deletion Time: " + (endTime - startTime) + " ns");
    }

    private static void measureLinkedList(int size) {
        long startTime, endTime;
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Insertion
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList Insertion Time: " + (endTime - startTime) + " ns");

        // Lookup
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            int val = linkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList Lookup Time: " + (endTime - startTime) + " ns");

        // Deletion
        startTime = System.nanoTime();
        linkedList.remove(size - 1); // Simulating deletion
        endTime = System.nanoTime();
        System.out.println("LinkedList Deletion Time: " + (endTime - startTime) + " ns");
    }

    private static void measureHashSet(int size) {
        long startTime, endTime;
        HashSet<Integer> hashSet = new HashSet<>();

        // Insertion
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("HashSet Insertion Time: " + (endTime - startTime) + " ns");

        // Lookup
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            boolean exists = hashSet.contains(i);
        }
        endTime = System.nanoTime();
        System.out.println("HashSet Lookup Time: " + (endTime - startTime) + " ns");

        // Deletion
        startTime = System.nanoTime();
        hashSet.remove(size - 1); // Simulating deletion
        endTime = System.nanoTime();
        System.out.println("HashSet Deletion Time: " + (endTime - startTime) + " ns");
    }
}

