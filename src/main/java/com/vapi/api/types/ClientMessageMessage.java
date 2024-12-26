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

public final class ClientMessageMessage {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private ClientMessageMessage(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static ClientMessageMessage conversationUpdate(ClientMessageConversationUpdate value) {
        return new ClientMessageMessage(new ConversationUpdateValue(value));
    }

    public static ClientMessageMessage hang(ClientMessageHang value) {
        return new ClientMessageMessage(new HangValue(value));
    }

    public static ClientMessageMessage metadata(ClientMessageMetadata value) {
        return new ClientMessageMessage(new MetadataValue(value));
    }

    public static ClientMessageMessage modelOutput(ClientMessageModelOutput value) {
        return new ClientMessageMessage(new ModelOutputValue(value));
    }

    public static ClientMessageMessage speechUpdate(ClientMessageSpeechUpdate value) {
        return new ClientMessageMessage(new SpeechUpdateValue(value));
    }

    public static ClientMessageMessage transcript(ClientMessageTranscript value) {
        return new ClientMessageMessage(new TranscriptValue(value));
    }

    public static ClientMessageMessage toolCalls(ClientMessageToolCalls value) {
        return new ClientMessageMessage(new ToolCallsValue(value));
    }

    public static ClientMessageMessage toolCallsResult(ClientMessageToolCallsResult value) {
        return new ClientMessageMessage(new ToolCallsResultValue(value));
    }

    public static ClientMessageMessage transferUpdate(ClientMessageTransferUpdate value) {
        return new ClientMessageMessage(new TransferUpdateValue(value));
    }

    public static ClientMessageMessage userInterrupted(ClientMessageUserInterrupted value) {
        return new ClientMessageMessage(new UserInterruptedValue(value));
    }

    public static ClientMessageMessage languageChangeDetected(ClientMessageLanguageChangeDetected value) {
        return new ClientMessageMessage(new LanguageChangeDetectedValue(value));
    }

    public static ClientMessageMessage voiceInput(ClientMessageVoiceInput value) {
        return new ClientMessageMessage(new VoiceInputValue(value));
    }

    public boolean isConversationUpdate() {
        return value instanceof ConversationUpdateValue;
    }

    public boolean isHang() {
        return value instanceof HangValue;
    }

    public boolean isMetadata() {
        return value instanceof MetadataValue;
    }

    public boolean isModelOutput() {
        return value instanceof ModelOutputValue;
    }

    public boolean isSpeechUpdate() {
        return value instanceof SpeechUpdateValue;
    }

    public boolean isTranscript() {
        return value instanceof TranscriptValue;
    }

    public boolean isToolCalls() {
        return value instanceof ToolCallsValue;
    }

    public boolean isToolCallsResult() {
        return value instanceof ToolCallsResultValue;
    }

    public boolean isTransferUpdate() {
        return value instanceof TransferUpdateValue;
    }

    public boolean isUserInterrupted() {
        return value instanceof UserInterruptedValue;
    }

    public boolean isLanguageChangeDetected() {
        return value instanceof LanguageChangeDetectedValue;
    }

    public boolean isVoiceInput() {
        return value instanceof VoiceInputValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<ClientMessageConversationUpdate> getConversationUpdate() {
        if (isConversationUpdate()) {
            return Optional.of(((ConversationUpdateValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ClientMessageHang> getHang() {
        if (isHang()) {
            return Optional.of(((HangValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ClientMessageMetadata> getMetadata() {
        if (isMetadata()) {
            return Optional.of(((MetadataValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ClientMessageModelOutput> getModelOutput() {
        if (isModelOutput()) {
            return Optional.of(((ModelOutputValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ClientMessageSpeechUpdate> getSpeechUpdate() {
        if (isSpeechUpdate()) {
            return Optional.of(((SpeechUpdateValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ClientMessageTranscript> getTranscript() {
        if (isTranscript()) {
            return Optional.of(((TranscriptValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ClientMessageToolCalls> getToolCalls() {
        if (isToolCalls()) {
            return Optional.of(((ToolCallsValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ClientMessageToolCallsResult> getToolCallsResult() {
        if (isToolCallsResult()) {
            return Optional.of(((ToolCallsResultValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ClientMessageTransferUpdate> getTransferUpdate() {
        if (isTransferUpdate()) {
            return Optional.of(((TransferUpdateValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ClientMessageUserInterrupted> getUserInterrupted() {
        if (isUserInterrupted()) {
            return Optional.of(((UserInterruptedValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ClientMessageLanguageChangeDetected> getLanguageChangeDetected() {
        if (isLanguageChangeDetected()) {
            return Optional.of(((LanguageChangeDetectedValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ClientMessageVoiceInput> getVoiceInput() {
        if (isVoiceInput()) {
            return Optional.of(((VoiceInputValue) value).value);
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
        T visitConversationUpdate(ClientMessageConversationUpdate conversationUpdate);

        T visitHang(ClientMessageHang hang);

        T visitMetadata(ClientMessageMetadata metadata);

        T visitModelOutput(ClientMessageModelOutput modelOutput);

        T visitSpeechUpdate(ClientMessageSpeechUpdate speechUpdate);

        T visitTranscript(ClientMessageTranscript transcript);

        T visitToolCalls(ClientMessageToolCalls toolCalls);

        T visitToolCallsResult(ClientMessageToolCallsResult toolCallsResult);

        T visitTransferUpdate(ClientMessageTransferUpdate transferUpdate);

        T visitUserInterrupted(ClientMessageUserInterrupted userInterrupted);

        T visitLanguageChangeDetected(ClientMessageLanguageChangeDetected languageChangeDetected);

        T visitVoiceInput(ClientMessageVoiceInput voiceInput);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(ConversationUpdateValue.class),
        @JsonSubTypes.Type(HangValue.class),
        @JsonSubTypes.Type(MetadataValue.class),
        @JsonSubTypes.Type(ModelOutputValue.class),
        @JsonSubTypes.Type(SpeechUpdateValue.class),
        @JsonSubTypes.Type(TranscriptValue.class),
        @JsonSubTypes.Type(ToolCallsValue.class),
        @JsonSubTypes.Type(ToolCallsResultValue.class),
        @JsonSubTypes.Type(TransferUpdateValue.class),
        @JsonSubTypes.Type(UserInterruptedValue.class),
        @JsonSubTypes.Type(LanguageChangeDetectedValue.class),
        @JsonSubTypes.Type(VoiceInputValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("conversation-update")
    private static final class ConversationUpdateValue implements Value {
        @JsonUnwrapped
        private ClientMessageConversationUpdate value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private ConversationUpdateValue() {}

        private ConversationUpdateValue(ClientMessageConversationUpdate value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitConversationUpdate(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof ConversationUpdateValue && equalTo((ConversationUpdateValue) other);
        }

        private boolean equalTo(ConversationUpdateValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ClientMessageMessage{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("hang")
    private static final class HangValue implements Value {
        @JsonUnwrapped
        private ClientMessageHang value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private HangValue() {}

        private HangValue(ClientMessageHang value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitHang(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof HangValue && equalTo((HangValue) other);
        }

        private boolean equalTo(HangValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ClientMessageMessage{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("metadata")
    private static final class MetadataValue implements Value {
        @JsonUnwrapped
        private ClientMessageMetadata value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private MetadataValue() {}

        private MetadataValue(ClientMessageMetadata value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitMetadata(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof MetadataValue && equalTo((MetadataValue) other);
        }

        private boolean equalTo(MetadataValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ClientMessageMessage{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("model-output")
    private static final class ModelOutputValue implements Value {
        @JsonUnwrapped
        private ClientMessageModelOutput value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private ModelOutputValue() {}

        private ModelOutputValue(ClientMessageModelOutput value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitModelOutput(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof ModelOutputValue && equalTo((ModelOutputValue) other);
        }

        private boolean equalTo(ModelOutputValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ClientMessageMessage{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("speech-update")
    private static final class SpeechUpdateValue implements Value {
        @JsonUnwrapped
        private ClientMessageSpeechUpdate value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private SpeechUpdateValue() {}

        private SpeechUpdateValue(ClientMessageSpeechUpdate value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitSpeechUpdate(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof SpeechUpdateValue && equalTo((SpeechUpdateValue) other);
        }

        private boolean equalTo(SpeechUpdateValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ClientMessageMessage{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("transcript")
    private static final class TranscriptValue implements Value {
        @JsonUnwrapped
        private ClientMessageTranscript value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private TranscriptValue() {}

        private TranscriptValue(ClientMessageTranscript value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitTranscript(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof TranscriptValue && equalTo((TranscriptValue) other);
        }

        private boolean equalTo(TranscriptValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ClientMessageMessage{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("tool-calls")
    private static final class ToolCallsValue implements Value {
        @JsonUnwrapped
        private ClientMessageToolCalls value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private ToolCallsValue() {}

        private ToolCallsValue(ClientMessageToolCalls value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitToolCalls(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof ToolCallsValue && equalTo((ToolCallsValue) other);
        }

        private boolean equalTo(ToolCallsValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ClientMessageMessage{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("tool-calls-result")
    private static final class ToolCallsResultValue implements Value {
        @JsonUnwrapped
        private ClientMessageToolCallsResult value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private ToolCallsResultValue() {}

        private ToolCallsResultValue(ClientMessageToolCallsResult value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitToolCallsResult(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof ToolCallsResultValue && equalTo((ToolCallsResultValue) other);
        }

        private boolean equalTo(ToolCallsResultValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ClientMessageMessage{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("transfer-update")
    private static final class TransferUpdateValue implements Value {
        @JsonUnwrapped
        private ClientMessageTransferUpdate value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private TransferUpdateValue() {}

        private TransferUpdateValue(ClientMessageTransferUpdate value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitTransferUpdate(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof TransferUpdateValue && equalTo((TransferUpdateValue) other);
        }

        private boolean equalTo(TransferUpdateValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ClientMessageMessage{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("user-interrupted")
    private static final class UserInterruptedValue implements Value {
        @JsonUnwrapped
        private ClientMessageUserInterrupted value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private UserInterruptedValue() {}

        private UserInterruptedValue(ClientMessageUserInterrupted value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitUserInterrupted(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof UserInterruptedValue && equalTo((UserInterruptedValue) other);
        }

        private boolean equalTo(UserInterruptedValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ClientMessageMessage{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("language-change-detected")
    private static final class LanguageChangeDetectedValue implements Value {
        @JsonUnwrapped
        private ClientMessageLanguageChangeDetected value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private LanguageChangeDetectedValue() {}

        private LanguageChangeDetectedValue(ClientMessageLanguageChangeDetected value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitLanguageChangeDetected(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof LanguageChangeDetectedValue && equalTo((LanguageChangeDetectedValue) other);
        }

        private boolean equalTo(LanguageChangeDetectedValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ClientMessageMessage{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("voice-input")
    private static final class VoiceInputValue implements Value {
        @JsonUnwrapped
        private ClientMessageVoiceInput value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private VoiceInputValue() {}

        private VoiceInputValue(ClientMessageVoiceInput value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitVoiceInput(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof VoiceInputValue && equalTo((VoiceInputValue) other);
        }

        private boolean equalTo(VoiceInputValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ClientMessageMessage{" + "value: " + value + "}";
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
            return "ClientMessageMessage{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
