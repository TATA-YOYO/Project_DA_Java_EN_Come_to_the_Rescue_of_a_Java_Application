package com.hemebiotech.analytics.tools;


import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Counter implements ICount {

    @Override
    public Map<String, Integer> CountSymptoms(List<String> myList) {
        Map<String, Integer> mapOfSymptoms = new TreeMap<>();
        for (String key : myList) {
            mapOfSymptoms.put(key, 0);
        }
        for (String key : myList) {
            if (mapOfSymptoms.get(key) == 0) {
                mapOfSymptoms.put(key, 1);
            } else {
                int occurrence = mapOfSymptoms.get(key);
                occurrence++;
                mapOfSymptoms.put(key, occurrence);
            }
        }
        return mapOfSymptoms;
    }
}
