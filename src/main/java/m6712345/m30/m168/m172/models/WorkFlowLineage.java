/*
 * DolphinSchedulerApiDocsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package m6712345.m30.m168.m172.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDateTime;
import m6712345.m30.m168.m172.DateTimeHelper;

/**
 * This is a model class for WorkFlowLineage type.
 */
public class WorkFlowLineage {
    private String crontab;
    private LocalDateTime scheduleEndTime;
    private Integer schedulePublishStatus;
    private LocalDateTime scheduleStartTime;
    private String sourceWorkFlowCode;
    private Long workFlowCode;
    private String workFlowName;
    private String workFlowPublishStatus;

    /**
     * Default constructor.
     */
    public WorkFlowLineage() {
    }

    /**
     * Initialization constructor.
     * @param  crontab  String value for crontab.
     * @param  scheduleEndTime  LocalDateTime value for scheduleEndTime.
     * @param  schedulePublishStatus  Integer value for schedulePublishStatus.
     * @param  scheduleStartTime  LocalDateTime value for scheduleStartTime.
     * @param  sourceWorkFlowCode  String value for sourceWorkFlowCode.
     * @param  workFlowCode  Long value for workFlowCode.
     * @param  workFlowName  String value for workFlowName.
     * @param  workFlowPublishStatus  String value for workFlowPublishStatus.
     */
    public WorkFlowLineage(
            String crontab,
            LocalDateTime scheduleEndTime,
            Integer schedulePublishStatus,
            LocalDateTime scheduleStartTime,
            String sourceWorkFlowCode,
            Long workFlowCode,
            String workFlowName,
            String workFlowPublishStatus) {
        this.crontab = crontab;
        this.scheduleEndTime = scheduleEndTime;
        this.schedulePublishStatus = schedulePublishStatus;
        this.scheduleStartTime = scheduleStartTime;
        this.sourceWorkFlowCode = sourceWorkFlowCode;
        this.workFlowCode = workFlowCode;
        this.workFlowName = workFlowName;
        this.workFlowPublishStatus = workFlowPublishStatus;
    }

    /**
     * Getter for Crontab.
     * @return Returns the String
     */
    @JsonGetter("crontab")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCrontab() {
        return crontab;
    }

    /**
     * Setter for Crontab.
     * @param crontab Value for String
     */
    @JsonSetter("crontab")
    public void setCrontab(String crontab) {
        this.crontab = crontab;
    }

    /**
     * Getter for ScheduleEndTime.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("scheduleEndTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getScheduleEndTime() {
        return scheduleEndTime;
    }

    /**
     * Setter for ScheduleEndTime.
     * @param scheduleEndTime Value for LocalDateTime
     */
    @JsonSetter("scheduleEndTime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setScheduleEndTime(LocalDateTime scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
    }

    /**
     * Getter for SchedulePublishStatus.
     * @return Returns the Integer
     */
    @JsonGetter("schedulePublishStatus")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSchedulePublishStatus() {
        return schedulePublishStatus;
    }

    /**
     * Setter for SchedulePublishStatus.
     * @param schedulePublishStatus Value for Integer
     */
    @JsonSetter("schedulePublishStatus")
    public void setSchedulePublishStatus(Integer schedulePublishStatus) {
        this.schedulePublishStatus = schedulePublishStatus;
    }

