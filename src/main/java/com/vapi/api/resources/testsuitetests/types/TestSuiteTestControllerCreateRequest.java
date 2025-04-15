/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.resources.testsuitetests.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.vapi.api.types.CreateTestSuiteTestChatDto;
import com.vapi.api.types.CreateTestSuiteTestVoiceDto;
import java.util.Objects;
import java.util.Optional;

public final class TestSuiteTestControllerCreateRequest {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private TestSuiteTestControllerCreateRequest(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static TestSuiteTestControllerCreateRequest voice(CreateTestSuiteTestVoiceDto value) {
        return new TestSuiteTestControllerCreateRequest(new VoiceValue(value));
    }

    public static TestSuiteTestControllerCreateRequest chat(CreateTestSuiteTestChatDto value) {
        return new TestSuiteTestControllerCreateRequest(new ChatValue(value));
    }

    public boolean isVoice() {
        return value instanceof VoiceValue;
    }

    public boolean isChat() {
        return value instanceof ChatValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<CreateTestSuiteTestVoiceDto> getVoice() {
        if (isVoice()) {
            return Optional.of(((VoiceValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateTestSuiteTestChatDto> getChat() {
        if (isChat()) {
            return Optional.of(((ChatValue) value).value);
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
        T visitVoice(CreateTestSuiteTestVoiceDto voice);

        T visitChat(CreateTestSuiteTestChatDto chat);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({@JsonSubTypes.Type(VoiceValue.class), @JsonSubTypes.Type(ChatValue.class)})
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("voice")
    @JsonIgnoreProperties("type")
    private static final class VoiceValue implements Value {
        @JsonUnwrapped
        private CreateTestSuiteTestVoiceDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private VoiceValue() {}

        private VoiceValue(CreateTestSuiteTestVoiceDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitVoice(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof VoiceValue && equalTo((VoiceValue) other);
        }

        private boolean equalTo(VoiceValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "TestSuiteTestControllerCreateRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("chat")
    @JsonIgnoreProperties("type")
    private static final class ChatValue implements Value {
        @JsonUnwrapped
        private CreateTestSuiteTestChatDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private ChatValue() {}

        private ChatValue(CreateTestSuiteTestChatDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitChat(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof ChatValue && equalTo((ChatValue) other);
        }

        private boolean equalTo(ChatValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "TestSuiteTestControllerCreateRequest{" + "value: " + value + "}";
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
            return "TestSuiteTestControllerCreateRequest{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
