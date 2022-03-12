package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Simple brute force implementation
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
