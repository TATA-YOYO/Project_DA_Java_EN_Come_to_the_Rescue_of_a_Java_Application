package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class AnalyticsCounter {
    private static int headacheCount = 0;
    private static int rashCount = 0;
    private static int pupilCount = 0;

    public static void main(String[] args) throws Exception {
        // first get input
        Map<String, Integer> mapOfSymptoms = new HashMap<String, Integer>();
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Marc-black\\s.txt"));
        String line = reader.readLine();
        mapOfSymptoms.put(line,1);
        line = reader.readLine();


        while (line != null) {

            if (mapOfSymptoms.get(line)==null){
                mapOfSymptoms.put(line,1);
            }
            else{
                int v = mapOfSymptoms.get(line);
                v++;
                mapOfSymptoms.put(line,v);
            }
            line = reader.readLine();
        }

        // next generate output
        FileWriter writer = new FileWriter("C:\\Users\\Marc-black\\Desktop\\result.out");
        writer.write("headache: " + AnalyticsCounter.headacheCount + "\n");
        writer.write("rash: " + rashCount + "\n");
        writer.write("dialated pupils: " + pupilCount + "\n");
        writer.close();
    }
}
