package com.hemebiotech.analytics;

import com.hemebiotech.analytics.symptoms.Symptoms;
import com.hemebiotech.analytics.tools.*;
import java.util.List;
import java.util.Map;

/**
 * Reads symptoms from a file then generate a file with these symptoms in alphabetical order and their occurrences.<br>
 * <strong>The first argument have to be a file path of symptoms.<br>
 * The second argument have to be a file path for app output.</strong>
 */
public class AnalyticsCounter {
    private static IReadSymptoms symptomsReader = new ReaderOfSymptoms();
    private static IWriteSymptoms symptomsWriter = new WriterOfSymptoms();
    private static ICount counterOfSymptoms = new Counter();

    public static void main(String[] args) throws Exception {
        List<String> listOfSymptoms = symptomsReader.readFile(args[0]);
        Map<String, Integer> mapOfSymptoms = counterOfSymptoms.CountSymptoms(listOfSymptoms);
        Symptoms symptomsObject = new Symptoms(mapOfSymptoms,listOfSymptoms);
        symptomsWriter.writeOnFile(args[1],symptomsObject );
    }
}
