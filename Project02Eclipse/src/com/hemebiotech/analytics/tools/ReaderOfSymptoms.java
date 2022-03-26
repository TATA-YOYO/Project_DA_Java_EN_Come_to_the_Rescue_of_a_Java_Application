package com.hemebiotech.analytics.tools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * From a file it reads and counts occurrences and returns a map with the symptoms in key and their number of occurrences in value.
 */
public class ReaderOfSymptoms implements IReadSymptoms {

    @Override
    public Map<String, Integer> readFromFile(String file) throws IOException {
        Map<String, Integer> mapOfFile = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        mapOfFile.put(line, 1);
        line = reader.readLine();

        while (line != null) {

            if (mapOfFile.get(line) == null) {
                mapOfFile.put(line, 1);
            } else {
                int occurrence = mapOfFile.get(line);
                occurrence++;
                mapOfFile.put(line, occurrence);
            }
            line = reader.readLine();
        }
        return mapOfFile;
    }

}
