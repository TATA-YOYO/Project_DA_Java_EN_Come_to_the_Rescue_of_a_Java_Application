package com.hemebiotech.analytics;

import java.io.*;
import java.util.Map;

public class AnalyticsCounter {
    public static void main(String[] args) throws Exception {
        // first get input
        ReaderOfSymptoms myReaderOfSymptoms = new ReaderOfSymptoms();
        Symptoms mySymptoms = new Symptoms(myReaderOfSymptoms, "C:\\Users\\Marc-black\\s.txt");

        // next generate output
        BufferedWriter writer = new BufferedWriter (new FileWriter("C:\\Users\\Marc-black\\Desktop\\result.txt"));

        try {
            for (Map.Entry<String, Integer> entre : mySymptoms.mapOfSymptoms.entrySet()) {
                writer.write(entre.getKey() + " :" + entre.getValue());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
