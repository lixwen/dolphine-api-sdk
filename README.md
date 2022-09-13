
# Getting Started with Dolphin Scheduler Api Docs

## Introduction

Dolphin Scheduler Api Docs

## Building

The generated code uses a few Maven dependencies e.g., Jackson, OkHttp,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on `File -> Import`.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?workspaceFolder=Dolphin%20Scheduler%20Api%20Docs-Java&workspaceName=DolphinSchedulerApiDocs&projectName=DolphinSchedulerApiDocsLib&rootNamespace=m6712345.m30.m168.m172&groupId=DolphinSchedulerApiDocsLib&artifactId=dolphin-scheduler-api-docs-lib&version=1.0.0&step=import0)

* In the import dialog, select `Existing Java Project` and click `Next`.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?workspaceFolder=Dolphin%20Scheduler%20Api%20Docs-Java&workspaceName=DolphinSchedulerApiDocs&projectName=DolphinSchedulerApiDocsLib&rootNamespace=m6712345.m30.m168.m172&groupId=DolphinSchedulerApiDocsLib&artifactId=dolphin-scheduler-api-docs-lib&version=1.0.0&step=import1)

* Browse to locate the folder containing the source code. Select the detected location of the project and click `Finish`.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?workspaceFolder=Dolphin%20Scheduler%20Api%20Docs-Java&workspaceName=DolphinSchedulerApiDocs&projectName=DolphinSchedulerApiDocsLib&rootNamespace=m6712345.m30.m168.m172&groupId=DolphinSchedulerApiDocsLib&artifactId=dolphin-scheduler-api-docs-lib&version=1.0.0&step=import2)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?workspaceFolder=Dolphin%20Scheduler%20Api%20Docs-Java&workspaceName=DolphinSchedulerApiDocs&projectName=DolphinSchedulerApiDocsLib&rootNamespace=m6712345.m30.m168.m172&groupId=DolphinSchedulerApiDocsLib&artifactId=dolphin-scheduler-api-docs-lib&version=1.0.0&step=import3)

## Installation

The following section explains how to use the DolphinSchedulerApiDocsLib library in a new project.

### 1. Starting a new project

For starting a new project, click the menu command `File > New > Project`.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?workspaceFolder=Dolphin%20Scheduler%20Api%20Docs-Java&workspaceName=DolphinSchedulerApiDocs&projectName=DolphinSchedulerApiDocsLib&rootNamespace=m6712345.m30.m168.m172&groupId=DolphinSchedulerApiDocsLib&artifactId=dolphin-scheduler-api-docs-lib&version=1.0.0&step=createNewProject0)

Next, choose `Maven > Maven Project` and click `Next`.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?workspaceFolder=Dolphin%20Scheduler%20Api%20Docs-Java&workspaceName=DolphinSchedulerApiDocs&projectName=DolphinSchedulerApiDocsLib&rootNamespace=m6712345.m30.m168.m172&groupId=DolphinSchedulerApiDocsLib&artifactId=dolphin-scheduler-api-docs-lib&version=1.0.0&step=createNewProject1)

Here, make sure to use the current workspace by choosing `Use default Workspace location`, as shown in the picture below and click `Next`.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?workspaceFolder=Dolphin%20Scheduler%20Api%20Docs-Java&workspaceName=DolphinSchedulerApiDocs&projectName=DolphinSchedulerApiDocsLib&rootNamespace=m6712345.m30.m168.m172&groupId=DolphinSchedulerApiDocsLib&artifactId=dolphin-scheduler-api-docs-lib&version=1.0.0&step=createNewProject2)

Following this, select the *quick start* project type to create a simple project with an existing class and a `main` method. To do this, choose `maven-archetype-quickstart` item from the list and click `Next`.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?workspaceFolder=Dolphin%20Scheduler%20Api%20Docs-Java&workspaceName=DolphinSchedulerApiDocs&projectName=DolphinSchedulerApiDocsLib&rootNamespace=m6712345.m30.m168.m172&groupId=DolphinSchedulerApiDocsLib&artifactId=dolphin-scheduler-api-docs-lib&version=1.0.0&step=createNewProject3)

