package com.hemebiotech.analytics.tools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * From a file it reads and counts occurrences and returns a map with the symptoms in key and their number of occurrences in value.
 */
public class ReaderOfSymptoms implements IReadSymptoms {

    @Override
    public List<String> readFile(String pathOfFile){
        ArrayList<String> result = new ArrayList();

        if (pathOfFile != null) {
            try {
                BufferedReader reader = new BufferedReader (new FileReader(pathOfFile));
                String line = reader.readLine();

                while (line != null) {
                    result.add(line);
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

}
