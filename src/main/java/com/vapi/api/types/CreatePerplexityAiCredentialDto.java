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
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CreatePerplexityAiCredentialDto.Builder.class)
public final class CreatePerplexityAiCredentialDto {
    private final String apiKey;

    private final Optional<String> name;

    private final Map<String, Object> additionalProperties;

    private CreatePerplexityAiCredentialDto(
            String apiKey, Optional<String> name, Map<String, Object> additionalProperties) {
        this.apiKey = apiKey;
        this.name = name;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("provider")
    public String getProvider() {
        return "perplexity-ai";
    }

    /**
     * @return This is not returned in the API.
     */
    @JsonProperty("apiKey")
    public String getApiKey() {
        return apiKey;
    }

    /**
     * @return This is the name of credential. This is just for your reference.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreatePerplexityAiCredentialDto && equalTo((CreatePerplexityAiCredentialDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreatePerplexityAiCredentialDto other) {
        return apiKey.equals(other.apiKey) && name.equals(other.name);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.apiKey, this.name);
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

        Builder from(CreatePerplexityAiCredentialDto other);
    }

    public interface _FinalStage {
        CreatePerplexityAiCredentialDto build();

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ApiKeyStage, _FinalStage {
        private String apiKey;

        private Optional<String> name = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CreatePerplexityAiCredentialDto other) {
            apiKey(other.getApiKey());
            name(other.getName());
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

        /**
         * <p>This is the name of credential. This is just for your reference.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public _FinalStage name(Optional<String> name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        public CreatePerplexityAiCredentialDto build() {
            return new CreatePerplexityAiCredentialDto(apiKey, name, additionalProperties);
        }
    }
}
