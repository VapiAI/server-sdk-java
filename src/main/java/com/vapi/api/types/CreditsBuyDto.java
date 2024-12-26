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
@JsonDeserialize(builder = CreditsBuyDto.Builder.class)
public final class CreditsBuyDto {
    private final double credits;

    private final Map<String, Object> additionalProperties;

    private CreditsBuyDto(double credits, Map<String, Object> additionalProperties) {
        this.credits = credits;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the number of credits to add to the subscription.
     */
    @JsonProperty("credits")
    public double getCredits() {
        return credits;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreditsBuyDto && equalTo((CreditsBuyDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreditsBuyDto other) {
        return credits == other.credits;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.credits);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CreditsStage builder() {
        return new Builder();
    }

    public interface CreditsStage {
        _FinalStage credits(double credits);

        Builder from(CreditsBuyDto other);
    }

    public interface _FinalStage {
        CreditsBuyDto build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CreditsStage, _FinalStage {
        private double credits;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CreditsBuyDto other) {
            credits(other.getCredits());
            return this;
        }

        /**
         * <p>This is the number of credits to add to the subscription.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("credits")
        public _FinalStage credits(double credits) {
            this.credits = credits;
            return this;
        }

        @java.lang.Override
        public CreditsBuyDto build() {
            return new CreditsBuyDto(credits, additionalProperties);
        }
    }
}
