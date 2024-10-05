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
@JsonDeserialize(builder = SipTrunkOutboundSipRegisterPlan.Builder.class)
public final class SipTrunkOutboundSipRegisterPlan {
    private final Optional<String> domain;

    private final Optional<String> username;

    private final Optional<String> realm;

    private final Map<String, Object> additionalProperties;

    private SipTrunkOutboundSipRegisterPlan(
            Optional<String> domain,
            Optional<String> username,
            Optional<String> realm,
            Map<String, Object> additionalProperties) {
        this.domain = domain;
        this.username = username;
        this.realm = realm;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("domain")
    public Optional<String> getDomain() {
        return domain;
    }

    @JsonProperty("username")
    public Optional<String> getUsername() {
        return username;
    }

    @JsonProperty("realm")
    public Optional<String> getRealm() {
        return realm;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SipTrunkOutboundSipRegisterPlan && equalTo((SipTrunkOutboundSipRegisterPlan) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SipTrunkOutboundSipRegisterPlan other) {
        return domain.equals(other.domain) && username.equals(other.username) && realm.equals(other.realm);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.domain, this.username, this.realm);
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
        private Optional<String> domain = Optional.empty();

        private Optional<String> username = Optional.empty();

        private Optional<String> realm = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(SipTrunkOutboundSipRegisterPlan other) {
            domain(other.getDomain());
            username(other.getUsername());
            realm(other.getRealm());
            return this;
        }

        @JsonSetter(value = "domain", nulls = Nulls.SKIP)
        public Builder domain(Optional<String> domain) {
            this.domain = domain;
            return this;
        }

        public Builder domain(String domain) {
            this.domain = Optional.ofNullable(domain);
            return this;
        }

        @JsonSetter(value = "username", nulls = Nulls.SKIP)
        public Builder username(Optional<String> username) {
            this.username = username;
            return this;
        }

        public Builder username(String username) {
            this.username = Optional.ofNullable(username);
            return this;
        }

        @JsonSetter(value = "realm", nulls = Nulls.SKIP)
        public Builder realm(Optional<String> realm) {
            this.realm = realm;
            return this;
        }

        public Builder realm(String realm) {
            this.realm = Optional.ofNullable(realm);
            return this;
        }

        public SipTrunkOutboundSipRegisterPlan build() {
            return new SipTrunkOutboundSipRegisterPlan(domain, username, realm, additionalProperties);
        }
    }
}