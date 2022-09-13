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
import java.util.List;
import java.util.Map;
import m6712345.m30.m168.m172.DateTimeHelper;

/**
 * This is a model class for ProcessDefinition type.
 */
public class ProcessDefinition {
    private Long code;
    private LocalDateTime createTime;
    private String description;
    private ExecutionTypeEnum executionType;
    private FlagEnum flag;
    private List<Property> globalParamList;
    private Map<String, String> globalParamMap;
    private String globalParams;
    private Integer id;
    private String locations;
    private String modifyBy;
    private String name;
    private Long projectCode;
    private String projectName;
    private ReleaseStateEnum releaseState;
    private ScheduleReleaseStateEnum scheduleReleaseState;
    private String tenantCode;
    private Integer tenantId;
    private Integer timeout;
    private LocalDateTime updateTime;
    private Integer userId;
    private String userName;
    private Integer version;
    private Integer warningGroupId;

    /**
     * Default constructor.
     */
    public ProcessDefinition() {
    }

    /**
     * Initialization constructor.
     * @param  code  Long value for code.
     * @param  createTime  LocalDateTime value for createTime.
     * @param  description  String value for description.
     * @param  executionType  ExecutionTypeEnum value for executionType.
     * @param  flag  FlagEnum value for flag.
     * @param  globalParamList  List of Property value for globalParamList.
     * @param  globalParamMap  Map of String, value for globalParamMap.
     * @param  globalParams  String value for globalParams.
     * @param  id  Integer value for id.
     * @param  locations  String value for locations.
     * @param  modifyBy  String value for modifyBy.
     * @param  name  String value for name.
     * @param  projectCode  Long value for projectCode.
     * @param  projectName  String value for projectName.
     * @param  releaseState  ReleaseStateEnum value for releaseState.
     * @param  scheduleReleaseState  ScheduleReleaseStateEnum value for scheduleReleaseState.
     * @param  tenantCode  String value for tenantCode.
     * @param  tenantId  Integer value for tenantId.
     * @param  timeout  Integer value for timeout.
     * @param  updateTime  LocalDateTime value for updateTime.
     * @param  userId  Integer value for userId.
     * @param  userName  String value for userName.
     * @param  version  Integer value for version.
     * @param  warningGroupId  Integer value for warningGroupId.
     */
    public ProcessDefinition(
            Long code,
            LocalDateTime createTime,
            String description,
            ExecutionTypeEnum executionType,
            FlagEnum flag,
            List<Property> globalParamList,
            Map<String, String> globalParamMap,
            String globalParams,
            Integer id,
            String locations,
            String modifyBy,
            String name,
            Long projectCode,
            String projectName,
            ReleaseStateEnum releaseState,
            ScheduleReleaseStateEnum scheduleReleaseState,
            String tenantCode,
            Integer tenantId,
            Integer timeout,
            LocalDateTime updateTime,
            Integer userId,
            String userName,
            Integer version,
            Integer warningGroupId) {
        this.code = code;
        this.createTime = createTime;
        this.description = description;
        this.executionType = executionType;
        this.flag = flag;
        this.globalParamList = globalParamList;
        this.globalParamMap = globalParamMap;
        this.globalParams = globalParams;
        this.id = id;
        this.locations = locations;
        this.modifyBy = modifyBy;
        this.name = name;
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.releaseState = releaseState;
        this.scheduleReleaseState = scheduleReleaseState;
        this.tenantCode = tenantCode;
        this.tenantId = tenantId;
        this.timeout = timeout;
        this.updateTime = updateTime;
        this.userId = userId;
        this.userName = userName;
        this.version = version;
        this.warningGroupId = warningGroupId;
    }

