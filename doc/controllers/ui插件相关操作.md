# UI插件相关操作

Ui Plugin Controller

```java
UIController uIController = client.getUIController();
```

## Class Name

`UIController`

## Methods

* [Query Ui Plugins by Type Using GET](../../doc/controllers/ui插件相关操作.md#query-ui-plugins-by-type-using-get)
* [Query Ui Plugin Detail by Id Using GET](../../doc/controllers/ui插件相关操作.md#query-ui-plugin-detail-by-id-using-get)


# Query Ui Plugins by Type Using GET

通过类型查询UI插件

```java
CompletableFuture<Void> queryUiPluginsByTypeUsingGETAsync(
    final Object pluginType)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `pluginType` | `Object` | Query, Required | pluginType |

## Response Type

`void`

## Example Usage

```java
Object pluginType = m6712345.m30.m168.m172.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}");

uIController.queryUiPluginsByTypeUsingGETAsync(pluginType).thenAccept(result -> {
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


# Query Ui Plugin Detail by Id Using GET

通过ID查询UI插件详情

```java
CompletableFuture<Void> queryUiPluginDetailByIdUsingGETAsync(
    final int id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `int` | Template, Required | 插件ID |

## Response Type

`void`

## Example Usage

```java
int id = 100;

uIController.queryUiPluginDetailByIdUsingGETAsync(id).thenAccept(result -> {
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

