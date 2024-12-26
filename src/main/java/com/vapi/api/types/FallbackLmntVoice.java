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
@JsonDeserialize(builder = FallbackLmntVoice.Builder.class)
public final class FallbackLmntVoice {
    private final FallbackLmntVoiceId voiceId;

    private final Optional<Double> speed;

    private final Optional<ChunkPlan> chunkPlan;

    private final Map<String, Object> additionalProperties;

    private FallbackLmntVoice(
            FallbackLmntVoiceId voiceId,
            Optional<Double> speed,
            Optional<ChunkPlan> chunkPlan,
            Map<String, Object> additionalProperties) {
        this.voiceId = voiceId;
        this.speed = speed;
        this.chunkPlan = chunkPlan;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the provider-specific ID that will be used.
     */
    @JsonProperty("voiceId")
    public FallbackLmntVoiceId getVoiceId() {
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

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FallbackLmntVoice && equalTo((FallbackLmntVoice) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FallbackLmntVoice other) {
        return voiceId.equals(other.voiceId) && speed.equals(other.speed) && chunkPlan.equals(other.chunkPlan);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.voiceId, this.speed, this.chunkPlan);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static VoiceIdStage builder() {
        return new Builder();
    }

    public interface VoiceIdStage {
        _FinalStage voiceId(@NotNull FallbackLmntVoiceId voiceId);

        Builder from(FallbackLmntVoice other);
    }

    public interface _FinalStage {
        FallbackLmntVoice build();

        _FinalStage speed(Optional<Double> speed);

        _FinalStage speed(Double speed);

        _FinalStage chunkPlan(Optional<ChunkPlan> chunkPlan);

        _FinalStage chunkPlan(ChunkPlan chunkPlan);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements VoiceIdStage, _FinalStage {
        private FallbackLmntVoiceId voiceId;

        private Optional<ChunkPlan> chunkPlan = Optional.empty();

        private Optional<Double> speed = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(FallbackLmntVoice other) {
            voiceId(other.getVoiceId());
            speed(other.getSpeed());
            chunkPlan(other.getChunkPlan());
            return this;
        }

        /**
         * <p>This is the provider-specific ID that will be used.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("voiceId")
        public _FinalStage voiceId(@NotNull FallbackLmntVoiceId voiceId) {
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

        @java.lang.Override
        public FallbackLmntVoice build() {
            return new FallbackLmntVoice(voiceId, speed, chunkPlan, additionalProperties);
        }
    }
}
