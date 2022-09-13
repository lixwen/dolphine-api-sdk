# Worker分组管理

Worker Group Controller

```java
WorkerController workerController = client.getWorkerController();
```

## Class Name

`WorkerController`

## Methods

* [Query All Worker Groups Paging Using GET](../../doc/controllers/worker分组管理.md#query-all-worker-groups-paging-using-get)
* [Save Worker Group Using POST](../../doc/controllers/worker分组管理.md#save-worker-group-using-post)
* [Query All Worker Groups Using GET](../../doc/controllers/worker分组管理.md#query-all-worker-groups-using-get)
* [Query Worker Address List Using GET](../../doc/controllers/worker分组管理.md#query-worker-address-list-using-get)
* [Delete by Id Using DELETE](../../doc/controllers/worker分组管理.md#delete-by-id-using-delete)


# Query All Worker Groups Paging Using GET

Worker分组管理

```java
CompletableFuture<Result> queryAllWorkerGroupsPagingUsingGETAsync(
    final int pageNo,
    final int pageSize,
    final String searchVal)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `pageNo` | `int` | Query, Required | 页码号 |
| `pageSize` | `int` | Query, Required | 页大小 |
| `searchVal` | `String` | Query, Optional | 搜索值 |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
int pageNo = 1;
int pageSize = 20;

workerController.queryAllWorkerGroupsPagingUsingGETAsync(pageNo, pageSize, null).thenAccept(result -> {
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


# Save Worker Group Using POST

创建Worker分组

```java
CompletableFuture<Result> saveWorkerGroupUsingPOSTAsync(
    final String addrList,
    final String name,
    final Integer id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `addrList` | `String` | Query, Required | worker地址列表 |
| `name` | `String` | Query, Required | Worker分组名称 |
| `id` | `Integer` | Query, Optional | Worker Server分组ID<br>**Default**: `0` |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
String addrList = "addrList8";
String name = "name0";
Integer id = 10;

workerController.saveWorkerGroupUsingPOSTAsync(addrList, name, id).thenAccept(result -> {
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


# Query All Worker Groups Using GET

查询worker group分组

```java
CompletableFuture<Result> queryAllWorkerGroupsUsingGETAsync()
```

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
workerController.queryAllWorkerGroupsUsingGETAsync().thenAccept(result -> {
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


# Query Worker Address List Using GET

查询worker地址列表

```java
CompletableFuture<Result> queryWorkerAddressListUsingGETAsync()
```

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
workerController.queryWorkerAddressListUsingGETAsync().thenAccept(result -> {
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


# Delete by Id Using DELETE

通过ID删除worker group

```java
CompletableFuture<Result> deleteByIdUsingDELETEAsync(
    final int id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `int` | Template, Required | Worker Server分组ID |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
int id = 10;

workerController.deleteByIdUsingDELETEAsync(id).thenAccept(result -> {
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

