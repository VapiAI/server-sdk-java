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
@JsonDeserialize(builder = TransferDestinationNumber.Builder.class)
public final class TransferDestinationNumber {
    private final Optional<Boolean> numberE164CheckEnabled;

    private final String number;

    private final Optional<String> extension;

    private final Optional<String> callerId;

    private final Optional<String> message;

    private final Optional<String> description;

    private final Map<String, Object> additionalProperties;

    private TransferDestinationNumber(
            Optional<Boolean> numberE164CheckEnabled,
            String number,
            Optional<String> extension,
            Optional<String> callerId,
            Optional<String> message,
            Optional<String> description,
            Map<String, Object> additionalProperties) {
        this.numberE164CheckEnabled = numberE164CheckEnabled;
        this.number = number;
        this.extension = extension;
        this.callerId = callerId;
        this.message = message;
        this.description = description;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the flag to toggle the E164 check for the <code>number</code> field. This is an advanced property which should be used if you know your use case requires it.
     * <p>Use cases:</p>
     * <ul>
     * <li><code>false</code>: To allow non-E164 numbers like <code>+001234567890</code>, <code>1234</code>, or <code>abc</code>. This is useful for dialing out to non-E164 numbers on your SIP trunks.</li>
     * <li><code>true</code> (default): To allow only E164 numbers like <code>+14155551234</code>. This is standard for PSTN calls.</li>
     * </ul>
     * <p>If <code>false</code>, the <code>number</code> is still required to only contain alphanumeric characters (regex: <code>/^\+?[a-zA-Z0-9]+$/</code>).</p>
     * <p>@default true (E164 check is enabled)</p>
     */
    @JsonProperty("numberE164CheckEnabled")
    public Optional<Boolean> getNumberE164CheckEnabled() {
        return numberE164CheckEnabled;
    }

    /**
     * @return This is the phone number to transfer the call to.
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * @return This is the extension to dial after transferring the call to the <code>number</code>.
     */
    @JsonProperty("extension")
    public Optional<String> getExtension() {
        return extension;
    }

    /**
     * @return This is the caller ID to use when transferring the call to the <code>number</code>.
     * <p>Usage:</p>
     * <ul>
     * <li>If not provided, the caller ID will be the number the call is coming from. Example, +14151111111 calls in to and the assistant transfers out to +16470000000. +16470000000 will see +14151111111 as the caller.</li>
     * <li>To change this behavior, provide a <code>callerId</code>.</li>
     * <li>Set to '{{customer.number}}' to always use the customer's number as the caller ID.</li>
     * <li>Set to '{{phoneNumber.number}}' to always use the phone number of the assistant as the caller ID.</li>
     * <li>Set to any E164 number to always use that number as the caller ID. This needs to be a number that is owned or verified by your Transport provider like Twilio.</li>
     * </ul>
     * <p>For Twilio, you can read up more here: https://www.twilio.com/docs/voice/twiml/dial#callerid</p>
     */
    @JsonProperty("callerId")
    public Optional<String> getCallerId() {
        return callerId;
    }

    /**
     * @return This is the message to say before transferring the call to the destination.
     * <p>If this is not provided and transfer tool messages is not provided, default is &quot;Transferring the call now&quot;.</p>
     * <p>If set to &quot;&quot;, nothing is spoken. This is useful when you want to silently transfer. This is especially useful when transferring between assistants in a squad. In this scenario, you likely also want to set <code>assistant.firstMessageMode=assistant-speaks-first-with-model-generated-message</code> for the destination assistant.</p>
     */
    @JsonProperty("message")
    public Optional<String> getMessage() {
        return message;
    }

    /**
     * @return This is the description of the destination, used by the AI to choose when and how to transfer the call.
     */
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TransferDestinationNumber && equalTo((TransferDestinationNumber) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TransferDestinationNumber other) {
        return numberE164CheckEnabled.equals(other.numberE164CheckEnabled)
                && number.equals(other.number)
                && extension.equals(other.extension)
                && callerId.equals(other.callerId)
                && message.equals(other.message)
                && description.equals(other.description);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.numberE164CheckEnabled,
                this.number,
                this.extension,
                this.callerId,
                this.message,
                this.description);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NumberStage builder() {
        return new Builder();
    }

    public interface NumberStage {
        _FinalStage number(@NotNull String number);

        Builder from(TransferDestinationNumber other);
    }

    public interface _FinalStage {
        TransferDestinationNumber build();

        _FinalStage numberE164CheckEnabled(Optional<Boolean> numberE164CheckEnabled);

        _FinalStage numberE164CheckEnabled(Boolean numberE164CheckEnabled);

        _FinalStage extension(Optional<String> extension);

        _FinalStage extension(String extension);

        _FinalStage callerId(Optional<String> callerId);

        _FinalStage callerId(String callerId);

        _FinalStage message(Optional<String> message);

        _FinalStage message(String message);

        _FinalStage description(Optional<String> description);

        _FinalStage description(String description);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NumberStage, _FinalStage {
        private String number;

        private Optional<String> description = Optional.empty();

        private Optional<String> message = Optional.empty();

        private Optional<String> callerId = Optional.empty();

        private Optional<String> extension = Optional.empty();

        private Optional<Boolean> numberE164CheckEnabled = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TransferDestinationNumber other) {
            numberE164CheckEnabled(other.getNumberE164CheckEnabled());
            number(other.getNumber());
            extension(other.getExtension());
            callerId(other.getCallerId());
            message(other.getMessage());
            description(other.getDescription());
            return this;
        }

        /**
         * <p>This is the phone number to transfer the call to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("number")
        public _FinalStage number(@NotNull String number) {
            this.number = Objects.requireNonNull(number, "number must not be null");
            return this;
        }

        /**
         * <p>This is the description of the destination, used by the AI to choose when and how to transfer the call.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage description(String description) {
            this.description = Optional.ofNullable(description);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public _FinalStage description(Optional<String> description) {
            this.description = description;
            return this;
        }

        /**
         * <p>This is the message to say before transferring the call to the destination.</p>
         * <p>If this is not provided and transfer tool messages is not provided, default is &quot;Transferring the call now&quot;.</p>
         * <p>If set to &quot;&quot;, nothing is spoken. This is useful when you want to silently transfer. This is especially useful when transferring between assistants in a squad. In this scenario, you likely also want to set <code>assistant.firstMessageMode=assistant-speaks-first-with-model-generated-message</code> for the destination assistant.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage message(String message) {
            this.message = Optional.ofNullable(message);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "message", nulls = Nulls.SKIP)
        public _FinalStage message(Optional<String> message) {
            this.message = message;
            return this;
        }

        /**
         * <p>This is the caller ID to use when transferring the call to the <code>number</code>.</p>
         * <p>Usage:</p>
         * <ul>
         * <li>If not provided, the caller ID will be the number the call is coming from. Example, +14151111111 calls in to and the assistant transfers out to +16470000000. +16470000000 will see +14151111111 as the caller.</li>
         * <li>To change this behavior, provide a <code>callerId</code>.</li>
         * <li>Set to '{{customer.number}}' to always use the customer's number as the caller ID.</li>
         * <li>Set to '{{phoneNumber.number}}' to always use the phone number of the assistant as the caller ID.</li>
         * <li>Set to any E164 number to always use that number as the caller ID. This needs to be a number that is owned or verified by your Transport provider like Twilio.</li>
         * </ul>
         * <p>For Twilio, you can read up more here: https://www.twilio.com/docs/voice/twiml/dial#callerid</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage callerId(String callerId) {
            this.callerId = Optional.ofNullable(callerId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "callerId", nulls = Nulls.SKIP)
        public _FinalStage callerId(Optional<String> callerId) {
            this.callerId = callerId;
            return this;
        }

        /**
         * <p>This is the extension to dial after transferring the call to the <code>number</code>.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage extension(String extension) {
            this.extension = Optional.ofNullable(extension);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "extension", nulls = Nulls.SKIP)
        public _FinalStage extension(Optional<String> extension) {
            this.extension = extension;
            return this;
        }

        /**
         * <p>This is the flag to toggle the E164 check for the <code>number</code> field. This is an advanced property which should be used if you know your use case requires it.</p>
         * <p>Use cases:</p>
         * <ul>
         * <li><code>false</code>: To allow non-E164 numbers like <code>+001234567890</code>, <code>1234</code>, or <code>abc</code>. This is useful for dialing out to non-E164 numbers on your SIP trunks.</li>
         * <li><code>true</code> (default): To allow only E164 numbers like <code>+14155551234</code>. This is standard for PSTN calls.</li>
         * </ul>
         * <p>If <code>false</code>, the <code>number</code> is still required to only contain alphanumeric characters (regex: <code>/^\+?[a-zA-Z0-9]+$/</code>).</p>
         * <p>@default true (E164 check is enabled)</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage numberE164CheckEnabled(Boolean numberE164CheckEnabled) {
            this.numberE164CheckEnabled = Optional.ofNullable(numberE164CheckEnabled);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "numberE164CheckEnabled", nulls = Nulls.SKIP)
        public _FinalStage numberE164CheckEnabled(Optional<Boolean> numberE164CheckEnabled) {
            this.numberE164CheckEnabled = numberE164CheckEnabled;
            return this;
        }

        @java.lang.Override
        public TransferDestinationNumber build() {
            return new TransferDestinationNumber(
                    numberE164CheckEnabled, number, extension, callerId, message, description, additionalProperties);
        }
    }
}