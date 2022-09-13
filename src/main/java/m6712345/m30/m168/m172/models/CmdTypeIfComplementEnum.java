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
 * CmdTypeIfComplementEnum to be used.
 */
public enum CmdTypeIfComplementEnum {
    START_PROCESS,

    START_CURRENT_TASK_PROCESS,

    RECOVER_TOLERANCE_FAULT_PROCESS,

    RECOVER_SUSPENDED_PROCESS,

    START_FAILURE_TASK_PROCESS,

    COMPLEMENT_DATA,

    SCHEDULER,

    REPEAT_RUNNING,

    PAUSE,

    STOP,

    RECOVER_WAITING_THREAD,

    RECOVER_SERIAL_WAIT;


    private static TreeMap<String, CmdTypeIfComplementEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        START_PROCESS.value = "START_PROCESS";
        START_CURRENT_TASK_PROCESS.value = "START_CURRENT_TASK_PROCESS";
        RECOVER_TOLERANCE_FAULT_PROCESS.value = "RECOVER_TOLERANCE_FAULT_PROCESS";
        RECOVER_SUSPENDED_PROCESS.value = "RECOVER_SUSPENDED_PROCESS";
        START_FAILURE_TASK_PROCESS.value = "START_FAILURE_TASK_PROCESS";
        COMPLEMENT_DATA.value = "COMPLEMENT_DATA";
        SCHEDULER.value = "SCHEDULER";
        REPEAT_RUNNING.value = "REPEAT_RUNNING";
        PAUSE.value = "PAUSE";
        STOP.value = "STOP";
        RECOVER_WAITING_THREAD.value = "RECOVER_WAITING_THREAD";
        RECOVER_SERIAL_WAIT.value = "RECOVER_SERIAL_WAIT";

        valueMap.put("START_PROCESS", START_PROCESS);
        valueMap.put("START_CURRENT_TASK_PROCESS", START_CURRENT_TASK_PROCESS);
        valueMap.put("RECOVER_TOLERANCE_FAULT_PROCESS", RECOVER_TOLERANCE_FAULT_PROCESS);
        valueMap.put("RECOVER_SUSPENDED_PROCESS", RECOVER_SUSPENDED_PROCESS);
        valueMap.put("START_FAILURE_TASK_PROCESS", START_FAILURE_TASK_PROCESS);
        valueMap.put("COMPLEMENT_DATA", COMPLEMENT_DATA);
        valueMap.put("SCHEDULER", SCHEDULER);
        valueMap.put("REPEAT_RUNNING", REPEAT_RUNNING);
        valueMap.put("PAUSE", PAUSE);
        valueMap.put("STOP", STOP);
        valueMap.put("RECOVER_WAITING_THREAD", RECOVER_WAITING_THREAD);
        valueMap.put("RECOVER_SERIAL_WAIT", RECOVER_SERIAL_WAIT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static CmdTypeIfComplementEnum fromString(String toConvert) {
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
     * Convert list of CmdTypeIfComplementEnum values to list of string values.
     * @param toConvert The list of CmdTypeIfComplementEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CmdTypeIfComplementEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CmdTypeIfComplementEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 