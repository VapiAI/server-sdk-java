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
@JsonDeserialize(builder = FallbackSesameVoice.Builder.class)
public final class FallbackSesameVoice {
    private final Optional<Boolean> cachingEnabled;

    private final String voiceId;

    private final Optional<ChunkPlan> chunkPlan;

    private final Map<String, Object> additionalProperties;

    private FallbackSesameVoice(
            Optional<Boolean> cachingEnabled,
            String voiceId,
            Optional<ChunkPlan> chunkPlan,
            Map<String, Object> additionalProperties) {
        this.cachingEnabled = cachingEnabled;
        this.voiceId = voiceId;
        this.chunkPlan = chunkPlan;
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
     * @return This is the voice provider that will be used.
     */
    @JsonProperty("provider")
    public String getProvider() {
        return "sesame";
    }

    /**
     * @return This is the provider-specific ID that will be used.
     */
    @JsonProperty("voiceId")
    public String getVoiceId() {
        return voiceId;
    }

    /**
     * @return This is the model that will be used.
     */
    @JsonProperty("model")
    public String getModel() {
        return "csm-1b";
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
        return other instanceof FallbackSesameVoice && equalTo((FallbackSesameVoice) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FallbackSesameVoice other) {
        return cachingEnabled.equals(other.cachingEnabled)
                && voiceId.equals(other.voiceId)
                && chunkPlan.equals(other.chunkPlan);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.cachingEnabled, this.voiceId, this.chunkPlan);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static VoiceIdStage builder() {
        return new Builder();
    }

    public interface VoiceIdStage {
        _FinalStage voiceId(@NotNull String voiceId);

        Builder from(FallbackSesameVoice other);
    }

    public interface _FinalStage {
        FallbackSesameVoice build();

        _FinalStage cachingEnabled(Optional<Boolean> cachingEnabled);

        _FinalStage cachingEnabled(Boolean cachingEnabled);

        _FinalStage chunkPlan(Optional<ChunkPlan> chunkPlan);

        _FinalStage chunkPlan(ChunkPlan chunkPlan);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements VoiceIdStage, _FinalStage {
        private String voiceId;

        private Optional<ChunkPlan> chunkPlan = Optional.empty();

        private Optional<Boolean> cachingEnabled = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(FallbackSesameVoice other) {
            cachingEnabled(other.getCachingEnabled());
            voiceId(other.getVoiceId());
            chunkPlan(other.getChunkPlan());
            return this;
        }

        /**
         * <p>This is the provider-specific ID that will be used.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("voiceId")
        public _FinalStage voiceId(@NotNull String voiceId) {
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
        public FallbackSesameVoice build() {
            return new FallbackSesameVoice(cachingEnabled, voiceId, chunkPlan, additionalProperties);
        }
    }
}
