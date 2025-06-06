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
@JsonDeserialize(builder = FallbackElevenLabsTranscriber.Builder.class)
public final class FallbackElevenLabsTranscriber {
    private final Optional<String> model;

    private final Optional<FallbackElevenLabsTranscriberLanguage> language;

    private final Map<String, Object> additionalProperties;

    private FallbackElevenLabsTranscriber(
            Optional<String> model,
            Optional<FallbackElevenLabsTranscriberLanguage> language,
            Map<String, Object> additionalProperties) {
        this.model = model;
        this.language = language;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the model that will be used for the transcription.
     */
    @JsonProperty("model")
    public Optional<String> getModel() {
        return model;
    }

    @JsonProperty("language")
    public Optional<FallbackElevenLabsTranscriberLanguage> getLanguage() {
        return language;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FallbackElevenLabsTranscriber && equalTo((FallbackElevenLabsTranscriber) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FallbackElevenLabsTranscriber other) {
        return model.equals(other.model) && language.equals(other.language);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.model, this.language);
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
        private Optional<String> model = Optional.empty();

        private Optional<FallbackElevenLabsTranscriberLanguage> language = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(FallbackElevenLabsTranscriber other) {
            model(other.getModel());
            language(other.getLanguage());
            return this;
        }

        @JsonSetter(value = "model", nulls = Nulls.SKIP)
        public Builder model(Optional<String> model) {
            this.model = model;
            return this;
        }

        public Builder model(String model) {
            this.model = Optional.ofNullable(model);
            return this;
        }

        @JsonSetter(value = "language", nulls = Nulls.SKIP)
        public Builder language(Optional<FallbackElevenLabsTranscriberLanguage> language) {
            this.language = language;
            return this;
        }

        public Builder language(FallbackElevenLabsTranscriberLanguage language) {
            this.language = Optional.ofNullable(language);
            return this;
        }

        public FallbackElevenLabsTranscriber build() {
            return new FallbackElevenLabsTranscriber(model, language, additionalProperties);
        }
    }
}
