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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ServerMessageModelOutput.Builder.class)
public final class ServerMessageModelOutput {
    private final Optional<ServerMessageModelOutputPhoneNumber> phoneNumber;

    private final Optional<String> timestamp;

    private final Optional<Artifact> artifact;

    private final Optional<CreateAssistantDto> assistant;

    private final Optional<CreateCustomerDto> customer;

    private final Optional<Call> call;

    private final Map<String, Object> output;

    private final Map<String, Object> additionalProperties;

    private ServerMessageModelOutput(
            Optional<ServerMessageModelOutputPhoneNumber> phoneNumber,
            Optional<String> timestamp,
            Optional<Artifact> artifact,
            Optional<CreateAssistantDto> assistant,
            Optional<CreateCustomerDto> customer,
            Optional<Call> call,
            Map<String, Object> output,
            Map<String, Object> additionalProperties) {
        this.phoneNumber = phoneNumber;
        this.timestamp = timestamp;
        this.artifact = artifact;
        this.assistant = assistant;
        this.customer = customer;
        this.call = call;
        this.output = output;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the phone number associated with the call.
     * <p>This matches one of the following:</p>
     * <ul>
     * <li><code>call.phoneNumber</code>,</li>
     * <li><code>call.phoneNumberId</code>.</li>
     * </ul>
     */
    @JsonProperty("phoneNumber")
    public Optional<ServerMessageModelOutputPhoneNumber> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @return This is the type of the message. &quot;model-output&quot; is sent as the model outputs tokens.
     */
    @JsonProperty("type")
    public String getType() {
        return "model-output";
    }

    /**
     * @return This is the ISO-8601 formatted timestamp of when the message was sent.
     */
    @JsonProperty("timestamp")
    public Optional<String> getTimestamp() {
        return timestamp;
    }

    /**
     * @return This is a live version of the <code>call.artifact</code>.
     * <p>This matches what is stored on <code>call.artifact</code> after the call.</p>
     */
    @JsonProperty("artifact")
    public Optional<Artifact> getArtifact() {
        return artifact;
    }

    /**
     * @return This is the assistant that is currently active. This is provided for convenience.
     * <p>This matches one of the following:</p>
     * <ul>
     * <li><code>call.assistant</code>,</li>
     * <li><code>call.assistantId</code>,</li>
     * <li><code>call.squad[n].assistant</code>,</li>
     * <li><code>call.squad[n].assistantId</code>,</li>
     * <li><code>call.squadId-&gt;[n].assistant</code>,</li>
     * <li><code>call.squadId-&gt;[n].assistantId</code>.</li>
     * </ul>
     */
    @JsonProperty("assistant")
    public Optional<CreateAssistantDto> getAssistant() {
        return assistant;
    }

    /**
     * @return This is the customer associated with the call.
     * <p>This matches one of the following:</p>
     * <ul>
     * <li><code>call.customer</code>,</li>
     * <li><code>call.customerId</code>.</li>
     * </ul>
     */
    @JsonProperty("customer")
    public Optional<CreateCustomerDto> getCustomer() {
        return customer;
    }

    /**
     * @return This is the call object.
     * <p>This matches what was returned in POST /call.</p>
     * <p>Note: This might get stale during the call. To get the latest call object, especially after the call is ended, use GET /call/:id.</p>
     */
    @JsonProperty("call")
    public Optional<Call> getCall() {
        return call;
    }

    /**
     * @return This is the output of the model. It can be a token or tool call.
     */
    @JsonProperty("output")
    public Map<String, Object> getOutput() {
        return output;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ServerMessageModelOutput && equalTo((ServerMessageModelOutput) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ServerMessageModelOutput other) {
        return phoneNumber.equals(other.phoneNumber)
                && timestamp.equals(other.timestamp)
                && artifact.equals(other.artifact)
                && assistant.equals(other.assistant)
                && customer.equals(other.customer)
                && call.equals(other.call)
                && output.equals(other.output);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.phoneNumber, this.timestamp, this.artifact, this.assistant, this.customer, this.call, this.output);
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
        private Optional<ServerMessageModelOutputPhoneNumber> phoneNumber = Optional.empty();

        private Optional<String> timestamp = Optional.empty();

        private Optional<Artifact> artifact = Optional.empty();

        private Optional<CreateAssistantDto> assistant = Optional.empty();

        private Optional<CreateCustomerDto> customer = Optional.empty();

        private Optional<Call> call = Optional.empty();

        private Map<String, Object> output = new LinkedHashMap<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ServerMessageModelOutput other) {
            phoneNumber(other.getPhoneNumber());
            timestamp(other.getTimestamp());
            artifact(other.getArtifact());
            assistant(other.getAssistant());
            customer(other.getCustomer());
            call(other.getCall());
            output(other.getOutput());
            return this;
        }

        @JsonSetter(value = "phoneNumber", nulls = Nulls.SKIP)
        public Builder phoneNumber(Optional<ServerMessageModelOutputPhoneNumber> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder phoneNumber(ServerMessageModelOutputPhoneNumber phoneNumber) {
            this.phoneNumber = Optional.ofNullable(phoneNumber);
            return this;
        }

        @JsonSetter(value = "timestamp", nulls = Nulls.SKIP)
        public Builder timestamp(Optional<String> timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder timestamp(String timestamp) {
            this.timestamp = Optional.ofNullable(timestamp);
            return this;
        }

        @JsonSetter(value = "artifact", nulls = Nulls.SKIP)
        public Builder artifact(Optional<Artifact> artifact) {
            this.artifact = artifact;
            return this;
        }

        public Builder artifact(Artifact artifact) {
            this.artifact = Optional.ofNullable(artifact);
            return this;
        }

        @JsonSetter(value = "assistant", nulls = Nulls.SKIP)
        public Builder assistant(Optional<CreateAssistantDto> assistant) {
            this.assistant = assistant;
            return this;
        }

        public Builder assistant(CreateAssistantDto assistant) {
            this.assistant = Optional.ofNullable(assistant);
            return this;
        }

        @JsonSetter(value = "customer", nulls = Nulls.SKIP)
        public Builder customer(Optional<CreateCustomerDto> customer) {
            this.customer = customer;
            return this;
        }

        public Builder customer(CreateCustomerDto customer) {
            this.customer = Optional.ofNullable(customer);
            return this;
        }

        @JsonSetter(value = "call", nulls = Nulls.SKIP)
        public Builder call(Optional<Call> call) {
            this.call = call;
            return this;
        }

        public Builder call(Call call) {
            this.call = Optional.ofNullable(call);
            return this;
        }

        @JsonSetter(value = "output", nulls = Nulls.SKIP)
        public Builder output(Map<String, Object> output) {
            this.output.clear();
            this.output.putAll(output);
            return this;
        }

        public Builder putAllOutput(Map<String, Object> output) {
            this.output.putAll(output);
            return this;
        }

        public Builder output(String key, Object value) {
            this.output.put(key, value);
            return this;
        }

        public ServerMessageModelOutput build() {
            return new ServerMessageModelOutput(
                    phoneNumber, timestamp, artifact, assistant, customer, call, output, additionalProperties);
        }
    }
}
