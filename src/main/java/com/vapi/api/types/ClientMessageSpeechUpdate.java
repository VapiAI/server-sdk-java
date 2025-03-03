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
@JsonDeserialize(builder = ClientMessageSpeechUpdate.Builder.class)
public final class ClientMessageSpeechUpdate {
    private final ClientMessageSpeechUpdateStatus status;

    private final ClientMessageSpeechUpdateRole role;

    private final Map<String, Object> additionalProperties;

    private ClientMessageSpeechUpdate(
            ClientMessageSpeechUpdateStatus status,
            ClientMessageSpeechUpdateRole role,
            Map<String, Object> additionalProperties) {
        this.status = status;
        this.role = role;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the type of the message. &quot;speech-update&quot; is sent whenever assistant or user start or stop speaking.
     */
    @JsonProperty("type")
    public String getType() {
        return "speech-update";
    }

    /**
     * @return This is the status of the speech update.
     */
    @JsonProperty("status")
    public ClientMessageSpeechUpdateStatus getStatus() {
        return status;
    }

    /**
     * @return This is the role which the speech update is for.
     */
    @JsonProperty("role")
    public ClientMessageSpeechUpdateRole getRole() {
        return role;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientMessageSpeechUpdate && equalTo((ClientMessageSpeechUpdate) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientMessageSpeechUpdate other) {
        return status.equals(other.status) && role.equals(other.role);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.status, this.role);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static StatusStage builder() {
        return new Builder();
    }

    public interface StatusStage {
        RoleStage status(@NotNull ClientMessageSpeechUpdateStatus status);

        Builder from(ClientMessageSpeechUpdate other);
    }

    public interface RoleStage {
        _FinalStage role(@NotNull ClientMessageSpeechUpdateRole role);
    }

    public interface _FinalStage {
        ClientMessageSpeechUpdate build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements StatusStage, RoleStage, _FinalStage {
        private ClientMessageSpeechUpdateStatus status;

        private ClientMessageSpeechUpdateRole role;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ClientMessageSpeechUpdate other) {
            status(other.getStatus());
            role(other.getRole());
            return this;
        }

        /**
         * <p>This is the status of the speech update.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("status")
        public RoleStage status(@NotNull ClientMessageSpeechUpdateStatus status) {
            this.status = Objects.requireNonNull(status, "status must not be null");
            return this;
        }

        /**
         * <p>This is the role which the speech update is for.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("role")
        public _FinalStage role(@NotNull ClientMessageSpeechUpdateRole role) {
            this.role = Objects.requireNonNull(role, "role must not be null");
            return this;
        }

        @java.lang.Override
        public ClientMessageSpeechUpdate build() {
            return new ClientMessageSpeechUpdate(status, role, additionalProperties);
        }
    }
}
