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
@JsonDeserialize(builder = TokenRestrictions.Builder.class)
public final class TokenRestrictions {
    private final Optional<Boolean> enabled;

    private final Optional<List<String>> allowedOrigins;

    private final Optional<List<String>> allowedAssistantIds;

    private final Optional<Boolean> allowTransientAssistant;

    private final Map<String, Object> additionalProperties;

    private TokenRestrictions(
            Optional<Boolean> enabled,
            Optional<List<String>> allowedOrigins,
            Optional<List<String>> allowedAssistantIds,
            Optional<Boolean> allowTransientAssistant,
            Map<String, Object> additionalProperties) {
        this.enabled = enabled;
        this.allowedOrigins = allowedOrigins;
        this.allowedAssistantIds = allowedAssistantIds;
        this.allowTransientAssistant = allowTransientAssistant;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This determines whether the token is enabled or disabled. Default is true, it's enabled.
     */
    @JsonProperty("enabled")
    public Optional<Boolean> getEnabled() {
        return enabled;
    }

    /**
     * @return This determines the allowed origins for this token. Validates the <code>Origin</code> header. Default is any origin.
     * <p>Only relevant for <code>public</code> tokens.</p>
     */
    @JsonProperty("allowedOrigins")
    public Optional<List<String>> getAllowedOrigins() {
        return allowedOrigins;
    }

    /**
     * @return This determines which assistantIds can be used when creating a call. Default is any assistantId.
     * <p>Only relevant for <code>public</code> tokens.</p>
     */
    @JsonProperty("allowedAssistantIds")
    public Optional<List<String>> getAllowedAssistantIds() {
        return allowedAssistantIds;
    }

    /**
     * @return This determines whether transient assistants can be used when creating a call. Default is true.
     * <p>If <code>allowedAssistantIds</code> is provided, this is automatically false.</p>
     * <p>Only relevant for <code>public</code> tokens.</p>
     */
    @JsonProperty("allowTransientAssistant")
    public Optional<Boolean> getAllowTransientAssistant() {
        return allowTransientAssistant;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TokenRestrictions && equalTo((TokenRestrictions) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TokenRestrictions other) {
        return enabled.equals(other.enabled)
                && allowedOrigins.equals(other.allowedOrigins)
                && allowedAssistantIds.equals(other.allowedAssistantIds)
                && allowTransientAssistant.equals(other.allowTransientAssistant);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.enabled, this.allowedOrigins, this.allowedAssistantIds, this.allowTransientAssistant);
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
        private Optional<Boolean> enabled = Optional.empty();

        private Optional<List<String>> allowedOrigins = Optional.empty();

        private Optional<List<String>> allowedAssistantIds = Optional.empty();

        private Optional<Boolean> allowTransientAssistant = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TokenRestrictions other) {
            enabled(other.getEnabled());
            allowedOrigins(other.getAllowedOrigins());
            allowedAssistantIds(other.getAllowedAssistantIds());
            allowTransientAssistant(other.getAllowTransientAssistant());
            return this;
        }

        @JsonSetter(value = "enabled", nulls = Nulls.SKIP)
        public Builder enabled(Optional<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Optional.ofNullable(enabled);
            return this;
        }

        @JsonSetter(value = "allowedOrigins", nulls = Nulls.SKIP)
        public Builder allowedOrigins(Optional<List<String>> allowedOrigins) {
            this.allowedOrigins = allowedOrigins;
            return this;
        }

        public Builder allowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Optional.ofNullable(allowedOrigins);
            return this;
        }

        @JsonSetter(value = "allowedAssistantIds", nulls = Nulls.SKIP)
        public Builder allowedAssistantIds(Optional<List<String>> allowedAssistantIds) {
            this.allowedAssistantIds = allowedAssistantIds;
            return this;
        }

        public Builder allowedAssistantIds(List<String> allowedAssistantIds) {
            this.allowedAssistantIds = Optional.ofNullable(allowedAssistantIds);
            return this;
        }

        @JsonSetter(value = "allowTransientAssistant", nulls = Nulls.SKIP)
        public Builder allowTransientAssistant(Optional<Boolean> allowTransientAssistant) {
            this.allowTransientAssistant = allowTransientAssistant;
            return this;
        }

        public Builder allowTransientAssistant(Boolean allowTransientAssistant) {
            this.allowTransientAssistant = Optional.ofNullable(allowTransientAssistant);
            return this;
        }

        public TokenRestrictions build() {
            return new TokenRestrictions(
                    enabled, allowedOrigins, allowedAssistantIds, allowTransientAssistant, additionalProperties);
        }
    }
}