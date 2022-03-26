package com.hemebiotech.analytics.tools;

/**
 * Arranges in alphabetical order an array of Strings from an input array,
 * then returns it.
 */
public class AlphabeticalSorter implements IAlphabeticalArraySorter {
    @Override
    public String[] stringArraySort(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0)
                {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        return words;
    }
}
