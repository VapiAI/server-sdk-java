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

public final class AssistantTranscriber {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private AssistantTranscriber(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static AssistantTranscriber assemblyAi(AssemblyAiTranscriber value) {
        return new AssistantTranscriber(new AssemblyAiValue(value));
    }

    public static AssistantTranscriber customTranscriber(CustomTranscriber value) {
        return new AssistantTranscriber(new CustomTranscriberValue(value));
    }

    public static AssistantTranscriber deepgram(DeepgramTranscriber value) {
        return new AssistantTranscriber(new DeepgramValue(value));
    }

    public static AssistantTranscriber gladia(GladiaTranscriber value) {
        return new AssistantTranscriber(new GladiaValue(value));
    }

    public static AssistantTranscriber talkscriber(TalkscriberTranscriber value) {
        return new AssistantTranscriber(new TalkscriberValue(value));
    }

    public boolean isAssemblyAi() {
        return value instanceof AssemblyAiValue;
    }

    public boolean isCustomTranscriber() {
        return value instanceof CustomTranscriberValue;
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

    public Optional<AssemblyAiTranscriber> getAssemblyAi() {
        if (isAssemblyAi()) {
            return Optional.of(((AssemblyAiValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CustomTranscriber> getCustomTranscriber() {
        if (isCustomTranscriber()) {
            return Optional.of(((CustomTranscriberValue) value).value);
        }
        return Optional.empty();
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
        T visitAssemblyAi(AssemblyAiTranscriber assemblyAi);

        T visitCustomTranscriber(CustomTranscriber customTranscriber);

        T visitDeepgram(DeepgramTranscriber deepgram);

        T visitGladia(GladiaTranscriber gladia);

        T visitTalkscriber(TalkscriberTranscriber talkscriber);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "provider", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(AssemblyAiValue.class),
        @JsonSubTypes.Type(CustomTranscriberValue.class),
        @JsonSubTypes.Type(DeepgramValue.class),
        @JsonSubTypes.Type(GladiaValue.class),
        @JsonSubTypes.Type(TalkscriberValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("assembly-ai")
    private static final class AssemblyAiValue implements Value {
        @JsonUnwrapped
        private AssemblyAiTranscriber value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private AssemblyAiValue() {}

        private AssemblyAiValue(AssemblyAiTranscriber value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitAssemblyAi(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof AssemblyAiValue && equalTo((AssemblyAiValue) other);
        }

        private boolean equalTo(AssemblyAiValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AssistantTranscriber{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("custom-transcriber")
    private static final class CustomTranscriberValue implements Value {
        @JsonUnwrapped
        private CustomTranscriber value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CustomTranscriberValue() {}

        private CustomTranscriberValue(CustomTranscriber value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitCustomTranscriber(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof CustomTranscriberValue && equalTo((CustomTranscriberValue) other);
        }

        private boolean equalTo(CustomTranscriberValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AssistantTranscriber{" + "value: " + value + "}";
        }
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
            return "AssistantTranscriber{" + "value: " + value + "}";
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
            return "AssistantTranscriber{" + "value: " + value + "}";
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
            return "AssistantTranscriber{" + "value: " + value + "}";
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
            return "AssistantTranscriber{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
