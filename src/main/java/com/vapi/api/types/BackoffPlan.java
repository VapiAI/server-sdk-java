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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = BackoffPlan.Builder.class)
public final class BackoffPlan {
    private final Map<String, Object> type;

    private final double maxRetries;

    private final double baseDelaySeconds;

    private final Map<String, Object> additionalProperties;

    private BackoffPlan(
            Map<String, Object> type,
            double maxRetries,
            double baseDelaySeconds,
            Map<String, Object> additionalProperties) {
        this.type = type;
        this.maxRetries = maxRetries;
        this.baseDelaySeconds = baseDelaySeconds;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the type of backoff plan to use. Defaults to fixed.
     * <p>@default fixed</p>
     */
    @JsonProperty("type")
    public Map<String, Object> getType() {
        return type;
    }

    /**
     * @return This is the maximum number of retries to attempt if the request fails. Defaults to 0 (no retries).
     * <p>@default 0</p>
     */
    @JsonProperty("maxRetries")
    public double getMaxRetries() {
        return maxRetries;
    }

    /**
     * @return This is the base delay in seconds. For linear backoff, this is the delay between each retry. For exponential backoff, this is the initial delay.
     */
    @JsonProperty("baseDelaySeconds")
    public double getBaseDelaySeconds() {
        return baseDelaySeconds;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BackoffPlan && equalTo((BackoffPlan) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BackoffPlan other) {
        return type.equals(other.type) && maxRetries == other.maxRetries && baseDelaySeconds == other.baseDelaySeconds;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.type, this.maxRetries, this.baseDelaySeconds);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static MaxRetriesStage builder() {
        return new Builder();
    }

    public interface MaxRetriesStage {
        BaseDelaySecondsStage maxRetries(double maxRetries);

        Builder from(BackoffPlan other);
    }

    public interface BaseDelaySecondsStage {
        _FinalStage baseDelaySeconds(double baseDelaySeconds);
    }

    public interface _FinalStage {
        BackoffPlan build();

        _FinalStage type(Map<String, Object> type);

        _FinalStage putAllType(Map<String, Object> type);

        _FinalStage type(String key, Object value);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements MaxRetriesStage, BaseDelaySecondsStage, _FinalStage {
        private double maxRetries;

        private double baseDelaySeconds;

        private Map<String, Object> type = new LinkedHashMap<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(BackoffPlan other) {
            type(other.getType());
            maxRetries(other.getMaxRetries());
            baseDelaySeconds(other.getBaseDelaySeconds());
            return this;
        }

        /**
         * <p>This is the maximum number of retries to attempt if the request fails. Defaults to 0 (no retries).</p>
         * <p>@default 0</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("maxRetries")
        public BaseDelaySecondsStage maxRetries(double maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        /**
         * <p>This is the base delay in seconds. For linear backoff, this is the delay between each retry. For exponential backoff, this is the initial delay.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("baseDelaySeconds")
        public _FinalStage baseDelaySeconds(double baseDelaySeconds) {
            this.baseDelaySeconds = baseDelaySeconds;
            return this;
        }

        /**
         * <p>This is the type of backoff plan to use. Defaults to fixed.</p>
         * <p>@default fixed</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage type(String key, Object value) {
            this.type.put(key, value);
            return this;
        }

        /**
         * <p>This is the type of backoff plan to use. Defaults to fixed.</p>
         * <p>@default fixed</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage putAllType(Map<String, Object> type) {
            this.type.putAll(type);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "type", nulls = Nulls.SKIP)
        public _FinalStage type(Map<String, Object> type) {
            this.type.clear();
            this.type.putAll(type);
            return this;
        }

        @java.lang.Override
        public BackoffPlan build() {
            return new BackoffPlan(type, maxRetries, baseDelaySeconds, additionalProperties);
        }
    }
}
