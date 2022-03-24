package com.hemebiotech.analytics.objects_classes.tools;

import com.hemebiotech.analytics.IWriteSymptoms;
import com.hemebiotech.analytics.objects_classes.Symptoms;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Tool to write the symptoms in alphabetical order by crossing the elements of a table with those of a map
 * <strong>This program adds the text to the file but does not overwrite it </strong>
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

