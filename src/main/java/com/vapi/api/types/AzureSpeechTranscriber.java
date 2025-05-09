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
@JsonDeserialize(builder = AzureSpeechTranscriber.Builder.class)
public final class AzureSpeechTranscriber {
    private final Optional<AzureSpeechTranscriberLanguage> language;

    private final Optional<FallbackTranscriberPlan> fallbackPlan;

    private final Map<String, Object> additionalProperties;

    private AzureSpeechTranscriber(
            Optional<AzureSpeechTranscriberLanguage> language,
            Optional<FallbackTranscriberPlan> fallbackPlan,
            Map<String, Object> additionalProperties) {
        this.language = language;
        this.fallbackPlan = fallbackPlan;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the language that will be set for the transcription. The list of languages Azure supports can be found here: https://learn.microsoft.com/en-us/azure/ai-services/speech-service/language-support?tabs=stt
     */
    @JsonProperty("language")
    public Optional<AzureSpeechTranscriberLanguage> getLanguage() {
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
        return other instanceof AzureSpeechTranscriber && equalTo((AzureSpeechTranscriber) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AzureSpeechTranscriber other) {
        return language.equals(other.language) && fallbackPlan.equals(other.fallbackPlan);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.language, this.fallbackPlan);
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
        private Optional<AzureSpeechTranscriberLanguage> language = Optional.empty();

        private Optional<FallbackTranscriberPlan> fallbackPlan = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(AzureSpeechTranscriber other) {
            language(other.getLanguage());
            fallbackPlan(other.getFallbackPlan());
            return this;
        }

        @JsonSetter(value = "language", nulls = Nulls.SKIP)
        public Builder language(Optional<AzureSpeechTranscriberLanguage> language) {
            this.language = language;
            return this;
        }

        public Builder language(AzureSpeechTranscriberLanguage language) {
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

        public AzureSpeechTranscriber build() {
            return new AzureSpeechTranscriber(language, fallbackPlan, additionalProperties);
        }
    }
}
