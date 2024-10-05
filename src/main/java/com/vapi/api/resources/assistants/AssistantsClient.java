/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.resources.assistants;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.vapi.api.core.ClientOptions;
import com.vapi.api.core.MediaTypes;
import com.vapi.api.core.ObjectMappers;
import com.vapi.api.core.RequestOptions;
import com.vapi.api.core.VapiApiException;
import com.vapi.api.core.VapiException;
import com.vapi.api.resources.assistants.requests.AssistantsListRequest;
import com.vapi.api.resources.assistants.requests.UpdateAssistantDto;
import com.vapi.api.types.Assistant;
import com.vapi.api.types.CreateAssistantDto;
import java.io.IOException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class AssistantsClient {
    protected final ClientOptions clientOptions;

    public AssistantsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public List<Assistant> list() {
        return list(AssistantsListRequest.builder().build());
    }

    public List<Assistant> list(AssistantsListRequest request) {
        return list(request, null);
    }

    public List<Assistant> list(AssistantsListRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("assistant");
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
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        responseBody.string(), new TypeReference<List<Assistant>>() {});
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

    public Assistant create() {
        return create(CreateAssistantDto.builder().build());
    }

    public Assistant create(CreateAssistantDto request) {
        return create(request, null);
    }

    public Assistant create(CreateAssistantDto request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("assistant")
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
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Assistant.class);
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

    public Assistant get(String id) {
        return get(id, null);
    }

    public Assistant get(String id, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("assistant")
                .addPathSegment(id)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Assistant.class);
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

    public Assistant delete(String id) {
        return delete(id, null);
    }

    public Assistant delete(String id, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("assistant")
                .addPathSegment(id)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("DELETE", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Assistant.class);
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

    public Assistant update(String id) {
        return update(id, UpdateAssistantDto.builder().build());
    }

    public Assistant update(String id, UpdateAssistantDto request) {
        return update(id, request, null);
    }

    public Assistant update(String id, UpdateAssistantDto request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("assistant")
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
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Assistant.class);
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