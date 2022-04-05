package com.hemebiotech.analytics.tools;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * read symptom data from a source
 * The important part is, the return value from the operation, which is a map of strings and integer,
 * that may contain no duplications
 * <strong>The implementation does not need to order the list</strong>
 */
public interface IReadSymptoms {
    List<String> readFile(String pathOfFile);
}
