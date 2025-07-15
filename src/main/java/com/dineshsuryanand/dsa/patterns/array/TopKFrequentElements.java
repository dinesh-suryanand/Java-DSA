package com.dineshsuryanand.dsa.patterns.array;


import java.util.*;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequencies
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0)+1);
        }

        // Step 2: Use a Min-Heap (PriorityQueue) to keep track of top k elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(frequencyMap::get));

        for (int num : frequencyMap.keySet()) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the least frequent element
            }
        }

        // Step 3: Convert heap to result array
        int[] result = new int[k];
        int i = k-1; // last index
        while (!minHeap.isEmpty()) {
            result[i--] = minHeap.poll();
        }



        return result;
    }
}

