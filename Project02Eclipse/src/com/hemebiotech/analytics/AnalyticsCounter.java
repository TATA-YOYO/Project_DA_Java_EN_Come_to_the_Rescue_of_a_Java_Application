package com.hemebiotech.analytics;

import com.hemebiotech.analytics.symptoms.Symptoms;
import com.hemebiotech.analytics.tools.IReadSymptoms;
import com.hemebiotech.analytics.tools.IWriteSymptoms;
import com.hemebiotech.analytics.tools.ReaderOfSymptoms;
import com.hemebiotech.analytics.tools.WriterOfSymptoms;
import java.util.Map;

/**
 * Reads symptoms from a file then generate a file with these symptoms in alphabetical order and their occurrences.<br>
 * <strong>The first argument have to be a file path of symptoms.<br>
 * The second argument have to be a file path for app output.</strong>
 */
public class AnalyticsCounter {
    private static IReadSymptoms symptomsReader = new ReaderOfSymptoms();
    private static IWriteSymptoms symptomsWriter = new WriterOfSymptoms();

    public static void main(String[] args) throws Exception {
        Map<String, Integer> mapOfSymptoms = symptomsReader.readFromFile(args[0]);
        Symptoms symptomsObject = new Symptoms(mapOfSymptoms);
        symptomsWriter.writeOnFile(args[1], symptomsObject);
    }
}
