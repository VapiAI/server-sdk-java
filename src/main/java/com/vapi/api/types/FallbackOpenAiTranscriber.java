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
@JsonDeserialize(builder = FallbackOpenAiTranscriber.Builder.class)
public final class FallbackOpenAiTranscriber {
    private final FallbackOpenAiTranscriberModel model;

    private final Optional<FallbackOpenAiTranscriberLanguage> language;

    private final Map<String, Object> additionalProperties;

    private FallbackOpenAiTranscriber(
            FallbackOpenAiTranscriberModel model,
            Optional<FallbackOpenAiTranscriberLanguage> language,
            Map<String, Object> additionalProperties) {
        this.model = model;
        this.language = language;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the model that will be used for the transcription.
     */
    @JsonProperty("model")
    public FallbackOpenAiTranscriberModel getModel() {
        return model;
    }

    /**
     * @return This is the language that will be set for the transcription.
     */
    @JsonProperty("language")
    public Optional<FallbackOpenAiTranscriberLanguage> getLanguage() {
        return language;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FallbackOpenAiTranscriber && equalTo((FallbackOpenAiTranscriber) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FallbackOpenAiTranscriber other) {
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

    public static ModelStage builder() {
        return new Builder();
    }

    public interface ModelStage {
        _FinalStage model(@NotNull FallbackOpenAiTranscriberModel model);

        Builder from(FallbackOpenAiTranscriber other);
    }

    public interface _FinalStage {
        FallbackOpenAiTranscriber build();

        _FinalStage language(Optional<FallbackOpenAiTranscriberLanguage> language);

        _FinalStage language(FallbackOpenAiTranscriberLanguage language);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ModelStage, _FinalStage {
        private FallbackOpenAiTranscriberModel model;

        private Optional<FallbackOpenAiTranscriberLanguage> language = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(FallbackOpenAiTranscriber other) {
            model(other.getModel());
            language(other.getLanguage());
            return this;
        }

        /**
         * <p>This is the model that will be used for the transcription.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("model")
        public _FinalStage model(@NotNull FallbackOpenAiTranscriberModel model) {
            this.model = Objects.requireNonNull(model, "model must not be null");
            return this;
        }

        /**
         * <p>This is the language that will be set for the transcription.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage language(FallbackOpenAiTranscriberLanguage language) {
            this.language = Optional.ofNullable(language);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "language", nulls = Nulls.SKIP)
        public _FinalStage language(Optional<FallbackOpenAiTranscriberLanguage> language) {
            this.language = language;
            return this;
        }

        @java.lang.Override
        public FallbackOpenAiTranscriber build() {
            return new FallbackOpenAiTranscriber(model, language, additionalProperties);
        }
    }
}
