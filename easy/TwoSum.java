 package easy;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the value and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the hash map
            if (map.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }

            // Add the current number and its index to the hash map
            map.put(nums[i], i);
        }

        // If no solution found (as per problem statement, this line will never be reached)
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {4, 10, 11, 5};
        int target = 9;
        int[] result = twoSum(nums, target);

        // Output the result
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
