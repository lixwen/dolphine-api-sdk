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
 * This is a model class for ProcessTaskRelation type.
 */
public class ProcessTaskRelation {
    private String conditionParams;
    private ConditionTypeEnum conditionType;
    private LocalDateTime createTime;
    private Integer id;
    private String name;
    private Long postTaskCode;
    private Integer postTaskVersion;
    private Long preTaskCode;
    private Integer preTaskVersion;
    private Long processDefinitionCode;
    private Integer processDefinitionVersion;
    private Long projectCode;
    private LocalDateTime updateTime;

    /**
     * Default constructor.
     */
    public ProcessTaskRelation() {
    }

    /**
     * Initialization constructor.
     * @param  conditionParams  String value for conditionParams.
     * @param  conditionType  ConditionTypeEnum value for conditionType.
     * @param  createTime  LocalDateTime value for createTime.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  postTaskCode  Long value for postTaskCode.
     * @param  postTaskVersion  Integer value for postTaskVersion.
     * @param  preTaskCode  Long value for preTaskCode.
     * @param  preTaskVersion  Integer value for preTaskVersion.
     * @param  processDefinitionCode  Long value for processDefinitionCode.
     * @param  processDefinitionVersion  Integer value for processDefinitionVersion.
     * @param  projectCode  Long value for projectCode.
     * @param  updateTime  LocalDateTime value for updateTime.
     */
    public ProcessTaskRelation(
            String conditionParams,
            ConditionTypeEnum conditionType,
            LocalDateTime createTime,
            Integer id,
            String name,
            Long postTaskCode,
            Integer postTaskVersion,
            Long preTaskCode,
            Integer preTaskVersion,
            Long processDefinitionCode,
            Integer processDefinitionVersion,
            Long projectCode,
            LocalDateTime updateTime) {
        this.conditionParams = conditionParams;
        this.conditionType = conditionType;
        this.createTime = createTime;
        this.id = id;
        this.name = name;
        this.postTaskCode = postTaskCode;
        this.postTaskVersion = postTaskVersion;
        this.preTaskCode = preTaskCode;
        this.preTaskVersion = preTaskVersion;
        this.processDefinitionCode = processDefinitionCode;
        this.processDefinitionVersion = processDefinitionVersion;
        this.projectCode = projectCode;
        this.updateTime = updateTime;
    }

    /**
     * Getter for ConditionParams.
     * @return Returns the String
     */
    @JsonGetter("conditionParams")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getConditionParams() {
        return conditionParams;
    }

    /**
     * Setter for ConditionParams.
     * @param conditionParams Value for String
     */
    @JsonSetter("conditionParams")
    public void setConditionParams(String conditionParams) {
        this.conditionParams = conditionParams;
    }

    /**
     * Getter for ConditionType.
     * @return Returns the ConditionTypeEnum
     */
    @JsonGetter("conditionType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ConditionTypeEnum getConditionType() {
        return conditionType;
    }

    /**
     * Setter for ConditionType.
     * @param conditionType Value for ConditionTypeEnum
     */
    @JsonSetter("conditionType")
    public void setConditionType(ConditionTypeEnum conditionType) {
        this.conditionType = conditionType;
    }

    /**
     * Getter for CreateTime.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("createTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * Setter for CreateTime.
     * @param createTime Value for LocalDateTime
     */
    @JsonSetter("createTime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for PostTaskCode.
     * @return Returns the Long
     */
    @JsonGetter("postTaskCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getPostTaskCode() {
        return postTaskCode;
    }

    /**
     * Setter for PostTaskCode.
     * @param postTaskCode Value for Long
     */
    @JsonSetter("postTaskCode")
    public void setPostTaskCode(Long postTaskCode) {
        this.postTaskCode = postTaskCode;
    }

    /**
     * Getter for PostTaskVersion.
     * @return Returns the Integer
     */
    @JsonGetter("postTaskVersion")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPostTaskVersion() {
        return postTaskVersion;
    }

    /**
     * Setter for PostTaskVersion.
     * @param postTaskVersion Value for Integer
     */
    @JsonSetter("postTaskVersion")
    public void setPostTaskVersion(Integer postTaskVersion) {
        this.postTaskVersion = postTaskVersion;
    }

    /**
     * Getter for PreTaskCode.
     * @return Returns the Long
     */
    @JsonGetter("preTaskCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getPreTaskCode() {
        return preTaskCode;
    }

    /**
     * Setter for PreTaskCode.
     * @param preTaskCode Value for Long
     */
    @JsonSetter("preTaskCode")
    public void setPreTaskCode(Long preTaskCode) {
        this.preTaskCode = preTaskCode;
    }

    /**
     * Getter for PreTaskVersion.
     * @return Returns the Integer
     */
    @JsonGetter("preTaskVersion")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPreTaskVersion() {
        return preTaskVersion;
    }

    /**
     * Setter for PreTaskVersion.
     * @param preTaskVersion Value for Integer
     */
    @JsonSetter("preTaskVersion")
    public void setPreTaskVersion(Integer preTaskVersion) {
        this.preTaskVersion = preTaskVersion;
    }

    /**
     * Getter for ProcessDefinitionCode.
     * @return Returns the Long
     */
    @JsonGetter("processDefinitionCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getProcessDefinitionCode() {
        return processDefinitionCode;
    }

    /**
     * Setter for ProcessDefinitionCode.
     * @param processDefinitionCode Value for Long
     */
    @JsonSetter("processDefinitionCode")
    public void setProcessDefinitionCode(Long processDefinitionCode) {
        this.processDefinitionCode = processDefinitionCode;
    }

    /**
     * Getter for ProcessDefinitionVersion.
     * @return Returns the Integer
     */
    @JsonGetter("processDefinitionVersion")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProcessDefinitionVersion() {
        return processDefinitionVersion;
    }

    /**
     * Setter for ProcessDefinitionVersion.
     * @param processDefinitionVersion Value for Integer
     */
    @JsonSetter("processDefinitionVersion")
    public void setProcessDefinitionVersion(Integer processDefinitionVersion) {
        this.processDefinitionVersion = processDefinitionVersion;
    }

    /**
     * Getter for ProjectCode.
     * @return Returns the Long
     */
    @JsonGetter("projectCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getProjectCode() {
        return projectCode;
    }

    /**
     * Setter for ProjectCode.
     * @param projectCode Value for Long
     */
    @JsonSetter("projectCode")
    public void setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
    }

