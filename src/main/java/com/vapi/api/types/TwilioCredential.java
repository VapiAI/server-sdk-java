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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = TwilioCredential.Builder.class)
public final class TwilioCredential {
    private final String authToken;

    private final String id;

    private final String orgId;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Optional<String> name;

    private final String accountSid;

    private final Map<String, Object> additionalProperties;

    private TwilioCredential(
            String authToken,
            String id,
            String orgId,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Optional<String> name,
            String accountSid,
            Map<String, Object> additionalProperties) {
        this.authToken = authToken;
        this.id = id;
        this.orgId = orgId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.name = name;
        this.accountSid = accountSid;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("provider")
    public String getProvider() {
        return "twilio";
    }

    /**
     * @return This is not returned in the API.
     */
    @JsonProperty("authToken")
    public String getAuthToken() {
        return authToken;
    }

    /**
     * @return This is the unique identifier for the credential.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return This is the unique identifier for the org that this credential belongs to.
     */
    @JsonProperty("orgId")
    public String getOrgId() {
        return orgId;
    }

    /**
     * @return This is the ISO 8601 date-time string of when the credential was created.
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * @return This is the ISO 8601 date-time string of when the assistant was last updated.
     */
    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @return This is the name of credential. This is just for your reference.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("accountSid")
    public String getAccountSid() {
        return accountSid;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TwilioCredential && equalTo((TwilioCredential) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TwilioCredential other) {
        return authToken.equals(other.authToken)
                && id.equals(other.id)
                && orgId.equals(other.orgId)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt)
                && name.equals(other.name)
                && accountSid.equals(other.accountSid);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.authToken, this.id, this.orgId, this.createdAt, this.updatedAt, this.name, this.accountSid);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AuthTokenStage builder() {
        return new Builder();
    }

    public interface AuthTokenStage {
        IdStage authToken(@NotNull String authToken);

        Builder from(TwilioCredential other);
    }

    public interface IdStage {
        OrgIdStage id(@NotNull String id);
    }

    public interface OrgIdStage {
        CreatedAtStage orgId(@NotNull String orgId);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(@NotNull OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        AccountSidStage updatedAt(@NotNull OffsetDateTime updatedAt);
    }

    public interface AccountSidStage {
        _FinalStage accountSid(@NotNull String accountSid);
    }

    public interface _FinalStage {
        TwilioCredential build();

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements AuthTokenStage,
                    IdStage,
                    OrgIdStage,
                    CreatedAtStage,
                    UpdatedAtStage,
                    AccountSidStage,
                    _FinalStage {
        private String authToken;

        private String id;

        private String orgId;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private String accountSid;

        private Optional<String> name = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TwilioCredential other) {
            authToken(other.getAuthToken());
            id(other.getId());
            orgId(other.getOrgId());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            name(other.getName());
            accountSid(other.getAccountSid());
            return this;
        }

        /**
         * <p>This is not returned in the API.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("authToken")
        public IdStage authToken(@NotNull String authToken) {
            this.authToken = Objects.requireNonNull(authToken, "authToken must not be null");
            return this;
        }

        /**
         * <p>This is the unique identifier for the credential.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public OrgIdStage id(@NotNull String id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        /**
         * <p>This is the unique identifier for the org that this credential belongs to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("orgId")
        public CreatedAtStage orgId(@NotNull String orgId) {
            this.orgId = Objects.requireNonNull(orgId, "orgId must not be null");
            return this;
        }

        /**
         * <p>This is the ISO 8601 date-time string of when the credential was created.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(@NotNull OffsetDateTime createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt, "createdAt must not be null");
            return this;
        }

        /**
         * <p>This is the ISO 8601 date-time string of when the assistant was last updated.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("updatedAt")
        public AccountSidStage updatedAt(@NotNull OffsetDateTime updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt, "updatedAt must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("accountSid")
        public _FinalStage accountSid(@NotNull String accountSid) {
            this.accountSid = Objects.requireNonNull(accountSid, "accountSid must not be null");
            return this;
        }

        /**
         * <p>This is the name of credential. This is just for your reference.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public _FinalStage name(Optional<String> name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        public TwilioCredential build() {
            return new TwilioCredential(
                    authToken, id, orgId, createdAt, updatedAt, name, accountSid, additionalProperties);
        }
    }
}
