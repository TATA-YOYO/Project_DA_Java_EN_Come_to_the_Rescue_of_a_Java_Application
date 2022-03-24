package com.hemebiotech.analytics.objects_classes;

import com.hemebiotech.analytics.IAlphabeticalArraySorter;
import com.hemebiotech.analytics.IReadSymptoms;
import java.io.IOException;
import java.util.Map;

/**
 * This class makes it possible to instantiate an object
 * which carries the symptoms in the form of an array classified in alphabetical order and a map.
 * It is during the construction of the object that the symptoms are ordered and counted.
 */
public class Symptoms {
    private Map<String, Integer> mapOfSymptoms;
    private String[] symptomsArray;

    public Symptoms(IReadSymptoms read, IAlphabeticalArraySorter sorter, String pathOfSymptomsFile) throws IOException {
        this.mapOfSymptoms = read.readFromFile(pathOfSymptomsFile);
        this.symptomsArray = new String[mapOfSymptoms.size()];
        int currentIndex = 0;
        for (Map.Entry<String, Integer> entry : mapOfSymptoms.entrySet()) {
            symptomsArray[currentIndex] = entry.getKey();
            currentIndex++;
        }
        symptomsArray = sorter.stringArraySort(symptomsArray);
    }

    public Map<String, Integer> getMapOfSymptoms() {
        return mapOfSymptoms;
    }

    public String[] getSymptomsArray() {
        return symptomsArray;
    }
}
