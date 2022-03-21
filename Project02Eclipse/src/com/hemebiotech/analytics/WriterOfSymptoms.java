package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterOfSymptoms {

    public void writeOnFile(String file, Symptoms symptomToWrite) throws IOException {
        for (String myArray : symptomToWrite.getSymptomsArray()) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            try {
                writer.write(myArray + " :" + symptomToWrite.getMapOfSymptoms().get(myArray));
                writer.newLine();
                writer.close();
            } catch (IOException e) {
                writer.close();
            }
        }
    }
}

