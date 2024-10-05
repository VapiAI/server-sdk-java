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

public final class AssistantOverridesTranscriber {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private AssistantOverridesTranscriber(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static AssistantOverridesTranscriber deepgram(DeepgramTranscriber value) {
        return new AssistantOverridesTranscriber(new DeepgramValue(value));
    }

    public static AssistantOverridesTranscriber gladia(GladiaTranscriber value) {
        return new AssistantOverridesTranscriber(new GladiaValue(value));
    }

    public static AssistantOverridesTranscriber talkscriber(TalkscriberTranscriber value) {
        return new AssistantOverridesTranscriber(new TalkscriberValue(value));
    }

    public boolean isDeepgram() {
        return value instanceof DeepgramValue;
    }

    public boolean isGladia() {
        return value instanceof GladiaValue;
    }

    public boolean isTalkscriber() {
        return value instanceof TalkscriberValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<DeepgramTranscriber> getDeepgram() {
        if (isDeepgram()) {
            return Optional.of(((DeepgramValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<GladiaTranscriber> getGladia() {
        if (isGladia()) {
            return Optional.of(((GladiaValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<TalkscriberTranscriber> getTalkscriber() {
        if (isTalkscriber()) {
            return Optional.of(((TalkscriberValue) value).value);
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
        T visitDeepgram(DeepgramTranscriber deepgram);

        T visitGladia(GladiaTranscriber gladia);

        T visitTalkscriber(TalkscriberTranscriber talkscriber);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "provider", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(DeepgramValue.class),
        @JsonSubTypes.Type(GladiaValue.class),
        @JsonSubTypes.Type(TalkscriberValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("deepgram")
    private static final class DeepgramValue implements Value {
        @JsonUnwrapped
        private DeepgramTranscriber value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private DeepgramValue() {}

        private DeepgramValue(DeepgramTranscriber value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitDeepgram(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof DeepgramValue && equalTo((DeepgramValue) other);
        }

        private boolean equalTo(DeepgramValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AssistantOverridesTranscriber{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("gladia")
    private static final class GladiaValue implements Value {
        @JsonUnwrapped
        private GladiaTranscriber value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private GladiaValue() {}

        private GladiaValue(GladiaTranscriber value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitGladia(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof GladiaValue && equalTo((GladiaValue) other);
        }

        private boolean equalTo(GladiaValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AssistantOverridesTranscriber{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("talkscriber")
    private static final class TalkscriberValue implements Value {
        @JsonUnwrapped
        private TalkscriberTranscriber value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private TalkscriberValue() {}

        private TalkscriberValue(TalkscriberTranscriber value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitTalkscriber(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof TalkscriberValue && equalTo((TalkscriberValue) other);
        }

        private boolean equalTo(TalkscriberValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AssistantOverridesTranscriber{" + "value: " + value + "}";
        }
    }

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
            return "AssistantOverridesTranscriber{" + "type: " + type + ", value: " + value + "}";
        }
    }
}