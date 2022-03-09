package com.hemebiotech.analytics;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class AnalyticsCounter {
    public static void main(String[] args) throws Exception {
        // first get input
        Map<String, Integer> mapOfSymptoms = new HashMap<String, Integer>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
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
        BufferedWriter writer = new BufferedWriter (new FileWriter("C:\\Users\\Marc-black\\Desktop\\result.txt"));

        try {
            for (Map.Entry<String, Integer> entre : mapOfSymptoms.entrySet()) {
                writer.write(entre.getKey() + " :" + entre.getValue());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
