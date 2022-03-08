package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
    private static int headacheCount = 0;
    private static int rashCount = 0;
    private static int pupilCount = 0;

    public static void main(String[] args) throws Exception {
        // first get input
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Marc-black\\Documents\\P2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt"));
        String line = reader.readLine();

        int i = 0;
        while (line != null) {
            i++;
            System.out.println("symptom from file: " + line);
            if (line.equals("headache")) {
                headacheCount++;
                System.out.println("number of headaches: " + headacheCount);
            } else if (line.equals("rush")) {
                rashCount++;
            } else if (line.contains("pupils")) {
                pupilCount++;
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
