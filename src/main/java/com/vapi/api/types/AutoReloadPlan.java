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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vapi.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = AutoReloadPlan.Builder.class)
public final class AutoReloadPlan {
    private final double credits;

    private final double threshold;

    private final Map<String, Object> additionalProperties;

    private AutoReloadPlan(double credits, double threshold, Map<String, Object> additionalProperties) {
        this.credits = credits;
        this.threshold = threshold;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This the amount of credits to reload.
     */
    @JsonProperty("credits")
    public double getCredits() {
        return credits;
    }

    /**
     * @return This is the limit at which the reload is triggered.
     */
    @JsonProperty("threshold")
    public double getThreshold() {
        return threshold;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AutoReloadPlan && equalTo((AutoReloadPlan) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AutoReloadPlan other) {
        return credits == other.credits && threshold == other.threshold;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.credits, this.threshold);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CreditsStage builder() {
        return new Builder();
    }

    public interface CreditsStage {
        ThresholdStage credits(double credits);

        Builder from(AutoReloadPlan other);
    }

    public interface ThresholdStage {
        _FinalStage threshold(double threshold);
    }

    public interface _FinalStage {
        AutoReloadPlan build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CreditsStage, ThresholdStage, _FinalStage {
        private double credits;

        private double threshold;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AutoReloadPlan other) {
            credits(other.getCredits());
            threshold(other.getThreshold());
            return this;
        }

        /**
         * <p>This the amount of credits to reload.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("credits")
        public ThresholdStage credits(double credits) {
            this.credits = credits;
            return this;
        }

        /**
         * <p>This is the limit at which the reload is triggered.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("threshold")
        public _FinalStage threshold(double threshold) {
            this.threshold = threshold;
            return this;
        }

        @java.lang.Override
        public AutoReloadPlan build() {
            return new AutoReloadPlan(credits, threshold, additionalProperties);
        }
    }
}
