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

public final class CreateAssistantDtoTranscriber {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private CreateAssistantDtoTranscriber(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static CreateAssistantDtoTranscriber assemblyAi(AssemblyAiTranscriber value) {
        return new CreateAssistantDtoTranscriber(new AssemblyAiValue(value));
    }

    public static CreateAssistantDtoTranscriber azure(AzureSpeechTranscriber value) {
        return new CreateAssistantDtoTranscriber(new AzureValue(value));
    }

    public static CreateAssistantDtoTranscriber customTranscriber(CustomTranscriber value) {
        return new CreateAssistantDtoTranscriber(new CustomTranscriberValue(value));
    }

    public static CreateAssistantDtoTranscriber deepgram(DeepgramTranscriber value) {
        return new CreateAssistantDtoTranscriber(new DeepgramValue(value));
    }

    public static CreateAssistantDtoTranscriber _11Labs(ElevenLabsTranscriber value) {
        return new CreateAssistantDtoTranscriber(new _11LabsValue(value));
    }

    public static CreateAssistantDtoTranscriber gladia(GladiaTranscriber value) {
        return new CreateAssistantDtoTranscriber(new GladiaValue(value));
    }

    public static CreateAssistantDtoTranscriber speechmatics(SpeechmaticsTranscriber value) {
        return new CreateAssistantDtoTranscriber(new SpeechmaticsValue(value));
    }

    public static CreateAssistantDtoTranscriber talkscriber(TalkscriberTranscriber value) {
        return new CreateAssistantDtoTranscriber(new TalkscriberValue(value));
    }

    public static CreateAssistantDtoTranscriber google(GoogleTranscriber value) {
        return new CreateAssistantDtoTranscriber(new GoogleValue(value));
    }

    public static CreateAssistantDtoTranscriber openai(OpenAiTranscriber value) {
        return new CreateAssistantDtoTranscriber(new OpenaiValue(value));
    }

    public boolean isAssemblyAi() {
        return value instanceof AssemblyAiValue;
    }

    public boolean isAzure() {
        return value instanceof AzureValue;
    }

    public boolean isCustomTranscriber() {
        return value instanceof CustomTranscriberValue;
    }

    public boolean isDeepgram() {
        return value instanceof DeepgramValue;
    }

    public boolean is11Labs() {
        return value instanceof _11LabsValue;
    }

    public boolean isGladia() {
        return value instanceof GladiaValue;
    }

    public boolean isSpeechmatics() {
        return value instanceof SpeechmaticsValue;
    }

    public boolean isTalkscriber() {
        return value instanceof TalkscriberValue;
    }

    public boolean isGoogle() {
        return value instanceof GoogleValue;
    }

    public boolean isOpenai() {
        return value instanceof OpenaiValue;
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

    public Optional<AzureSpeechTranscriber> getAzure() {
        if (isAzure()) {
            return Optional.of(((AzureValue) value).value);
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

    public Optional<ElevenLabsTranscriber> get11Labs() {
        if (is11Labs()) {
            return Optional.of(((_11LabsValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<GladiaTranscriber> getGladia() {
        if (isGladia()) {
            return Optional.of(((GladiaValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<SpeechmaticsTranscriber> getSpeechmatics() {
        if (isSpeechmatics()) {
            return Optional.of(((SpeechmaticsValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<TalkscriberTranscriber> getTalkscriber() {
        if (isTalkscriber()) {
            return Optional.of(((TalkscriberValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<GoogleTranscriber> getGoogle() {
        if (isGoogle()) {
            return Optional.of(((GoogleValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<OpenAiTranscriber> getOpenai() {
        if (isOpenai()) {
            return Optional.of(((OpenaiValue) value).value);
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

        T visitAzure(AzureSpeechTranscriber azure);

        T visitCustomTranscriber(CustomTranscriber customTranscriber);

        T visitDeepgram(DeepgramTranscriber deepgram);

        T visit11Labs(ElevenLabsTranscriber _11Labs);

        T visitGladia(GladiaTranscriber gladia);

        T visitSpeechmatics(SpeechmaticsTranscriber speechmatics);

        T visitTalkscriber(TalkscriberTranscriber talkscriber);

        T visitGoogle(GoogleTranscriber google);

        T visitOpenai(OpenAiTranscriber openai);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "provider", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(AssemblyAiValue.class),
        @JsonSubTypes.Type(AzureValue.class),
        @JsonSubTypes.Type(CustomTranscriberValue.class),
        @JsonSubTypes.Type(DeepgramValue.class),
        @JsonSubTypes.Type(_11LabsValue.class),
        @JsonSubTypes.Type(GladiaValue.class),
        @JsonSubTypes.Type(SpeechmaticsValue.class),
        @JsonSubTypes.Type(TalkscriberValue.class),
        @JsonSubTypes.Type(GoogleValue.class),
        @JsonSubTypes.Type(OpenaiValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("assembly-ai")
    @JsonIgnoreProperties("provider")
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
            return "CreateAssistantDtoTranscriber{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("azure")
    @JsonIgnoreProperties("provider")
    private static final class AzureValue implements Value {
        @JsonUnwrapped
        private AzureSpeechTranscriber value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private AzureValue() {}

        private AzureValue(AzureSpeechTranscriber value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitAzure(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof AzureValue && equalTo((AzureValue) other);
        }

        private boolean equalTo(AzureValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "CreateAssistantDtoTranscriber{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("custom-transcriber")
    @JsonIgnoreProperties("provider")
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
            return "CreateAssistantDtoTranscriber{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("deepgram")
    @JsonIgnoreProperties("provider")
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
            return "CreateAssistantDtoTranscriber{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("11labs")
    @JsonIgnoreProperties("provider")
    private static final class _11LabsValue implements Value {
        @JsonUnwrapped
        private ElevenLabsTranscriber value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private _11LabsValue() {}

        private _11LabsValue(ElevenLabsTranscriber value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visit11Labs(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof _11LabsValue && equalTo((_11LabsValue) other);
        }

        private boolean equalTo(_11LabsValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "CreateAssistantDtoTranscriber{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("gladia")
    @JsonIgnoreProperties("provider")
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
            return "CreateAssistantDtoTranscriber{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("speechmatics")
    @JsonIgnoreProperties("provider")
    private static final class SpeechmaticsValue implements Value {
        @JsonUnwrapped
        private SpeechmaticsTranscriber value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private SpeechmaticsValue() {}

        private SpeechmaticsValue(SpeechmaticsTranscriber value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitSpeechmatics(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof SpeechmaticsValue && equalTo((SpeechmaticsValue) other);
        }

        private boolean equalTo(SpeechmaticsValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "CreateAssistantDtoTranscriber{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("talkscriber")
    @JsonIgnoreProperties("provider")
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
            return "CreateAssistantDtoTranscriber{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("google")
    @JsonIgnoreProperties("provider")
    private static final class GoogleValue implements Value {
        @JsonUnwrapped
        private GoogleTranscriber value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private GoogleValue() {}

        private GoogleValue(GoogleTranscriber value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitGoogle(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof GoogleValue && equalTo((GoogleValue) other);
        }

        private boolean equalTo(GoogleValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "CreateAssistantDtoTranscriber{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("openai")
    @JsonIgnoreProperties("provider")
    private static final class OpenaiValue implements Value {
        @JsonUnwrapped
        private OpenAiTranscriber value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private OpenaiValue() {}

        private OpenaiValue(OpenAiTranscriber value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitOpenai(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof OpenaiValue && equalTo((OpenaiValue) other);
        }

        private boolean equalTo(OpenaiValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "CreateAssistantDtoTranscriber{" + "value: " + value + "}";
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
            return "CreateAssistantDtoTranscriber{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
