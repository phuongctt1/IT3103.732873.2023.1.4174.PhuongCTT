
import java.util.Arrays;
import java.util.Scanner;

public class ArraySortAndAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Create the array
        int[] array = new int[size];
        
        // Read the array elements from the user
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Sort the array
        Arrays.sort(array);
        
        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));
        
        // Calculate the sum of array elements
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        
        // Calculate the average of array elements
        double average = (double) sum / size;
        
        // Print the sum and average
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        // Close the scanner
        scanner.close();
    }
}
