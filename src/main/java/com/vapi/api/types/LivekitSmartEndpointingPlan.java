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
@JsonDeserialize(builder = LivekitSmartEndpointingPlan.Builder.class)
public final class LivekitSmartEndpointingPlan {
    private final LivekitSmartEndpointingPlanProvider provider;

    private final Optional<String> waitFunction;

    private final Map<String, Object> additionalProperties;

    private LivekitSmartEndpointingPlan(
            LivekitSmartEndpointingPlanProvider provider,
            Optional<String> waitFunction,
            Map<String, Object> additionalProperties) {
        this.provider = provider;
        this.waitFunction = waitFunction;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the provider for the smart endpointing plan.
     */
    @JsonProperty("provider")
    public LivekitSmartEndpointingPlanProvider getProvider() {
        return provider;
    }

    /**
     * @return This expression describes how long the bot will wait to start speaking based on the likelihood that the user has reached an endpoint.
     * <p>This is a millisecond valued function. It maps probabilities (real numbers on [0,1]) to milliseconds that the bot should wait before speaking ([0, \infty]). Any negative values that are returned are set to zero (the bot can't start talking in the past).</p>
     * <p>A probability of zero represents very high confidence that the caller has stopped speaking, and would like the bot to speak to them. A probability of one represents very high confidence that the caller is still speaking.</p>
     * <p>Under the hood, this is parsed into a mathjs expression. Whatever you use to write your expression needs to be valid with respect to mathjs</p>
     * <p>@default &quot;70 + 4000 * x&quot;</p>
     */
    @JsonProperty("waitFunction")
    public Optional<String> getWaitFunction() {
        return waitFunction;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LivekitSmartEndpointingPlan && equalTo((LivekitSmartEndpointingPlan) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(LivekitSmartEndpointingPlan other) {
        return provider.equals(other.provider) && waitFunction.equals(other.waitFunction);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.provider, this.waitFunction);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ProviderStage builder() {
        return new Builder();
    }

    public interface ProviderStage {
        _FinalStage provider(@NotNull LivekitSmartEndpointingPlanProvider provider);

        Builder from(LivekitSmartEndpointingPlan other);
    }

    public interface _FinalStage {
        LivekitSmartEndpointingPlan build();

        _FinalStage waitFunction(Optional<String> waitFunction);

        _FinalStage waitFunction(String waitFunction);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ProviderStage, _FinalStage {
        private LivekitSmartEndpointingPlanProvider provider;

        private Optional<String> waitFunction = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(LivekitSmartEndpointingPlan other) {
            provider(other.getProvider());
            waitFunction(other.getWaitFunction());
            return this;
        }

        /**
         * <p>This is the provider for the smart endpointing plan.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("provider")
        public _FinalStage provider(@NotNull LivekitSmartEndpointingPlanProvider provider) {
            this.provider = Objects.requireNonNull(provider, "provider must not be null");
            return this;
        }

        /**
         * <p>This expression describes how long the bot will wait to start speaking based on the likelihood that the user has reached an endpoint.</p>
         * <p>This is a millisecond valued function. It maps probabilities (real numbers on [0,1]) to milliseconds that the bot should wait before speaking ([0, \infty]). Any negative values that are returned are set to zero (the bot can't start talking in the past).</p>
         * <p>A probability of zero represents very high confidence that the caller has stopped speaking, and would like the bot to speak to them. A probability of one represents very high confidence that the caller is still speaking.</p>
         * <p>Under the hood, this is parsed into a mathjs expression. Whatever you use to write your expression needs to be valid with respect to mathjs</p>
         * <p>@default &quot;70 + 4000 * x&quot;</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage waitFunction(String waitFunction) {
            this.waitFunction = Optional.ofNullable(waitFunction);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "waitFunction", nulls = Nulls.SKIP)
        public _FinalStage waitFunction(Optional<String> waitFunction) {
            this.waitFunction = waitFunction;
            return this;
        }

        @java.lang.Override
        public LivekitSmartEndpointingPlan build() {
            return new LivekitSmartEndpointingPlan(provider, waitFunction, additionalProperties);
        }
    }
}
