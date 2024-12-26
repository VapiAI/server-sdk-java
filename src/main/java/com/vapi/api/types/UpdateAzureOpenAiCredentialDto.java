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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = UpdateAzureOpenAiCredentialDto.Builder.class)
public final class UpdateAzureOpenAiCredentialDto {
    private final UpdateAzureOpenAiCredentialDtoRegion region;

    private final List<UpdateAzureOpenAiCredentialDtoModelsItem> models;

    private final String openAiKey;

    private final String openAiEndpoint;

    private final Optional<String> name;

    private final Map<String, Object> additionalProperties;

    private UpdateAzureOpenAiCredentialDto(
            UpdateAzureOpenAiCredentialDtoRegion region,
            List<UpdateAzureOpenAiCredentialDtoModelsItem> models,
            String openAiKey,
            String openAiEndpoint,
            Optional<String> name,
            Map<String, Object> additionalProperties) {
        this.region = region;
        this.models = models;
        this.openAiKey = openAiKey;
        this.openAiEndpoint = openAiEndpoint;
        this.name = name;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("provider")
    public String getProvider() {
        return "azure-openai";
    }

    @JsonProperty("region")
    public UpdateAzureOpenAiCredentialDtoRegion getRegion() {
        return region;
    }

    @JsonProperty("models")
    public List<UpdateAzureOpenAiCredentialDtoModelsItem> getModels() {
        return models;
    }

    /**
     * @return This is not returned in the API.
     */
    @JsonProperty("openAIKey")
    public String getOpenAiKey() {
        return openAiKey;
    }

    @JsonProperty("openAIEndpoint")
    public String getOpenAiEndpoint() {
        return openAiEndpoint;
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
        return other instanceof UpdateAzureOpenAiCredentialDto && equalTo((UpdateAzureOpenAiCredentialDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UpdateAzureOpenAiCredentialDto other) {
        return region.equals(other.region)
                && models.equals(other.models)
                && openAiKey.equals(other.openAiKey)
                && openAiEndpoint.equals(other.openAiEndpoint)
                && name.equals(other.name);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.region, this.models, this.openAiKey, this.openAiEndpoint, this.name);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RegionStage builder() {
        return new Builder();
    }

    public interface RegionStage {
        OpenAiKeyStage region(@NotNull UpdateAzureOpenAiCredentialDtoRegion region);

        Builder from(UpdateAzureOpenAiCredentialDto other);
    }

    public interface OpenAiKeyStage {
        OpenAiEndpointStage openAiKey(@NotNull String openAiKey);
    }

    public interface OpenAiEndpointStage {
        _FinalStage openAiEndpoint(@NotNull String openAiEndpoint);
    }

    public interface _FinalStage {
        UpdateAzureOpenAiCredentialDto build();

        _FinalStage models(List<UpdateAzureOpenAiCredentialDtoModelsItem> models);

        _FinalStage addModels(UpdateAzureOpenAiCredentialDtoModelsItem models);

        _FinalStage addAllModels(List<UpdateAzureOpenAiCredentialDtoModelsItem> models);

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements RegionStage, OpenAiKeyStage, OpenAiEndpointStage, _FinalStage {
        private UpdateAzureOpenAiCredentialDtoRegion region;

        private String openAiKey;

        private String openAiEndpoint;

        private Optional<String> name = Optional.empty();

        private List<UpdateAzureOpenAiCredentialDtoModelsItem> models = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UpdateAzureOpenAiCredentialDto other) {
            region(other.getRegion());
            models(other.getModels());
            openAiKey(other.getOpenAiKey());
            openAiEndpoint(other.getOpenAiEndpoint());
            name(other.getName());
            return this;
        }

        @java.lang.Override
        @JsonSetter("region")
        public OpenAiKeyStage region(@NotNull UpdateAzureOpenAiCredentialDtoRegion region) {
            this.region = Objects.requireNonNull(region, "region must not be null");
            return this;
        }

        /**
         * <p>This is not returned in the API.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("openAIKey")
        public OpenAiEndpointStage openAiKey(@NotNull String openAiKey) {
            this.openAiKey = Objects.requireNonNull(openAiKey, "openAiKey must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("openAIEndpoint")
        public _FinalStage openAiEndpoint(@NotNull String openAiEndpoint) {
            this.openAiEndpoint = Objects.requireNonNull(openAiEndpoint, "openAiEndpoint must not be null");
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
        public _FinalStage addAllModels(List<UpdateAzureOpenAiCredentialDtoModelsItem> models) {
            this.models.addAll(models);
            return this;
        }

        @java.lang.Override
        public _FinalStage addModels(UpdateAzureOpenAiCredentialDtoModelsItem models) {
            this.models.add(models);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "models", nulls = Nulls.SKIP)
        public _FinalStage models(List<UpdateAzureOpenAiCredentialDtoModelsItem> models) {
            this.models.clear();
            this.models.addAll(models);
            return this;
        }

        @java.lang.Override
        public UpdateAzureOpenAiCredentialDto build() {
            return new UpdateAzureOpenAiCredentialDto(
                    region, models, openAiKey, openAiEndpoint, name, additionalProperties);
        }
    }
}
