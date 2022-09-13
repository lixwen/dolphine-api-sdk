
# Dag Data

## Structure

`DagData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProcessDefinition` | [`ProcessDefinition`](../../doc/models/process-definition.md) | Optional | - | ProcessDefinition getProcessDefinition() | setProcessDefinition(ProcessDefinition processDefinition) |
| `ProcessTaskRelationList` | [`List<ProcessTaskRelation>`](../../doc/models/process-task-relation.md) | Optional | - | List<ProcessTaskRelation> getProcessTaskRelationList() | setProcessTaskRelationList(List<ProcessTaskRelation> processTaskRelationList) |
| `TaskDefinitionList` | [`List<TaskDefinition>`](../../doc/models/task-definition.md) | Optional | - | List<TaskDefinition> getTaskDefinitionList() | setTaskDefinitionList(List<TaskDefinition> taskDefinitionList) |

## Example (as JSON)

```json
{
  "processDefinition": null,
  "processTaskRelationList": null,
  "taskDefinitionList": null
}
```

