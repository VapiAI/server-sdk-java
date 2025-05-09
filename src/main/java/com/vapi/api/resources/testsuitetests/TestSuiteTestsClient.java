/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.resources.testsuitetests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vapi.api.core.ClientOptions;
import com.vapi.api.core.MediaTypes;
import com.vapi.api.core.ObjectMappers;
import com.vapi.api.core.RequestOptions;
import com.vapi.api.core.VapiApiException;
import com.vapi.api.core.VapiException;
import com.vapi.api.resources.testsuitetests.requests.TestSuiteTestControllerFindAllPaginatedRequest;
import com.vapi.api.resources.testsuitetests.types.TestSuiteTestControllerCreateRequest;
import com.vapi.api.resources.testsuitetests.types.TestSuiteTestControllerCreateResponse;
import com.vapi.api.resources.testsuitetests.types.TestSuiteTestControllerFindOneResponse;
import com.vapi.api.resources.testsuitetests.types.TestSuiteTestControllerRemoveResponse;
import com.vapi.api.resources.testsuitetests.types.TestSuiteTestControllerUpdateRequest;
import com.vapi.api.resources.testsuitetests.types.TestSuiteTestControllerUpdateResponse;
import com.vapi.api.types.TestSuiteTestsPaginatedResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class TestSuiteTestsClient {
    protected final ClientOptions clientOptions;

    public TestSuiteTestsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public TestSuiteTestsPaginatedResponse testSuiteTestControllerFindAllPaginated(String testSuiteId) {
        return testSuiteTestControllerFindAllPaginated(
                testSuiteId,
                TestSuiteTestControllerFindAllPaginatedRequest.builder().build());
    }

    public TestSuiteTestsPaginatedResponse testSuiteTestControllerFindAllPaginated(
            String testSuiteId, TestSuiteTestControllerFindAllPaginatedRequest request) {
        return testSuiteTestControllerFindAllPaginated(testSuiteId, request, null);
    }

    public TestSuiteTestsPaginatedResponse testSuiteTestControllerFindAllPaginated(
            String testSuiteId, TestSuiteTestControllerFindAllPaginatedRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("test-suite")
                .addPathSegment(testSuiteId)
                .addPathSegments("test");
        if (request.getPage().isPresent()) {
            httpUrl.addQueryParameter("page", request.getPage().get().toString());
        }
        if (request.getSortOrder().isPresent()) {
            httpUrl.addQueryParameter("sortOrder", request.getSortOrder().get().toString());
        }
        if (request.getLimit().isPresent()) {
            httpUrl.addQueryParameter("limit", request.getLimit().get().toString());
        }
        if (request.getCreatedAtGt().isPresent()) {
            httpUrl.addQueryParameter(
                    "createdAtGt", request.getCreatedAtGt().get().toString());
        }
        if (request.getCreatedAtLt().isPresent()) {
            httpUrl.addQueryParameter(
                    "createdAtLt", request.getCreatedAtLt().get().toString());
        }
        if (request.getCreatedAtGe().isPresent()) {
            httpUrl.addQueryParameter(
                    "createdAtGe", request.getCreatedAtGe().get().toString());
        }
        if (request.getCreatedAtLe().isPresent()) {
            httpUrl.addQueryParameter(
                    "createdAtLe", request.getCreatedAtLe().get().toString());
        }
        if (request.getUpdatedAtGt().isPresent()) {
            httpUrl.addQueryParameter(
                    "updatedAtGt", request.getUpdatedAtGt().get().toString());
        }
        if (request.getUpdatedAtLt().isPresent()) {
            httpUrl.addQueryParameter(
                    "updatedAtLt", request.getUpdatedAtLt().get().toString());
        }
        if (request.getUpdatedAtGe().isPresent()) {
            httpUrl.addQueryParameter(
                    "updatedAtGe", request.getUpdatedAtGe().get().toString());
        }
        if (request.getUpdatedAtLe().isPresent()) {
            httpUrl.addQueryParameter(
                    "updatedAtLe", request.getUpdatedAtLe().get().toString());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        responseBody.string(), TestSuiteTestsPaginatedResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new VapiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new VapiException("Network error executing HTTP request", e);
        }
    }

    public TestSuiteTestControllerCreateResponse testSuiteTestControllerCreate(
            String testSuiteId, TestSuiteTestControllerCreateRequest request) {
        return testSuiteTestControllerCreate(testSuiteId, request, null);
    }

    public TestSuiteTestControllerCreateResponse testSuiteTestControllerCreate(
            String testSuiteId, TestSuiteTestControllerCreateRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("test-suite")
                .addPathSegment(testSuiteId)
                .addPathSegments("test")
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        responseBody.string(), TestSuiteTestControllerCreateResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new VapiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new VapiException("Network error executing HTTP request", e);
        }
    }

    public TestSuiteTestControllerFindOneResponse testSuiteTestControllerFindOne(String testSuiteId, String id) {
        return testSuiteTestControllerFindOne(testSuiteId, id, null);
    }

    public TestSuiteTestControllerFindOneResponse testSuiteTestControllerFindOne(
            String testSuiteId, String id, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("test-suite")
                .addPathSegment(testSuiteId)
                .addPathSegments("test")
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        responseBody.string(), TestSuiteTestControllerFindOneResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new VapiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new VapiException("Network error executing HTTP request", e);
        }
    }

    public TestSuiteTestControllerRemoveResponse testSuiteTestControllerRemove(String testSuiteId, String id) {
        return testSuiteTestControllerRemove(testSuiteId, id, null);
    }

    public TestSuiteTestControllerRemoveResponse testSuiteTestControllerRemove(
            String testSuiteId, String id, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("test-suite")
                .addPathSegment(testSuiteId)
                .addPathSegments("test")
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        responseBody.string(), TestSuiteTestControllerRemoveResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new VapiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new VapiException("Network error executing HTTP request", e);
        }
    }

    public TestSuiteTestControllerUpdateResponse testSuiteTestControllerUpdate(
            String testSuiteId, String id, TestSuiteTestControllerUpdateRequest request) {
        return testSuiteTestControllerUpdate(testSuiteId, id, request, null);
    }

    public TestSuiteTestControllerUpdateResponse testSuiteTestControllerUpdate(
            String testSuiteId,
            String id,
            TestSuiteTestControllerUpdateRequest request,
            RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("test-suite")
                .addPathSegment(testSuiteId)
                .addPathSegments("test")
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        responseBody.string(), TestSuiteTestControllerUpdateResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new VapiApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new VapiException("Network error executing HTTP request", e);
        }
    }
}
