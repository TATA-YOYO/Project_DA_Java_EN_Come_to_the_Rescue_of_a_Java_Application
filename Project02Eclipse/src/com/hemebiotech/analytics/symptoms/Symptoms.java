package com.hemebiotech.analytics.symptoms;

import java.util.List;
import java.util.Map;

/**
 * This class makes it possible to instantiate an object
 * which carries the symptoms in the form of an array classified in alphabetical order and a map.
 * It is during the construction of the object that the symptoms are ordered.
 */
public class Symptoms {
    private Map<String, Integer> mapOfSymptoms;
    private List<String> listOfSymptoms;

    public Symptoms(Map<String, Integer> mapOfSymptoms, List myList) {
        this.mapOfSymptoms = mapOfSymptoms;
        this.listOfSymptoms = myList;
    }

    public Map<String, Integer> getMapOfSymptoms() {
        return mapOfSymptoms;
    }

    public List<String> getListOfSymptoms() {
        return listOfSymptoms;
    }
}
