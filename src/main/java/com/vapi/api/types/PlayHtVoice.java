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
@JsonDeserialize(builder = PlayHtVoice.Builder.class)
public final class PlayHtVoice {
    private final Optional<Boolean> fillerInjectionEnabled;

    private final PlayHtVoiceVoiceId voiceId;

    private final Optional<Double> speed;

    private final Optional<Double> temperature;

    private final Optional<PlayHtVoiceEmotion> emotion;

    private final Optional<Double> voiceGuidance;

    private final Optional<Double> styleGuidance;

    private final Optional<Double> textGuidance;

    private final Optional<ChunkPlan> chunkPlan;

    private final Map<String, Object> additionalProperties;

    private PlayHtVoice(
            Optional<Boolean> fillerInjectionEnabled,
            PlayHtVoiceVoiceId voiceId,
            Optional<Double> speed,
            Optional<Double> temperature,
            Optional<PlayHtVoiceEmotion> emotion,
            Optional<Double> voiceGuidance,
            Optional<Double> styleGuidance,
            Optional<Double> textGuidance,
            Optional<ChunkPlan> chunkPlan,
            Map<String, Object> additionalProperties) {
        this.fillerInjectionEnabled = fillerInjectionEnabled;
        this.voiceId = voiceId;
        this.speed = speed;
        this.temperature = temperature;
        this.emotion = emotion;
        this.voiceGuidance = voiceGuidance;
        this.styleGuidance = styleGuidance;
        this.textGuidance = textGuidance;
        this.chunkPlan = chunkPlan;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This determines whether fillers are injected into the model output before inputting it into the voice provider.
     * <p>Default <code>false</code> because you can achieve better results with prompting the model.</p>
     */
    @JsonProperty("fillerInjectionEnabled")
    public Optional<Boolean> getFillerInjectionEnabled() {
        return fillerInjectionEnabled;
    }

    /**
     * @return This is the provider-specific ID that will be used.
     */
    @JsonProperty("voiceId")
    public PlayHtVoiceVoiceId getVoiceId() {
        return voiceId;
    }

    /**
     * @return This is the speed multiplier that will be used.
     */
    @JsonProperty("speed")
    public Optional<Double> getSpeed() {
        return speed;
    }

    /**
     * @return A floating point number between 0, exclusive, and 2, inclusive. If equal to null or not provided, the model's default temperature will be used. The temperature parameter controls variance. Lower temperatures result in more predictable results, higher temperatures allow each run to vary more, so the voice may sound less like the baseline voice.
     */
    @JsonProperty("temperature")
    public Optional<Double> getTemperature() {
        return temperature;
    }

    /**
     * @return An emotion to be applied to the speech.
     */
    @JsonProperty("emotion")
    public Optional<PlayHtVoiceEmotion> getEmotion() {
        return emotion;
    }

    /**
     * @return A number between 1 and 6. Use lower numbers to reduce how unique your chosen voice will be compared to other voices.
     */
    @JsonProperty("voiceGuidance")
    public Optional<Double> getVoiceGuidance() {
        return voiceGuidance;
    }

    /**
     * @return A number between 1 and 30. Use lower numbers to to reduce how strong your chosen emotion will be. Higher numbers will create a very emotional performance.
     */
    @JsonProperty("styleGuidance")
    public Optional<Double> getStyleGuidance() {
        return styleGuidance;
    }

    /**
     * @return A number between 1 and 2. This number influences how closely the generated speech adheres to the input text. Use lower values to create more fluid speech, but with a higher chance of deviating from the input text. Higher numbers will make the generated speech more accurate to the input text, ensuring that the words spoken align closely with the provided text.
     */
    @JsonProperty("textGuidance")
    public Optional<Double> getTextGuidance() {
        return textGuidance;
    }

    /**
     * @return This is the plan for chunking the model output before it is sent to the voice provider.
     */
    @JsonProperty("chunkPlan")
    public Optional<ChunkPlan> getChunkPlan() {
        return chunkPlan;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PlayHtVoice && equalTo((PlayHtVoice) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PlayHtVoice other) {
        return fillerInjectionEnabled.equals(other.fillerInjectionEnabled)
                && voiceId.equals(other.voiceId)
                && speed.equals(other.speed)
                && temperature.equals(other.temperature)
                && emotion.equals(other.emotion)
                && voiceGuidance.equals(other.voiceGuidance)
                && styleGuidance.equals(other.styleGuidance)
                && textGuidance.equals(other.textGuidance)
                && chunkPlan.equals(other.chunkPlan);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.fillerInjectionEnabled,
                this.voiceId,
                this.speed,
                this.temperature,
                this.emotion,
                this.voiceGuidance,
                this.styleGuidance,
                this.textGuidance,
                this.chunkPlan);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static VoiceIdStage builder() {
        return new Builder();
    }

    public interface VoiceIdStage {
        _FinalStage voiceId(@NotNull PlayHtVoiceVoiceId voiceId);

        Builder from(PlayHtVoice other);
    }

    public interface _FinalStage {
        PlayHtVoice build();

        _FinalStage fillerInjectionEnabled(Optional<Boolean> fillerInjectionEnabled);

        _FinalStage fillerInjectionEnabled(Boolean fillerInjectionEnabled);

        _FinalStage speed(Optional<Double> speed);

        _FinalStage speed(Double speed);

        _FinalStage temperature(Optional<Double> temperature);

        _FinalStage temperature(Double temperature);

        _FinalStage emotion(Optional<PlayHtVoiceEmotion> emotion);

        _FinalStage emotion(PlayHtVoiceEmotion emotion);

        _FinalStage voiceGuidance(Optional<Double> voiceGuidance);

        _FinalStage voiceGuidance(Double voiceGuidance);

        _FinalStage styleGuidance(Optional<Double> styleGuidance);

        _FinalStage styleGuidance(Double styleGuidance);

        _FinalStage textGuidance(Optional<Double> textGuidance);

        _FinalStage textGuidance(Double textGuidance);

        _FinalStage chunkPlan(Optional<ChunkPlan> chunkPlan);

        _FinalStage chunkPlan(ChunkPlan chunkPlan);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements VoiceIdStage, _FinalStage {
        private PlayHtVoiceVoiceId voiceId;

        private Optional<ChunkPlan> chunkPlan = Optional.empty();

        private Optional<Double> textGuidance = Optional.empty();

        private Optional<Double> styleGuidance = Optional.empty();

        private Optional<Double> voiceGuidance = Optional.empty();

        private Optional<PlayHtVoiceEmotion> emotion = Optional.empty();

        private Optional<Double> temperature = Optional.empty();

        private Optional<Double> speed = Optional.empty();

        private Optional<Boolean> fillerInjectionEnabled = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(PlayHtVoice other) {
            fillerInjectionEnabled(other.getFillerInjectionEnabled());
            voiceId(other.getVoiceId());
            speed(other.getSpeed());
            temperature(other.getTemperature());
            emotion(other.getEmotion());
            voiceGuidance(other.getVoiceGuidance());
            styleGuidance(other.getStyleGuidance());
            textGuidance(other.getTextGuidance());
            chunkPlan(other.getChunkPlan());
            return this;
        }

        /**
         * <p>This is the provider-specific ID that will be used.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("voiceId")
        public _FinalStage voiceId(@NotNull PlayHtVoiceVoiceId voiceId) {
            this.voiceId = Objects.requireNonNull(voiceId, "voiceId must not be null");
            return this;
        }

        /**
         * <p>This is the plan for chunking the model output before it is sent to the voice provider.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage chunkPlan(ChunkPlan chunkPlan) {
            this.chunkPlan = Optional.ofNullable(chunkPlan);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "chunkPlan", nulls = Nulls.SKIP)
        public _FinalStage chunkPlan(Optional<ChunkPlan> chunkPlan) {
            this.chunkPlan = chunkPlan;
            return this;
        }

        /**
         * <p>A number between 1 and 2. This number influences how closely the generated speech adheres to the input text. Use lower values to create more fluid speech, but with a higher chance of deviating from the input text. Higher numbers will make the generated speech more accurate to the input text, ensuring that the words spoken align closely with the provided text.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage textGuidance(Double textGuidance) {
            this.textGuidance = Optional.ofNullable(textGuidance);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "textGuidance", nulls = Nulls.SKIP)
        public _FinalStage textGuidance(Optional<Double> textGuidance) {
            this.textGuidance = textGuidance;
            return this;
        }

        /**
         * <p>A number between 1 and 30. Use lower numbers to to reduce how strong your chosen emotion will be. Higher numbers will create a very emotional performance.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage styleGuidance(Double styleGuidance) {
            this.styleGuidance = Optional.ofNullable(styleGuidance);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "styleGuidance", nulls = Nulls.SKIP)
        public _FinalStage styleGuidance(Optional<Double> styleGuidance) {
            this.styleGuidance = styleGuidance;
            return this;
        }

        /**
         * <p>A number between 1 and 6. Use lower numbers to reduce how unique your chosen voice will be compared to other voices.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage voiceGuidance(Double voiceGuidance) {
            this.voiceGuidance = Optional.ofNullable(voiceGuidance);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "voiceGuidance", nulls = Nulls.SKIP)
        public _FinalStage voiceGuidance(Optional<Double> voiceGuidance) {
            this.voiceGuidance = voiceGuidance;
            return this;
        }

        /**
         * <p>An emotion to be applied to the speech.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage emotion(PlayHtVoiceEmotion emotion) {
            this.emotion = Optional.ofNullable(emotion);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "emotion", nulls = Nulls.SKIP)
        public _FinalStage emotion(Optional<PlayHtVoiceEmotion> emotion) {
            this.emotion = emotion;
            return this;
        }

        /**
         * <p>A floating point number between 0, exclusive, and 2, inclusive. If equal to null or not provided, the model's default temperature will be used. The temperature parameter controls variance. Lower temperatures result in more predictable results, higher temperatures allow each run to vary more, so the voice may sound less like the baseline voice.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage temperature(Double temperature) {
            this.temperature = Optional.ofNullable(temperature);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "temperature", nulls = Nulls.SKIP)
        public _FinalStage temperature(Optional<Double> temperature) {
            this.temperature = temperature;
            return this;
        }

        /**
         * <p>This is the speed multiplier that will be used.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage speed(Double speed) {
            this.speed = Optional.ofNullable(speed);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "speed", nulls = Nulls.SKIP)
        public _FinalStage speed(Optional<Double> speed) {
            this.speed = speed;
            return this;
        }

        /**
         * <p>This determines whether fillers are injected into the model output before inputting it into the voice provider.</p>
         * <p>Default <code>false</code> because you can achieve better results with prompting the model.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage fillerInjectionEnabled(Boolean fillerInjectionEnabled) {
            this.fillerInjectionEnabled = Optional.ofNullable(fillerInjectionEnabled);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "fillerInjectionEnabled", nulls = Nulls.SKIP)
        public _FinalStage fillerInjectionEnabled(Optional<Boolean> fillerInjectionEnabled) {
            this.fillerInjectionEnabled = fillerInjectionEnabled;
            return this;
        }

        @java.lang.Override
        public PlayHtVoice build() {
            return new PlayHtVoice(
                    fillerInjectionEnabled,
                    voiceId,
                    speed,
                    temperature,
                    emotion,
                    voiceGuidance,
                    styleGuidance,
                    textGuidance,
                    chunkPlan,
                    additionalProperties);
        }
    }
}