/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vapi.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ChatCompletionMessageMetadata.Builder.class)
public final class ChatCompletionMessageMetadata {
    private final String taskName;

    private final String taskType;

    private final String taskOutput;

    private final Optional<Map<String, Object>> taskState;

    private final Optional<List<String>> nodeTrace;

    private final Map<String, Object> additionalProperties;

    private ChatCompletionMessageMetadata(
            String taskName,
            String taskType,
            String taskOutput,
            Optional<Map<String, Object>> taskState,
            Optional<List<String>> nodeTrace,
            Map<String, Object> additionalProperties) {
        this.taskName = taskName;
        this.taskType = taskType;
        this.taskOutput = taskOutput;
        this.taskState = taskState;
        this.nodeTrace = nodeTrace;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("taskName")
    public String getTaskName() {
        return taskName;
    }

    @JsonProperty("taskType")
    public String getTaskType() {
        return taskType;
    }

    @JsonProperty("taskOutput")
    public String getTaskOutput() {
        return taskOutput;
    }

    @JsonProperty("taskState")
    public Optional<Map<String, Object>> getTaskState() {
        return taskState;
    }

    @JsonProperty("nodeTrace")
    public Optional<List<String>> getNodeTrace() {
        return nodeTrace;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ChatCompletionMessageMetadata && equalTo((ChatCompletionMessageMetadata) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ChatCompletionMessageMetadata other) {
        return taskName.equals(other.taskName)
                && taskType.equals(other.taskType)
                && taskOutput.equals(other.taskOutput)
                && taskState.equals(other.taskState)
                && nodeTrace.equals(other.nodeTrace);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.taskName, this.taskType, this.taskOutput, this.taskState, this.nodeTrace);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TaskNameStage builder() {
        return new Builder();
    }

    public interface TaskNameStage {
        TaskTypeStage taskName(@NotNull String taskName);

        Builder from(ChatCompletionMessageMetadata other);
    }

    public interface TaskTypeStage {
        TaskOutputStage taskType(@NotNull String taskType);
    }

    public interface TaskOutputStage {
        _FinalStage taskOutput(@NotNull String taskOutput);
    }

    public interface _FinalStage {
        ChatCompletionMessageMetadata build();

        _FinalStage taskState(Optional<Map<String, Object>> taskState);

        _FinalStage taskState(Map<String, Object> taskState);

        _FinalStage nodeTrace(Optional<List<String>> nodeTrace);

        _FinalStage nodeTrace(List<String> nodeTrace);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TaskNameStage, TaskTypeStage, TaskOutputStage, _FinalStage {
        private String taskName;

        private String taskType;

        private String taskOutput;

        private Optional<List<String>> nodeTrace = Optional.empty();

        private Optional<Map<String, Object>> taskState = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ChatCompletionMessageMetadata other) {
            taskName(other.getTaskName());
            taskType(other.getTaskType());
            taskOutput(other.getTaskOutput());
            taskState(other.getTaskState());
            nodeTrace(other.getNodeTrace());
            return this;
        }

        @java.lang.Override
        @JsonSetter("taskName")
        public TaskTypeStage taskName(@NotNull String taskName) {
            this.taskName = Objects.requireNonNull(taskName, "taskName must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("taskType")
        public TaskOutputStage taskType(@NotNull String taskType) {
            this.taskType = Objects.requireNonNull(taskType, "taskType must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("taskOutput")
        public _FinalStage taskOutput(@NotNull String taskOutput) {
            this.taskOutput = Objects.requireNonNull(taskOutput, "taskOutput must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage nodeTrace(List<String> nodeTrace) {
            this.nodeTrace = Optional.ofNullable(nodeTrace);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "nodeTrace", nulls = Nulls.SKIP)
        public _FinalStage nodeTrace(Optional<List<String>> nodeTrace) {
            this.nodeTrace = nodeTrace;
            return this;
        }

        @java.lang.Override
        public _FinalStage taskState(Map<String, Object> taskState) {
            this.taskState = Optional.ofNullable(taskState);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "taskState", nulls = Nulls.SKIP)
        public _FinalStage taskState(Optional<Map<String, Object>> taskState) {
            this.taskState = taskState;
            return this;
        }

        @java.lang.Override
        public ChatCompletionMessageMetadata build() {
            return new ChatCompletionMessageMetadata(
                    taskName, taskType, taskOutput, taskState, nodeTrace, additionalProperties);
        }
    }
}
