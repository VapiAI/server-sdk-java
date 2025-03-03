/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

public final class ServerMessageTransferUpdateDestination {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private ServerMessageTransferUpdateDestination(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static ServerMessageTransferUpdateDestination assistant(TransferDestinationAssistant value) {
        return new ServerMessageTransferUpdateDestination(new AssistantValue(value));
    }

    public static ServerMessageTransferUpdateDestination step(TransferDestinationStep value) {
        return new ServerMessageTransferUpdateDestination(new StepValue(value));
    }

    public static ServerMessageTransferUpdateDestination number(TransferDestinationNumber value) {
        return new ServerMessageTransferUpdateDestination(new NumberValue(value));
    }

    public static ServerMessageTransferUpdateDestination sip(TransferDestinationSip value) {
        return new ServerMessageTransferUpdateDestination(new SipValue(value));
    }

    public boolean isAssistant() {
        return value instanceof AssistantValue;
    }

    public boolean isStep() {
        return value instanceof StepValue;
    }

    public boolean isNumber() {
        return value instanceof NumberValue;
    }

    public boolean isSip() {
        return value instanceof SipValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<TransferDestinationAssistant> getAssistant() {
        if (isAssistant()) {
            return Optional.of(((AssistantValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<TransferDestinationStep> getStep() {
        if (isStep()) {
            return Optional.of(((StepValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<TransferDestinationNumber> getNumber() {
        if (isNumber()) {
            return Optional.of(((NumberValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<TransferDestinationSip> getSip() {
        if (isSip()) {
            return Optional.of(((SipValue) value).value);
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
        T visitAssistant(TransferDestinationAssistant assistant);

        T visitStep(TransferDestinationStep step);

        T visitNumber(TransferDestinationNumber number);

        T visitSip(TransferDestinationSip sip);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(AssistantValue.class),
        @JsonSubTypes.Type(StepValue.class),
        @JsonSubTypes.Type(NumberValue.class),
        @JsonSubTypes.Type(SipValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("assistant")
    @JsonIgnoreProperties("type")
    private static final class AssistantValue implements Value {
        @JsonUnwrapped
        private TransferDestinationAssistant value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private AssistantValue() {}

        private AssistantValue(TransferDestinationAssistant value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitAssistant(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof AssistantValue && equalTo((AssistantValue) other);
        }

        private boolean equalTo(AssistantValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ServerMessageTransferUpdateDestination{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("step")
    @JsonIgnoreProperties("type")
    private static final class StepValue implements Value {
        @JsonUnwrapped
        private TransferDestinationStep value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private StepValue() {}

        private StepValue(TransferDestinationStep value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitStep(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof StepValue && equalTo((StepValue) other);
        }

        private boolean equalTo(StepValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ServerMessageTransferUpdateDestination{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("number")
    @JsonIgnoreProperties("type")
    private static final class NumberValue implements Value {
        @JsonUnwrapped
        private TransferDestinationNumber value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private NumberValue() {}

        private NumberValue(TransferDestinationNumber value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitNumber(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof NumberValue && equalTo((NumberValue) other);
        }

        private boolean equalTo(NumberValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ServerMessageTransferUpdateDestination{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("sip")
    @JsonIgnoreProperties("type")
    private static final class SipValue implements Value {
        @JsonUnwrapped
        private TransferDestinationSip value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private SipValue() {}

        private SipValue(TransferDestinationSip value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitSip(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof SipValue && equalTo((SipValue) other);
        }

        private boolean equalTo(SipValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ServerMessageTransferUpdateDestination{" + "value: " + value + "}";
        }
    }

    @JsonIgnoreProperties("type")
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
            return "ServerMessageTransferUpdateDestination{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
