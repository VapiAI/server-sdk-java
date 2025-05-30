/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.resources.squads;

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
import com.vapi.api.resources.squads.requests.SquadsListRequest;
import com.vapi.api.resources.squads.requests.UpdateSquadDto;
import com.vapi.api.types.CreateSquadDto;
import com.vapi.api.types.Squad;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

public class AsyncRawSquadsClient {
    protected final ClientOptions clientOptions;

    public AsyncRawSquadsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public CompletableFuture<VapiHttpResponse<List<Squad>>> list() {
        return list(SquadsListRequest.builder().build());
    }

    public CompletableFuture<VapiHttpResponse<List<Squad>>> list(SquadsListRequest request) {
        return list(request, null);
    }

    public CompletableFuture<VapiHttpResponse<List<Squad>>> list(
            SquadsListRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("squad");
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
        CompletableFuture<VapiHttpResponse<List<Squad>>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new VapiHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(
                                        responseBody.string(), new TypeReference<List<Squad>>() {}),
                                response));
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    future.completeExceptionally(new VapiApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                            response));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new VapiException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new VapiException("Network error executing HTTP request", e));
            }
        });
        return future;
    }

    public CompletableFuture<VapiHttpResponse<Squad>> create(CreateSquadDto request) {
        return create(request, null);
    }

    public CompletableFuture<VapiHttpResponse<Squad>> create(CreateSquadDto request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("squad")
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
        CompletableFuture<VapiHttpResponse<Squad>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new VapiHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Squad.class), response));
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    future.completeExceptionally(new VapiApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                            response));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new VapiException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new VapiException("Network error executing HTTP request", e));
            }
        });
        return future;
    }

    public CompletableFuture<VapiHttpResponse<Squad>> get(String id) {
        return get(id, null);
    }

    public CompletableFuture<VapiHttpResponse<Squad>> get(String id, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("squad")
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
        CompletableFuture<VapiHttpResponse<Squad>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new VapiHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Squad.class), response));
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    future.completeExceptionally(new VapiApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                            response));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new VapiException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new VapiException("Network error executing HTTP request", e));
            }
        });
        return future;
    }

    public CompletableFuture<VapiHttpResponse<Squad>> delete(String id) {
        return delete(id, null);
    }

    public CompletableFuture<VapiHttpResponse<Squad>> delete(String id, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("squad")
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
        CompletableFuture<VapiHttpResponse<Squad>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new VapiHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Squad.class), response));
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    future.completeExceptionally(new VapiApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                            response));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new VapiException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new VapiException("Network error executing HTTP request", e));
            }
        });
        return future;
    }

    public CompletableFuture<VapiHttpResponse<Squad>> update(String id, UpdateSquadDto request) {
        return update(id, request, null);
    }

    public CompletableFuture<VapiHttpResponse<Squad>> update(
            String id, UpdateSquadDto request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("squad")
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
        CompletableFuture<VapiHttpResponse<Squad>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new VapiHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Squad.class), response));
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    future.completeExceptionally(new VapiApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                            response));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new VapiException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new VapiException("Network error executing HTTP request", e));
            }
        });
        return future;
    }
}
