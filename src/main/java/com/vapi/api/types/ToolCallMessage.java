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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ToolCallMessage.Builder.class)
public final class ToolCallMessage {
    private final String role;

    private final List<Map<String, Object>> toolCalls;

    private final String message;

    private final double time;

    private final double secondsFromStart;

    private final Map<String, Object> additionalProperties;

    private ToolCallMessage(
            String role,
            List<Map<String, Object>> toolCalls,
            String message,
            double time,
            double secondsFromStart,
            Map<String, Object> additionalProperties) {
        this.role = role;
        this.toolCalls = toolCalls;
        this.message = message;
        this.time = time;
        this.secondsFromStart = secondsFromStart;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The role of the tool call in the conversation.
     */
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    /**
     * @return The list of tool calls made during the conversation.
     */
    @JsonProperty("toolCalls")
    public List<Map<String, Object>> getToolCalls() {
        return toolCalls;
    }

    /**
     * @return The message content for the tool call.
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * @return The timestamp when the message was sent.
     */
    @JsonProperty("time")
    public double getTime() {
        return time;
    }

    /**
     * @return The number of seconds from the start of the conversation.
     */
    @JsonProperty("secondsFromStart")
    public double getSecondsFromStart() {
        return secondsFromStart;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ToolCallMessage && equalTo((ToolCallMessage) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ToolCallMessage other) {
        return role.equals(other.role)
                && toolCalls.equals(other.toolCalls)
                && message.equals(other.message)
                && time == other.time
                && secondsFromStart == other.secondsFromStart;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.role, this.toolCalls, this.message, this.time, this.secondsFromStart);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RoleStage builder() {
        return new Builder();
    }

    public interface RoleStage {
        MessageStage role(@NotNull String role);

        Builder from(ToolCallMessage other);
    }

    public interface MessageStage {
        TimeStage message(@NotNull String message);
    }

    public interface TimeStage {
        SecondsFromStartStage time(double time);
    }

    public interface SecondsFromStartStage {
        _FinalStage secondsFromStart(double secondsFromStart);
    }

    public interface _FinalStage {
        ToolCallMessage build();

        _FinalStage toolCalls(List<Map<String, Object>> toolCalls);

        _FinalStage addToolCalls(Map<String, Object> toolCalls);

        _FinalStage addAllToolCalls(List<Map<String, Object>> toolCalls);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements RoleStage, MessageStage, TimeStage, SecondsFromStartStage, _FinalStage {
        private String role;

        private String message;

        private double time;

        private double secondsFromStart;

        private List<Map<String, Object>> toolCalls = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ToolCallMessage other) {
            role(other.getRole());
            toolCalls(other.getToolCalls());
            message(other.getMessage());
            time(other.getTime());
            secondsFromStart(other.getSecondsFromStart());
            return this;
        }

        /**
         * <p>The role of the tool call in the conversation.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("role")
        public MessageStage role(@NotNull String role) {
            this.role = Objects.requireNonNull(role, "role must not be null");
            return this;
        }

        /**
         * <p>The message content for the tool call.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("message")
        public TimeStage message(@NotNull String message) {
            this.message = Objects.requireNonNull(message, "message must not be null");
            return this;
        }

        /**
         * <p>The timestamp when the message was sent.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("time")
        public SecondsFromStartStage time(double time) {
            this.time = time;
            return this;
        }

        /**
         * <p>The number of seconds from the start of the conversation.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("secondsFromStart")
        public _FinalStage secondsFromStart(double secondsFromStart) {
            this.secondsFromStart = secondsFromStart;
            return this;
        }

        /**
         * <p>The list of tool calls made during the conversation.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllToolCalls(List<Map<String, Object>> toolCalls) {
            this.toolCalls.addAll(toolCalls);
            return this;
        }

        /**
         * <p>The list of tool calls made during the conversation.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addToolCalls(Map<String, Object> toolCalls) {
            this.toolCalls.add(toolCalls);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "toolCalls", nulls = Nulls.SKIP)
        public _FinalStage toolCalls(List<Map<String, Object>> toolCalls) {
            this.toolCalls.clear();
            this.toolCalls.addAll(toolCalls);
            return this;
        }

        @java.lang.Override
        public ToolCallMessage build() {
            return new ToolCallMessage(role, toolCalls, message, time, secondsFromStart, additionalProperties);
        }
    }
}