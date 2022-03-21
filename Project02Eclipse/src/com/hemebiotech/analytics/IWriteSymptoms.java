package com.hemebiotech.analytics;

import com.hemebiotech.analytics.objects_classes.Symptoms;

import java.io.IOException;

public interface IWriteSymptoms {
    void writeOnFile(String file, Symptoms symptomToWrite) throws IOException;
}
