package com.hemebiotech.analytics;

public class AnalyticsCounter {
    public static void main(String[] args) throws Exception {
        ReaderOfSymptoms lecteurDeSymptomes = new ReaderOfSymptoms();
        AlphabeticalSorter alphabeticalOrderer = new AlphabeticalSorter();
        Symptoms symptomsObject = new Symptoms(lecteurDeSymptomes,alphabeticalOrderer, "C:\\Users\\Marc-black\\s.txt");
        WriterOfSymptomsMap redacteurDeSymptomes = new WriterOfSymptomsMap();
        redacteurDeSymptomes.writeOnFile("C:\\Users\\Marc-black\\Desktop\\result.txt", symptomsObject);
    }
}
