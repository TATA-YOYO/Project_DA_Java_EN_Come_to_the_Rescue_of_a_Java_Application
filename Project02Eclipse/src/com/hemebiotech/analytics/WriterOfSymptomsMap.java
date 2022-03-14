package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriterOfSymptomsMap {

    public void writeSymptoms(String file, Symptoms symptomToWrite) {
        for (Map.Entry<String, Integer> entry : symptomToWrite.mapOfSymptoms.entrySet()) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
                writer.write(entry.getKey() + " :" + entry.getValue());
                writer.newLine();
                writer.close();

            } catch (IOException e) {
                System.out.println("Il y a un problème avec le rédacteur de symptomes.");
            }
        }
    }
}
