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
@JsonDeserialize(builder = FallbackAzureVoice.Builder.class)
public final class FallbackAzureVoice {
    private final Optional<Boolean> cachingEnabled;

    private final FallbackAzureVoiceId voiceId;

    private final Optional<Double> speed;

    private final Optional<ChunkPlan> chunkPlan;

    private final Optional<Object> oneOf;

    private final Map<String, Object> additionalProperties;

    private FallbackAzureVoice(
            Optional<Boolean> cachingEnabled,
            FallbackAzureVoiceId voiceId,
            Optional<Double> speed,
            Optional<ChunkPlan> chunkPlan,
            Optional<Object> oneOf,
            Map<String, Object> additionalProperties) {
        this.cachingEnabled = cachingEnabled;
        this.voiceId = voiceId;
        this.speed = speed;
        this.chunkPlan = chunkPlan;
        this.oneOf = oneOf;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the flag to toggle voice caching for the assistant.
     */
    @JsonProperty("cachingEnabled")
    public Optional<Boolean> getCachingEnabled() {
        return cachingEnabled;
    }

    /**
     * @return This is the provider-specific ID that will be used.
     */
    @JsonProperty("voiceId")
    public FallbackAzureVoiceId getVoiceId() {
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
     * @return This is the plan for chunking the model output before it is sent to the voice provider.
     */
    @JsonProperty("chunkPlan")
    public Optional<ChunkPlan> getChunkPlan() {
        return chunkPlan;
    }

    @JsonProperty("oneOf")
    public Optional<Object> getOneOf() {
        return oneOf;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FallbackAzureVoice && equalTo((FallbackAzureVoice) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FallbackAzureVoice other) {
        return cachingEnabled.equals(other.cachingEnabled)
                && voiceId.equals(other.voiceId)
                && speed.equals(other.speed)
                && chunkPlan.equals(other.chunkPlan)
                && oneOf.equals(other.oneOf);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.cachingEnabled, this.voiceId, this.speed, this.chunkPlan, this.oneOf);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static VoiceIdStage builder() {
        return new Builder();
    }

    public interface VoiceIdStage {
        _FinalStage voiceId(@NotNull FallbackAzureVoiceId voiceId);

        Builder from(FallbackAzureVoice other);
    }

    public interface _FinalStage {
        FallbackAzureVoice build();

        _FinalStage cachingEnabled(Optional<Boolean> cachingEnabled);

        _FinalStage cachingEnabled(Boolean cachingEnabled);

        _FinalStage speed(Optional<Double> speed);

        _FinalStage speed(Double speed);

        _FinalStage chunkPlan(Optional<ChunkPlan> chunkPlan);

        _FinalStage chunkPlan(ChunkPlan chunkPlan);

        _FinalStage oneOf(Optional<Object> oneOf);

        _FinalStage oneOf(Object oneOf);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements VoiceIdStage, _FinalStage {
        private FallbackAzureVoiceId voiceId;

        private Optional<Object> oneOf = Optional.empty();

        private Optional<ChunkPlan> chunkPlan = Optional.empty();

        private Optional<Double> speed = Optional.empty();

        private Optional<Boolean> cachingEnabled = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(FallbackAzureVoice other) {
            cachingEnabled(other.getCachingEnabled());
            voiceId(other.getVoiceId());
            speed(other.getSpeed());
            chunkPlan(other.getChunkPlan());
            oneOf(other.getOneOf());
            return this;
        }

        /**
         * <p>This is the provider-specific ID that will be used.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("voiceId")
        public _FinalStage voiceId(@NotNull FallbackAzureVoiceId voiceId) {
            this.voiceId = Objects.requireNonNull(voiceId, "voiceId must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage oneOf(Object oneOf) {
            this.oneOf = Optional.ofNullable(oneOf);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "oneOf", nulls = Nulls.SKIP)
        public _FinalStage oneOf(Optional<Object> oneOf) {
            this.oneOf = oneOf;
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
         * <p>This is the flag to toggle voice caching for the assistant.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage cachingEnabled(Boolean cachingEnabled) {
            this.cachingEnabled = Optional.ofNullable(cachingEnabled);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "cachingEnabled", nulls = Nulls.SKIP)
        public _FinalStage cachingEnabled(Optional<Boolean> cachingEnabled) {
            this.cachingEnabled = cachingEnabled;
            return this;
        }

        @java.lang.Override
        public FallbackAzureVoice build() {
            return new FallbackAzureVoice(cachingEnabled, voiceId, speed, chunkPlan, oneOf, additionalProperties);
        }
    }
}
