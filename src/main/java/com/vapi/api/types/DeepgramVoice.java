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
@JsonDeserialize(builder = DeepgramVoice.Builder.class)
public final class DeepgramVoice {
    private final DeepgramVoiceId voiceId;

    private final Optional<Boolean> mipOptOut;

    private final Optional<ChunkPlan> chunkPlan;

    private final Optional<FallbackPlan> fallbackPlan;

    private final Map<String, Object> additionalProperties;

    private DeepgramVoice(
            DeepgramVoiceId voiceId,
            Optional<Boolean> mipOptOut,
            Optional<ChunkPlan> chunkPlan,
            Optional<FallbackPlan> fallbackPlan,
            Map<String, Object> additionalProperties) {
        this.voiceId = voiceId;
        this.mipOptOut = mipOptOut;
        this.chunkPlan = chunkPlan;
        this.fallbackPlan = fallbackPlan;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the provider-specific ID that will be used.
     */
    @JsonProperty("voiceId")
    public DeepgramVoiceId getVoiceId() {
        return voiceId;
    }

    /**
     * @return If set to true, this will add mip_opt_out=true as a query parameter of all API requests. See https://developers.deepgram.com/docs/the-deepgram-model-improvement-partnership-program#want-to-opt-out
     * <p>This will only be used if you are using your own Deepgram API key.</p>
     * <p>@default false</p>
     */
    @JsonProperty("mipOptOut")
    public Optional<Boolean> getMipOptOut() {
        return mipOptOut;
    }

    /**
     * @return This is the plan for chunking the model output before it is sent to the voice provider.
     */
    @JsonProperty("chunkPlan")
    public Optional<ChunkPlan> getChunkPlan() {
        return chunkPlan;
    }

    /**
     * @return This is the plan for voice provider fallbacks in the event that the primary voice provider fails.
     */
    @JsonProperty("fallbackPlan")
    public Optional<FallbackPlan> getFallbackPlan() {
        return fallbackPlan;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DeepgramVoice && equalTo((DeepgramVoice) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DeepgramVoice other) {
        return voiceId.equals(other.voiceId)
                && mipOptOut.equals(other.mipOptOut)
                && chunkPlan.equals(other.chunkPlan)
                && fallbackPlan.equals(other.fallbackPlan);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.voiceId, this.mipOptOut, this.chunkPlan, this.fallbackPlan);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static VoiceIdStage builder() {
        return new Builder();
    }

    public interface VoiceIdStage {
        _FinalStage voiceId(@NotNull DeepgramVoiceId voiceId);

        Builder from(DeepgramVoice other);
    }

    public interface _FinalStage {
        DeepgramVoice build();

        _FinalStage mipOptOut(Optional<Boolean> mipOptOut);

        _FinalStage mipOptOut(Boolean mipOptOut);

        _FinalStage chunkPlan(Optional<ChunkPlan> chunkPlan);

        _FinalStage chunkPlan(ChunkPlan chunkPlan);

        _FinalStage fallbackPlan(Optional<FallbackPlan> fallbackPlan);

        _FinalStage fallbackPlan(FallbackPlan fallbackPlan);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements VoiceIdStage, _FinalStage {
        private DeepgramVoiceId voiceId;

        private Optional<FallbackPlan> fallbackPlan = Optional.empty();

        private Optional<ChunkPlan> chunkPlan = Optional.empty();

        private Optional<Boolean> mipOptOut = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(DeepgramVoice other) {
            voiceId(other.getVoiceId());
            mipOptOut(other.getMipOptOut());
            chunkPlan(other.getChunkPlan());
            fallbackPlan(other.getFallbackPlan());
            return this;
        }

        /**
         * <p>This is the provider-specific ID that will be used.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("voiceId")
        public _FinalStage voiceId(@NotNull DeepgramVoiceId voiceId) {
            this.voiceId = Objects.requireNonNull(voiceId, "voiceId must not be null");
            return this;
        }

        /**
         * <p>This is the plan for voice provider fallbacks in the event that the primary voice provider fails.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage fallbackPlan(FallbackPlan fallbackPlan) {
            this.fallbackPlan = Optional.ofNullable(fallbackPlan);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "fallbackPlan", nulls = Nulls.SKIP)
        public _FinalStage fallbackPlan(Optional<FallbackPlan> fallbackPlan) {
            this.fallbackPlan = fallbackPlan;
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
         * <p>If set to true, this will add mip_opt_out=true as a query parameter of all API requests. See https://developers.deepgram.com/docs/the-deepgram-model-improvement-partnership-program#want-to-opt-out</p>
         * <p>This will only be used if you are using your own Deepgram API key.</p>
         * <p>@default false</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage mipOptOut(Boolean mipOptOut) {
            this.mipOptOut = Optional.ofNullable(mipOptOut);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "mipOptOut", nulls = Nulls.SKIP)
        public _FinalStage mipOptOut(Optional<Boolean> mipOptOut) {
            this.mipOptOut = mipOptOut;
            return this;
        }

        @java.lang.Override
        public DeepgramVoice build() {
            return new DeepgramVoice(voiceId, mipOptOut, chunkPlan, fallbackPlan, additionalProperties);
        }
    }
}
