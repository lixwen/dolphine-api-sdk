# Taskgroup

```java
TaskgroupController taskgroupController = client.getTaskgroupController();
```

## Class Name

`TaskgroupController`

## Methods

* [Close Task Group Using POST](../../doc/controllers/taskgroup.md#close-task-group-using-post)
* [Create Task Group Using POST](../../doc/controllers/taskgroup.md#create-task-group-using-post)
* [Force Start Using POST](../../doc/controllers/taskgroup.md#force-start-using-post)
* [Query All Task Group Using GET](../../doc/controllers/taskgroup.md#query-all-task-group-using-get)
* [Modify Priority Using POST](../../doc/controllers/taskgroup.md#modify-priority-using-post)
* [Query Tasks by Group Id Using GET](../../doc/controllers/taskgroup.md#query-tasks-by-group-id-using-get)
* [Query Task Group by Code Using GET](../../doc/controllers/taskgroup.md#query-task-group-by-code-using-get)
* [Query Task Group by Status Using GET](../../doc/controllers/taskgroup.md#query-task-group-by-status-using-get)
* [Start Task Group Using POST](../../doc/controllers/taskgroup.md#start-task-group-using-post)
* [Update Task Group Using POST](../../doc/controllers/taskgroup.md#update-task-group-using-post)


# Close Task Group Using POST

CLOSE_TASK_GROUP_NOTES

```java
CompletableFuture<Result> closeTaskGroupUsingPOSTAsync(
    final int id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `int` | Query, Required | ID |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
int id = 112;

taskGroupController.closeTaskGroupUsingPOSTAsync(id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |


# Create Task Group Using POST

CREATE_TASK_GROUP_NOTE

```java
CompletableFuture<Result> createTaskGroupUsingPOSTAsync(
    final String description,
    final Integer groupSize,
    final String name,
    final String projectCode)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `description` | `String` | Query, Optional | DESCRIPTION |
| `groupSize` | `Integer` | Query, Optional | GROUPSIZE |
| `name` | `String` | Query, Optional | NAME |
| `projectCode` | `String` | Query, Optional | 项目Code |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
taskGroupController.createTaskGroupUsingPOSTAsync(null, null, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |


# Force Start Using POST

WAKE_TASK_COMPULSIVELY_NOTES

```java
CompletableFuture<Result> forceStartUsingPOSTAsync(
    final int queueId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `queueId` | `int` | Query, Required | 任务组队列id |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
int queueId = 178;

taskGroupController.forceStartUsingPOSTAsync(queueId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |


# Query All Task Group Using GET

QUERY_ALL_TASK_GROUP_NOTES

```java
CompletableFuture<Result> queryAllTaskGroupUsingGETAsync(
    final int pageNo,
    final int pageSize,
    final String name,
    final Integer status)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `pageNo` | `int` | Query, Required | 页码号 |
| `pageSize` | `int` | Query, Required | 页大小 |
| `name` | `String` | Query, Optional | NAME |
| `status` | `Integer` | Query, Optional | status |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
int pageNo = 1;
int pageSize = 20;

taskGroupController.queryAllTaskGroupUsingGETAsync(pageNo, pageSize, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |


# Modify Priority Using POST

WAKE_TASK_COMPULSIVELY_NOTES

```java
CompletableFuture<Result> modifyPriorityUsingPOSTAsync(
    final int priority,
    final int queueId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `priority` | `int` | Query, Required | 任务队列优先级 |
| `queueId` | `int` | Query, Required | 任务组队列id |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
int priority = 142;
int queueId = 178;

taskGroupController.modifyPriorityUsingPOSTAsync(priority, queueId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |


# Query Tasks by Group Id Using GET

QUERY_ALL_TASKS_NOTES

```java
CompletableFuture<Result> queryTasksByGroupIdUsingGETAsync(
    final int pageNo,
    final int pageSize,
    final Integer groupId,
    final String processInstanceName,
    final Integer status,
    final String taskInstanceName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `pageNo` | `int` | Query, Required | 页码号 |
| `pageSize` | `int` | Query, Required | 页大小 |
| `groupId` | `Integer` | Query, Optional | GROUP_ID<br>**Default**: `-1` |
| `processInstanceName` | `String` | Query, Optional | 流程实例名称 |
| `status` | `Integer` | Query, Optional | STATUS |
| `taskInstanceName` | `String` | Query, Optional | TASK_INSTANCE_NAME |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
int pageNo = 1;
int pageSize = 20;
Integer groupId = 1;
String processInstanceName = "processName";
Integer status = 1;
String taskInstanceName = "taskName";

taskGroupController.queryTasksByGroupIdUsingGETAsync(pageNo, pageSize, groupId, processInstanceName, status, taskInstanceName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |


# Query Task Group by Code Using GET

QUERY_TASK_GROUP_LIST_BY_PROJECT_ID_NOTES

```java
CompletableFuture<Result> queryTaskGroupByCodeUsingGETAsync(
    final int pageNo,
    final int pageSize,
    final String projectCode)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `pageNo` | `int` | Query, Required | 页码号 |
| `pageSize` | `int` | Query, Required | 页大小 |
| `projectCode` | `String` | Query, Required | 项目Code |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
int pageNo = 1;
int pageSize = 20;
String projectCode = "projectCode0";

taskGroupController.queryTaskGroupByCodeUsingGETAsync(pageNo, pageSize, projectCode).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |


# Query Task Group by Status Using GET

QUERY_TASK_GROUP_LIST_BY_STATUS_NOTES

```java
CompletableFuture<Result> queryTaskGroupByStatusUsingGETAsync(
    final int pageNo,
    final int pageSize,
    final int status)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `pageNo` | `int` | Query, Required | 页码号 |
| `pageSize` | `int` | Query, Required | 页大小 |
| `status` | `int` | Query, Required | status |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
int pageNo = 1;
int pageSize = 20;
int status = 204;

taskGroupController.queryTaskGroupByStatusUsingGETAsync(pageNo, pageSize, status).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |


# Start Task Group Using POST

START_TASK_GROUP_NOTES

```java
CompletableFuture<Result> startTaskGroupUsingPOSTAsync(
    final int id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `int` | Query, Required | ID |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
int id = 112;

taskGroupController.startTaskGroupUsingPOSTAsync(id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |


# Update Task Group Using POST

UPDATE_TASK_GROUP_NOTE

```java
CompletableFuture<Result> updateTaskGroupUsingPOSTAsync(
    final String description,
    final Integer groupSize,
    final Integer id,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `description` | `String` | Query, Optional | DESCRIPTION |
| `groupSize` | `Integer` | Query, Optional | GROUPSIZE |
| `id` | `Integer` | Query, Optional | id |
| `name` | `String` | Query, Optional | NAME |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
taskGroupController.updateTaskGroupUsingPOSTAsync(null, null, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 404 | Not Found | `ApiException` |

