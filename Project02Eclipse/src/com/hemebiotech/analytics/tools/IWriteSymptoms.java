package com.hemebiotech.analytics.tools;

import com.hemebiotech.analytics.symptoms.Symptoms;
import java.io.IOException;

/**
 Writes to file
 */
public interface IWriteSymptoms {
    /**
     *
     * @param file
     * @param symptomToWrite
     * @throws IOException
     */
    void writeOnFile(String file, Symptoms symptomToWrite) throws IOException;
}
