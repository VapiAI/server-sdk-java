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
@JsonDeserialize(builder = AnthropicThinkingConfig.Builder.class)
public final class AnthropicThinkingConfig {
    private final double budgetTokens;

    private final Map<String, Object> additionalProperties;

    private AnthropicThinkingConfig(double budgetTokens, Map<String, Object> additionalProperties) {
        this.budgetTokens = budgetTokens;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("type")
    public String getType() {
        return "enabled";
    }

    /**
     * @return The maximum number of tokens to allocate for thinking.
     * Must be between 1024 and 100000 tokens.
     */
    @JsonProperty("budgetTokens")
    public double getBudgetTokens() {
        return budgetTokens;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AnthropicThinkingConfig && equalTo((AnthropicThinkingConfig) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AnthropicThinkingConfig other) {
        return budgetTokens == other.budgetTokens;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.budgetTokens);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static BudgetTokensStage builder() {
        return new Builder();
    }

    public interface BudgetTokensStage {
        _FinalStage budgetTokens(double budgetTokens);

        Builder from(AnthropicThinkingConfig other);
    }

    public interface _FinalStage {
        AnthropicThinkingConfig build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements BudgetTokensStage, _FinalStage {
        private double budgetTokens;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AnthropicThinkingConfig other) {
            budgetTokens(other.getBudgetTokens());
            return this;
        }

        /**
         * <p>The maximum number of tokens to allocate for thinking.
         * Must be between 1024 and 100000 tokens.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("budgetTokens")
        public _FinalStage budgetTokens(double budgetTokens) {
            this.budgetTokens = budgetTokens;
            return this;
        }

        @java.lang.Override
        public AnthropicThinkingConfig build() {
            return new AnthropicThinkingConfig(budgetTokens, additionalProperties);
        }
    }
}
