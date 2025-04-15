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
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = VapiSmartEndpointingPlan.Builder.class)
public final class VapiSmartEndpointingPlan {
    private final VapiSmartEndpointingPlanProvider provider;

    private final Map<String, Object> additionalProperties;

    private VapiSmartEndpointingPlan(
            VapiSmartEndpointingPlanProvider provider, Map<String, Object> additionalProperties) {
        this.provider = provider;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the provider for the smart endpointing plan.
     */
    @JsonProperty("provider")
    public VapiSmartEndpointingPlanProvider getProvider() {
        return provider;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof VapiSmartEndpointingPlan && equalTo((VapiSmartEndpointingPlan) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(VapiSmartEndpointingPlan other) {
        return provider.equals(other.provider);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.provider);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ProviderStage builder() {
        return new Builder();
    }

    public interface ProviderStage {
        _FinalStage provider(@NotNull VapiSmartEndpointingPlanProvider provider);

        Builder from(VapiSmartEndpointingPlan other);
    }

    public interface _FinalStage {
        VapiSmartEndpointingPlan build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ProviderStage, _FinalStage {
        private VapiSmartEndpointingPlanProvider provider;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(VapiSmartEndpointingPlan other) {
            provider(other.getProvider());
            return this;
        }

        /**
         * <p>This is the provider for the smart endpointing plan.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("provider")
        public _FinalStage provider(@NotNull VapiSmartEndpointingPlanProvider provider) {
            this.provider = Objects.requireNonNull(provider, "provider must not be null");
            return this;
        }

        @java.lang.Override
        public VapiSmartEndpointingPlan build() {
            return new VapiSmartEndpointingPlan(provider, additionalProperties);
        }
    }
}
