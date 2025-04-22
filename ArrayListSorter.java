package project;

import java.util.*;

public class ArrayListSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        System.out.println("Unsorted ArrayList: " + numbers);

        // Sort ArrayList in descending order
        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("Sorted ArrayList in descending order: " + numbers);
    }
}
