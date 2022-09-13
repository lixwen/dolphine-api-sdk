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
 * ProgramTypeEnum to be used.
 */
public enum ProgramTypeEnum {
    JAVA,

    SCALA,

    PYTHON,

    SQL;


    private static TreeMap<String, ProgramTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        JAVA.value = "JAVA";
        SCALA.value = "SCALA";
        PYTHON.value = "PYTHON";
        SQL.value = "SQL";

        valueMap.put("JAVA", JAVA);
        valueMap.put("SCALA", SCALA);
        valueMap.put("PYTHON", PYTHON);
        valueMap.put("SQL", SQL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ProgramTypeEnum fromString(String toConvert) {
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
     * Convert list of ProgramTypeEnum values to list of string values.
     * @param toConvert The list of ProgramTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ProgramTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ProgramTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 