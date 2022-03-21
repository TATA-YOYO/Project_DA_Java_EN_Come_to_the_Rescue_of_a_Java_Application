package com.hemebiotech.analytics;

public class AnalyticsCounter {
    private static IReadSymptoms symptomsReader = new ReaderOfSymptoms();
    private static IAlphabeticalArraySorter alphabeticalSorter = new AlphabeticalSorter();
    private static WriterOfSymptoms symptomsWriter = new WriterOfSymptoms();

    public static void main(String[] args) throws Exception {
        Symptoms symptomsObject = new Symptoms(symptomsReader, alphabeticalSorter, args[0]);
        symptomsWriter.writeOnFile(args[1], symptomsObject);
    }
}
