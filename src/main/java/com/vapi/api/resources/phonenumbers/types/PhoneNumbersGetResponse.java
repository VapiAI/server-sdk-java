/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.resources.phonenumbers.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.vapi.api.types.ByoPhoneNumber;
import com.vapi.api.types.TelnyxPhoneNumber;
import com.vapi.api.types.TwilioPhoneNumber;
import com.vapi.api.types.VapiPhoneNumber;
import com.vapi.api.types.VonagePhoneNumber;
import java.util.Objects;
import java.util.Optional;

public final class PhoneNumbersGetResponse {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private PhoneNumbersGetResponse(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static PhoneNumbersGetResponse byoPhoneNumber(ByoPhoneNumber value) {
        return new PhoneNumbersGetResponse(new ByoPhoneNumberValue(value));
    }

    public static PhoneNumbersGetResponse twilio(TwilioPhoneNumber value) {
        return new PhoneNumbersGetResponse(new TwilioValue(value));
    }

    public static PhoneNumbersGetResponse vonage(VonagePhoneNumber value) {
        return new PhoneNumbersGetResponse(new VonageValue(value));
    }

    public static PhoneNumbersGetResponse vapi(VapiPhoneNumber value) {
        return new PhoneNumbersGetResponse(new VapiValue(value));
    }

    public static PhoneNumbersGetResponse telnyx(TelnyxPhoneNumber value) {
        return new PhoneNumbersGetResponse(new TelnyxValue(value));
    }

    public boolean isByoPhoneNumber() {
        return value instanceof ByoPhoneNumberValue;
    }

    public boolean isTwilio() {
        return value instanceof TwilioValue;
    }

    public boolean isVonage() {
        return value instanceof VonageValue;
    }

    public boolean isVapi() {
        return value instanceof VapiValue;
    }

    public boolean isTelnyx() {
        return value instanceof TelnyxValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<ByoPhoneNumber> getByoPhoneNumber() {
        if (isByoPhoneNumber()) {
            return Optional.of(((ByoPhoneNumberValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<TwilioPhoneNumber> getTwilio() {
        if (isTwilio()) {
            return Optional.of(((TwilioValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<VonagePhoneNumber> getVonage() {
        if (isVonage()) {
            return Optional.of(((VonageValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<VapiPhoneNumber> getVapi() {
        if (isVapi()) {
            return Optional.of(((VapiValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<TelnyxPhoneNumber> getTelnyx() {
        if (isTelnyx()) {
            return Optional.of(((TelnyxValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<Object> _getUnknown() {
        if (_isUnknown()) {
            return Optional.of(((_UnknownValue) value).value);
        }
        return Optional.empty();
    }

    @JsonValue
    private Value getValue() {
        return this.value;
    }

    public interface Visitor<T> {
        T visitByoPhoneNumber(ByoPhoneNumber byoPhoneNumber);

        T visitTwilio(TwilioPhoneNumber twilio);

        T visitVonage(VonagePhoneNumber vonage);

        T visitVapi(VapiPhoneNumber vapi);

        T visitTelnyx(TelnyxPhoneNumber telnyx);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "provider", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(ByoPhoneNumberValue.class),
        @JsonSubTypes.Type(TwilioValue.class),
        @JsonSubTypes.Type(VonageValue.class),
        @JsonSubTypes.Type(VapiValue.class),
        @JsonSubTypes.Type(TelnyxValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("byo-phone-number")
    @JsonIgnoreProperties("provider")
    private static final class ByoPhoneNumberValue implements Value {
        @JsonUnwrapped
        private ByoPhoneNumber value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private ByoPhoneNumberValue() {}

        private ByoPhoneNumberValue(ByoPhoneNumber value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitByoPhoneNumber(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof ByoPhoneNumberValue && equalTo((ByoPhoneNumberValue) other);
        }

        private boolean equalTo(ByoPhoneNumberValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PhoneNumbersGetResponse{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("twilio")
    @JsonIgnoreProperties("provider")
    private static final class TwilioValue implements Value {
        @JsonUnwrapped
        private TwilioPhoneNumber value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private TwilioValue() {}

        private TwilioValue(TwilioPhoneNumber value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitTwilio(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof TwilioValue && equalTo((TwilioValue) other);
        }

        private boolean equalTo(TwilioValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PhoneNumbersGetResponse{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("vonage")
    @JsonIgnoreProperties("provider")
    private static final class VonageValue implements Value {
        @JsonUnwrapped
        private VonagePhoneNumber value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private VonageValue() {}

        private VonageValue(VonagePhoneNumber value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitVonage(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof VonageValue && equalTo((VonageValue) other);
        }

        private boolean equalTo(VonageValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PhoneNumbersGetResponse{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("vapi")
    @JsonIgnoreProperties("provider")
    private static final class VapiValue implements Value {
        @JsonUnwrapped
        private VapiPhoneNumber value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private VapiValue() {}

        private VapiValue(VapiPhoneNumber value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitVapi(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof VapiValue && equalTo((VapiValue) other);
        }

        private boolean equalTo(VapiValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PhoneNumbersGetResponse{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("telnyx")
    @JsonIgnoreProperties("provider")
    private static final class TelnyxValue implements Value {
        @JsonUnwrapped
        private TelnyxPhoneNumber value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private TelnyxValue() {}

        private TelnyxValue(TelnyxPhoneNumber value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitTelnyx(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof TelnyxValue && equalTo((TelnyxValue) other);
        }

        private boolean equalTo(TelnyxValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PhoneNumbersGetResponse{" + "value: " + value + "}";
        }
    }

    @JsonIgnoreProperties("provider")
    private static final class _UnknownValue implements Value {
        private String type;

        @JsonValue
        private Object value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private _UnknownValue(@JsonProperty("value") Object value) {}

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor._visitUnknown(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof _UnknownValue && equalTo((_UnknownValue) other);
        }

        private boolean equalTo(_UnknownValue other) {
            return type.equals(other.type) && value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.type, this.value);
        }

        @java.lang.Override
        public String toString() {
            return "PhoneNumbersGetResponse{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
