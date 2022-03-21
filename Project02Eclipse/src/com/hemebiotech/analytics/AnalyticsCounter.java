package com.hemebiotech.analytics;

import com.hemebiotech.analytics.objects_classes.Symptoms;
import com.hemebiotech.analytics.objects_classes.tools.AlphabeticalSorter;
import com.hemebiotech.analytics.objects_classes.tools.ReaderOfSymptoms;
import com.hemebiotech.analytics.objects_classes.tools.WriterOfSymptoms;

public class AnalyticsCounter {
    private static IReadSymptoms symptomsReader = new ReaderOfSymptoms();
    private static IAlphabeticalArraySorter alphabeticalSorter = new AlphabeticalSorter();
    private static IWriteSymptoms symptomsWriter = new WriterOfSymptoms();

    public static void main(String[] args) throws Exception {
        Symptoms symptomsObject = new Symptoms(symptomsReader, alphabeticalSorter, args[0]);
        symptomsWriter.writeOnFile(args[1], symptomsObject);
    }
}
