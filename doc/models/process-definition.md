
# Process Definition

## Structure

`ProcessDefinition`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `Long` | Optional | - | Long getCode() | setCode(Long code) |
| `CreateTime` | `LocalDateTime` | Optional | - | LocalDateTime getCreateTime() | setCreateTime(LocalDateTime createTime) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `ExecutionType` | [`ExecutionTypeEnum`](../../doc/models/execution-type-enum.md) | Optional | - | ExecutionTypeEnum getExecutionType() | setExecutionType(ExecutionTypeEnum executionType) |
| `Flag` | [`FlagEnum`](../../doc/models/flag-enum.md) | Optional | - | FlagEnum getFlag() | setFlag(FlagEnum flag) |
| `GlobalParamList` | [`List<Property>`](../../doc/models/property.md) | Optional | - | List<Property> getGlobalParamList() | setGlobalParamList(List<Property> globalParamList) |
| `GlobalParamMap` | `Map<String, String>` | Optional | - | Map<String, String> getGlobalParamMap() | setGlobalParamMap(Map<String, String> globalParamMap) |
| `GlobalParams` | `String` | Optional | - | String getGlobalParams() | setGlobalParams(String globalParams) |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Locations` | `String` | Optional | - | String getLocations() | setLocations(String locations) |
| `ModifyBy` | `String` | Optional | - | String getModifyBy() | setModifyBy(String modifyBy) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `ProjectCode` | `Long` | Optional | - | Long getProjectCode() | setProjectCode(Long projectCode) |
| `ProjectName` | `String` | Optional | - | String getProjectName() | setProjectName(String projectName) |
| `ReleaseState` | [`ReleaseStateEnum`](../../doc/models/release-state-enum.md) | Optional | - | ReleaseStateEnum getReleaseState() | setReleaseState(ReleaseStateEnum releaseState) |
| `ScheduleReleaseState` | [`ScheduleReleaseStateEnum`](../../doc/models/schedule-release-state-enum.md) | Optional | - | ScheduleReleaseStateEnum getScheduleReleaseState() | setScheduleReleaseState(ScheduleReleaseStateEnum scheduleReleaseState) |
| `TenantCode` | `String` | Optional | - | String getTenantCode() | setTenantCode(String tenantCode) |
| `TenantId` | `Integer` | Optional | - | Integer getTenantId() | setTenantId(Integer tenantId) |
| `Timeout` | `Integer` | Optional | - | Integer getTimeout() | setTimeout(Integer timeout) |
| `UpdateTime` | `LocalDateTime` | Optional | - | LocalDateTime getUpdateTime() | setUpdateTime(LocalDateTime updateTime) |
| `UserId` | `Integer` | Optional | - | Integer getUserId() | setUserId(Integer userId) |
| `UserName` | `String` | Optional | - | String getUserName() | setUserName(String userName) |
| `Version` | `Integer` | Optional | - | Integer getVersion() | setVersion(Integer version) |
| `WarningGroupId` | `Integer` | Optional | - | Integer getWarningGroupId() | setWarningGroupId(Integer warningGroupId) |

## Example (as JSON)

```json
{
  "code": null,
  "createTime": null,
  "description": null,
  "executionType": null,
  "flag": null,
  "globalParamList": null,
  "globalParamMap": null,
  "globalParams": null,
  "id": null,
  "locations": null,
  "modifyBy": null,
  "name": null,
  "projectCode": null,
  "projectName": null,
  "releaseState": null,
  "scheduleReleaseState": null,
  "tenantCode": null,
  "tenantId": null,
  "timeout": null,
  "updateTime": null,
  "userId": null,
  "userName": null,
  "version": null,
  "warningGroupId": null
}
```

