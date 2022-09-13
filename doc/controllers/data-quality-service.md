# DATA QUALITY SERVICE

Data Quality Controller

```java
DATAQUALITYSERVICEController dATAQUALITYSERVICEController = client.getDATAQUALITYSERVICEController();
```

## Class Name

`DATAQUALITYSERVICEController`

## Methods

* [Get Datasource Options by Id Using GET](../../doc/controllers/data-quality-service.md#get-datasource-options-by-id-using-get)
* [Get Rule Form Create Json by Id Using GET](../../doc/controllers/data-quality-service.md#get-rule-form-create-json-by-id-using-get)
* [Query Execute Result List Paging Using GET](../../doc/controllers/data-quality-service.md#query-execute-result-list-paging-using-get)
* [Query Rule List Paging Using GET](../../doc/controllers/data-quality-service.md#query-rule-list-paging-using-get)
* [Query Rule List Using GET](../../doc/controllers/data-quality-service.md#query-rule-list-using-get)


# Get Datasource Options by Id Using GET

获取数据源OPTIONS

```java
CompletableFuture<Result> getDatasourceOptionsByIdUsingGETAsync(
    final Integer datasourceId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datasourceId` | `Integer` | Query, Optional | 数据源ID |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
Integer datasourceId = 1;

dATAQUALITYSERVICEController.getDatasourceOptionsByIdUsingGETAsync(datasourceId).thenAccept(result -> {
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


# Get Rule Form Create Json by Id Using GET

获取规则form-create json

```java
CompletableFuture<Result> getRuleFormCreateJsonByIdUsingGETAsync(
    final Integer ruleId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `ruleId` | `Integer` | Query, Optional | 规则ID |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
Integer ruleId = 1;

dATAQUALITYSERVICEController.getRuleFormCreateJsonByIdUsingGETAsync(ruleId).thenAccept(result -> {
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


# Query Execute Result List Paging Using GET

查询数据质量任务结果分页列表

```java
CompletableFuture<Result> queryExecuteResultListPagingUsingGETAsync(
    final String endDate,
    final Integer pageNo,
    final Integer pageSize,
    final Integer ruleType,
    final String searchVal,
    final String startDate,
    final Integer state)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `endDate` | `String` | Query, Optional | 结束时间 |
| `pageNo` | `Integer` | Query, Optional | 页码号 |
| `pageSize` | `Integer` | Query, Optional | 页大小 |
| `ruleType` | `Integer` | Query, Optional | 规则类型 |
| `searchVal` | `String` | Query, Optional | 搜索值 |
| `startDate` | `String` | Query, Optional | 开始时间 |
| `state` | `Integer` | Query, Optional | 状态 |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
Integer pageNo = 1;
Integer pageSize = 10;
Integer ruleType = 1;
Integer state = 1;

dATAQUALITYSERVICEController.queryExecuteResultListPagingUsingGETAsync(null, pageNo, pageSize, ruleType, null, null, state).thenAccept(result -> {
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


# Query Rule List Paging Using GET

查询规则分页列表

```java
CompletableFuture<Result> queryRuleListPagingUsingGETAsync(
    final String endDate,
    final Integer pageNo,
    final Integer pageSize,
    final Integer ruleType,
    final String searchVal,
    final String startDate)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `endDate` | `String` | Query, Optional | 结束时间 |
| `pageNo` | `Integer` | Query, Optional | 页码号 |
| `pageSize` | `Integer` | Query, Optional | 页大小 |
| `ruleType` | `Integer` | Query, Optional | 规则类型 |
| `searchVal` | `String` | Query, Optional | 搜索值 |
| `startDate` | `String` | Query, Optional | 开始时间 |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
Integer pageNo = 1;
Integer pageSize = 10;
Integer ruleType = 1;

dATAQUALITYSERVICEController.queryRuleListPagingUsingGETAsync(null, pageNo, pageSize, ruleType, null, null).thenAccept(result -> {
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


# Query Rule List Using GET

查询规则列表

```java
CompletableFuture<Result> queryRuleListUsingGETAsync()
```

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
dATAQUALITYSERVICEController.queryRuleListUsingGETAsync().thenAccept(result -> {
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

