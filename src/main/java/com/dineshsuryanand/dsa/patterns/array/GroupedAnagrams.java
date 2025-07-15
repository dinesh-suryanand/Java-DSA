package com.dineshsuryanand.dsa.patterns.array;

import java.util.*;

public class GroupedAnagrams {
    /**
     * Groups words that are anagrams of each other.
     *
     * @param words Array of words
     * @return List of grouped anagrams
     */
    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            anagramGroups.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(anagramGroups.values());
    }
}
