/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.resources.workflow;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.vapi.api.core.ClientOptions;
import com.vapi.api.core.MediaTypes;
import com.vapi.api.core.ObjectMappers;
import com.vapi.api.core.RequestOptions;
import com.vapi.api.core.VapiApiException;
import com.vapi.api.core.VapiException;
import com.vapi.api.core.VapiHttpResponse;
import com.vapi.api.resources.workflow.requests.UpdateWorkflowDto;
import com.vapi.api.types.CreateWorkflowDto;
import com.vapi.api.types.Workflow;
import java.io.IOException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class RawWorkflowClient {
    protected final ClientOptions clientOptions;

    public RawWorkflowClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public VapiHttpResponse<List<Workflow>> workflowControllerFindAll() {
        return workflowControllerFindAll(null);
    }

    public VapiHttpResponse<List<Workflow>> workflowControllerFindAll(RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("workflow")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return new VapiHttpResponse<>(
                        ObjectMappers.JSON_MAPPER.readValue(
                                responseBody.string(), new TypeReference<List<Workflow>>() {}),
                        response);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new VapiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                    response);
        } catch (IOException e) {
            throw new VapiException("Network error executing HTTP request", e);
        }
    }

    public VapiHttpResponse<Workflow> workflowControllerCreate(CreateWorkflowDto request) {
        return workflowControllerCreate(request, null);
    }

    public VapiHttpResponse<Workflow> workflowControllerCreate(
            CreateWorkflowDto request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("workflow")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new VapiException("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return new VapiHttpResponse<>(
                        ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Workflow.class), response);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new VapiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                    response);
        } catch (IOException e) {
            throw new VapiException("Network error executing HTTP request", e);
        }
    }

    public VapiHttpResponse<Workflow> workflowControllerFindOne(String id) {
        return workflowControllerFindOne(id, null);
    }

    public VapiHttpResponse<Workflow> workflowControllerFindOne(String id, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("workflow")
                .addPathSegment(id)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return new VapiHttpResponse<>(
                        ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Workflow.class), response);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new VapiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                    response);
        } catch (IOException e) {
            throw new VapiException("Network error executing HTTP request", e);
        }
    }

    public VapiHttpResponse<Workflow> workflowControllerDelete(String id) {
        return workflowControllerDelete(id, null);
    }

    public VapiHttpResponse<Workflow> workflowControllerDelete(String id, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("workflow")
                .addPathSegment(id)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("DELETE", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return new VapiHttpResponse<>(
                        ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Workflow.class), response);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new VapiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                    response);
        } catch (IOException e) {
            throw new VapiException("Network error executing HTTP request", e);
        }
    }

    public VapiHttpResponse<Workflow> workflowControllerUpdate(String id) {
        return workflowControllerUpdate(id, UpdateWorkflowDto.builder().build());
    }

    public VapiHttpResponse<Workflow> workflowControllerUpdate(String id, UpdateWorkflowDto request) {
        return workflowControllerUpdate(id, request, null);
    }

    public VapiHttpResponse<Workflow> workflowControllerUpdate(
            String id, UpdateWorkflowDto request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("workflow")
                .addPathSegment(id)
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new VapiException("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("PATCH", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return new VapiHttpResponse<>(
                        ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Workflow.class), response);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new VapiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                    response);
        } catch (IOException e) {
            throw new VapiException("Network error executing HTTP request", e);
        }
    }
}