    /**
     * Getter for ScheduleStartTime.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("scheduleStartTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getScheduleStartTime() {
        return scheduleStartTime;
    }

    /**
     * Setter for ScheduleStartTime.
     * @param scheduleStartTime Value for LocalDateTime
     */
    @JsonSetter("scheduleStartTime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setScheduleStartTime(LocalDateTime scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }

    /**
     * Getter for SourceWorkFlowCode.
     * @return Returns the String
     */
    @JsonGetter("sourceWorkFlowCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSourceWorkFlowCode() {
        return sourceWorkFlowCode;
    }

    /**
     * Setter for SourceWorkFlowCode.
     * @param sourceWorkFlowCode Value for String
     */
    @JsonSetter("sourceWorkFlowCode")
    public void setSourceWorkFlowCode(String sourceWorkFlowCode) {
        this.sourceWorkFlowCode = sourceWorkFlowCode;
    }

    /**
     * Getter for WorkFlowCode.
     * @return Returns the Long
     */
    @JsonGetter("workFlowCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getWorkFlowCode() {
        return workFlowCode;
    }

    /**
     * Setter for WorkFlowCode.
     * @param workFlowCode Value for Long
     */
    @JsonSetter("workFlowCode")
    public void setWorkFlowCode(Long workFlowCode) {
        this.workFlowCode = workFlowCode;
    }

    /**
     * Getter for WorkFlowName.
     * @return Returns the String
     */
    @JsonGetter("workFlowName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWorkFlowName() {
        return workFlowName;
    }

    /**
     * Setter for WorkFlowName.
     * @param workFlowName Value for String
     */
    @JsonSetter("workFlowName")
    public void setWorkFlowName(String workFlowName) {
        this.workFlowName = workFlowName;
    }

    /**
     * Getter for WorkFlowPublishStatus.
     * @return Returns the String
     */
    @JsonGetter("workFlowPublishStatus")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWorkFlowPublishStatus() {
        return workFlowPublishStatus;
    }

    /**
     * Setter for WorkFlowPublishStatus.
     * @param workFlowPublishStatus Value for String
     */
    @JsonSetter("workFlowPublishStatus")
    public void setWorkFlowPublishStatus(String workFlowPublishStatus) {
        this.workFlowPublishStatus = workFlowPublishStatus;
    }

    /**
     * Converts this WorkFlowLineage into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WorkFlowLineage [" + "crontab=" + crontab + ", scheduleEndTime=" + scheduleEndTime
                + ", schedulePublishStatus=" + schedulePublishStatus + ", scheduleStartTime="
                + scheduleStartTime + ", sourceWorkFlowCode=" + sourceWorkFlowCode
                + ", workFlowCode=" + workFlowCode + ", workFlowName=" + workFlowName
                + ", workFlowPublishStatus=" + workFlowPublishStatus + "]";
    }

    /**
     * Builds a new {@link WorkFlowLineage.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WorkFlowLineage.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .crontab(getCrontab())
                .scheduleEndTime(getScheduleEndTime())
                .schedulePublishStatus(getSchedulePublishStatus())
                .scheduleStartTime(getScheduleStartTime())
                .sourceWorkFlowCode(getSourceWorkFlowCode())
                .workFlowCode(getWorkFlowCode())
                .workFlowName(getWorkFlowName())
                .workFlowPublishStatus(getWorkFlowPublishStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link WorkFlowLineage}.
     */
    public static class Builder {
        private String crontab;
        private LocalDateTime scheduleEndTime;
        private Integer schedulePublishStatus;
        private LocalDateTime scheduleStartTime;
        private String sourceWorkFlowCode;
        private Long workFlowCode;
        private String workFlowName;
        private String workFlowPublishStatus;



        /**
         * Setter for crontab.
         * @param  crontab  String value for crontab.
         * @return Builder
         */
        public Builder crontab(String crontab) {
            this.crontab = crontab;
            return this;
        }

        /**
         * Setter for scheduleEndTime.
         * @param  scheduleEndTime  LocalDateTime value for scheduleEndTime.
         * @return Builder
         */
        public Builder scheduleEndTime(LocalDateTime scheduleEndTime) {
            this.scheduleEndTime = scheduleEndTime;
            return this;
        }

        /**
         * Setter for schedulePublishStatus.
         * @param  schedulePublishStatus  Integer value for schedulePublishStatus.
         * @return Builder
         */
        public Builder schedulePublishStatus(Integer schedulePublishStatus) {
            this.schedulePublishStatus = schedulePublishStatus;
            return this;
        }

        /**
         * Setter for scheduleStartTime.
         * @param  scheduleStartTime  LocalDateTime value for scheduleStartTime.
         * @return Builder
         */
        public Builder scheduleStartTime(LocalDateTime scheduleStartTime) {
            this.scheduleStartTime = scheduleStartTime;
            return this;
        }

        /**
         * Setter for sourceWorkFlowCode.
         * @param  sourceWorkFlowCode  String value for sourceWorkFlowCode.
         * @return Builder
         */
        public Builder sourceWorkFlowCode(String sourceWorkFlowCode) {
            this.sourceWorkFlowCode = sourceWorkFlowCode;
            return this;
        }

        /**
         * Setter for workFlowCode.
         * @param  workFlowCode  Long value for workFlowCode.
         * @return Builder
         */
        public Builder workFlowCode(Long workFlowCode) {
            this.workFlowCode = workFlowCode;
            return this;
        }

        /**
         * Setter for workFlowName.
         * @param  workFlowName  String value for workFlowName.
         * @return Builder
         */
        public Builder workFlowName(String workFlowName) {
            this.workFlowName = workFlowName;
            return this;
        }

        /**
         * Setter for workFlowPublishStatus.
         * @param  workFlowPublishStatus  String value for workFlowPublishStatus.
         * @return Builder
         */
        public Builder workFlowPublishStatus(String workFlowPublishStatus) {
            this.workFlowPublishStatus = workFlowPublishStatus;
            return this;
        }

        /**
         * Builds a new {@link WorkFlowLineage} object using the set fields.
         * @return {@link WorkFlowLineage}
         */
        public WorkFlowLineage build() {
            return new WorkFlowLineage(crontab, scheduleEndTime, schedulePublishStatus,
                    scheduleStartTime, sourceWorkFlowCode, workFlowCode, workFlowName,
                    workFlowPublishStatus);
        }
    }
}
