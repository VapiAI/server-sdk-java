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
@JsonDeserialize(builder = StartSpeakingPlan.Builder.class)
public final class StartSpeakingPlan {
    private final Optional<Double> waitSeconds;

    private final Optional<Boolean> smartEndpointingEnabled;

    private final Optional<TranscriptionEndpointingPlan> transcriptionEndpointingPlan;

    private final Map<String, Object> additionalProperties;

    private StartSpeakingPlan(
            Optional<Double> waitSeconds,
            Optional<Boolean> smartEndpointingEnabled,
            Optional<TranscriptionEndpointingPlan> transcriptionEndpointingPlan,
            Map<String, Object> additionalProperties) {
        this.waitSeconds = waitSeconds;
        this.smartEndpointingEnabled = smartEndpointingEnabled;
        this.transcriptionEndpointingPlan = transcriptionEndpointingPlan;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is how long assistant waits before speaking. Defaults to 0.4.
     * <p>This is the minimum it will wait but if there is latency is the pipeline, this minimum will be exceeded. This is really a stopgap in case the pipeline is moving too fast.</p>
     * <p>Example:</p>
     * <ul>
     * <li>If model generates tokens and voice generates bytes within 100ms, the pipeline still waits 300ms before outputting speech.</li>
     * </ul>
     * <p>Usage:</p>
     * <ul>
     * <li>If the customer is taking long pauses, set this to a higher value.</li>
     * <li>If the assistant is accidentally jumping in too much, set this to a higher value.</li>
     * </ul>
     * <p>@default 0.4</p>
     */
    @JsonProperty("waitSeconds")
    public Optional<Double> getWaitSeconds() {
        return waitSeconds;
    }

    /**
     * @return This determines if a customer speech is considered done (endpointing) using the VAP model on customer's speech. This is good for middle-of-thought detection.
     * <p>Once an endpoint is triggered, the request is sent to <code>assistant.model</code>.</p>
     * <p>Default <code>false</code> since experimental.</p>
     * <p>@default false</p>
     */
    @JsonProperty("smartEndpointingEnabled")
    public Optional<Boolean> getSmartEndpointingEnabled() {
        return smartEndpointingEnabled;
    }

    /**
     * @return This determines how a customer speech is considered done (endpointing) using the transcription of customer's speech.
     * <p>Once an endpoint is triggered, the request is sent to <code>assistant.model</code>.</p>
     */
    @JsonProperty("transcriptionEndpointingPlan")
    public Optional<TranscriptionEndpointingPlan> getTranscriptionEndpointingPlan() {
        return transcriptionEndpointingPlan;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof StartSpeakingPlan && equalTo((StartSpeakingPlan) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(StartSpeakingPlan other) {
        return waitSeconds.equals(other.waitSeconds)
                && smartEndpointingEnabled.equals(other.smartEndpointingEnabled)
                && transcriptionEndpointingPlan.equals(other.transcriptionEndpointingPlan);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.waitSeconds, this.smartEndpointingEnabled, this.transcriptionEndpointingPlan);
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
        private Optional<Double> waitSeconds = Optional.empty();

        private Optional<Boolean> smartEndpointingEnabled = Optional.empty();

        private Optional<TranscriptionEndpointingPlan> transcriptionEndpointingPlan = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(StartSpeakingPlan other) {
            waitSeconds(other.getWaitSeconds());
            smartEndpointingEnabled(other.getSmartEndpointingEnabled());
            transcriptionEndpointingPlan(other.getTranscriptionEndpointingPlan());
            return this;
        }

        @JsonSetter(value = "waitSeconds", nulls = Nulls.SKIP)
        public Builder waitSeconds(Optional<Double> waitSeconds) {
            this.waitSeconds = waitSeconds;
            return this;
        }

        public Builder waitSeconds(Double waitSeconds) {
            this.waitSeconds = Optional.ofNullable(waitSeconds);
            return this;
        }

        @JsonSetter(value = "smartEndpointingEnabled", nulls = Nulls.SKIP)
        public Builder smartEndpointingEnabled(Optional<Boolean> smartEndpointingEnabled) {
            this.smartEndpointingEnabled = smartEndpointingEnabled;
            return this;
        }

        public Builder smartEndpointingEnabled(Boolean smartEndpointingEnabled) {
            this.smartEndpointingEnabled = Optional.ofNullable(smartEndpointingEnabled);
            return this;
        }

        @JsonSetter(value = "transcriptionEndpointingPlan", nulls = Nulls.SKIP)
        public Builder transcriptionEndpointingPlan(
                Optional<TranscriptionEndpointingPlan> transcriptionEndpointingPlan) {
            this.transcriptionEndpointingPlan = transcriptionEndpointingPlan;
            return this;
        }

        public Builder transcriptionEndpointingPlan(TranscriptionEndpointingPlan transcriptionEndpointingPlan) {
            this.transcriptionEndpointingPlan = Optional.ofNullable(transcriptionEndpointingPlan);
            return this;
        }

        public StartSpeakingPlan build() {
            return new StartSpeakingPlan(
                    waitSeconds, smartEndpointingEnabled, transcriptionEndpointingPlan, additionalProperties);
        }
    }
}