package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

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
