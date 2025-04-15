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

public final class CreateSmsSendToolDtoMessagesItem {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private CreateSmsSendToolDtoMessagesItem(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static CreateSmsSendToolDtoMessagesItem requestStart(ToolMessageStart value) {
        return new CreateSmsSendToolDtoMessagesItem(new RequestStartValue(value));
    }

    public static CreateSmsSendToolDtoMessagesItem requestComplete(ToolMessageComplete value) {
        return new CreateSmsSendToolDtoMessagesItem(new RequestCompleteValue(value));
    }

    public static CreateSmsSendToolDtoMessagesItem requestFailed(ToolMessageFailed value) {
        return new CreateSmsSendToolDtoMessagesItem(new RequestFailedValue(value));
    }

    public static CreateSmsSendToolDtoMessagesItem requestResponseDelayed(ToolMessageDelayed value) {
        return new CreateSmsSendToolDtoMessagesItem(new RequestResponseDelayedValue(value));
    }

    public boolean isRequestStart() {
        return value instanceof RequestStartValue;
    }

    public boolean isRequestComplete() {
        return value instanceof RequestCompleteValue;
    }

    public boolean isRequestFailed() {
        return value instanceof RequestFailedValue;
    }

    public boolean isRequestResponseDelayed() {
        return value instanceof RequestResponseDelayedValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<ToolMessageStart> getRequestStart() {
        if (isRequestStart()) {
            return Optional.of(((RequestStartValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ToolMessageComplete> getRequestComplete() {
        if (isRequestComplete()) {
            return Optional.of(((RequestCompleteValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ToolMessageFailed> getRequestFailed() {
        if (isRequestFailed()) {
            return Optional.of(((RequestFailedValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ToolMessageDelayed> getRequestResponseDelayed() {
        if (isRequestResponseDelayed()) {
            return Optional.of(((RequestResponseDelayedValue) value).value);
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
        T visitRequestStart(ToolMessageStart requestStart);

        T visitRequestComplete(ToolMessageComplete requestComplete);

        T visitRequestFailed(ToolMessageFailed requestFailed);

        T visitRequestResponseDelayed(ToolMessageDelayed requestResponseDelayed);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(RequestStartValue.class),
        @JsonSubTypes.Type(RequestCompleteValue.class),
        @JsonSubTypes.Type(RequestFailedValue.class),
        @JsonSubTypes.Type(RequestResponseDelayedValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("request-start")
    @JsonIgnoreProperties("type")
    private static final class RequestStartValue implements Value {
        @JsonUnwrapped
        private ToolMessageStart value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private RequestStartValue() {}

        private RequestStartValue(ToolMessageStart value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitRequestStart(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof RequestStartValue && equalTo((RequestStartValue) other);
        }

        private boolean equalTo(RequestStartValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "CreateSmsSendToolDtoMessagesItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("request-complete")
    @JsonIgnoreProperties("type")
    private static final class RequestCompleteValue implements Value {
        @JsonUnwrapped
        private ToolMessageComplete value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private RequestCompleteValue() {}

        private RequestCompleteValue(ToolMessageComplete value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitRequestComplete(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof RequestCompleteValue && equalTo((RequestCompleteValue) other);
        }

        private boolean equalTo(RequestCompleteValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "CreateSmsSendToolDtoMessagesItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("request-failed")
    @JsonIgnoreProperties("type")
    private static final class RequestFailedValue implements Value {
        @JsonUnwrapped
        private ToolMessageFailed value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private RequestFailedValue() {}

        private RequestFailedValue(ToolMessageFailed value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitRequestFailed(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof RequestFailedValue && equalTo((RequestFailedValue) other);
        }

        private boolean equalTo(RequestFailedValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "CreateSmsSendToolDtoMessagesItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("request-response-delayed")
    @JsonIgnoreProperties("type")
    private static final class RequestResponseDelayedValue implements Value {
        @JsonUnwrapped
        private ToolMessageDelayed value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private RequestResponseDelayedValue() {}

        private RequestResponseDelayedValue(ToolMessageDelayed value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitRequestResponseDelayed(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof RequestResponseDelayedValue && equalTo((RequestResponseDelayedValue) other);
        }

        private boolean equalTo(RequestResponseDelayedValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "CreateSmsSendToolDtoMessagesItem{" + "value: " + value + "}";
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
            return "CreateSmsSendToolDtoMessagesItem{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
