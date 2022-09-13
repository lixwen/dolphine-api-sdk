/*
 * DolphinSchedulerApiDocsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package m6712345.m30.m168.m172.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * ProcessInstancePriorityEnum to be used.
 */
public enum ProcessInstancePriorityEnum {
    HIGHEST,

    HIGH,

    MEDIUM,

    LOW,

    LOWEST;


    private static TreeMap<String, ProcessInstancePriorityEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        HIGHEST.value = "HIGHEST";
        HIGH.value = "HIGH";
        MEDIUM.value = "MEDIUM";
        LOW.value = "LOW";
        LOWEST.value = "LOWEST";

        valueMap.put("HIGHEST", HIGHEST);
        valueMap.put("HIGH", HIGH);
        valueMap.put("MEDIUM", MEDIUM);
        valueMap.put("LOW", LOW);
        valueMap.put("LOWEST", LOWEST);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ProcessInstancePriorityEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of ProcessInstancePriorityEnum values to list of string values.
     * @param toConvert The list of ProcessInstancePriorityEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ProcessInstancePriorityEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ProcessInstancePriorityEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 