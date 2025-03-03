/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.resources.blocks.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.vapi.api.types.UpdateConversationBlockDto;
import com.vapi.api.types.UpdateToolCallBlockDto;
import com.vapi.api.types.UpdateWorkflowBlockDto;
import java.util.Objects;
import java.util.Optional;

public final class BlocksUpdateRequest {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private BlocksUpdateRequest(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static BlocksUpdateRequest conversation(UpdateConversationBlockDto value) {
        return new BlocksUpdateRequest(new ConversationValue(value));
    }

    public static BlocksUpdateRequest toolCall(UpdateToolCallBlockDto value) {
        return new BlocksUpdateRequest(new ToolCallValue(value));
    }

    public static BlocksUpdateRequest workflow(UpdateWorkflowBlockDto value) {
        return new BlocksUpdateRequest(new WorkflowValue(value));
    }

    public boolean isConversation() {
        return value instanceof ConversationValue;
    }

    public boolean isToolCall() {
        return value instanceof ToolCallValue;
    }

    public boolean isWorkflow() {
        return value instanceof WorkflowValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<UpdateConversationBlockDto> getConversation() {
        if (isConversation()) {
            return Optional.of(((ConversationValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<UpdateToolCallBlockDto> getToolCall() {
        if (isToolCall()) {
            return Optional.of(((ToolCallValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<UpdateWorkflowBlockDto> getWorkflow() {
        if (isWorkflow()) {
            return Optional.of(((WorkflowValue) value).value);
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
        T visitConversation(UpdateConversationBlockDto conversation);

        T visitToolCall(UpdateToolCallBlockDto toolCall);

        T visitWorkflow(UpdateWorkflowBlockDto workflow);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(ConversationValue.class),
        @JsonSubTypes.Type(ToolCallValue.class),
        @JsonSubTypes.Type(WorkflowValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("conversation")
    @JsonIgnoreProperties("type")
    private static final class ConversationValue implements Value {
        @JsonUnwrapped
        private UpdateConversationBlockDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private ConversationValue() {}

        private ConversationValue(UpdateConversationBlockDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitConversation(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof ConversationValue && equalTo((ConversationValue) other);
        }

        private boolean equalTo(ConversationValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "BlocksUpdateRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("tool-call")
    @JsonIgnoreProperties("type")
    private static final class ToolCallValue implements Value {
        @JsonUnwrapped
        private UpdateToolCallBlockDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private ToolCallValue() {}

        private ToolCallValue(UpdateToolCallBlockDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitToolCall(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof ToolCallValue && equalTo((ToolCallValue) other);
        }

        private boolean equalTo(ToolCallValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "BlocksUpdateRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("workflow")
    @JsonIgnoreProperties("type")
    private static final class WorkflowValue implements Value {
        @JsonUnwrapped
        private UpdateWorkflowBlockDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private WorkflowValue() {}

        private WorkflowValue(UpdateWorkflowBlockDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitWorkflow(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof WorkflowValue && equalTo((WorkflowValue) other);
        }

        private boolean equalTo(WorkflowValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "BlocksUpdateRequest{" + "value: " + value + "}";
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
            return "BlocksUpdateRequest{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
