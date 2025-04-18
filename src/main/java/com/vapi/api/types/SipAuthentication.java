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
@JsonDeserialize(builder = SipAuthentication.Builder.class)
public final class SipAuthentication {
    private final Optional<String> realm;

    private final String username;

    private final String password;

    private final Map<String, Object> additionalProperties;

    private SipAuthentication(
            Optional<String> realm, String username, String password, Map<String, Object> additionalProperties) {
        this.realm = realm;
        this.username = username;
        this.password = password;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This will be expected in the <code>realm</code> field of the <code>authorization</code> header of the SIP INVITE. Defaults to sip.vapi.ai.
     */
    @JsonProperty("realm")
    public Optional<String> getRealm() {
        return realm;
    }

    /**
     * @return This will be expected in the <code>username</code> field of the <code>authorization</code> header of the SIP INVITE.
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * @return This will be expected to generate the <code>response</code> field of the <code>authorization</code> header of the SIP INVITE, through digest authentication.
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SipAuthentication && equalTo((SipAuthentication) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SipAuthentication other) {
        return realm.equals(other.realm) && username.equals(other.username) && password.equals(other.password);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.realm, this.username, this.password);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UsernameStage builder() {
        return new Builder();
    }

    public interface UsernameStage {
        PasswordStage username(@NotNull String username);

        Builder from(SipAuthentication other);
    }

    public interface PasswordStage {
        _FinalStage password(@NotNull String password);
    }

    public interface _FinalStage {
        SipAuthentication build();

        _FinalStage realm(Optional<String> realm);

        _FinalStage realm(String realm);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UsernameStage, PasswordStage, _FinalStage {
        private String username;

        private String password;

        private Optional<String> realm = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(SipAuthentication other) {
            realm(other.getRealm());
            username(other.getUsername());
            password(other.getPassword());
            return this;
        }

        /**
         * <p>This will be expected in the <code>username</code> field of the <code>authorization</code> header of the SIP INVITE.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("username")
        public PasswordStage username(@NotNull String username) {
            this.username = Objects.requireNonNull(username, "username must not be null");
            return this;
        }

        /**
         * <p>This will be expected to generate the <code>response</code> field of the <code>authorization</code> header of the SIP INVITE, through digest authentication.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("password")
        public _FinalStage password(@NotNull String password) {
            this.password = Objects.requireNonNull(password, "password must not be null");
            return this;
        }

        /**
         * <p>This will be expected in the <code>realm</code> field of the <code>authorization</code> header of the SIP INVITE. Defaults to sip.vapi.ai.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage realm(String realm) {
            this.realm = Optional.ofNullable(realm);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "realm", nulls = Nulls.SKIP)
        public _FinalStage realm(Optional<String> realm) {
            this.realm = realm;
            return this;
        }

        @java.lang.Override
        public SipAuthentication build() {
            return new SipAuthentication(realm, username, password, additionalProperties);
        }
    }
}
