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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = DeepgramTranscriber.Builder.class)
public final class DeepgramTranscriber {
    private final Optional<DeepgramTranscriberModel> model;

    private final Optional<DeepgramTranscriberLanguage> language;

    private final Optional<Boolean> smartFormat;

    private final Optional<Boolean> languageDetectionEnabled;

    private final Optional<List<String>> keywords;

    private final Optional<Double> endpointing;

    private final Map<String, Object> additionalProperties;

    private DeepgramTranscriber(
            Optional<DeepgramTranscriberModel> model,
            Optional<DeepgramTranscriberLanguage> language,
            Optional<Boolean> smartFormat,
            Optional<Boolean> languageDetectionEnabled,
            Optional<List<String>> keywords,
            Optional<Double> endpointing,
            Map<String, Object> additionalProperties) {
        this.model = model;
        this.language = language;
        this.smartFormat = smartFormat;
        this.languageDetectionEnabled = languageDetectionEnabled;
        this.keywords = keywords;
        this.endpointing = endpointing;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the Deepgram model that will be used. A list of models can be found here: https://developers.deepgram.com/docs/models-languages-overview
     */
    @JsonProperty("model")
    public Optional<DeepgramTranscriberModel> getModel() {
        return model;
    }

    /**
     * @return This is the language that will be set for the transcription. The list of languages Deepgram supports can be found here: https://developers.deepgram.com/docs/models-languages-overview
     */
    @JsonProperty("language")
    public Optional<DeepgramTranscriberLanguage> getLanguage() {
        return language;
    }

    /**
     * @return This will be use smart format option provided by Deepgram. It's default disabled because it can sometimes format numbers as times but it's getting better.
     */
    @JsonProperty("smartFormat")
    public Optional<Boolean> getSmartFormat() {
        return smartFormat;
    }

    /**
     * @return This enables or disables language detection. If true, swaps transcribers to detected language automatically. Defaults to false.
     */
    @JsonProperty("languageDetectionEnabled")
    public Optional<Boolean> getLanguageDetectionEnabled() {
        return languageDetectionEnabled;
    }

    /**
     * @return These keywords are passed to the transcription model to help it pick up use-case specific words. Anything that may not be a common word, like your company name, should be added here.
     */
    @JsonProperty("keywords")
    public Optional<List<String>> getKeywords() {
        return keywords;
    }

    /**
     * @return This is the timeout after which Deepgram will send transcription on user silence. You can read in-depth documentation here: https://developers.deepgram.com/docs/endpointing.
     * <p>Here are the most important bits:</p>
     * <ul>
     * <li>Defaults to 10. This is recommended for most use cases to optimize for latency.</li>
     * <li>10 can cause some missing transcriptions since because of the shorter context. This mostly happens for one-word utterances. For those uses cases, it's recommended to try 300. It will add a bit of latency but the quality and reliability of the experience will be better.</li>
     * <li>If neither 10 nor 300 work, contact support@vapi.ai and we'll find another solution.</li>
     * </ul>
     * <p>@default 10</p>
     */
    @JsonProperty("endpointing")
    public Optional<Double> getEndpointing() {
        return endpointing;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DeepgramTranscriber && equalTo((DeepgramTranscriber) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DeepgramTranscriber other) {
        return model.equals(other.model)
                && language.equals(other.language)
                && smartFormat.equals(other.smartFormat)
                && languageDetectionEnabled.equals(other.languageDetectionEnabled)
                && keywords.equals(other.keywords)
                && endpointing.equals(other.endpointing);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.model,
                this.language,
                this.smartFormat,
                this.languageDetectionEnabled,
                this.keywords,
                this.endpointing);
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
        private Optional<DeepgramTranscriberModel> model = Optional.empty();

        private Optional<DeepgramTranscriberLanguage> language = Optional.empty();

        private Optional<Boolean> smartFormat = Optional.empty();

        private Optional<Boolean> languageDetectionEnabled = Optional.empty();

        private Optional<List<String>> keywords = Optional.empty();

        private Optional<Double> endpointing = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(DeepgramTranscriber other) {
            model(other.getModel());
            language(other.getLanguage());
            smartFormat(other.getSmartFormat());
            languageDetectionEnabled(other.getLanguageDetectionEnabled());
            keywords(other.getKeywords());
            endpointing(other.getEndpointing());
            return this;
        }

        @JsonSetter(value = "model", nulls = Nulls.SKIP)
        public Builder model(Optional<DeepgramTranscriberModel> model) {
            this.model = model;
            return this;
        }

        public Builder model(DeepgramTranscriberModel model) {
            this.model = Optional.ofNullable(model);
            return this;
        }

        @JsonSetter(value = "language", nulls = Nulls.SKIP)
        public Builder language(Optional<DeepgramTranscriberLanguage> language) {
            this.language = language;
            return this;
        }

        public Builder language(DeepgramTranscriberLanguage language) {
            this.language = Optional.ofNullable(language);
            return this;
        }

        @JsonSetter(value = "smartFormat", nulls = Nulls.SKIP)
        public Builder smartFormat(Optional<Boolean> smartFormat) {
            this.smartFormat = smartFormat;
            return this;
        }

        public Builder smartFormat(Boolean smartFormat) {
            this.smartFormat = Optional.ofNullable(smartFormat);
            return this;
        }

        @JsonSetter(value = "languageDetectionEnabled", nulls = Nulls.SKIP)
        public Builder languageDetectionEnabled(Optional<Boolean> languageDetectionEnabled) {
            this.languageDetectionEnabled = languageDetectionEnabled;
            return this;
        }

        public Builder languageDetectionEnabled(Boolean languageDetectionEnabled) {
            this.languageDetectionEnabled = Optional.ofNullable(languageDetectionEnabled);
            return this;
        }

        @JsonSetter(value = "keywords", nulls = Nulls.SKIP)
        public Builder keywords(Optional<List<String>> keywords) {
            this.keywords = keywords;
            return this;
        }

        public Builder keywords(List<String> keywords) {
            this.keywords = Optional.ofNullable(keywords);
            return this;
        }

        @JsonSetter(value = "endpointing", nulls = Nulls.SKIP)
        public Builder endpointing(Optional<Double> endpointing) {
            this.endpointing = endpointing;
            return this;
        }

        public Builder endpointing(Double endpointing) {
            this.endpointing = Optional.ofNullable(endpointing);
            return this;
        }

        public DeepgramTranscriber build() {
            return new DeepgramTranscriber(
                    model,
                    language,
                    smartFormat,
                    languageDetectionEnabled,
                    keywords,
                    endpointing,
                    additionalProperties);
        }
    }
}
