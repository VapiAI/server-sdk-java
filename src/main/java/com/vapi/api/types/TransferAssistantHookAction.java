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
@JsonDeserialize(builder = TransferAssistantHookAction.Builder.class)
public final class TransferAssistantHookAction {
    private final Optional<TransferAssistantHookActionDestination> destination;

    private final Map<String, Object> additionalProperties;

    private TransferAssistantHookAction(
            Optional<TransferAssistantHookActionDestination> destination, Map<String, Object> additionalProperties) {
        this.destination = destination;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the type of action - must be &quot;transfer&quot;
     */
    @JsonProperty("type")
    public String getType() {
        return "transfer";
    }

    /**
     * @return This is the destination details for the transfer - can be a phone number or SIP URI
     */
    @JsonProperty("destination")
    public Optional<TransferAssistantHookActionDestination> getDestination() {
        return destination;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TransferAssistantHookAction && equalTo((TransferAssistantHookAction) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TransferAssistantHookAction other) {
        return destination.equals(other.destination);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.destination);
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
        private Optional<TransferAssistantHookActionDestination> destination = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TransferAssistantHookAction other) {
            destination(other.getDestination());
            return this;
        }

        @JsonSetter(value = "destination", nulls = Nulls.SKIP)
        public Builder destination(Optional<TransferAssistantHookActionDestination> destination) {
            this.destination = destination;
            return this;
        }

        public Builder destination(TransferAssistantHookActionDestination destination) {
            this.destination = Optional.ofNullable(destination);
            return this;
        }

        public TransferAssistantHookAction build() {
            return new TransferAssistantHookAction(destination, additionalProperties);
        }
    }
}
