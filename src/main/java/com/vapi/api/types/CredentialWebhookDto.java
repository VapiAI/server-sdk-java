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
@JsonDeserialize(builder = CredentialWebhookDto.Builder.class)
public final class CredentialWebhookDto {
    private final CredentialWebhookDtoType type;

    private final CredentialWebhookDtoOperation operation;

    private final String from;

    private final String connectionId;

    private final CredentialWebhookDtoAuthMode authMode;

    private final String providerConfigKey;

    private final String provider;

    private final String environment;

    private final boolean success;

    private final CredentialEndUser endUser;

    private final Optional<CredentialSessionError> error;

    private final Map<String, Object> additionalProperties;

    private CredentialWebhookDto(
            CredentialWebhookDtoType type,
            CredentialWebhookDtoOperation operation,
            String from,
            String connectionId,
            CredentialWebhookDtoAuthMode authMode,
            String providerConfigKey,
            String provider,
            String environment,
            boolean success,
            CredentialEndUser endUser,
            Optional<CredentialSessionError> error,
            Map<String, Object> additionalProperties) {
        this.type = type;
        this.operation = operation;
        this.from = from;
        this.connectionId = connectionId;
        this.authMode = authMode;
        this.providerConfigKey = providerConfigKey;
        this.provider = provider;
        this.environment = environment;
        this.success = success;
        this.endUser = endUser;
        this.error = error;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("type")
    public CredentialWebhookDtoType getType() {
        return type;
    }

    @JsonProperty("operation")
    public CredentialWebhookDtoOperation getOperation() {
        return operation;
    }

    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    @JsonProperty("connectionId")
    public String getConnectionId() {
        return connectionId;
    }

    @JsonProperty("authMode")
    public CredentialWebhookDtoAuthMode getAuthMode() {
        return authMode;
    }

    @JsonProperty("providerConfigKey")
    public String getProviderConfigKey() {
        return providerConfigKey;
    }

    @JsonProperty("provider")
    public String getProvider() {
        return provider;
    }

    @JsonProperty("environment")
    public String getEnvironment() {
        return environment;
    }

    @JsonProperty("success")
    public boolean getSuccess() {
        return success;
    }

    @JsonProperty("endUser")
    public CredentialEndUser getEndUser() {
        return endUser;
    }

    @JsonProperty("error")
    public Optional<CredentialSessionError> getError() {
        return error;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CredentialWebhookDto && equalTo((CredentialWebhookDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CredentialWebhookDto other) {
        return type.equals(other.type)
                && operation.equals(other.operation)
                && from.equals(other.from)
                && connectionId.equals(other.connectionId)
                && authMode.equals(other.authMode)
                && providerConfigKey.equals(other.providerConfigKey)
                && provider.equals(other.provider)
                && environment.equals(other.environment)
                && success == other.success
                && endUser.equals(other.endUser)
                && error.equals(other.error);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.type,
                this.operation,
                this.from,
                this.connectionId,
                this.authMode,
                this.providerConfigKey,
                this.provider,
                this.environment,
                this.success,
                this.endUser,
                this.error);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TypeStage builder() {
        return new Builder();
    }

    public interface TypeStage {
        OperationStage type(@NotNull CredentialWebhookDtoType type);

        Builder from(CredentialWebhookDto other);
    }

    public interface OperationStage {
        FromStage operation(@NotNull CredentialWebhookDtoOperation operation);
    }

    public interface FromStage {
        ConnectionIdStage from(@NotNull String from);
    }

    public interface ConnectionIdStage {
        AuthModeStage connectionId(@NotNull String connectionId);
    }

    public interface AuthModeStage {
        ProviderConfigKeyStage authMode(@NotNull CredentialWebhookDtoAuthMode authMode);
    }

    public interface ProviderConfigKeyStage {
        ProviderStage providerConfigKey(@NotNull String providerConfigKey);
    }

    public interface ProviderStage {
        EnvironmentStage provider(@NotNull String provider);
    }

    public interface EnvironmentStage {
        SuccessStage environment(@NotNull String environment);
    }

    public interface SuccessStage {
        EndUserStage success(boolean success);
    }

    public interface EndUserStage {
        _FinalStage endUser(@NotNull CredentialEndUser endUser);
    }

    public interface _FinalStage {
        CredentialWebhookDto build();

        _FinalStage error(Optional<CredentialSessionError> error);

        _FinalStage error(CredentialSessionError error);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements TypeStage,
                    OperationStage,
                    FromStage,
                    ConnectionIdStage,
                    AuthModeStage,
                    ProviderConfigKeyStage,
                    ProviderStage,
                    EnvironmentStage,
                    SuccessStage,
                    EndUserStage,
                    _FinalStage {
        private CredentialWebhookDtoType type;

        private CredentialWebhookDtoOperation operation;

        private String from;

        private String connectionId;

        private CredentialWebhookDtoAuthMode authMode;

        private String providerConfigKey;

        private String provider;

        private String environment;

        private boolean success;

        private CredentialEndUser endUser;

        private Optional<CredentialSessionError> error = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CredentialWebhookDto other) {
            type(other.getType());
            operation(other.getOperation());
            from(other.getFrom());
            connectionId(other.getConnectionId());
            authMode(other.getAuthMode());
            providerConfigKey(other.getProviderConfigKey());
            provider(other.getProvider());
            environment(other.getEnvironment());
            success(other.getSuccess());
            endUser(other.getEndUser());
            error(other.getError());
            return this;
        }

        @java.lang.Override
        @JsonSetter("type")
        public OperationStage type(@NotNull CredentialWebhookDtoType type) {
            this.type = Objects.requireNonNull(type, "type must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("operation")
        public FromStage operation(@NotNull CredentialWebhookDtoOperation operation) {
            this.operation = Objects.requireNonNull(operation, "operation must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("from")
        public ConnectionIdStage from(@NotNull String from) {
            this.from = Objects.requireNonNull(from, "from must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("connectionId")
        public AuthModeStage connectionId(@NotNull String connectionId) {
            this.connectionId = Objects.requireNonNull(connectionId, "connectionId must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("authMode")
        public ProviderConfigKeyStage authMode(@NotNull CredentialWebhookDtoAuthMode authMode) {
            this.authMode = Objects.requireNonNull(authMode, "authMode must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("providerConfigKey")
        public ProviderStage providerConfigKey(@NotNull String providerConfigKey) {
            this.providerConfigKey = Objects.requireNonNull(providerConfigKey, "providerConfigKey must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("provider")
        public EnvironmentStage provider(@NotNull String provider) {
            this.provider = Objects.requireNonNull(provider, "provider must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("environment")
        public SuccessStage environment(@NotNull String environment) {
            this.environment = Objects.requireNonNull(environment, "environment must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("success")
        public EndUserStage success(boolean success) {
            this.success = success;
            return this;
        }

        @java.lang.Override
        @JsonSetter("endUser")
        public _FinalStage endUser(@NotNull CredentialEndUser endUser) {
            this.endUser = Objects.requireNonNull(endUser, "endUser must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage error(CredentialSessionError error) {
            this.error = Optional.ofNullable(error);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "error", nulls = Nulls.SKIP)
        public _FinalStage error(Optional<CredentialSessionError> error) {
            this.error = error;
            return this;
        }

        @java.lang.Override
        public CredentialWebhookDto build() {
            return new CredentialWebhookDto(
                    type,
                    operation,
                    from,
                    connectionId,
                    authMode,
                    providerConfigKey,
                    provider,
                    environment,
                    success,
                    endUser,
                    error,
                    additionalProperties);
        }
    }
}
