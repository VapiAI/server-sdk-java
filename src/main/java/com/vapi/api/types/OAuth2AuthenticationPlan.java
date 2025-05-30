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
@JsonDeserialize(builder = OAuth2AuthenticationPlan.Builder.class)
public final class OAuth2AuthenticationPlan {
    private final OAuth2AuthenticationPlanType type;

    private final String url;

    private final String clientId;

    private final String clientSecret;

    private final Optional<String> scope;

    private final Map<String, Object> additionalProperties;

    private OAuth2AuthenticationPlan(
            OAuth2AuthenticationPlanType type,
            String url,
            String clientId,
            String clientSecret,
            Optional<String> scope,
            Map<String, Object> additionalProperties) {
        this.type = type;
        this.url = url;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.scope = scope;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("type")
    public OAuth2AuthenticationPlanType getType() {
        return type;
    }

    /**
     * @return This is the OAuth2 URL.
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * @return This is the OAuth2 client ID.
     */
    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    /**
     * @return This is the OAuth2 client secret.
     */
    @JsonProperty("clientSecret")
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * @return This is the scope of the OAuth2 token.
     */
    @JsonProperty("scope")
    public Optional<String> getScope() {
        return scope;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof OAuth2AuthenticationPlan && equalTo((OAuth2AuthenticationPlan) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(OAuth2AuthenticationPlan other) {
        return type.equals(other.type)
                && url.equals(other.url)
                && clientId.equals(other.clientId)
                && clientSecret.equals(other.clientSecret)
                && scope.equals(other.scope);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.type, this.url, this.clientId, this.clientSecret, this.scope);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TypeStage builder() {
        return new Builder();
    }

    public interface TypeStage {
        UrlStage type(@NotNull OAuth2AuthenticationPlanType type);

        Builder from(OAuth2AuthenticationPlan other);
    }

    public interface UrlStage {
        ClientIdStage url(@NotNull String url);
    }

    public interface ClientIdStage {
        ClientSecretStage clientId(@NotNull String clientId);
    }

    public interface ClientSecretStage {
        _FinalStage clientSecret(@NotNull String clientSecret);
    }

    public interface _FinalStage {
        OAuth2AuthenticationPlan build();

        _FinalStage scope(Optional<String> scope);

        _FinalStage scope(String scope);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TypeStage, UrlStage, ClientIdStage, ClientSecretStage, _FinalStage {
        private OAuth2AuthenticationPlanType type;

        private String url;

        private String clientId;

        private String clientSecret;

        private Optional<String> scope = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(OAuth2AuthenticationPlan other) {
            type(other.getType());
            url(other.getUrl());
            clientId(other.getClientId());
            clientSecret(other.getClientSecret());
            scope(other.getScope());
            return this;
        }

        @java.lang.Override
        @JsonSetter("type")
        public UrlStage type(@NotNull OAuth2AuthenticationPlanType type) {
            this.type = Objects.requireNonNull(type, "type must not be null");
            return this;
        }

        /**
         * <p>This is the OAuth2 URL.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("url")
        public ClientIdStage url(@NotNull String url) {
            this.url = Objects.requireNonNull(url, "url must not be null");
            return this;
        }

        /**
         * <p>This is the OAuth2 client ID.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("clientId")
        public ClientSecretStage clientId(@NotNull String clientId) {
            this.clientId = Objects.requireNonNull(clientId, "clientId must not be null");
            return this;
        }

        /**
         * <p>This is the OAuth2 client secret.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("clientSecret")
        public _FinalStage clientSecret(@NotNull String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret, "clientSecret must not be null");
            return this;
        }

        /**
         * <p>This is the scope of the OAuth2 token.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage scope(String scope) {
            this.scope = Optional.ofNullable(scope);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "scope", nulls = Nulls.SKIP)
        public _FinalStage scope(Optional<String> scope) {
            this.scope = scope;
            return this;
        }

        @java.lang.Override
        public OAuth2AuthenticationPlan build() {
            return new OAuth2AuthenticationPlan(type, url, clientId, clientSecret, scope, additionalProperties);
        }
    }
}
