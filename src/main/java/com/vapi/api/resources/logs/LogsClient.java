/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.resources.logs;

import com.vapi.api.core.ClientOptions;
import com.vapi.api.core.ObjectMappers;
import com.vapi.api.core.RequestOptions;
import com.vapi.api.core.VapiApiException;
import com.vapi.api.core.VapiException;
import com.vapi.api.core.pagination.SyncPagingIterable;
import com.vapi.api.resources.logs.requests.LogsGetRequest;
import com.vapi.api.types.Log;
import com.vapi.api.types.LogsPaginatedResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class LogsClient {
    protected final ClientOptions clientOptions;

    public LogsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public SyncPagingIterable<Log> get() {
        return get(LogsGetRequest.builder().build());
    }

    public SyncPagingIterable<Log> get(LogsGetRequest request) {
        return get(request, null);
    }

    public SyncPagingIterable<Log> get(LogsGetRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("logs");
        if (request.getOrgId().isPresent()) {
            httpUrl.addQueryParameter("orgId", request.getOrgId().get());
        }
        if (request.getType().isPresent()) {
            httpUrl.addQueryParameter("type", request.getType().get().toString());
        }
        if (request.getAssistantId().isPresent()) {
            httpUrl.addQueryParameter("assistantId", request.getAssistantId().get());
        }
        if (request.getPhoneNumberId().isPresent()) {
            httpUrl.addQueryParameter(
                    "phoneNumberId", request.getPhoneNumberId().get());
        }
        if (request.getCustomerId().isPresent()) {
            httpUrl.addQueryParameter("customerId", request.getCustomerId().get());
        }
        if (request.getSquadId().isPresent()) {
            httpUrl.addQueryParameter("squadId", request.getSquadId().get());
        }
        if (request.getCallId().isPresent()) {
            httpUrl.addQueryParameter("callId", request.getCallId().get());
        }
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
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                LogsPaginatedResponse parsedResponse =
                        ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), LogsPaginatedResponse.class);
                int newPageNumber = request.getPage().map(page -> page + 1).orElse(1);
                LogsGetRequest nextRequest = LogsGetRequest.builder()
                        .from(request)
                        .page(newPageNumber)
                        .build();
                List<Log> result = parsedResponse.getResults();
                return new SyncPagingIterable<>(true, result, () -> get(nextRequest, requestOptions));
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
