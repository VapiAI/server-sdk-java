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
@JsonDeserialize(builder = ElevenLabsTranscriber.Builder.class)
public final class ElevenLabsTranscriber {
    private final Optional<String> model;

    private final Optional<ElevenLabsTranscriberLanguage> language;

    private final Optional<FallbackTranscriberPlan> fallbackPlan;

    private final Map<String, Object> additionalProperties;

    private ElevenLabsTranscriber(
            Optional<String> model,
            Optional<ElevenLabsTranscriberLanguage> language,
            Optional<FallbackTranscriberPlan> fallbackPlan,
            Map<String, Object> additionalProperties) {
        this.model = model;
        this.language = language;
        this.fallbackPlan = fallbackPlan;
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
    public Optional<ElevenLabsTranscriberLanguage> getLanguage() {
        return language;
    }

    /**
     * @return This is the plan for voice provider fallbacks in the event that the primary voice provider fails.
     */
    @JsonProperty("fallbackPlan")
    public Optional<FallbackTranscriberPlan> getFallbackPlan() {
        return fallbackPlan;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ElevenLabsTranscriber && equalTo((ElevenLabsTranscriber) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ElevenLabsTranscriber other) {
        return model.equals(other.model) && language.equals(other.language) && fallbackPlan.equals(other.fallbackPlan);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.model, this.language, this.fallbackPlan);
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

        private Optional<ElevenLabsTranscriberLanguage> language = Optional.empty();

        private Optional<FallbackTranscriberPlan> fallbackPlan = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ElevenLabsTranscriber other) {
            model(other.getModel());
            language(other.getLanguage());
            fallbackPlan(other.getFallbackPlan());
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
        public Builder language(Optional<ElevenLabsTranscriberLanguage> language) {
            this.language = language;
            return this;
        }

        public Builder language(ElevenLabsTranscriberLanguage language) {
            this.language = Optional.ofNullable(language);
            return this;
        }

        @JsonSetter(value = "fallbackPlan", nulls = Nulls.SKIP)
        public Builder fallbackPlan(Optional<FallbackTranscriberPlan> fallbackPlan) {
            this.fallbackPlan = fallbackPlan;
            return this;
        }

        public Builder fallbackPlan(FallbackTranscriberPlan fallbackPlan) {
            this.fallbackPlan = Optional.ofNullable(fallbackPlan);
            return this;
        }

        public ElevenLabsTranscriber build() {
            return new ElevenLabsTranscriber(model, language, fallbackPlan, additionalProperties);
        }
    }
}
