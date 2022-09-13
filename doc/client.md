
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance. |

The API client can be initialized as follows:

```java
DolphinSchedulerApiDocsClient client = new DolphinSchedulerApiDocsClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .build();
```

## Dolphin Scheduler Api DocsClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getTokenController()` | Provides access to Token controller. | `TokenController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getDATAQUALITYSERVICEController()` | Provides access to DATAQUALITYSERVICE controller. | `DATAQUALITYSERVICEController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getUIController()` | Provides access to UI controller. | `UIController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getWorkerController()` | Provides access to Worker controller. | `WorkerController` |
| `getMController()` | Provides access to M controller. | `MController` |
| `getDsErrorController()` | Provides access to DsErrorController controller. | `DsErrorController` |
| `getTaskGroupController()` | Provides access to TaskGroup controller. | `TaskGroupController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | `ReadonlyHttpClientConfiguration` |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

