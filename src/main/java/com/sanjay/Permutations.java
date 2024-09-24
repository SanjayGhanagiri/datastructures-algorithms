package com.sanjay;
import java.util.ArrayList;
import java.util.List;

public class Permutations {

    // Function to generate all permutations of an array
    public static void generatePermutations(int[] array, int start, List<List<Integer>> result) {
        if (start == array.length) {
            // Add the current permutation to the result list
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : array) {
                currentPermutation.add(num);
            }
            result.add(currentPermutation);
        } else {
            for (int i = start; i < array.length; i++) {
                // Swap elements to generate a new permutation
                swap(array, start, i);
                generatePermutations(array, start + 1, result);  // Recursive call to generate permutations
                swap(array, start, i);  // Swap back to restore the original array
            }
        }
    }

    // Utility function to swap two elements in the array
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};  // Example input array
        List<List<Integer>> permutations = new ArrayList<>();

        generatePermutations(array, 0, permutations);

        // Print all generated permutations
        System.out.println("Generated permutations:");
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}