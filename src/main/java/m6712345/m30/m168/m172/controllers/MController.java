/*
 * DolphinSchedulerApiDocsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package m6712345.m30.m168.m172.controllers;

import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import m6712345.m30.m168.m172.ApiHelper;
import m6712345.m30.m168.m172.AuthManager;
import m6712345.m30.m168.m172.Configuration;
import m6712345.m30.m168.m172.exceptions.ApiException;
import m6712345.m30.m168.m172.http.Headers;
import m6712345.m30.m168.m172.http.client.HttpClient;
import m6712345.m30.m168.m172.http.client.HttpContext;
import m6712345.m30.m168.m172.http.request.HttpRequest;
import m6712345.m30.m168.m172.http.response.HttpResponse;
import m6712345.m30.m168.m172.http.response.HttpStringResponse;
import m6712345.m30.m168.m172.models.ResultListWorkFlowLineage;
import m6712345.m30.m168.m172.models.ResultMapStringObject;

/**
 * This class lists all the endpoints of the groups.
 */
public final class MController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public MController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }


    /**
     * QUERY_WORKFLOW_LINEAGE_NOTES.
     * @param  projectCode  Required parameter: 项目Code
     * @return    Returns the ResultMapStringObject response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResultMapStringObject queryWorkFlowLineageUsingGET(
            final long projectCode) throws ApiException, IOException {
        HttpRequest request = buildQueryWorkFlowLineageUsingGETRequest(projectCode);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleQueryWorkFlowLineageUsingGETResponse(context);
    }

    /**
     * QUERY_WORKFLOW_LINEAGE_NOTES.
     * @param  projectCode  Required parameter: 项目Code
     * @return    Returns the ResultMapStringObject response from the API call
     */
    public CompletableFuture<ResultMapStringObject> queryWorkFlowLineageUsingGETAsync(
            final long projectCode) {
        return makeHttpCallAsync(() -> buildQueryWorkFlowLineageUsingGETRequest(projectCode),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleQueryWorkFlowLineageUsingGETResponse(context));
    }

    /**
     * Builds the HttpRequest object for queryWorkFlowLineageUsingGET.
     */
    private HttpRequest buildQueryWorkFlowLineageUsingGETRequest(
            final long projectCode) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/projects/{projectCode}/lineages/list");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("projectCode",
                new SimpleEntry<Object, Boolean>(projectCode, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        return request;
    }

    /**
     * Processes the response for queryWorkFlowLineageUsingGET.
     * @return An object of type ResultMapStringObject
     */
    private ResultMapStringObject handleQueryWorkFlowLineageUsingGETResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 401) {
            throw new ApiException("Unauthorized", context);
        }
        if (responseCode == 403) {
            throw new ApiException("Forbidden", context);
        }
        if (responseCode == 404) {
            throw new ApiException("Not Found", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        ResultMapStringObject result = ApiHelper.deserialize(responseBody,
                ResultMapStringObject.class);

        return result;
    }

    /**
     * 通过名称查询工作流血缘列表.
     * @param  projectCode  Required parameter: 项目Code
     * @param  workFlowName  Optional parameter: workFlowName
     * @return    Returns the ResultListWorkFlowLineage response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResultListWorkFlowLineage queryWorkFlowLineageByNameUsingGET(
            final long projectCode,
            final String workFlowName) throws ApiException, IOException {
        HttpRequest request = buildQueryWorkFlowLineageByNameUsingGETRequest(projectCode,
                workFlowName);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleQueryWorkFlowLineageByNameUsingGETResponse(context);
    }

    /**
     * 通过名称查询工作流血缘列表.
     * @param  projectCode  Required parameter: 项目Code
     * @param  workFlowName  Optional parameter: workFlowName
     * @return    Returns the ResultListWorkFlowLineage response from the API call
     */
    public CompletableFuture<ResultListWorkFlowLineage> queryWorkFlowLineageByNameUsingGETAsync(
            final long projectCode,
            final String workFlowName) {
        return makeHttpCallAsync(() -> buildQueryWorkFlowLineageByNameUsingGETRequest(projectCode,
                workFlowName),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleQueryWorkFlowLineageByNameUsingGETResponse(context));
    }

    /**
     * Builds the HttpRequest object for queryWorkFlowLineageByNameUsingGET.
     */
    private HttpRequest buildQueryWorkFlowLineageByNameUsingGETRequest(
            final long projectCode,
            final String workFlowName) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/projects/{projectCode}/lineages/query-by-name");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("projectCode",
                new SimpleEntry<Object, Boolean>(projectCode, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("workFlowName", workFlowName);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, queryParameters,
                null);

        return request;
    }

    /**
     * Processes the response for queryWorkFlowLineageByNameUsingGET.
     * @return An object of type ResultListWorkFlowLineage
     */
    private ResultListWorkFlowLineage handleQueryWorkFlowLineageByNameUsingGETResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 401) {
            throw new ApiException("Unauthorized", context);
        }
        if (responseCode == 403) {
            throw new ApiException("Forbidden", context);
        }
        if (responseCode == 404) {
            throw new ApiException("Not Found", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        ResultListWorkFlowLineage result = ApiHelper.deserialize(responseBody,
                ResultListWorkFlowLineage.class);

        return result;
    }

    /**
     * QUERY_WORKFLOW_LINEAGE_BY_CODES_NOTES.
     * @param  projectCode  Required parameter: 项目Code
     * @param  workFlowCode  Required parameter: workFlowCode
     * @return    Returns the ResultMapStringObject response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResultMapStringObject queryWorkFlowLineageByCodeUsingGET(
            final long projectCode,
            final long workFlowCode) throws ApiException, IOException {
        HttpRequest request = buildQueryWorkFlowLineageByCodeUsingGETRequest(projectCode,
                workFlowCode);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleQueryWorkFlowLineageByCodeUsingGETResponse(context);
    }

    /**
     * QUERY_WORKFLOW_LINEAGE_BY_CODES_NOTES.
     * @param  projectCode  Required parameter: 项目Code
     * @param  workFlowCode  Required parameter: workFlowCode
     * @return    Returns the ResultMapStringObject response from the API call
     */
    public CompletableFuture<ResultMapStringObject> queryWorkFlowLineageByCodeUsingGETAsync(
            final long projectCode,
            final long workFlowCode) {
        return makeHttpCallAsync(() -> buildQueryWorkFlowLineageByCodeUsingGETRequest(projectCode,
                workFlowCode),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleQueryWorkFlowLineageByCodeUsingGETResponse(context));
    }

    /**
     * Builds the HttpRequest object for queryWorkFlowLineageByCodeUsingGET.
     */
    private HttpRequest buildQueryWorkFlowLineageByCodeUsingGETRequest(
            final long projectCode,
            final long workFlowCode) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/projects/{projectCode}/lineages/{workFlowCode}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("projectCode",
                new SimpleEntry<Object, Boolean>(projectCode, true));
        templateParameters.put("workFlowCode",
                new SimpleEntry<Object, Boolean>(workFlowCode, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        return request;
    }

    /**
     * Processes the response for queryWorkFlowLineageByCodeUsingGET.
     * @return An object of type ResultMapStringObject
     */
    private ResultMapStringObject handleQueryWorkFlowLineageByCodeUsingGETResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 401) {
            throw new ApiException("Unauthorized", context);
        }
        if (responseCode == 403) {
            throw new ApiException("Forbidden", context);
        }
        if (responseCode == 404) {
            throw new ApiException("Not Found", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        ResultMapStringObject result = ApiHelper.deserialize(responseBody,
                ResultMapStringObject.class);

        return result;
    }

}