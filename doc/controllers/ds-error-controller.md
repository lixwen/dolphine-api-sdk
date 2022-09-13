# Ds-Error-Controller

Ds Error Controller

```java
DsErrorController dsErrorController = client.getDsErrorController();
```

## Class Name

`DsErrorController`

## Methods

* [Handle Error Using GET](../../doc/controllers/ds-error-controller.md#handle-error-using-get)
* [Handle Error Using POST](../../doc/controllers/ds-error-controller.md#handle-error-using-post)
* [Handle Error Using PUT](../../doc/controllers/ds-error-controller.md#handle-error-using-put)
* [Handle Error Using DELETE](../../doc/controllers/ds-error-controller.md#handle-error-using-delete)
* [Handle Error Using PATCH](../../doc/controllers/ds-error-controller.md#handle-error-using-patch)


# Handle Error Using GET

handleError

```java
CompletableFuture<ModelAndView> handleErrorUsingGETAsync()
```

## Response Type

[`ModelAndView`](../../doc/models/model-and-view.md)

## Example Usage

```java
dsErrorController.handleErrorUsingGETAsync().thenAccept(result -> {
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


# Handle Error Using POST

handleError

```java
CompletableFuture<ModelAndView> handleErrorUsingPOSTAsync()
```

## Response Type

[`ModelAndView`](../../doc/models/model-and-view.md)

## Example Usage

```java
dsErrorController.handleErrorUsingPOSTAsync().thenAccept(result -> {
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


# Handle Error Using PUT

handleError

```java
CompletableFuture<ModelAndView> handleErrorUsingPUTAsync()
```

## Response Type

[`ModelAndView`](../../doc/models/model-and-view.md)

## Example Usage

```java
dsErrorController.handleErrorUsingPUTAsync().thenAccept(result -> {
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


# Handle Error Using DELETE

handleError

```java
CompletableFuture<ModelAndView> handleErrorUsingDELETEAsync()
```

## Response Type

[`ModelAndView`](../../doc/models/model-and-view.md)

## Example Usage

```java
dsErrorController.handleErrorUsingDELETEAsync().thenAccept(result -> {
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


# Handle Error Using PATCH

handleError

```java
CompletableFuture<ModelAndView> handleErrorUsingPATCHAsync()
```

## Response Type

[`ModelAndView`](../../doc/models/model-and-view.md)

## Example Usage

```java
dsErrorController.handleErrorUsingPATCHAsync().thenAccept(result -> {
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

