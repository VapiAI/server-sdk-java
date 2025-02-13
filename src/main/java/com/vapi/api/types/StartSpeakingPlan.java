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
@JsonDeserialize(builder = StartSpeakingPlan.Builder.class)
public final class StartSpeakingPlan {
    private final Optional<Double> waitSeconds;

    private final Optional<Boolean> smartEndpointingEnabled;

    private final Optional<List<StartSpeakingPlanCustomEndpointingRulesItem>> customEndpointingRules;

    private final Optional<TranscriptionEndpointingPlan> transcriptionEndpointingPlan;

    private final Map<String, Object> additionalProperties;

    private StartSpeakingPlan(
            Optional<Double> waitSeconds,
            Optional<Boolean> smartEndpointingEnabled,
            Optional<List<StartSpeakingPlanCustomEndpointingRulesItem>> customEndpointingRules,
            Optional<TranscriptionEndpointingPlan> transcriptionEndpointingPlan,
            Map<String, Object> additionalProperties) {
        this.waitSeconds = waitSeconds;
        this.smartEndpointingEnabled = smartEndpointingEnabled;
        this.customEndpointingRules = customEndpointingRules;
        this.transcriptionEndpointingPlan = transcriptionEndpointingPlan;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is how long assistant waits before speaking. Defaults to 0.4.
     * <p>This is the minimum it will wait but if there is latency is the pipeline, this minimum will be exceeded. This is intended as a stopgap in case the pipeline is moving too fast.</p>
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
     * @return This determines if a customer speech is considered done (endpointing) using a Vapi custom-trained model on customer's speech. This is good for middle-of-thought detection.
     * <p>Once an endpoint is triggered, the request is sent to <code>assistant.model</code>.</p>
     * <p>Usage:</p>
     * <ul>
     * <li>If your conversations are long-form and you want assistant to wait smartly even if customer pauses for a bit to think, you can use this instead.</li>
     * </ul>
     * <p>This overrides <code>transcriptionEndpointingPlan</code>.</p>
     * <p>@default false</p>
     */
    @JsonProperty("smartEndpointingEnabled")
    public Optional<Boolean> getSmartEndpointingEnabled() {
        return smartEndpointingEnabled;
    }

    /**
     * @return These are the custom endpointing rules to set an endpointing timeout based on a regex on the customer's speech or the assistant's last message.
     * <p>Usage:</p>
     * <ul>
     * <li>If you have yes/no questions like &quot;are you interested in a loan?&quot;, you can set a shorter timeout.</li>
     * <li>If you have questions where the customer may pause to look up information like &quot;what's my account number?&quot;, you can set a longer timeout.</li>
     * <li>If you want to wait longer while customer is enumerating a list of numbers, you can set a longer timeout.</li>
     * </ul>
     * <p>These override <code>transcriptionEndpointingPlan</code> and <code>smartEndpointingEnabled</code> when a rule is matched.</p>
     * <p>The rules are evaluated in order and the first one that matches will be used.</p>
     * <p>@default []</p>
     */
    @JsonProperty("customEndpointingRules")
    public Optional<List<StartSpeakingPlanCustomEndpointingRulesItem>> getCustomEndpointingRules() {
        return customEndpointingRules;
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
                && customEndpointingRules.equals(other.customEndpointingRules)
                && transcriptionEndpointingPlan.equals(other.transcriptionEndpointingPlan);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.waitSeconds,
                this.smartEndpointingEnabled,
                this.customEndpointingRules,
                this.transcriptionEndpointingPlan);
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

        private Optional<List<StartSpeakingPlanCustomEndpointingRulesItem>> customEndpointingRules = Optional.empty();

        private Optional<TranscriptionEndpointingPlan> transcriptionEndpointingPlan = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(StartSpeakingPlan other) {
            waitSeconds(other.getWaitSeconds());
            smartEndpointingEnabled(other.getSmartEndpointingEnabled());
            customEndpointingRules(other.getCustomEndpointingRules());
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

        @JsonSetter(value = "customEndpointingRules", nulls = Nulls.SKIP)
        public Builder customEndpointingRules(
                Optional<List<StartSpeakingPlanCustomEndpointingRulesItem>> customEndpointingRules) {
            this.customEndpointingRules = customEndpointingRules;
            return this;
        }

        public Builder customEndpointingRules(
                List<StartSpeakingPlanCustomEndpointingRulesItem> customEndpointingRules) {
            this.customEndpointingRules = Optional.ofNullable(customEndpointingRules);
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
                    waitSeconds,
                    smartEndpointingEnabled,
                    customEndpointingRules,
                    transcriptionEndpointingPlan,
                    additionalProperties);
        }
    }
}
