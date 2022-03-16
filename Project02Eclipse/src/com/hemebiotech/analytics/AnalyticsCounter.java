package com.hemebiotech.analytics;

public class AnalyticsCounter {
    public static void main(String[] args) throws Exception {
        ReaderOfSymptoms symptomsReader = new ReaderOfSymptoms();
        AlphabeticalSorter sorterOfAlphabetical = new AlphabeticalSorter();
        Symptoms symptomsObject = new Symptoms(symptomsReader,sorterOfAlphabetical, "C:\\Users\\Marc-black\\s.txt");
        WriterOfSymptoms symptomsWriter = new WriterOfSymptoms();
        symptomsWriter.writeOnFile("C:\\Users\\Marc-black\\Desktop\\result.txt", symptomsObject);
    }
}