    /**
     * Getter for UpdateTime.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updateTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * Setter for UpdateTime.
     * @param updateTime Value for LocalDateTime
     */
    @JsonSetter("updateTime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * Converts this ProcessTaskRelation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProcessTaskRelation [" + "conditionParams=" + conditionParams + ", conditionType="
                + conditionType + ", createTime=" + createTime + ", id=" + id + ", name=" + name
                + ", postTaskCode=" + postTaskCode + ", postTaskVersion=" + postTaskVersion
                + ", preTaskCode=" + preTaskCode + ", preTaskVersion=" + preTaskVersion
                + ", processDefinitionCode=" + processDefinitionCode + ", processDefinitionVersion="
                + processDefinitionVersion + ", projectCode=" + projectCode + ", updateTime="
                + updateTime + "]";
    }

    /**
     * Builds a new {@link ProcessTaskRelation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProcessTaskRelation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .conditionParams(getConditionParams())
                .conditionType(getConditionType())
                .createTime(getCreateTime())
                .id(getId())
                .name(getName())
                .postTaskCode(getPostTaskCode())
                .postTaskVersion(getPostTaskVersion())
                .preTaskCode(getPreTaskCode())
                .preTaskVersion(getPreTaskVersion())
                .processDefinitionCode(getProcessDefinitionCode())
                .processDefinitionVersion(getProcessDefinitionVersion())
                .projectCode(getProjectCode())
                .updateTime(getUpdateTime());
        return builder;
    }

    /**
     * Class to build instances of {@link ProcessTaskRelation}.
     */
    public static class Builder {
        private String conditionParams;
        private ConditionTypeEnum conditionType;
        private LocalDateTime createTime;
        private Integer id;
        private String name;
        private Long postTaskCode;
        private Integer postTaskVersion;
        private Long preTaskCode;
        private Integer preTaskVersion;
        private Long processDefinitionCode;
        private Integer processDefinitionVersion;
        private Long projectCode;
        private LocalDateTime updateTime;



        /**
         * Setter for conditionParams.
         * @param  conditionParams  String value for conditionParams.
         * @return Builder
         */
        public Builder conditionParams(String conditionParams) {
            this.conditionParams = conditionParams;
            return this;
        }

        /**
         * Setter for conditionType.
         * @param  conditionType  ConditionTypeEnum value for conditionType.
         * @return Builder
         */
        public Builder conditionType(ConditionTypeEnum conditionType) {
            this.conditionType = conditionType;
            return this;
        }

        /**
         * Setter for createTime.
         * @param  createTime  LocalDateTime value for createTime.
         * @return Builder
         */
        public Builder createTime(LocalDateTime createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for postTaskCode.
         * @param  postTaskCode  Long value for postTaskCode.
         * @return Builder
         */
        public Builder postTaskCode(Long postTaskCode) {
            this.postTaskCode = postTaskCode;
            return this;
        }

        /**
         * Setter for postTaskVersion.
         * @param  postTaskVersion  Integer value for postTaskVersion.
         * @return Builder
         */
        public Builder postTaskVersion(Integer postTaskVersion) {
            this.postTaskVersion = postTaskVersion;
            return this;
        }

        /**
         * Setter for preTaskCode.
         * @param  preTaskCode  Long value for preTaskCode.
         * @return Builder
         */
        public Builder preTaskCode(Long preTaskCode) {
            this.preTaskCode = preTaskCode;
            return this;
        }

        /**
         * Setter for preTaskVersion.
         * @param  preTaskVersion  Integer value for preTaskVersion.
         * @return Builder
         */
        public Builder preTaskVersion(Integer preTaskVersion) {
            this.preTaskVersion = preTaskVersion;
            return this;
        }

        /**
         * Setter for processDefinitionCode.
         * @param  processDefinitionCode  Long value for processDefinitionCode.
         * @return Builder
         */
        public Builder processDefinitionCode(Long processDefinitionCode) {
            this.processDefinitionCode = processDefinitionCode;
            return this;
        }

        /**
         * Setter for processDefinitionVersion.
         * @param  processDefinitionVersion  Integer value for processDefinitionVersion.
         * @return Builder
         */
        public Builder processDefinitionVersion(Integer processDefinitionVersion) {
            this.processDefinitionVersion = processDefinitionVersion;
            return this;
        }

        /**
         * Setter for projectCode.
         * @param  projectCode  Long value for projectCode.
         * @return Builder
         */
        public Builder projectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }

        /**
         * Setter for updateTime.
         * @param  updateTime  LocalDateTime value for updateTime.
         * @return Builder
         */
        public Builder updateTime(LocalDateTime updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Builds a new {@link ProcessTaskRelation} object using the set fields.
         * @return {@link ProcessTaskRelation}
         */
        public ProcessTaskRelation build() {
            return new ProcessTaskRelation(conditionParams, conditionType, createTime, id, name,
                    postTaskCode, postTaskVersion, preTaskCode, preTaskVersion,
                    processDefinitionCode, processDefinitionVersion, projectCode, updateTime);
        }
    }
}
