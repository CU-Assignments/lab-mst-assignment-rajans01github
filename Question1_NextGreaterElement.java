// QUESTION 1:
// The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
// You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
// For each element in nums1, find the next greater element in nums2.
// If no such element exists, return -1 for that position.
//
// Example:
// Input: nums1 = [4, 1, 2], nums2 = [1, 3, 4, 2]
// Output: [-1, 3, -1]

import java.util.*;

public class Question1_NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Process nums2 to find next greater elements
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // Prepare result for nums1 using map
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result = nextGreaterElement(nums1, nums2);

        System.out.println("Output: " + Arrays.toString(result)); // Output: [-1, 3, -1]
    }
}
