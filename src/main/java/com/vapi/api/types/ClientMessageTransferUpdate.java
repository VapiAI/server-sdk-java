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
@JsonDeserialize(builder = ClientMessageTransferUpdate.Builder.class)
public final class ClientMessageTransferUpdate {
    private final Optional<ClientMessageTransferUpdatePhoneNumber> phoneNumber;

    private final Optional<ClientMessageTransferUpdateDestination> destination;

    private final Optional<Double> timestamp;

    private final Optional<Call> call;

    private final Optional<CreateCustomerDto> customer;

    private final Optional<CreateAssistantDto> assistant;

    private final Optional<CreateAssistantDto> toAssistant;

    private final Optional<CreateAssistantDto> fromAssistant;

    private final Optional<Map<String, Object>> toStepRecord;

    private final Optional<Map<String, Object>> fromStepRecord;

    private final Map<String, Object> additionalProperties;

    private ClientMessageTransferUpdate(
            Optional<ClientMessageTransferUpdatePhoneNumber> phoneNumber,
            Optional<ClientMessageTransferUpdateDestination> destination,
            Optional<Double> timestamp,
            Optional<Call> call,
            Optional<CreateCustomerDto> customer,
            Optional<CreateAssistantDto> assistant,
            Optional<CreateAssistantDto> toAssistant,
            Optional<CreateAssistantDto> fromAssistant,
            Optional<Map<String, Object>> toStepRecord,
            Optional<Map<String, Object>> fromStepRecord,
            Map<String, Object> additionalProperties) {
        this.phoneNumber = phoneNumber;
        this.destination = destination;
        this.timestamp = timestamp;
        this.call = call;
        this.customer = customer;
        this.assistant = assistant;
        this.toAssistant = toAssistant;
        this.fromAssistant = fromAssistant;
        this.toStepRecord = toStepRecord;
        this.fromStepRecord = fromStepRecord;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the phone number that the message is associated with.
     */
    @JsonProperty("phoneNumber")
    public Optional<ClientMessageTransferUpdatePhoneNumber> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @return This is the type of the message. &quot;transfer-update&quot; is sent whenever a transfer happens.
     */
    @JsonProperty("type")
    public String getType() {
        return "transfer-update";
    }

    /**
     * @return This is the destination of the transfer.
     */
    @JsonProperty("destination")
    public Optional<ClientMessageTransferUpdateDestination> getDestination() {
        return destination;
    }

    /**
     * @return This is the timestamp of the message.
     */
    @JsonProperty("timestamp")
    public Optional<Double> getTimestamp() {
        return timestamp;
    }

    /**
     * @return This is the call that the message is associated with.
     */
    @JsonProperty("call")
    public Optional<Call> getCall() {
        return call;
    }

    /**
     * @return This is the customer that the message is associated with.
     */
    @JsonProperty("customer")
    public Optional<CreateCustomerDto> getCustomer() {
        return customer;
    }

    /**
     * @return This is the assistant that the message is associated with.
     */
    @JsonProperty("assistant")
    public Optional<CreateAssistantDto> getAssistant() {
        return assistant;
    }

    /**
     * @return This is the assistant that the call is being transferred to. This is only sent if <code>destination.type</code> is &quot;assistant&quot;.
     */
    @JsonProperty("toAssistant")
    public Optional<CreateAssistantDto> getToAssistant() {
        return toAssistant;
    }

    /**
     * @return This is the assistant that the call is being transferred from. This is only sent if <code>destination.type</code> is &quot;assistant&quot;.
     */
    @JsonProperty("fromAssistant")
    public Optional<CreateAssistantDto> getFromAssistant() {
        return fromAssistant;
    }

    /**
     * @return This is the step that the conversation moved to.
     */
    @JsonProperty("toStepRecord")
    public Optional<Map<String, Object>> getToStepRecord() {
        return toStepRecord;
    }

    /**
     * @return This is the step that the conversation moved from. =
     */
    @JsonProperty("fromStepRecord")
    public Optional<Map<String, Object>> getFromStepRecord() {
        return fromStepRecord;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientMessageTransferUpdate && equalTo((ClientMessageTransferUpdate) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientMessageTransferUpdate other) {
        return phoneNumber.equals(other.phoneNumber)
                && destination.equals(other.destination)
                && timestamp.equals(other.timestamp)
                && call.equals(other.call)
                && customer.equals(other.customer)
                && assistant.equals(other.assistant)
                && toAssistant.equals(other.toAssistant)
                && fromAssistant.equals(other.fromAssistant)
                && toStepRecord.equals(other.toStepRecord)
                && fromStepRecord.equals(other.fromStepRecord);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.phoneNumber,
                this.destination,
                this.timestamp,
                this.call,
                this.customer,
                this.assistant,
                this.toAssistant,
                this.fromAssistant,
                this.toStepRecord,
                this.fromStepRecord);
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
        private Optional<ClientMessageTransferUpdatePhoneNumber> phoneNumber = Optional.empty();

        private Optional<ClientMessageTransferUpdateDestination> destination = Optional.empty();

        private Optional<Double> timestamp = Optional.empty();

        private Optional<Call> call = Optional.empty();

        private Optional<CreateCustomerDto> customer = Optional.empty();

        private Optional<CreateAssistantDto> assistant = Optional.empty();

        private Optional<CreateAssistantDto> toAssistant = Optional.empty();

        private Optional<CreateAssistantDto> fromAssistant = Optional.empty();

        private Optional<Map<String, Object>> toStepRecord = Optional.empty();

        private Optional<Map<String, Object>> fromStepRecord = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ClientMessageTransferUpdate other) {
            phoneNumber(other.getPhoneNumber());
            destination(other.getDestination());
            timestamp(other.getTimestamp());
            call(other.getCall());
            customer(other.getCustomer());
            assistant(other.getAssistant());
            toAssistant(other.getToAssistant());
            fromAssistant(other.getFromAssistant());
            toStepRecord(other.getToStepRecord());
            fromStepRecord(other.getFromStepRecord());
            return this;
        }

        @JsonSetter(value = "phoneNumber", nulls = Nulls.SKIP)
        public Builder phoneNumber(Optional<ClientMessageTransferUpdatePhoneNumber> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder phoneNumber(ClientMessageTransferUpdatePhoneNumber phoneNumber) {
            this.phoneNumber = Optional.ofNullable(phoneNumber);
            return this;
        }

        @JsonSetter(value = "destination", nulls = Nulls.SKIP)
        public Builder destination(Optional<ClientMessageTransferUpdateDestination> destination) {
            this.destination = destination;
            return this;
        }

        public Builder destination(ClientMessageTransferUpdateDestination destination) {
            this.destination = Optional.ofNullable(destination);
            return this;
        }

        @JsonSetter(value = "timestamp", nulls = Nulls.SKIP)
        public Builder timestamp(Optional<Double> timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder timestamp(Double timestamp) {
            this.timestamp = Optional.ofNullable(timestamp);
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

        @JsonSetter(value = "customer", nulls = Nulls.SKIP)
        public Builder customer(Optional<CreateCustomerDto> customer) {
            this.customer = customer;
            return this;
        }

        public Builder customer(CreateCustomerDto customer) {
            this.customer = Optional.ofNullable(customer);
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

        @JsonSetter(value = "toAssistant", nulls = Nulls.SKIP)
        public Builder toAssistant(Optional<CreateAssistantDto> toAssistant) {
            this.toAssistant = toAssistant;
            return this;
        }

        public Builder toAssistant(CreateAssistantDto toAssistant) {
            this.toAssistant = Optional.ofNullable(toAssistant);
            return this;
        }

        @JsonSetter(value = "fromAssistant", nulls = Nulls.SKIP)
        public Builder fromAssistant(Optional<CreateAssistantDto> fromAssistant) {
            this.fromAssistant = fromAssistant;
            return this;
        }

        public Builder fromAssistant(CreateAssistantDto fromAssistant) {
            this.fromAssistant = Optional.ofNullable(fromAssistant);
            return this;
        }

        @JsonSetter(value = "toStepRecord", nulls = Nulls.SKIP)
        public Builder toStepRecord(Optional<Map<String, Object>> toStepRecord) {
            this.toStepRecord = toStepRecord;
            return this;
        }

        public Builder toStepRecord(Map<String, Object> toStepRecord) {
            this.toStepRecord = Optional.ofNullable(toStepRecord);
            return this;
        }

        @JsonSetter(value = "fromStepRecord", nulls = Nulls.SKIP)
        public Builder fromStepRecord(Optional<Map<String, Object>> fromStepRecord) {
            this.fromStepRecord = fromStepRecord;
            return this;
        }

        public Builder fromStepRecord(Map<String, Object> fromStepRecord) {
            this.fromStepRecord = Optional.ofNullable(fromStepRecord);
            return this;
        }

        public ClientMessageTransferUpdate build() {
            return new ClientMessageTransferUpdate(
                    phoneNumber,
                    destination,
                    timestamp,
                    call,
                    customer,
                    assistant,
                    toAssistant,
                    fromAssistant,
                    toStepRecord,
                    fromStepRecord,
                    additionalProperties);
        }
    }
}
