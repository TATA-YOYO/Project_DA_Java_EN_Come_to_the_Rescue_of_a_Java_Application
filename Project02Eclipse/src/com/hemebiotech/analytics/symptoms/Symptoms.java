package com.hemebiotech.analytics.symptoms;

import com.hemebiotech.analytics.tools.IAlphabeticalArraySorter;
import com.hemebiotech.analytics.tools.AlphabeticalSorter;
import java.util.Map;

/**
 * This class makes it possible to instantiate an object
 * which carries the symptoms in the form of an array classified in alphabetical order and a map.
 * It is during the construction of the object that the symptoms are ordered.
 */
public class Symptoms {
    private static IAlphabeticalArraySorter alphabeticalSorter = new AlphabeticalSorter();
    private Map<String, Integer> mapOfSymptoms;
    private String[] symptomsArray;

    public Symptoms( Map<String, Integer> mapOfSymptoms) {
        this.mapOfSymptoms =  mapOfSymptoms;
        this.symptomsArray = new String[mapOfSymptoms.size()];
        int currentIndex = 0;
        for (Map.Entry<String, Integer> entry : mapOfSymptoms.entrySet()) {
            symptomsArray[currentIndex] = entry.getKey();
            currentIndex++;
        }
        symptomsArray = alphabeticalSorter.stringArraySort(symptomsArray);
    }

    public Map<String, Integer> getMapOfSymptoms() {
        return mapOfSymptoms;
    }

    public String[] getSymptomsArray() {
        return symptomsArray;
    }
}