    /**
     * Getter for Code.
     * @return Returns the Long
     */
    @JsonGetter("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * @param code Value for Long
     */
    @JsonSetter("code")
    public void setCode(Long code) {
        this.code = code;
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
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for ExecutionType.
     * @return Returns the ExecutionTypeEnum
     */
    @JsonGetter("executionType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ExecutionTypeEnum getExecutionType() {
        return executionType;
    }

    /**
     * Setter for ExecutionType.
     * @param executionType Value for ExecutionTypeEnum
     */
    @JsonSetter("executionType")
    public void setExecutionType(ExecutionTypeEnum executionType) {
        this.executionType = executionType;
    }

    /**
     * Getter for Flag.
     * @return Returns the FlagEnum
     */
    @JsonGetter("flag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FlagEnum getFlag() {
        return flag;
    }

    /**
     * Setter for Flag.
     * @param flag Value for FlagEnum
     */
    @JsonSetter("flag")
    public void setFlag(FlagEnum flag) {
        this.flag = flag;
    }

    /**
     * Getter for GlobalParamList.
     * @return Returns the List of Property
     */
    @JsonGetter("globalParamList")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Property> getGlobalParamList() {
        return globalParamList;
    }

    /**
     * Setter for GlobalParamList.
     * @param globalParamList Value for List of Property
     */
    @JsonSetter("globalParamList")
    public void setGlobalParamList(List<Property> globalParamList) {
        this.globalParamList = globalParamList;
    }

    /**
     * Getter for GlobalParamMap.
     * @return Returns the Map of String, String
     */
    @JsonGetter("globalParamMap")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, String> getGlobalParamMap() {
        return globalParamMap;
    }

    /**
     * Setter for GlobalParamMap.
     * @param globalParamMap Value for Map of String, String
     */
    @JsonSetter("globalParamMap")
    public void setGlobalParamMap(Map<String, String> globalParamMap) {
        this.globalParamMap = globalParamMap;
    }

    /**
     * Getter for GlobalParams.
     * @return Returns the String
     */
    @JsonGetter("globalParams")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGlobalParams() {
        return globalParams;
    }

    /**
     * Setter for GlobalParams.
     * @param globalParams Value for String
     */
    @JsonSetter("globalParams")
    public void setGlobalParams(String globalParams) {
        this.globalParams = globalParams;
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
     * Getter for Locations.
     * @return Returns the String
     */
    @JsonGetter("locations")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocations() {
        return locations;
    }

    /**
     * Setter for Locations.
     * @param locations Value for String
     */
    @JsonSetter("locations")
    public void setLocations(String locations) {
        this.locations = locations;
    }

    /**
     * Getter for ModifyBy.
     * @return Returns the String
     */
    @JsonGetter("modifyBy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getModifyBy() {
        return modifyBy;
    }

    /**
     * Setter for ModifyBy.
     * @param modifyBy Value for String
     */
    @JsonSetter("modifyBy")
    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
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
     * Getter for ProjectName.
     * @return Returns the String
     */
    @JsonGetter("projectName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProjectName() {
        return projectName;
    }

    /**
     * Setter for ProjectName.
     * @param projectName Value for String
     */
    @JsonSetter("projectName")
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * Getter for ReleaseState.
     * @return Returns the ReleaseStateEnum
     */
    @JsonGetter("releaseState")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReleaseStateEnum getReleaseState() {
        return releaseState;
    }

    /**
     * Setter for ReleaseState.
     * @param releaseState Value for ReleaseStateEnum
     */
    @JsonSetter("releaseState")
    public void setReleaseState(ReleaseStateEnum releaseState) {
        this.releaseState = releaseState;
    }

    /**
     * Getter for ScheduleReleaseState.
     * @return Returns the ScheduleReleaseStateEnum
     */
    @JsonGetter("scheduleReleaseState")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ScheduleReleaseStateEnum getScheduleReleaseState() {
        return scheduleReleaseState;
    }

    /**
     * Setter for ScheduleReleaseState.
     * @param scheduleReleaseState Value for ScheduleReleaseStateEnum
     */
    @JsonSetter("scheduleReleaseState")
    public void setScheduleReleaseState(ScheduleReleaseStateEnum scheduleReleaseState) {
        this.scheduleReleaseState = scheduleReleaseState;
    }

    /**
     * Getter for TenantCode.
     * @return Returns the String
     */
    @JsonGetter("tenantCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTenantCode() {
        return tenantCode;
    }

    /**
     * Setter for TenantCode.
     * @param tenantCode Value for String
     */
    @JsonSetter("tenantCode")
    public void setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
    }

    /**
     * Getter for TenantId.
     * @return Returns the Integer
     */
    @JsonGetter("tenantId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * Setter for TenantId.
     * @param tenantId Value for Integer
     */
    @JsonSetter("tenantId")
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * Getter for Timeout.
     * @return Returns the Integer
     */
    @JsonGetter("timeout")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Setter for Timeout.
     * @param timeout Value for Integer
     */
    @JsonSetter("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
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
     * Getter for UserId.
     * @return Returns the Integer
     */
    @JsonGetter("userId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUserId() {
        return userId;
    }

    /**
     * Setter for UserId.
     * @param userId Value for Integer
     */
    @JsonSetter("userId")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * Getter for UserName.
     * @return Returns the String
     */
    @JsonGetter("userName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUserName() {
        return userName;
    }

    /**
     * Setter for UserName.
     * @param userName Value for String
     */
    @JsonSetter("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter for Version.
     * @return Returns the Integer
     */
    @JsonGetter("version")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getVersion() {
        return version;
    }

    /**
     * Setter for Version.
     * @param version Value for Integer
     */
    @JsonSetter("version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * Getter for WarningGroupId.
     * @return Returns the Integer
     */
    @JsonGetter("warningGroupId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getWarningGroupId() {
        return warningGroupId;
    }

    /**
     * Setter for WarningGroupId.
     * @param warningGroupId Value for Integer
     */
    @JsonSetter("warningGroupId")
    public void setWarningGroupId(Integer warningGroupId) {
        this.warningGroupId = warningGroupId;
    }

    /**
     * Converts this ProcessDefinition into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProcessDefinition [" + "code=" + code + ", createTime=" + createTime
                + ", description=" + description + ", executionType=" + executionType + ", flag="
                + flag + ", globalParamList=" + globalParamList + ", globalParamMap="
                + globalParamMap + ", globalParams=" + globalParams + ", id=" + id + ", locations="
                + locations + ", modifyBy=" + modifyBy + ", name=" + name + ", projectCode="
                + projectCode + ", projectName=" + projectName + ", releaseState=" + releaseState
                + ", scheduleReleaseState=" + scheduleReleaseState + ", tenantCode=" + tenantCode
                + ", tenantId=" + tenantId + ", timeout=" + timeout + ", updateTime=" + updateTime
                + ", userId=" + userId + ", userName=" + userName + ", version=" + version
                + ", warningGroupId=" + warningGroupId + "]";
    }

    /**
     * Builds a new {@link ProcessDefinition.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProcessDefinition.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .code(getCode())
                .createTime(getCreateTime())
                .description(getDescription())
                .executionType(getExecutionType())
                .flag(getFlag())
                .globalParamList(getGlobalParamList())
                .globalParamMap(getGlobalParamMap())
                .globalParams(getGlobalParams())
                .id(getId())
                .locations(getLocations())
                .modifyBy(getModifyBy())
                .name(getName())
                .projectCode(getProjectCode())
                .projectName(getProjectName())
                .releaseState(getReleaseState())
                .scheduleReleaseState(getScheduleReleaseState())
                .tenantCode(getTenantCode())
                .tenantId(getTenantId())
                .timeout(getTimeout())
                .updateTime(getUpdateTime())
                .userId(getUserId())
                .userName(getUserName())
                .version(getVersion())
                .warningGroupId(getWarningGroupId());
        return builder;
    }

    /**
     * Class to build instances of {@link ProcessDefinition}.
     */
    public static class Builder {
        private Long code;
        private LocalDateTime createTime;
        private String description;
        private ExecutionTypeEnum executionType;
        private FlagEnum flag;
        private List<Property> globalParamList;
        private Map<String, String> globalParamMap;
        private String globalParams;
        private Integer id;
        private String locations;
        private String modifyBy;
        private String name;
        private Long projectCode;
        private String projectName;
        private ReleaseStateEnum releaseState;
        private ScheduleReleaseStateEnum scheduleReleaseState;
        private String tenantCode;
        private Integer tenantId;
        private Integer timeout;
        private LocalDateTime updateTime;
        private Integer userId;
        private String userName;
        private Integer version;
        private Integer warningGroupId;



        /**
         * Setter for code.
         * @param  code  Long value for code.
         * @return Builder
         */
        public Builder code(Long code) {
            this.code = code;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for executionType.
         * @param  executionType  ExecutionTypeEnum value for executionType.
         * @return Builder
         */
        public Builder executionType(ExecutionTypeEnum executionType) {
            this.executionType = executionType;
            return this;
        }

        /**
         * Setter for flag.
         * @param  flag  FlagEnum value for flag.
         * @return Builder
         */
        public Builder flag(FlagEnum flag) {
            this.flag = flag;
            return this;
        }

        /**
         * Setter for globalParamList.
         * @param  globalParamList  List of Property value for globalParamList.
         * @return Builder
         */
        public Builder globalParamList(List<Property> globalParamList) {
            this.globalParamList = globalParamList;
            return this;
        }

        /**
         * Setter for globalParamMap.
         * @param  globalParamMap  Map of String, value for globalParamMap.
         * @return Builder
         */
        public Builder globalParamMap(Map<String, String> globalParamMap) {
            this.globalParamMap = globalParamMap;
            return this;
        }

        /**
         * Setter for globalParams.
         * @param  globalParams  String value for globalParams.
         * @return Builder
         */
        public Builder globalParams(String globalParams) {
            this.globalParams = globalParams;
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
         * Setter for locations.
         * @param  locations  String value for locations.
         * @return Builder
         */
        public Builder locations(String locations) {
            this.locations = locations;
            return this;
        }

        /**
         * Setter for modifyBy.
         * @param  modifyBy  String value for modifyBy.
         * @return Builder
         */
        public Builder modifyBy(String modifyBy) {
            this.modifyBy = modifyBy;
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
         * Setter for projectCode.
         * @param  projectCode  Long value for projectCode.
         * @return Builder
         */
        public Builder projectCode(Long projectCode) {
            this.projectCode = projectCode;
            return this;
        }

        /**
         * Setter for projectName.
         * @param  projectName  String value for projectName.
         * @return Builder
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * Setter for releaseState.
         * @param  releaseState  ReleaseStateEnum value for releaseState.
         * @return Builder
         */
        public Builder releaseState(ReleaseStateEnum releaseState) {
            this.releaseState = releaseState;
            return this;
        }

        /**
         * Setter for scheduleReleaseState.
         * @param  scheduleReleaseState  ScheduleReleaseStateEnum value for scheduleReleaseState.
         * @return Builder
         */
        public Builder scheduleReleaseState(ScheduleReleaseStateEnum scheduleReleaseState) {
            this.scheduleReleaseState = scheduleReleaseState;
            return this;
        }

        /**
         * Setter for tenantCode.
         * @param  tenantCode  String value for tenantCode.
         * @return Builder
         */
        public Builder tenantCode(String tenantCode) {
            this.tenantCode = tenantCode;
            return this;
        }

        /**
         * Setter for tenantId.
         * @param  tenantId  Integer value for tenantId.
         * @return Builder
         */
        public Builder tenantId(Integer tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Setter for timeout.
         * @param  timeout  Integer value for timeout.
         * @return Builder
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
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
         * Setter for userId.
         * @param  userId  Integer value for userId.
         * @return Builder
         */
        public Builder userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Setter for userName.
         * @param  userName  String value for userName.
         * @return Builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * Setter for version.
         * @param  version  Integer value for version.
         * @return Builder
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        /**
         * Setter for warningGroupId.
         * @param  warningGroupId  Integer value for warningGroupId.
         * @return Builder
         */
        public Builder warningGroupId(Integer warningGroupId) {
            this.warningGroupId = warningGroupId;
            return this;
        }

        /**
         * Builds a new {@link ProcessDefinition} object using the set fields.
         * @return {@link ProcessDefinition}
         */
        public ProcessDefinition build() {
            return new ProcessDefinition(code, createTime, description, executionType, flag,
                    globalParamList, globalParamMap, globalParams, id, locations, modifyBy, name,
                    projectCode, projectName, releaseState, scheduleReleaseState, tenantCode,
                    tenantId, timeout, updateTime, userId, userName, version, warningGroupId);
        }
    }
}
