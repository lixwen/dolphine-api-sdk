
# Process Instance

## Structure

`ProcessInstance`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Blocked` | `Boolean` | Optional | - | Boolean getBlocked() | setBlocked(Boolean blocked) |
| `CmdTypeIfComplement` | [`CmdTypeIfComplementEnum`](../../doc/models/cmd-type-if-complement-enum.md) | Optional | - | CmdTypeIfComplementEnum getCmdTypeIfComplement() | setCmdTypeIfComplement(CmdTypeIfComplementEnum cmdTypeIfComplement) |
| `CommandParam` | `String` | Optional | - | String getCommandParam() | setCommandParam(String commandParam) |
| `CommandStartTime` | `LocalDateTime` | Optional | - | LocalDateTime getCommandStartTime() | setCommandStartTime(LocalDateTime commandStartTime) |
| `CommandType` | [`CommandTypeEnum`](../../doc/models/command-type-enum.md) | Optional | - | CommandTypeEnum getCommandType() | setCommandType(CommandTypeEnum commandType) |
| `ComplementData` | `Boolean` | Optional | - | Boolean getComplementData() | setComplementData(Boolean complementData) |
| `DagData` | [`DagData`](../../doc/models/dag-data.md) | Optional | - | DagData getDagData() | setDagData(DagData dagData) |
| `DependenceScheduleTimes` | `String` | Optional | - | String getDependenceScheduleTimes() | setDependenceScheduleTimes(String dependenceScheduleTimes) |
| `DryRun` | `Integer` | Optional | - | Integer getDryRun() | setDryRun(Integer dryRun) |
| `Duration` | `String` | Optional | - | String getDuration() | setDuration(String duration) |
| `EndTime` | `LocalDateTime` | Optional | - | LocalDateTime getEndTime() | setEndTime(LocalDateTime endTime) |
| `EnvironmentCode` | `Long` | Optional | - | Long getEnvironmentCode() | setEnvironmentCode(Long environmentCode) |
| `ExecutorId` | `Integer` | Optional | - | Integer getExecutorId() | setExecutorId(Integer executorId) |
| `ExecutorName` | `String` | Optional | - | String getExecutorName() | setExecutorName(String executorName) |
| `FailureStrategy` | [`FailureStrategyEnum`](../../doc/models/failure-strategy-enum.md) | Optional | - | FailureStrategyEnum getFailureStrategy() | setFailureStrategy(FailureStrategyEnum failureStrategy) |
| `GlobalParams` | `String` | Optional | - | String getGlobalParams() | setGlobalParams(String globalParams) |
| `HistoryCmd` | `String` | Optional | - | String getHistoryCmd() | setHistoryCmd(String historyCmd) |
| `Host` | `String` | Optional | - | String getHost() | setHost(String host) |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `IsSubProcess` | [`IsSubProcessEnum`](../../doc/models/is-sub-process-enum.md) | Optional | - | IsSubProcessEnum getIsSubProcess() | setIsSubProcess(IsSubProcessEnum isSubProcess) |
| `Locations` | `String` | Optional | - | String getLocations() | setLocations(String locations) |
| `MaxTryTimes` | `Integer` | Optional | - | Integer getMaxTryTimes() | setMaxTryTimes(Integer maxTryTimes) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `NextProcessInstanceId` | `Integer` | Optional | - | Integer getNextProcessInstanceId() | setNextProcessInstanceId(Integer nextProcessInstanceId) |
| `ProcessDefinition` | [`ProcessDefinition`](../../doc/models/process-definition.md) | Optional | - | ProcessDefinition getProcessDefinition() | setProcessDefinition(ProcessDefinition processDefinition) |
| `ProcessDefinitionCode` | `Long` | Optional | - | Long getProcessDefinitionCode() | setProcessDefinitionCode(Long processDefinitionCode) |
| `ProcessDefinitionVersion` | `Integer` | Optional | - | Integer getProcessDefinitionVersion() | setProcessDefinitionVersion(Integer processDefinitionVersion) |
| `ProcessInstancePriority` | [`ProcessInstancePriorityEnum`](../../doc/models/process-instance-priority-enum.md) | Optional | - | ProcessInstancePriorityEnum getProcessInstancePriority() | setProcessInstancePriority(ProcessInstancePriorityEnum processInstancePriority) |
| `ProcessInstanceStop` | `Boolean` | Optional | - | Boolean getProcessInstanceStop() | setProcessInstanceStop(Boolean processInstanceStop) |
| `Queue` | `String` | Optional | - | String getQueue() | setQueue(String queue) |
| `Recovery` | [`RecoveryEnum`](../../doc/models/recovery-enum.md) | Optional | - | RecoveryEnum getRecovery() | setRecovery(RecoveryEnum recovery) |
| `RestartTime` | `LocalDateTime` | Optional | - | LocalDateTime getRestartTime() | setRestartTime(LocalDateTime restartTime) |
| `RunTimes` | `Integer` | Optional | - | Integer getRunTimes() | setRunTimes(Integer runTimes) |
| `ScheduleTime` | `LocalDateTime` | Optional | - | LocalDateTime getScheduleTime() | setScheduleTime(LocalDateTime scheduleTime) |
| `StartTime` | `LocalDateTime` | Optional | - | LocalDateTime getStartTime() | setStartTime(LocalDateTime startTime) |
| `State` | [`StateEnum`](../../doc/models/state-enum.md) | Optional | - | StateEnum getState() | setState(StateEnum state) |
| `TaskDependType` | [`TaskDependTypeEnum`](../../doc/models/task-depend-type-enum.md) | Optional | - | TaskDependTypeEnum getTaskDependType() | setTaskDependType(TaskDependTypeEnum taskDependType) |
| `TenantCode` | `String` | Optional | - | String getTenantCode() | setTenantCode(String tenantCode) |
| `TenantId` | `Integer` | Optional | - | Integer getTenantId() | setTenantId(Integer tenantId) |
| `Timeout` | `Integer` | Optional | - | Integer getTimeout() | setTimeout(Integer timeout) |
| `VarPool` | `String` | Optional | - | String getVarPool() | setVarPool(String varPool) |
| `WarningGroupId` | `Integer` | Optional | - | Integer getWarningGroupId() | setWarningGroupId(Integer warningGroupId) |
| `WarningType` | [`WarningTypeEnum`](../../doc/models/warning-type-enum.md) | Optional | - | WarningTypeEnum getWarningType() | setWarningType(WarningTypeEnum warningType) |
| `WorkerGroup` | `String` | Optional | - | String getWorkerGroup() | setWorkerGroup(String workerGroup) |

## Example (as JSON)

```json
{
  "blocked": null,
  "cmdTypeIfComplement": null,
  "commandParam": null,
  "commandStartTime": null,
  "commandType": null,
  "complementData": null,
  "dagData": null,
  "dependenceScheduleTimes": null,
  "dryRun": null,
  "duration": null,
  "endTime": null,
  "environmentCode": null,
  "executorId": null,
  "executorName": null,
  "failureStrategy": null,
  "globalParams": null,
  "historyCmd": null,
  "host": null,
  "id": null,
  "isSubProcess": null,
  "locations": null,
  "maxTryTimes": null,
  "name": null,
  "nextProcessInstanceId": null,
  "processDefinition": null,
  "processDefinitionCode": null,
  "processDefinitionVersion": null,
  "processInstancePriority": null,
  "processInstanceStop": null,
  "queue": null,
  "recovery": null,
  "restartTime": null,
  "runTimes": null,
  "scheduleTime": null,
  "startTime": null,
  "state": null,
  "taskDependType": null,
  "tenantCode": null,
  "tenantId": null,
  "timeout": null,
  "varPool": null,
  "warningGroupId": null,
  "warningType": null,
  "workerGroup": null
}
```

