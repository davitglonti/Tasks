package algorithms;

import java.util.HashMap;

public class LongestSubarray {
    public static int lenOfLongSubarr(int[] array, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int currentSum = 0;


        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];


            if (currentSum == k) {
                maxLength = i + 1;
            }


            if (map.containsKey(currentSum - k)) {
                maxLength = Math.max(maxLength, i - map.get(currentSum - k)); // მაქსიმალური სიგრძის გამოკითხვა
            }


            if (!map.containsKey(currentSum)) {
                map.put(currentSum, i);
            }
        }

        return maxLength;
    }
}

