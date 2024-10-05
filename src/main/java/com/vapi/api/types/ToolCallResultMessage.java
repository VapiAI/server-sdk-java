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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vapi.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ToolCallResultMessage.Builder.class)
public final class ToolCallResultMessage {
    private final String role;

    private final String toolCallId;

    private final String name;

    private final String result;

    private final double time;

    private final double secondsFromStart;

    private final Map<String, Object> additionalProperties;

    private ToolCallResultMessage(
            String role,
            String toolCallId,
            String name,
            String result,
            double time,
            double secondsFromStart,
            Map<String, Object> additionalProperties) {
        this.role = role;
        this.toolCallId = toolCallId;
        this.name = name;
        this.result = result;
        this.time = time;
        this.secondsFromStart = secondsFromStart;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The role of the tool call result in the conversation.
     */
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    /**
     * @return The ID of the tool call.
     */
    @JsonProperty("toolCallId")
    public String getToolCallId() {
        return toolCallId;
    }

    /**
     * @return The name of the tool that returned the result.
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return The result of the tool call in JSON format.
     */
    @JsonProperty("result")
    public String getResult() {
        return result;
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
        return other instanceof ToolCallResultMessage && equalTo((ToolCallResultMessage) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ToolCallResultMessage other) {
        return role.equals(other.role)
                && toolCallId.equals(other.toolCallId)
                && name.equals(other.name)
                && result.equals(other.result)
                && time == other.time
                && secondsFromStart == other.secondsFromStart;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.role, this.toolCallId, this.name, this.result, this.time, this.secondsFromStart);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RoleStage builder() {
        return new Builder();
    }

    public interface RoleStage {
        ToolCallIdStage role(@NotNull String role);

        Builder from(ToolCallResultMessage other);
    }

    public interface ToolCallIdStage {
        NameStage toolCallId(@NotNull String toolCallId);
    }

    public interface NameStage {
        ResultStage name(@NotNull String name);
    }

    public interface ResultStage {
        TimeStage result(@NotNull String result);
    }

    public interface TimeStage {
        SecondsFromStartStage time(double time);
    }

    public interface SecondsFromStartStage {
        _FinalStage secondsFromStart(double secondsFromStart);
    }

    public interface _FinalStage {
        ToolCallResultMessage build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements RoleStage,
                    ToolCallIdStage,
                    NameStage,
                    ResultStage,
                    TimeStage,
                    SecondsFromStartStage,
                    _FinalStage {
        private String role;

        private String toolCallId;

        private String name;

        private String result;

        private double time;

        private double secondsFromStart;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ToolCallResultMessage other) {
            role(other.getRole());
            toolCallId(other.getToolCallId());
            name(other.getName());
            result(other.getResult());
            time(other.getTime());
            secondsFromStart(other.getSecondsFromStart());
            return this;
        }

        /**
         * <p>The role of the tool call result in the conversation.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("role")
        public ToolCallIdStage role(@NotNull String role) {
            this.role = Objects.requireNonNull(role, "role must not be null");
            return this;
        }

        /**
         * <p>The ID of the tool call.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("toolCallId")
        public NameStage toolCallId(@NotNull String toolCallId) {
            this.toolCallId = Objects.requireNonNull(toolCallId, "toolCallId must not be null");
            return this;
        }

        /**
         * <p>The name of the tool that returned the result.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("name")
        public ResultStage name(@NotNull String name) {
            this.name = Objects.requireNonNull(name, "name must not be null");
            return this;
        }

        /**
         * <p>The result of the tool call in JSON format.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("result")
        public TimeStage result(@NotNull String result) {
            this.result = Objects.requireNonNull(result, "result must not be null");
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

        @java.lang.Override
        public ToolCallResultMessage build() {
            return new ToolCallResultMessage(
                    role, toolCallId, name, result, time, secondsFromStart, additionalProperties);
        }
    }
}