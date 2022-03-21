package com.hemebiotech.analytics;

public class AlphabeticalSorter implements IAlphabeticalArraySorter {
    @Override
    public String[] stringArraySort(String[] words) {
        int h = 4;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0)//words[i] is greater than words[j]
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
