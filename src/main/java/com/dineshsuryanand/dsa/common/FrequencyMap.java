package com.dineshsuryanand.dsa.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyMap {

    //method 1
    public static Map<Integer,Integer> createFrequencyMap(int[] nums) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int num: nums) {
            freqMap.put(num,freqMap.getOrDefault(num,0) + 1);
        }
        return freqMap;
    }

    // method 2 using merge method in Map
    public static Map<Integer,Integer> createFrequencyMapConcise(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.merge(num, 1, Integer::sum);
        }
        return freqMap;
    }

    public static Map<Integer,Long> createFrequencyMapStreams(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

    }
}
