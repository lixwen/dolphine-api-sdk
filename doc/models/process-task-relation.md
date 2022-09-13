
# Process Task Relation

## Structure

`ProcessTaskRelation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ConditionParams` | `String` | Optional | - | String getConditionParams() | setConditionParams(String conditionParams) |
| `ConditionType` | [`ConditionTypeEnum`](../../doc/models/condition-type-enum.md) | Optional | - | ConditionTypeEnum getConditionType() | setConditionType(ConditionTypeEnum conditionType) |
| `CreateTime` | `LocalDateTime` | Optional | - | LocalDateTime getCreateTime() | setCreateTime(LocalDateTime createTime) |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `PostTaskCode` | `Long` | Optional | - | Long getPostTaskCode() | setPostTaskCode(Long postTaskCode) |
| `PostTaskVersion` | `Integer` | Optional | - | Integer getPostTaskVersion() | setPostTaskVersion(Integer postTaskVersion) |
| `PreTaskCode` | `Long` | Optional | - | Long getPreTaskCode() | setPreTaskCode(Long preTaskCode) |
| `PreTaskVersion` | `Integer` | Optional | - | Integer getPreTaskVersion() | setPreTaskVersion(Integer preTaskVersion) |
| `ProcessDefinitionCode` | `Long` | Optional | - | Long getProcessDefinitionCode() | setProcessDefinitionCode(Long processDefinitionCode) |
| `ProcessDefinitionVersion` | `Integer` | Optional | - | Integer getProcessDefinitionVersion() | setProcessDefinitionVersion(Integer processDefinitionVersion) |
| `ProjectCode` | `Long` | Optional | - | Long getProjectCode() | setProjectCode(Long projectCode) |
| `UpdateTime` | `LocalDateTime` | Optional | - | LocalDateTime getUpdateTime() | setUpdateTime(LocalDateTime updateTime) |

## Example (as JSON)

```json
{
  "conditionParams": null,
  "conditionType": null,
  "createTime": null,
  "id": null,
  "name": null,
  "postTaskCode": null,
  "postTaskVersion": null,
  "preTaskCode": null,
  "preTaskVersion": null,
  "processDefinitionCode": null,
  "processDefinitionVersion": null,
  "projectCode": null,
  "updateTime": null
}
```

