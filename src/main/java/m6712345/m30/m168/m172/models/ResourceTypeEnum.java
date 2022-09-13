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
 * ResourceTypeEnum to be used.
 */
public enum ResourceTypeEnum {
    USER_MODULE,

    PROJECT_MODULE;


    private static TreeMap<String, ResourceTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        USER_MODULE.value = "USER_MODULE";
        PROJECT_MODULE.value = "PROJECT_MODULE";

        valueMap.put("USER_MODULE", USER_MODULE);
        valueMap.put("PROJECT_MODULE", PROJECT_MODULE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ResourceTypeEnum fromString(String toConvert) {
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
     * Convert list of ResourceTypeEnum values to list of string values.
     * @param toConvert The list of ResourceTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ResourceTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ResourceTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 