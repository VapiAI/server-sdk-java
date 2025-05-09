/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vapi.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = UpdateDeepgramCredentialDto.Builder.class)
public final class UpdateDeepgramCredentialDto {
    private final Optional<String> apiKey;

    private final Optional<String> name;

    private final Optional<String> apiUrl;

    private final Map<String, Object> additionalProperties;

    private UpdateDeepgramCredentialDto(
            Optional<String> apiKey,
            Optional<String> name,
            Optional<String> apiUrl,
            Map<String, Object> additionalProperties) {
        this.apiKey = apiKey;
        this.name = name;
        this.apiUrl = apiUrl;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is not returned in the API.
     */
    @JsonProperty("apiKey")
    public Optional<String> getApiKey() {
        return apiKey;
    }

    /**
     * @return This is the name of credential. This is just for your reference.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return This can be used to point to an onprem Deepgram instance. Defaults to api.deepgram.com.
     */
    @JsonProperty("apiUrl")
    public Optional<String> getApiUrl() {
        return apiUrl;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UpdateDeepgramCredentialDto && equalTo((UpdateDeepgramCredentialDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UpdateDeepgramCredentialDto other) {
        return apiKey.equals(other.apiKey) && name.equals(other.name) && apiUrl.equals(other.apiUrl);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.apiKey, this.name, this.apiUrl);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> apiKey = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> apiUrl = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(UpdateDeepgramCredentialDto other) {
            apiKey(other.getApiKey());
            name(other.getName());
            apiUrl(other.getApiUrl());
            return this;
        }

        @JsonSetter(value = "apiKey", nulls = Nulls.SKIP)
        public Builder apiKey(Optional<String> apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public Builder apiKey(String apiKey) {
            this.apiKey = Optional.ofNullable(apiKey);
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @JsonSetter(value = "apiUrl", nulls = Nulls.SKIP)
        public Builder apiUrl(Optional<String> apiUrl) {
            this.apiUrl = apiUrl;
            return this;
        }

        public Builder apiUrl(String apiUrl) {
            this.apiUrl = Optional.ofNullable(apiUrl);
            return this;
        }

        public UpdateDeepgramCredentialDto build() {
            return new UpdateDeepgramCredentialDto(apiKey, name, apiUrl, additionalProperties);
        }
    }
}
