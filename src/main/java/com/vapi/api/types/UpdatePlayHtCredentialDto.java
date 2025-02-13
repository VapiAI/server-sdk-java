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
@JsonDeserialize(builder = UpdatePlayHtCredentialDto.Builder.class)
public final class UpdatePlayHtCredentialDto {
    private final Optional<String> apiKey;

    private final Optional<String> name;

    private final Optional<String> userId;

    private final Map<String, Object> additionalProperties;

    private UpdatePlayHtCredentialDto(
            Optional<String> apiKey,
            Optional<String> name,
            Optional<String> userId,
            Map<String, Object> additionalProperties) {
        this.apiKey = apiKey;
        this.name = name;
        this.userId = userId;
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

    @JsonProperty("userId")
    public Optional<String> getUserId() {
        return userId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UpdatePlayHtCredentialDto && equalTo((UpdatePlayHtCredentialDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UpdatePlayHtCredentialDto other) {
        return apiKey.equals(other.apiKey) && name.equals(other.name) && userId.equals(other.userId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.apiKey, this.name, this.userId);
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

        private Optional<String> userId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(UpdatePlayHtCredentialDto other) {
            apiKey(other.getApiKey());
            name(other.getName());
            userId(other.getUserId());
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

        @JsonSetter(value = "userId", nulls = Nulls.SKIP)
        public Builder userId(Optional<String> userId) {
            this.userId = userId;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        public UpdatePlayHtCredentialDto build() {
            return new UpdatePlayHtCredentialDto(apiKey, name, userId, additionalProperties);
        }
    }
}