In the last step, provide a `Group Id` and `Artifact Id` as shown in the picture below and click `Finish`.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?workspaceFolder=Dolphin%20Scheduler%20Api%20Docs-Java&workspaceName=DolphinSchedulerApiDocs&projectName=DolphinSchedulerApiDocsLib&rootNamespace=m6712345.m30.m168.m172&groupId=DolphinSchedulerApiDocsLib&artifactId=dolphin-scheduler-api-docs-lib&version=1.0.0&step=createNewProject4)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its `pom.xml` file. In order to add a dependency on the *DolphinSchedulerApiDocsLib* client library, double click on the `pom.xml` file in the `Package Explorer`. Opening the `pom.xml` file will render a graphical view on the canvas. Here, switch to the `Dependencies` tab and click the `Add` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?workspaceFolder=Dolphin%20Scheduler%20Api%20Docs-Java&workspaceName=DolphinSchedulerApiDocs&projectName=DolphinSchedulerApiDocsLib&rootNamespace=m6712345.m30.m168.m172&groupId=DolphinSchedulerApiDocsLib&artifactId=dolphin-scheduler-api-docs-lib&version=1.0.0&step=testProject0)

Clicking the `Add` button will open a dialog where you need to specify DolphinSchedulerApiDocsLib in `Group Id`, dolphin-scheduler-api-docs-lib in `Artifact Id` and 1.0.0 in the `Version` fields. Once added click `OK`. Save the `pom.xml` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?workspaceFolder=Dolphin%20Scheduler%20Api%20Docs-Java&workspaceName=DolphinSchedulerApiDocs&projectName=DolphinSchedulerApiDocsLib&rootNamespace=m6712345.m30.m168.m172&groupId=DolphinSchedulerApiDocsLib&artifactId=dolphin-scheduler-api-docs-lib&version=1.0.0&step=testProject1)

![Adding sample code](https://apidocs.io/illustration/java?workspaceFolder=Dolphin%20Scheduler%20Api%20Docs-Java&workspaceName=DolphinSchedulerApiDocs&projectName=DolphinSchedulerApiDocsLib&rootNamespace=m6712345.m30.m168.m172&groupId=DolphinSchedulerApiDocsLib&artifactId=dolphin-scheduler-api-docs-lib&version=1.0.0&step=testProject2)

### 3. Write sample code

Once the `SimpleConsoleApp` is created, a file named `App.java` will be visible in the *Package Explorer* with a `main` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

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

## List of APIs

* [Taskgroup](doc/controllers/taskgroup.md)
* [访问token相关操作](doc/controllers/访问token相关操作.md)
* [告警组相关操作](doc/controllers/告警组相关操作.md)
* [告警插件实例相关操作](doc/controllers/告警插件实例相关操作.md)
* [审计日志执行相关操作](doc/controllers/审计日志执行相关操作.md)
* [任务状态分析相关操作](doc/controllers/任务状态分析相关操作.md)
* [DATA QUALITY SERVICE](doc/controllers/data-quality-service.md)
* [数据源相关操作](doc/controllers/数据源相关操作.md)
* [环境相关操作](doc/controllers/环境相关操作.md)
* [流程相关操作](doc/controllers/流程相关操作.md)
* [日志相关操作](doc/controllers/日志相关操作.md)
* [用户登录相关操作](doc/controllers/用户登录相关操作.md)
* [监控相关操作](doc/controllers/监控相关操作.md)
* [流程定义相关操作](doc/controllers/流程定义相关操作.md)
* [流程实例相关操作](doc/controllers/流程实例相关操作.md)
* [工作流关系相关操作](doc/controllers/工作流关系相关操作.md)
* [项目相关操作](doc/controllers/项目相关操作.md)
* [队列相关操作](doc/controllers/队列相关操作.md)
* [资源中心相关操作](doc/controllers/资源中心相关操作.md)
* [定时相关操作](doc/controllers/定时相关操作.md)
* [任务定义相关操作](doc/controllers/任务定义相关操作.md)
* [任务实例相关操作](doc/controllers/任务实例相关操作.md)
* [租户相关操作](doc/controllers/租户相关操作.md)
* [UI插件相关操作](doc/controllers/ui插件相关操作.md)
* [用户相关操作](doc/controllers/用户相关操作.md)
* [Worker分组管理](doc/controllers/worker分组管理.md)
* [工作流血缘相关操作](doc/controllers/工作流血缘相关操作.md)
* [Ds-Error-Controller](doc/controllers/ds-error-controller.md)

## Classes Documentation

* [Utility Classes](doc/utility-classes.md)
* [HttpRequest](doc/http-request.md)
* [HttpResponse](doc/http-response.md)
* [HttpStringResponse](doc/http-string-response.md)
* [HttpContext](doc/http-context.md)
* [HttpBodyRequest](doc/http-body-request.md)
* [Headers](doc/headers.md)
* [ApiException](doc/api-exception.md)
* [Configuration Interface](doc/configuration-interface.md)
* [HttpClientConfiguration](doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](doc/http-client-configuration-builder.md)

