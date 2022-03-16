package com.hemebiotech.analytics;

public class AlphabeticalSorter implements IAlphabeticalArraySorter {

    int compareStrings(String word1, String word2) {
        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            if ((int) word1.charAt(i) != (int) word2.charAt(i))//comparing unicode values
                return (int) word1.charAt(i) - (int) word2.charAt(i);
        }
        if (word1.length() != word2.length())//smaller word is occurs at the beginning of the larger word
            return word1.length() - word2.length();
        else
            return 0;
    }

    public String[] stringArraySort(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (compareStrings(words[i], words[j]) > 0)//words[i] is greater than words[j]
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
