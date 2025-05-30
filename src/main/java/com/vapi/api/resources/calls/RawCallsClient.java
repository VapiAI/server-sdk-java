/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.resources.calls;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.vapi.api.core.ClientOptions;
import com.vapi.api.core.MediaTypes;
import com.vapi.api.core.ObjectMappers;
import com.vapi.api.core.QueryStringMapper;
import com.vapi.api.core.RequestOptions;
import com.vapi.api.core.VapiApiException;
import com.vapi.api.core.VapiException;
import com.vapi.api.core.VapiHttpResponse;
import com.vapi.api.resources.calls.requests.CallsListRequest;
import com.vapi.api.resources.calls.requests.CreateCallDto;
import com.vapi.api.resources.calls.requests.UpdateCallDto;
import com.vapi.api.resources.calls.types.CallsCreateResponse;
import com.vapi.api.types.Call;
import java.io.IOException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class RawCallsClient {
    protected final ClientOptions clientOptions;

    public RawCallsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public VapiHttpResponse<List<Call>> list() {
        return list(CallsListRequest.builder().build());
    }

    public VapiHttpResponse<List<Call>> list(CallsListRequest request) {
        return list(request, null);
    }

    public VapiHttpResponse<List<Call>> list(CallsListRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("call");
        if (request.getId().isPresent()) {
            QueryStringMapper.addQueryParameter(httpUrl, "id", request.getId().get(), false);
        }
        if (request.getAssistantId().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "assistantId", request.getAssistantId().get(), false);
        }
        if (request.getPhoneNumberId().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "phoneNumberId", request.getPhoneNumberId().get(), false);
        }
        if (request.getLimit().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "limit", request.getLimit().get().toString(), false);
        }
        if (request.getCreatedAtGt().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "createdAtGt", request.getCreatedAtGt().get().toString(), false);
        }
        if (request.getCreatedAtLt().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "createdAtLt", request.getCreatedAtLt().get().toString(), false);
        }
        if (request.getCreatedAtGe().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "createdAtGe", request.getCreatedAtGe().get().toString(), false);
        }
        if (request.getCreatedAtLe().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "createdAtLe", request.getCreatedAtLe().get().toString(), false);
        }
        if (request.getUpdatedAtGt().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "updatedAtGt", request.getUpdatedAtGt().get().toString(), false);
        }
        if (request.getUpdatedAtLt().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "updatedAtLt", request.getUpdatedAtLt().get().toString(), false);
        }
        if (request.getUpdatedAtGe().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "updatedAtGe", request.getUpdatedAtGe().get().toString(), false);
        }
        if (request.getUpdatedAtLe().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "updatedAtLe", request.getUpdatedAtLe().get().toString(), false);
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
                return new VapiHttpResponse<>(
                        ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), new TypeReference<List<Call>>() {}),
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

    public VapiHttpResponse<CallsCreateResponse> create() {
        return create(CreateCallDto.builder().build());
    }

    public VapiHttpResponse<CallsCreateResponse> create(CreateCallDto request) {
        return create(request, null);
    }

    public VapiHttpResponse<CallsCreateResponse> create(CreateCallDto request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("call")
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
                        ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), CallsCreateResponse.class),
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

    public VapiHttpResponse<Call> get(String id) {
        return get(id, null);
    }

    public VapiHttpResponse<Call> get(String id, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("call")
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
                        ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Call.class), response);
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

    public VapiHttpResponse<Call> delete(String id) {
        return delete(id, null);
    }

    public VapiHttpResponse<Call> delete(String id, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("call")
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
                        ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Call.class), response);
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

    public VapiHttpResponse<Call> update(String id) {
        return update(id, UpdateCallDto.builder().build());
    }

    public VapiHttpResponse<Call> update(String id, UpdateCallDto request) {
        return update(id, request, null);
    }

    public VapiHttpResponse<Call> update(String id, UpdateCallDto request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("call")
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
                        ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Call.class), response);
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
