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
@JsonDeserialize(builder = ServerMessageLanguageChangeDetected.Builder.class)
public final class ServerMessageLanguageChangeDetected {
    private final Optional<ServerMessageLanguageChangeDetectedPhoneNumber> phoneNumber;

    private final Optional<Double> timestamp;

    private final Optional<Artifact> artifact;

    private final Optional<CreateAssistantDto> assistant;

    private final Optional<CreateCustomerDto> customer;

    private final Optional<Call> call;

    private final String language;

    private final Map<String, Object> additionalProperties;

    private ServerMessageLanguageChangeDetected(
            Optional<ServerMessageLanguageChangeDetectedPhoneNumber> phoneNumber,
            Optional<Double> timestamp,
            Optional<Artifact> artifact,
            Optional<CreateAssistantDto> assistant,
            Optional<CreateCustomerDto> customer,
            Optional<Call> call,
            String language,
            Map<String, Object> additionalProperties) {
        this.phoneNumber = phoneNumber;
        this.timestamp = timestamp;
        this.artifact = artifact;
        this.assistant = assistant;
        this.customer = customer;
        this.call = call;
        this.language = language;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the phone number that the message is associated with.
     */
    @JsonProperty("phoneNumber")
    public Optional<ServerMessageLanguageChangeDetectedPhoneNumber> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @return This is the type of the message. &quot;language-change-detected&quot; is sent when the transcriber is automatically switched based on the detected language.
     */
    @JsonProperty("type")
    public String getType() {
        return "language-change-detected";
    }

    /**
     * @return This is the timestamp of the message.
     */
    @JsonProperty("timestamp")
    public Optional<Double> getTimestamp() {
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
     * @return This is the assistant that the message is associated with.
     */
    @JsonProperty("assistant")
    public Optional<CreateAssistantDto> getAssistant() {
        return assistant;
    }

    /**
     * @return This is the customer that the message is associated with.
     */
    @JsonProperty("customer")
    public Optional<CreateCustomerDto> getCustomer() {
        return customer;
    }

    /**
     * @return This is the call that the message is associated with.
     */
    @JsonProperty("call")
    public Optional<Call> getCall() {
        return call;
    }

    /**
     * @return This is the language the transcriber is switched to.
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ServerMessageLanguageChangeDetected
                && equalTo((ServerMessageLanguageChangeDetected) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ServerMessageLanguageChangeDetected other) {
        return phoneNumber.equals(other.phoneNumber)
                && timestamp.equals(other.timestamp)
                && artifact.equals(other.artifact)
                && assistant.equals(other.assistant)
                && customer.equals(other.customer)
                && call.equals(other.call)
                && language.equals(other.language);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.phoneNumber,
                this.timestamp,
                this.artifact,
                this.assistant,
                this.customer,
                this.call,
                this.language);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static LanguageStage builder() {
        return new Builder();
    }

    public interface LanguageStage {
        _FinalStage language(@NotNull String language);

        Builder from(ServerMessageLanguageChangeDetected other);
    }

    public interface _FinalStage {
        ServerMessageLanguageChangeDetected build();

        _FinalStage phoneNumber(Optional<ServerMessageLanguageChangeDetectedPhoneNumber> phoneNumber);

        _FinalStage phoneNumber(ServerMessageLanguageChangeDetectedPhoneNumber phoneNumber);

        _FinalStage timestamp(Optional<Double> timestamp);

        _FinalStage timestamp(Double timestamp);

        _FinalStage artifact(Optional<Artifact> artifact);

        _FinalStage artifact(Artifact artifact);

        _FinalStage assistant(Optional<CreateAssistantDto> assistant);

        _FinalStage assistant(CreateAssistantDto assistant);

        _FinalStage customer(Optional<CreateCustomerDto> customer);

        _FinalStage customer(CreateCustomerDto customer);

        _FinalStage call(Optional<Call> call);

        _FinalStage call(Call call);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements LanguageStage, _FinalStage {
        private String language;

        private Optional<Call> call = Optional.empty();

        private Optional<CreateCustomerDto> customer = Optional.empty();

        private Optional<CreateAssistantDto> assistant = Optional.empty();

        private Optional<Artifact> artifact = Optional.empty();

        private Optional<Double> timestamp = Optional.empty();

        private Optional<ServerMessageLanguageChangeDetectedPhoneNumber> phoneNumber = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ServerMessageLanguageChangeDetected other) {
            phoneNumber(other.getPhoneNumber());
            timestamp(other.getTimestamp());
            artifact(other.getArtifact());
            assistant(other.getAssistant());
            customer(other.getCustomer());
            call(other.getCall());
            language(other.getLanguage());
            return this;
        }

        /**
         * <p>This is the language the transcriber is switched to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("language")
        public _FinalStage language(@NotNull String language) {
            this.language = Objects.requireNonNull(language, "language must not be null");
            return this;
        }

        /**
         * <p>This is the call that the message is associated with.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage call(Call call) {
            this.call = Optional.ofNullable(call);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "call", nulls = Nulls.SKIP)
        public _FinalStage call(Optional<Call> call) {
            this.call = call;
            return this;
        }

        /**
         * <p>This is the customer that the message is associated with.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage customer(CreateCustomerDto customer) {
            this.customer = Optional.ofNullable(customer);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "customer", nulls = Nulls.SKIP)
        public _FinalStage customer(Optional<CreateCustomerDto> customer) {
            this.customer = customer;
            return this;
        }

        /**
         * <p>This is the assistant that the message is associated with.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage assistant(CreateAssistantDto assistant) {
            this.assistant = Optional.ofNullable(assistant);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "assistant", nulls = Nulls.SKIP)
        public _FinalStage assistant(Optional<CreateAssistantDto> assistant) {
            this.assistant = assistant;
            return this;
        }

        /**
         * <p>This is a live version of the <code>call.artifact</code>.</p>
         * <p>This matches what is stored on <code>call.artifact</code> after the call.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage artifact(Artifact artifact) {
            this.artifact = Optional.ofNullable(artifact);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "artifact", nulls = Nulls.SKIP)
        public _FinalStage artifact(Optional<Artifact> artifact) {
            this.artifact = artifact;
            return this;
        }

        /**
         * <p>This is the timestamp of the message.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage timestamp(Double timestamp) {
            this.timestamp = Optional.ofNullable(timestamp);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "timestamp", nulls = Nulls.SKIP)
        public _FinalStage timestamp(Optional<Double> timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * <p>This is the phone number that the message is associated with.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage phoneNumber(ServerMessageLanguageChangeDetectedPhoneNumber phoneNumber) {
            this.phoneNumber = Optional.ofNullable(phoneNumber);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "phoneNumber", nulls = Nulls.SKIP)
        public _FinalStage phoneNumber(Optional<ServerMessageLanguageChangeDetectedPhoneNumber> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        @java.lang.Override
        public ServerMessageLanguageChangeDetected build() {
            return new ServerMessageLanguageChangeDetected(
                    phoneNumber, timestamp, artifact, assistant, customer, call, language, additionalProperties);
        }
    }
}
