package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriterOfSymptomsMap {

    public void writeSymptoms(String file, Symptoms symptomToWrite) throws IOException {
        for (Map.Entry<String, Integer> entry : symptomToWrite.mapOfSymptoms.entrySet()) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            try {
                writer.write(entry.getKey() + " :" + entry.getValue());
                writer.newLine();
                writer.close();
            } catch (IOException e) {
                writer.close();
            }
        }
    }
}
