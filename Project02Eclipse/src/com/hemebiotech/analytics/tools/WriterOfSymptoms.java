package com.hemebiotech.analytics.tools;

import com.hemebiotech.analytics.symptoms.Symptoms;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * This writes the symptoms of the map in order the elements of the array.
 * <strong>This program adds the text to the file but does not overwrite it.</strong>
 */
public class WriterOfSymptoms implements IWriteSymptoms {
    @Override
    public void writeOnFile(String file, Symptoms symptomToWrite) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (Map.Entry<String, Integer> myMap : symptomToWrite.getMapOfSymptoms().entrySet()) {
            writer.write(myMap.getKey() + " :" + myMap.getValue());
            writer.newLine();
        }
        writer.close();
    }
}

