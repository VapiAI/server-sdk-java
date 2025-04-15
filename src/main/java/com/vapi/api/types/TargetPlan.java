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
@JsonDeserialize(builder = TargetPlan.Builder.class)
public final class TargetPlan {
    private final Optional<String> phoneNumberId;

    private final Optional<TestSuitePhoneNumber> phoneNumber;

    private final Optional<String> assistantId;

    private final Map<String, Object> additionalProperties;

    private TargetPlan(
            Optional<String> phoneNumberId,
            Optional<TestSuitePhoneNumber> phoneNumber,
            Optional<String> assistantId,
            Map<String, Object> additionalProperties) {
        this.phoneNumberId = phoneNumberId;
        this.phoneNumber = phoneNumber;
        this.assistantId = assistantId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the phoneNumberId that is being tested.
     */
    @JsonProperty("phoneNumberId")
    public Optional<String> getPhoneNumberId() {
        return phoneNumberId;
    }

    /**
     * @return This is the phone number that is being tested. Only use this if you have not imported the phone number to Vapi.
     */
    @JsonProperty("phoneNumber")
    public Optional<TestSuitePhoneNumber> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @return This is the assistantId that is being tested.
     */
    @JsonProperty("assistantId")
    public Optional<String> getAssistantId() {
        return assistantId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TargetPlan && equalTo((TargetPlan) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TargetPlan other) {
        return phoneNumberId.equals(other.phoneNumberId)
                && phoneNumber.equals(other.phoneNumber)
                && assistantId.equals(other.assistantId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.phoneNumberId, this.phoneNumber, this.assistantId);
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
        private Optional<String> phoneNumberId = Optional.empty();

        private Optional<TestSuitePhoneNumber> phoneNumber = Optional.empty();

        private Optional<String> assistantId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TargetPlan other) {
            phoneNumberId(other.getPhoneNumberId());
            phoneNumber(other.getPhoneNumber());
            assistantId(other.getAssistantId());
            return this;
        }

        @JsonSetter(value = "phoneNumberId", nulls = Nulls.SKIP)
        public Builder phoneNumberId(Optional<String> phoneNumberId) {
            this.phoneNumberId = phoneNumberId;
            return this;
        }

        public Builder phoneNumberId(String phoneNumberId) {
            this.phoneNumberId = Optional.ofNullable(phoneNumberId);
            return this;
        }

        @JsonSetter(value = "phoneNumber", nulls = Nulls.SKIP)
        public Builder phoneNumber(Optional<TestSuitePhoneNumber> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder phoneNumber(TestSuitePhoneNumber phoneNumber) {
            this.phoneNumber = Optional.ofNullable(phoneNumber);
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

        public TargetPlan build() {
            return new TargetPlan(phoneNumberId, phoneNumber, assistantId, additionalProperties);
        }
    }
}
