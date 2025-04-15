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
@JsonDeserialize(builder = RimeAiVoice.Builder.class)
public final class RimeAiVoice {
    private final RimeAiVoiceId voiceId;

    private final Optional<RimeAiVoiceModel> model;

    private final Optional<Double> speed;

    private final Optional<Boolean> pauseBetweenBrackets;

    private final Optional<Boolean> phonemizeBetweenBrackets;

    private final Optional<Boolean> reduceLatency;

    private final Optional<String> inlineSpeedAlpha;

    private final Optional<ChunkPlan> chunkPlan;

    private final Optional<FallbackPlan> fallbackPlan;

    private final Map<String, Object> additionalProperties;

    private RimeAiVoice(
            RimeAiVoiceId voiceId,
            Optional<RimeAiVoiceModel> model,
            Optional<Double> speed,
            Optional<Boolean> pauseBetweenBrackets,
            Optional<Boolean> phonemizeBetweenBrackets,
            Optional<Boolean> reduceLatency,
            Optional<String> inlineSpeedAlpha,
            Optional<ChunkPlan> chunkPlan,
            Optional<FallbackPlan> fallbackPlan,
            Map<String, Object> additionalProperties) {
        this.voiceId = voiceId;
        this.model = model;
        this.speed = speed;
        this.pauseBetweenBrackets = pauseBetweenBrackets;
        this.phonemizeBetweenBrackets = phonemizeBetweenBrackets;
        this.reduceLatency = reduceLatency;
        this.inlineSpeedAlpha = inlineSpeedAlpha;
        this.chunkPlan = chunkPlan;
        this.fallbackPlan = fallbackPlan;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the provider-specific ID that will be used.
     */
    @JsonProperty("voiceId")
    public RimeAiVoiceId getVoiceId() {
        return voiceId;
    }

    /**
     * @return This is the model that will be used. Defaults to 'v1' when not specified.
     */
    @JsonProperty("model")
    public Optional<RimeAiVoiceModel> getModel() {
        return model;
    }

    /**
     * @return This is the speed multiplier that will be used.
     */
    @JsonProperty("speed")
    public Optional<Double> getSpeed() {
        return speed;
    }

    /**
     * @return This is a flag that controls whether to add slight pauses using angle brackets. Example: “Hi. &lt;200&gt; I’d love to have a conversation with you.” adds a 200ms pause between the first and second sentences.
     */
    @JsonProperty("pauseBetweenBrackets")
    public Optional<Boolean> getPauseBetweenBrackets() {
        return pauseBetweenBrackets;
    }

    /**
     * @return This is a flag that controls whether text inside brackets should be phonemized (converted to phonetic pronunciation) - Example: &quot;{h'El.o} World&quot; will pronounce &quot;Hello&quot; as expected.
     */
    @JsonProperty("phonemizeBetweenBrackets")
    public Optional<Boolean> getPhonemizeBetweenBrackets() {
        return phonemizeBetweenBrackets;
    }

    /**
     * @return This is a flag that controls whether to optimize for reduced latency in streaming. https://docs.rime.ai/api-reference/endpoint/websockets#param-reduce-latency
     */
    @JsonProperty("reduceLatency")
    public Optional<Boolean> getReduceLatency() {
        return reduceLatency;
    }

    /**
     * @return This is a string that allows inline speed control using alpha notation. https://docs.rime.ai/api-reference/endpoint/websockets#param-inline-speed-alpha
     */
    @JsonProperty("inlineSpeedAlpha")
    public Optional<String> getInlineSpeedAlpha() {
        return inlineSpeedAlpha;
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
        return other instanceof RimeAiVoice && equalTo((RimeAiVoice) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(RimeAiVoice other) {
        return voiceId.equals(other.voiceId)
                && model.equals(other.model)
                && speed.equals(other.speed)
                && pauseBetweenBrackets.equals(other.pauseBetweenBrackets)
                && phonemizeBetweenBrackets.equals(other.phonemizeBetweenBrackets)
                && reduceLatency.equals(other.reduceLatency)
                && inlineSpeedAlpha.equals(other.inlineSpeedAlpha)
                && chunkPlan.equals(other.chunkPlan)
                && fallbackPlan.equals(other.fallbackPlan);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.voiceId,
                this.model,
                this.speed,
                this.pauseBetweenBrackets,
                this.phonemizeBetweenBrackets,
                this.reduceLatency,
                this.inlineSpeedAlpha,
                this.chunkPlan,
                this.fallbackPlan);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static VoiceIdStage builder() {
        return new Builder();
    }

    public interface VoiceIdStage {
        _FinalStage voiceId(@NotNull RimeAiVoiceId voiceId);

        Builder from(RimeAiVoice other);
    }

    public interface _FinalStage {
        RimeAiVoice build();

        _FinalStage model(Optional<RimeAiVoiceModel> model);

        _FinalStage model(RimeAiVoiceModel model);

        _FinalStage speed(Optional<Double> speed);

        _FinalStage speed(Double speed);

        _FinalStage pauseBetweenBrackets(Optional<Boolean> pauseBetweenBrackets);

        _FinalStage pauseBetweenBrackets(Boolean pauseBetweenBrackets);

        _FinalStage phonemizeBetweenBrackets(Optional<Boolean> phonemizeBetweenBrackets);

        _FinalStage phonemizeBetweenBrackets(Boolean phonemizeBetweenBrackets);

        _FinalStage reduceLatency(Optional<Boolean> reduceLatency);

        _FinalStage reduceLatency(Boolean reduceLatency);

        _FinalStage inlineSpeedAlpha(Optional<String> inlineSpeedAlpha);

        _FinalStage inlineSpeedAlpha(String inlineSpeedAlpha);

        _FinalStage chunkPlan(Optional<ChunkPlan> chunkPlan);

        _FinalStage chunkPlan(ChunkPlan chunkPlan);

        _FinalStage fallbackPlan(Optional<FallbackPlan> fallbackPlan);

        _FinalStage fallbackPlan(FallbackPlan fallbackPlan);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements VoiceIdStage, _FinalStage {
        private RimeAiVoiceId voiceId;

        private Optional<FallbackPlan> fallbackPlan = Optional.empty();

        private Optional<ChunkPlan> chunkPlan = Optional.empty();

        private Optional<String> inlineSpeedAlpha = Optional.empty();

        private Optional<Boolean> reduceLatency = Optional.empty();

        private Optional<Boolean> phonemizeBetweenBrackets = Optional.empty();

        private Optional<Boolean> pauseBetweenBrackets = Optional.empty();

        private Optional<Double> speed = Optional.empty();

        private Optional<RimeAiVoiceModel> model = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(RimeAiVoice other) {
            voiceId(other.getVoiceId());
            model(other.getModel());
            speed(other.getSpeed());
            pauseBetweenBrackets(other.getPauseBetweenBrackets());
            phonemizeBetweenBrackets(other.getPhonemizeBetweenBrackets());
            reduceLatency(other.getReduceLatency());
            inlineSpeedAlpha(other.getInlineSpeedAlpha());
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
        public _FinalStage voiceId(@NotNull RimeAiVoiceId voiceId) {
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
         * <p>This is a string that allows inline speed control using alpha notation. https://docs.rime.ai/api-reference/endpoint/websockets#param-inline-speed-alpha</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage inlineSpeedAlpha(String inlineSpeedAlpha) {
            this.inlineSpeedAlpha = Optional.ofNullable(inlineSpeedAlpha);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "inlineSpeedAlpha", nulls = Nulls.SKIP)
        public _FinalStage inlineSpeedAlpha(Optional<String> inlineSpeedAlpha) {
            this.inlineSpeedAlpha = inlineSpeedAlpha;
            return this;
        }

        /**
         * <p>This is a flag that controls whether to optimize for reduced latency in streaming. https://docs.rime.ai/api-reference/endpoint/websockets#param-reduce-latency</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage reduceLatency(Boolean reduceLatency) {
            this.reduceLatency = Optional.ofNullable(reduceLatency);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "reduceLatency", nulls = Nulls.SKIP)
        public _FinalStage reduceLatency(Optional<Boolean> reduceLatency) {
            this.reduceLatency = reduceLatency;
            return this;
        }

        /**
         * <p>This is a flag that controls whether text inside brackets should be phonemized (converted to phonetic pronunciation) - Example: &quot;{h'El.o} World&quot; will pronounce &quot;Hello&quot; as expected.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage phonemizeBetweenBrackets(Boolean phonemizeBetweenBrackets) {
            this.phonemizeBetweenBrackets = Optional.ofNullable(phonemizeBetweenBrackets);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "phonemizeBetweenBrackets", nulls = Nulls.SKIP)
        public _FinalStage phonemizeBetweenBrackets(Optional<Boolean> phonemizeBetweenBrackets) {
            this.phonemizeBetweenBrackets = phonemizeBetweenBrackets;
            return this;
        }

        /**
         * <p>This is a flag that controls whether to add slight pauses using angle brackets. Example: “Hi. &lt;200&gt; I’d love to have a conversation with you.” adds a 200ms pause between the first and second sentences.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage pauseBetweenBrackets(Boolean pauseBetweenBrackets) {
            this.pauseBetweenBrackets = Optional.ofNullable(pauseBetweenBrackets);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "pauseBetweenBrackets", nulls = Nulls.SKIP)
        public _FinalStage pauseBetweenBrackets(Optional<Boolean> pauseBetweenBrackets) {
            this.pauseBetweenBrackets = pauseBetweenBrackets;
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
         * <p>This is the model that will be used. Defaults to 'v1' when not specified.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage model(RimeAiVoiceModel model) {
            this.model = Optional.ofNullable(model);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "model", nulls = Nulls.SKIP)
        public _FinalStage model(Optional<RimeAiVoiceModel> model) {
            this.model = model;
            return this;
        }

        @java.lang.Override
        public RimeAiVoice build() {
            return new RimeAiVoice(
                    voiceId,
                    model,
                    speed,
                    pauseBetweenBrackets,
                    phonemizeBetweenBrackets,
                    reduceLatency,
                    inlineSpeedAlpha,
                    chunkPlan,
                    fallbackPlan,
                    additionalProperties);
        }
    }
}
