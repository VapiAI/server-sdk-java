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
@JsonDeserialize(builder = UpdateVapiPhoneNumberDto.Builder.class)
public final class UpdateVapiPhoneNumberDto {
    private final Optional<UpdateVapiPhoneNumberDtoFallbackDestination> fallbackDestination;

    private final Optional<List<PhoneNumberHookCallRinging>> hooks;

    private final Optional<String> name;

    private final Optional<String> assistantId;

    private final Optional<String> workflowId;

    private final Optional<String> squadId;

    private final Optional<Server> server;

    private final Optional<String> sipUri;

    private final Optional<SipAuthentication> authentication;

    private final Map<String, Object> additionalProperties;

    private UpdateVapiPhoneNumberDto(
            Optional<UpdateVapiPhoneNumberDtoFallbackDestination> fallbackDestination,
            Optional<List<PhoneNumberHookCallRinging>> hooks,
            Optional<String> name,
            Optional<String> assistantId,
            Optional<String> workflowId,
            Optional<String> squadId,
            Optional<Server> server,
            Optional<String> sipUri,
            Optional<SipAuthentication> authentication,
            Map<String, Object> additionalProperties) {
        this.fallbackDestination = fallbackDestination;
        this.hooks = hooks;
        this.name = name;
        this.assistantId = assistantId;
        this.workflowId = workflowId;
        this.squadId = squadId;
        this.server = server;
        this.sipUri = sipUri;
        this.authentication = authentication;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the fallback destination an inbound call will be transferred to if:
     * <ol>
     * <li><code>assistantId</code> is not set</li>
     * <li><code>squadId</code> is not set</li>
     * <li>and, <code>assistant-request</code> message to the <code>serverUrl</code> fails</li>
     * </ol>
     * <p>If this is not set and above conditions are met, the inbound call is hung up with an error message.</p>
     */
    @JsonProperty("fallbackDestination")
    public Optional<UpdateVapiPhoneNumberDtoFallbackDestination> getFallbackDestination() {
        return fallbackDestination;
    }

    /**
     * @return This is the hooks that will be used for incoming calls to this phone number.
     */
    @JsonProperty("hooks")
    public Optional<List<PhoneNumberHookCallRinging>> getHooks() {
        return hooks;
    }

    /**
     * @return This is the name of the phone number. This is just for your own reference.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return This is the assistant that will be used for incoming calls to this phone number.
     * <p>If neither <code>assistantId</code>, <code>squadId</code> nor <code>workflowId</code> is set, <code>assistant-request</code> will be sent to your Server URL. Check <code>ServerMessage</code> and <code>ServerMessageResponse</code> for the shape of the message and response that is expected.</p>
     */
    @JsonProperty("assistantId")
    public Optional<String> getAssistantId() {
        return assistantId;
    }

    /**
     * @return This is the workflow that will be used for incoming calls to this phone number.
     * <p>If neither <code>assistantId</code>, <code>squadId</code>, nor <code>workflowId</code> is set, <code>assistant-request</code> will be sent to your Server URL. Check <code>ServerMessage</code> and <code>ServerMessageResponse</code> for the shape of the message and response that is expected.</p>
     */
    @JsonProperty("workflowId")
    public Optional<String> getWorkflowId() {
        return workflowId;
    }

    /**
     * @return This is the squad that will be used for incoming calls to this phone number.
     * <p>If neither <code>assistantId</code>, <code>squadId</code>, nor <code>workflowId</code> is set, <code>assistant-request</code> will be sent to your Server URL. Check <code>ServerMessage</code> and <code>ServerMessageResponse</code> for the shape of the message and response that is expected.</p>
     */
    @JsonProperty("squadId")
    public Optional<String> getSquadId() {
        return squadId;
    }

    /**
     * @return This is where Vapi will send webhooks. You can find all webhooks available along with their shape in ServerMessage schema.
     * <p>The order of precedence is:</p>
     * <ol>
     * <li>assistant.server</li>
     * <li>phoneNumber.server</li>
     * <li>org.server</li>
     * </ol>
     */
    @JsonProperty("server")
    public Optional<Server> getServer() {
        return server;
    }

    /**
     * @return This is the SIP URI of the phone number. You can SIP INVITE this. The assistant attached to this number will answer.
     * <p>This is case-insensitive.</p>
     */
    @JsonProperty("sipUri")
    public Optional<String> getSipUri() {
        return sipUri;
    }

    /**
     * @return This enables authentication for incoming SIP INVITE requests to the <code>sipUri</code>.
     * <p>If not set, any username/password to the 401 challenge of the SIP INVITE will be accepted.</p>
     */
    @JsonProperty("authentication")
    public Optional<SipAuthentication> getAuthentication() {
        return authentication;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UpdateVapiPhoneNumberDto && equalTo((UpdateVapiPhoneNumberDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UpdateVapiPhoneNumberDto other) {
        return fallbackDestination.equals(other.fallbackDestination)
                && hooks.equals(other.hooks)
                && name.equals(other.name)
                && assistantId.equals(other.assistantId)
                && workflowId.equals(other.workflowId)
                && squadId.equals(other.squadId)
                && server.equals(other.server)
                && sipUri.equals(other.sipUri)
                && authentication.equals(other.authentication);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.fallbackDestination,
                this.hooks,
                this.name,
                this.assistantId,
                this.workflowId,
                this.squadId,
                this.server,
                this.sipUri,
                this.authentication);
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
        private Optional<UpdateVapiPhoneNumberDtoFallbackDestination> fallbackDestination = Optional.empty();

        private Optional<List<PhoneNumberHookCallRinging>> hooks = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<String> assistantId = Optional.empty();

        private Optional<String> workflowId = Optional.empty();

        private Optional<String> squadId = Optional.empty();

        private Optional<Server> server = Optional.empty();

        private Optional<String> sipUri = Optional.empty();

        private Optional<SipAuthentication> authentication = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(UpdateVapiPhoneNumberDto other) {
            fallbackDestination(other.getFallbackDestination());
            hooks(other.getHooks());
            name(other.getName());
            assistantId(other.getAssistantId());
            workflowId(other.getWorkflowId());
            squadId(other.getSquadId());
            server(other.getServer());
            sipUri(other.getSipUri());
            authentication(other.getAuthentication());
            return this;
        }

        @JsonSetter(value = "fallbackDestination", nulls = Nulls.SKIP)
        public Builder fallbackDestination(Optional<UpdateVapiPhoneNumberDtoFallbackDestination> fallbackDestination) {
            this.fallbackDestination = fallbackDestination;
            return this;
        }

        public Builder fallbackDestination(UpdateVapiPhoneNumberDtoFallbackDestination fallbackDestination) {
            this.fallbackDestination = Optional.ofNullable(fallbackDestination);
            return this;
        }

        @JsonSetter(value = "hooks", nulls = Nulls.SKIP)
        public Builder hooks(Optional<List<PhoneNumberHookCallRinging>> hooks) {
            this.hooks = hooks;
            return this;
        }

        public Builder hooks(List<PhoneNumberHookCallRinging> hooks) {
            this.hooks = Optional.ofNullable(hooks);
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @JsonSetter(value = "assistantId", nulls = Nulls.SKIP)
        public Builder assistantId(Optional<String> assistantId) {
            this.assistantId = assistantId;
            return this;
        }

        public Builder assistantId(String assistantId) {
            this.assistantId = Optional.ofNullable(assistantId);
            return this;
        }

        @JsonSetter(value = "workflowId", nulls = Nulls.SKIP)
        public Builder workflowId(Optional<String> workflowId) {
            this.workflowId = workflowId;
            return this;
        }

        public Builder workflowId(String workflowId) {
            this.workflowId = Optional.ofNullable(workflowId);
            return this;
        }

        @JsonSetter(value = "squadId", nulls = Nulls.SKIP)
        public Builder squadId(Optional<String> squadId) {
            this.squadId = squadId;
            return this;
        }

        public Builder squadId(String squadId) {
            this.squadId = Optional.ofNullable(squadId);
            return this;
        }

        @JsonSetter(value = "server", nulls = Nulls.SKIP)
        public Builder server(Optional<Server> server) {
            this.server = server;
            return this;
        }

        public Builder server(Server server) {
            this.server = Optional.ofNullable(server);
            return this;
        }

        @JsonSetter(value = "sipUri", nulls = Nulls.SKIP)
        public Builder sipUri(Optional<String> sipUri) {
            this.sipUri = sipUri;
            return this;
        }

        public Builder sipUri(String sipUri) {
            this.sipUri = Optional.ofNullable(sipUri);
            return this;
        }

        @JsonSetter(value = "authentication", nulls = Nulls.SKIP)
        public Builder authentication(Optional<SipAuthentication> authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder authentication(SipAuthentication authentication) {
            this.authentication = Optional.ofNullable(authentication);
            return this;
        }

        public UpdateVapiPhoneNumberDto build() {
            return new UpdateVapiPhoneNumberDto(
                    fallbackDestination,
                    hooks,
                    name,
                    assistantId,
                    workflowId,
                    squadId,
                    server,
                    sipUri,
                    authentication,
                    additionalProperties);
        }
    }
}
