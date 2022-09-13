
# Task Definition

## Structure

`TaskDefinition`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `Long` | Optional | - | Long getCode() | setCode(Long code) |
| `CreateTime` | `LocalDateTime` | Optional | - | LocalDateTime getCreateTime() | setCreateTime(LocalDateTime createTime) |
| `DelayTime` | `Integer` | Optional | - | Integer getDelayTime() | setDelayTime(Integer delayTime) |
| `Dependence` | `String` | Optional | - | String getDependence() | setDependence(String dependence) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `EnvironmentCode` | `Long` | Optional | - | Long getEnvironmentCode() | setEnvironmentCode(Long environmentCode) |
| `FailRetryInterval` | `Integer` | Optional | - | Integer getFailRetryInterval() | setFailRetryInterval(Integer failRetryInterval) |
| `FailRetryTimes` | `Integer` | Optional | - | Integer getFailRetryTimes() | setFailRetryTimes(Integer failRetryTimes) |
| `Flag` | [`FlagEnum`](../../doc/models/flag-enum.md) | Optional | - | FlagEnum getFlag() | setFlag(FlagEnum flag) |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `ModifyBy` | `String` | Optional | - | String getModifyBy() | setModifyBy(String modifyBy) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `ProjectCode` | `Long` | Optional | - | Long getProjectCode() | setProjectCode(Long projectCode) |
| `ProjectName` | `String` | Optional | - | String getProjectName() | setProjectName(String projectName) |
| `ResourceIds` | `String` | Optional | - | String getResourceIds() | setResourceIds(String resourceIds) |
| `TaskGroupId` | `Integer` | Optional | - | Integer getTaskGroupId() | setTaskGroupId(Integer taskGroupId) |
| `TaskGroupPriority` | `Integer` | Optional | - | Integer getTaskGroupPriority() | setTaskGroupPriority(Integer taskGroupPriority) |
| `TaskParamList` | [`List<Property>`](../../doc/models/property.md) | Optional | - | List<Property> getTaskParamList() | setTaskParamList(List<Property> taskParamList) |
| `TaskParamMap` | `Map<String, String>` | Optional | - | Map<String, String> getTaskParamMap() | setTaskParamMap(Map<String, String> taskParamMap) |
| `TaskParams` | `String` | Optional | - | String getTaskParams() | setTaskParams(String taskParams) |
| `TaskPriority` | [`TaskPriorityEnum`](../../doc/models/task-priority-enum.md) | Optional | - | TaskPriorityEnum getTaskPriority() | setTaskPriority(TaskPriorityEnum taskPriority) |
| `TaskType` | `String` | Optional | - | String getTaskType() | setTaskType(String taskType) |
| `Timeout` | `Integer` | Optional | - | Integer getTimeout() | setTimeout(Integer timeout) |
| `TimeoutFlag` | [`TimeoutFlagEnum`](../../doc/models/timeout-flag-enum.md) | Optional | - | TimeoutFlagEnum getTimeoutFlag() | setTimeoutFlag(TimeoutFlagEnum timeoutFlag) |
| `TimeoutNotifyStrategy` | [`TimeoutNotifyStrategyEnum`](../../doc/models/timeout-notify-strategy-enum.md) | Optional | - | TimeoutNotifyStrategyEnum getTimeoutNotifyStrategy() | setTimeoutNotifyStrategy(TimeoutNotifyStrategyEnum timeoutNotifyStrategy) |
| `UpdateTime` | `LocalDateTime` | Optional | - | LocalDateTime getUpdateTime() | setUpdateTime(LocalDateTime updateTime) |
| `UserId` | `Integer` | Optional | - | Integer getUserId() | setUserId(Integer userId) |
| `UserName` | `String` | Optional | - | String getUserName() | setUserName(String userName) |
| `Version` | `Integer` | Optional | - | Integer getVersion() | setVersion(Integer version) |
| `WorkerGroup` | `String` | Optional | - | String getWorkerGroup() | setWorkerGroup(String workerGroup) |

## Example (as JSON)

```json
{
  "code": null,
  "createTime": null,
  "delayTime": null,
  "dependence": null,
  "description": null,
  "environmentCode": null,
  "failRetryInterval": null,
  "failRetryTimes": null,
  "flag": null,
  "id": null,
  "modifyBy": null,
  "name": null,
  "projectCode": null,
  "projectName": null,
  "resourceIds": null,
  "taskGroupId": null,
  "taskGroupPriority": null,
  "taskParamList": null,
  "taskParamMap": null,
  "taskParams": null,
  "taskPriority": null,
  "taskType": null,
  "timeout": null,
  "timeoutFlag": null,
  "timeoutNotifyStrategy": null,
  "updateTime": null,
  "userId": null,
  "userName": null,
  "version": null,
  "workerGroup": null
}
```

