# 访问token相关操作

Access Token Controller

```java
TokenController tokenController = client.getTokenController();
```

## Class Name

`TokenController`

## Methods

* [Query Access Token List Using GET](../../doc/controllers/访问token相关操作.md#query-access-token-list-using-get)
* [Create Token Using POST](../../doc/controllers/访问token相关操作.md#create-token-using-post)
* [Query Access Token by User Using GET](../../doc/controllers/访问token相关操作.md#query-access-token-by-user-using-get)
* [Update Token Using PUT](../../doc/controllers/访问token相关操作.md#update-token-using-put)


# Query Access Token List Using GET

分页查询access token列表

```java
CompletableFuture<Result> queryAccessTokenListUsingGETAsync(
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

tokenController.queryAccessTokenListUsingGETAsync(pageNo, pageSize, null).thenAccept(result -> {
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


# Create Token Using POST

为指定用户创建安全令牌

```java
CompletableFuture<Result> createTokenUsingPOSTAsync(
    final String expireTime,
    final int userId,
    final String token)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `expireTime` | `String` | Query, Required | 安全令牌的过期时间 |
| `userId` | `int` | Query, Required | 用户ID |
| `token` | `String` | Query, Optional | 安全令牌字符串，若未显式指定将会自动生成 |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
String expireTime = "2021-12-31 00:00:00";
int userId = 28;
String token = "xxxx";

tokenController.createTokenUsingPOSTAsync(expireTime, userId, token).thenAccept(result -> {
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


# Query Access Token by User Using GET

查询指定用户的access token

```java
CompletableFuture<Result> queryAccessTokenByUserUsingGETAsync(
    final int userId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userId` | `int` | Template, Required | 用户ID |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
int userId = 28;

tokenController.queryAccessTokenByUserUsingGETAsync(userId).thenAccept(result -> {
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


# Update Token Using PUT

更新指定用户的安全令牌

```java
CompletableFuture<Result> updateTokenUsingPUTAsync(
    final String expireTime,
    final int id,
    final int userId,
    final String token)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `expireTime` | `String` | Query, Required | 安全令牌的过期时间 |
| `id` | `int` | Template, Required | 安全令牌的ID |
| `userId` | `int` | Query, Required | 用户ID |
| `token` | `String` | Query, Optional | 安全令牌字符串，若未显式指定将会自动生成 |

## Response Type

[`Result`](../../doc/models/result.md)

## Example Usage

```java
String expireTime = "2021-12-31 00:00:00";
int id = 112;
int userId = 28;
String token = "xxxx";

tokenController.updateTokenUsingPUTAsync(expireTime, id, userId, token).thenAccept(result -> {
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

