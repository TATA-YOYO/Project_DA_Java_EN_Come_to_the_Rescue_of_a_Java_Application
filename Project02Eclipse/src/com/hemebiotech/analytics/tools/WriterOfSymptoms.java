package com.hemebiotech.analytics.tools;

import com.hemebiotech.analytics.symptoms.Symptoms;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This writes the symptoms of the map in order the elements of the array.
 * <strong>This program adds the text to the file but does not overwrite it.</strong>
 */
public class WriterOfSymptoms implements IWriteSymptoms {
@Override
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

