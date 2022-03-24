package com.hemebiotech.analytics;

import com.hemebiotech.analytics.objects_classes.Symptoms;
import com.hemebiotech.analytics.objects_classes.tools.AlphabeticalSorter;
import com.hemebiotech.analytics.objects_classes.tools.ReaderOfSymptoms;
import com.hemebiotech.analytics.objects_classes.tools.WriterOfSymptoms;

/**
 * The symptoms are ordered and counted during the construction of the symptoms object,
 * then a file listing them is generated thanks to the "symptomsWriter"
 * <strong>The first argument have to be a file path of symptoms.<br>
 * The second argument have to be a file path for app output.</strong>
 */
public class AnalyticsCounter {
    private static IReadSymptoms symptomsReader = new ReaderOfSymptoms();
    private static IAlphabeticalArraySorter alphabeticalSorter = new AlphabeticalSorter();
    private static IWriteSymptoms symptomsWriter = new WriterOfSymptoms();

    public static void main(String[] args) throws Exception {
        Symptoms symptomsObject = new Symptoms(symptomsReader, alphabeticalSorter, args[0]);
        symptomsWriter.writeOnFile(args[1], symptomsObject);
    }
}
