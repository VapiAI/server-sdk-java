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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vapi.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CreateGladiaCredentialDto.Builder.class)
public final class CreateGladiaCredentialDto {
    private final String apiKey;

    private final Map<String, Object> additionalProperties;

    private CreateGladiaCredentialDto(String apiKey, Map<String, Object> additionalProperties) {
        this.apiKey = apiKey;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("provider")
    public String getProvider() {
        return "gladia";
    }

    /**
     * @return This is not returned in the API.
     */
    @JsonProperty("apiKey")
    public String getApiKey() {
        return apiKey;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreateGladiaCredentialDto && equalTo((CreateGladiaCredentialDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreateGladiaCredentialDto other) {
        return apiKey.equals(other.apiKey);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.apiKey);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ApiKeyStage builder() {
        return new Builder();
    }

    public interface ApiKeyStage {
        _FinalStage apiKey(@NotNull String apiKey);

        Builder from(CreateGladiaCredentialDto other);
    }

    public interface _FinalStage {
        CreateGladiaCredentialDto build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ApiKeyStage, _FinalStage {
        private String apiKey;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CreateGladiaCredentialDto other) {
            apiKey(other.getApiKey());
            return this;
        }

        /**
         * <p>This is not returned in the API.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("apiKey")
        public _FinalStage apiKey(@NotNull String apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey, "apiKey must not be null");
            return this;
        }

        @java.lang.Override
        public CreateGladiaCredentialDto build() {
            return new CreateGladiaCredentialDto(apiKey, additionalProperties);
        }
    }
}