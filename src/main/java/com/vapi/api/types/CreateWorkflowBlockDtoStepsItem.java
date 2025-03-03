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

public final class CreateWorkflowBlockDtoStepsItem {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private CreateWorkflowBlockDtoStepsItem(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static CreateWorkflowBlockDtoStepsItem handoff(HandoffStep value) {
        return new CreateWorkflowBlockDtoStepsItem(new HandoffValue(value));
    }

    public static CreateWorkflowBlockDtoStepsItem callback(CallbackStep value) {
        return new CreateWorkflowBlockDtoStepsItem(new CallbackValue(value));
    }

    public boolean isHandoff() {
        return value instanceof HandoffValue;
    }

    public boolean isCallback() {
        return value instanceof CallbackValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<HandoffStep> getHandoff() {
        if (isHandoff()) {
            return Optional.of(((HandoffValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CallbackStep> getCallback() {
        if (isCallback()) {
            return Optional.of(((CallbackValue) value).value);
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
        T visitHandoff(HandoffStep handoff);

        T visitCallback(CallbackStep callback);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({@JsonSubTypes.Type(HandoffValue.class), @JsonSubTypes.Type(CallbackValue.class)})
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("handoff")
    @JsonIgnoreProperties("type")
    private static final class HandoffValue implements Value {
        @JsonUnwrapped
        private HandoffStep value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private HandoffValue() {}

        private HandoffValue(HandoffStep value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitHandoff(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof HandoffValue && equalTo((HandoffValue) other);
        }

        private boolean equalTo(HandoffValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "CreateWorkflowBlockDtoStepsItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("callback")
    @JsonIgnoreProperties("type")
    private static final class CallbackValue implements Value {
        @JsonUnwrapped
        private CallbackStep value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CallbackValue() {}

        private CallbackValue(CallbackStep value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitCallback(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof CallbackValue && equalTo((CallbackValue) other);
        }

        private boolean equalTo(CallbackValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "CreateWorkflowBlockDtoStepsItem{" + "value: " + value + "}";
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
            return "CreateWorkflowBlockDtoStepsItem{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
