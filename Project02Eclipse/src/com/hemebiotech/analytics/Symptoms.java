package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Symptoms {
    Map<String, Integer> mapOfSymptoms;
    List<String> listOfSymptoms;

    public Symptoms(IReadSymptoms read, String pathOfSymptomsFile) throws IOException {
        this.mapOfSymptoms = read.readFromFile(pathOfSymptomsFile);
    }

}
