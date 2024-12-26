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
@JsonDeserialize(builder = SubscriptionConcurrencyLineRemoveDto.Builder.class)
public final class SubscriptionConcurrencyLineRemoveDto {
    private final double quantity;

    private final Map<String, Object> additionalProperties;

    private SubscriptionConcurrencyLineRemoveDto(double quantity, Map<String, Object> additionalProperties) {
        this.quantity = quantity;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the number of concurrency lines to remove.
     */
    @JsonProperty("quantity")
    public double getQuantity() {
        return quantity;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SubscriptionConcurrencyLineRemoveDto
                && equalTo((SubscriptionConcurrencyLineRemoveDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SubscriptionConcurrencyLineRemoveDto other) {
        return quantity == other.quantity;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.quantity);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static QuantityStage builder() {
        return new Builder();
    }

    public interface QuantityStage {
        _FinalStage quantity(double quantity);

        Builder from(SubscriptionConcurrencyLineRemoveDto other);
    }

    public interface _FinalStage {
        SubscriptionConcurrencyLineRemoveDto build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements QuantityStage, _FinalStage {
        private double quantity;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(SubscriptionConcurrencyLineRemoveDto other) {
            quantity(other.getQuantity());
            return this;
        }

        /**
         * <p>This is the number of concurrency lines to remove.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("quantity")
        public _FinalStage quantity(double quantity) {
            this.quantity = quantity;
            return this;
        }

        @java.lang.Override
        public SubscriptionConcurrencyLineRemoveDto build() {
            return new SubscriptionConcurrencyLineRemoveDto(quantity, additionalProperties);
        }
    }
}
