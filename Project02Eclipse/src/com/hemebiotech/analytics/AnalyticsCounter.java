package com.hemebiotech.analytics;

import java.io.*;


public class AnalyticsCounter {
    public static void main(String[] args) throws Exception {
        ReaderOfSymptoms lecteurDeSymptomes = new ReaderOfSymptoms();
        Symptoms lesSymptomes = new Symptoms(lecteurDeSymptomes, "C:\\Users\\Marc-black\\s.txt");
        WriterOfSymptomsMap redacteurDeSymptomes = new WriterOfSymptomsMap();
        redacteurDeSymptomes.writeSymptoms("C:\\Users\\Marc-black\\Desktop\\result.txt", lesSymptomes);
    }
}
