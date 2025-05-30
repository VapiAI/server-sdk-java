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
@JsonDeserialize(builder = ClientMessageHang.Builder.class)
public final class ClientMessageHang {
    private final Optional<ClientMessageHangPhoneNumber> phoneNumber;

    private final Optional<Double> timestamp;

    private final Optional<Call> call;

    private final Optional<CreateCustomerDto> customer;

    private final Optional<CreateAssistantDto> assistant;

    private final Map<String, Object> additionalProperties;

    private ClientMessageHang(
            Optional<ClientMessageHangPhoneNumber> phoneNumber,
            Optional<Double> timestamp,
            Optional<Call> call,
            Optional<CreateCustomerDto> customer,
            Optional<CreateAssistantDto> assistant,
            Map<String, Object> additionalProperties) {
        this.phoneNumber = phoneNumber;
        this.timestamp = timestamp;
        this.call = call;
        this.customer = customer;
        this.assistant = assistant;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the phone number that the message is associated with.
     */
    @JsonProperty("phoneNumber")
    public Optional<ClientMessageHangPhoneNumber> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @return This is the type of the message. &quot;hang&quot; is sent when the assistant is hanging due to a delay. The delay can be caused by many factors, such as:
     * <ul>
     * <li>the model is too slow to respond</li>
     * <li>the voice is too slow to respond</li>
     * <li>the tool call is still waiting for a response from your server</li>
     * <li>etc.</li>
     * </ul>
     */
    @JsonProperty("type")
    public String getType() {
        return "hang";
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

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientMessageHang && equalTo((ClientMessageHang) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientMessageHang other) {
        return phoneNumber.equals(other.phoneNumber)
                && timestamp.equals(other.timestamp)
                && call.equals(other.call)
                && customer.equals(other.customer)
                && assistant.equals(other.assistant);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.phoneNumber, this.timestamp, this.call, this.customer, this.assistant);
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
        private Optional<ClientMessageHangPhoneNumber> phoneNumber = Optional.empty();

        private Optional<Double> timestamp = Optional.empty();

        private Optional<Call> call = Optional.empty();

        private Optional<CreateCustomerDto> customer = Optional.empty();

        private Optional<CreateAssistantDto> assistant = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ClientMessageHang other) {
            phoneNumber(other.getPhoneNumber());
            timestamp(other.getTimestamp());
            call(other.getCall());
            customer(other.getCustomer());
            assistant(other.getAssistant());
            return this;
        }

        @JsonSetter(value = "phoneNumber", nulls = Nulls.SKIP)
        public Builder phoneNumber(Optional<ClientMessageHangPhoneNumber> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder phoneNumber(ClientMessageHangPhoneNumber phoneNumber) {
            this.phoneNumber = Optional.ofNullable(phoneNumber);
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

        public ClientMessageHang build() {
            return new ClientMessageHang(phoneNumber, timestamp, call, customer, assistant, additionalProperties);
        }
    }
}
