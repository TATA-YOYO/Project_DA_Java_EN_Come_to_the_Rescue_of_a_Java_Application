package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterOfSymptomsMap {

    public void writeOnFile(String file, Symptoms symptomToWrite) throws IOException {
        for (String myArray : symptomToWrite.symptomsArray) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            try {
                writer.write(myArray + " :" + symptomToWrite.mapOfSymptoms.get(myArray));
                writer.newLine();
                writer.close();
            } catch (IOException e) {
                writer.close();
            }
        }
    }
}

