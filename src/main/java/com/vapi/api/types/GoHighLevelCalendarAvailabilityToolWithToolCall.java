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
@JsonDeserialize(builder = GoHighLevelCalendarAvailabilityToolWithToolCall.Builder.class)
public final class GoHighLevelCalendarAvailabilityToolWithToolCall {
    private final Optional<Boolean> async;

    private final Optional<List<GoHighLevelCalendarAvailabilityToolWithToolCallMessagesItem>> messages;

    private final ToolCall toolCall;

    private final Optional<OpenAiFunction> function;

    private final Optional<Server> server;

    private final Map<String, Object> additionalProperties;

    private GoHighLevelCalendarAvailabilityToolWithToolCall(
            Optional<Boolean> async,
            Optional<List<GoHighLevelCalendarAvailabilityToolWithToolCallMessagesItem>> messages,
            ToolCall toolCall,
            Optional<OpenAiFunction> function,
            Optional<Server> server,
            Map<String, Object> additionalProperties) {
        this.async = async;
        this.messages = messages;
        this.toolCall = toolCall;
        this.function = function;
        this.server = server;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This determines if the tool is async.
     * <p>If async, the assistant will move forward without waiting for your server to respond. This is useful if you just want to trigger something on your server.</p>
     * <p>If sync, the assistant will wait for your server to respond. This is useful if want assistant to respond with the result from your server.</p>
     * <p>Defaults to synchronous (<code>false</code>).</p>
     */
    @JsonProperty("async")
    public Optional<Boolean> getAsync() {
        return async;
    }

    /**
     * @return These are the messages that will be spoken to the user as the tool is running.
     * <p>For some tools, this is auto-filled based on special fields like <code>tool.destinations</code>. For others like the function tool, these can be custom configured.</p>
     */
    @JsonProperty("messages")
    public Optional<List<GoHighLevelCalendarAvailabilityToolWithToolCallMessagesItem>> getMessages() {
        return messages;
    }

    /**
     * @return The type of tool. &quot;gohighlevel.calendar.availability.check&quot; for GoHighLevel Calendar availability check tool.
     */
    @JsonProperty("type")
    public String getType() {
        return "gohighlevel.calendar.availability.check";
    }

    @JsonProperty("toolCall")
    public ToolCall getToolCall() {
        return toolCall;
    }

    /**
     * @return This is the function definition of the tool.
     * <p>For <code>endCall</code>, <code>transferCall</code>, and <code>dtmf</code> tools, this is auto-filled based on tool-specific fields like <code>tool.destinations</code>. But, even in those cases, you can provide a custom function definition for advanced use cases.</p>
     * <p>An example of an advanced use case is if you want to customize the message that's spoken for <code>endCall</code> tool. You can specify a function where it returns an argument &quot;reason&quot;. Then, in <code>messages</code> array, you can have many &quot;request-complete&quot; messages. One of these messages will be triggered if the <code>messages[].conditions</code> matches the &quot;reason&quot; argument.</p>
     */
    @JsonProperty("function")
    public Optional<OpenAiFunction> getFunction() {
        return function;
    }

    /**
     * @return This is the server that will be hit when this tool is requested by the model.
     * <p>All requests will be sent with the call object among other things. You can find more details in the Server URL documentation.</p>
     * <p>This overrides the serverUrl set on the org and the phoneNumber. Order of precedence: highest tool.server.url, then assistant.serverUrl, then phoneNumber.serverUrl, then org.serverUrl.</p>
     */
    @JsonProperty("server")
    public Optional<Server> getServer() {
        return server;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GoHighLevelCalendarAvailabilityToolWithToolCall
                && equalTo((GoHighLevelCalendarAvailabilityToolWithToolCall) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GoHighLevelCalendarAvailabilityToolWithToolCall other) {
        return async.equals(other.async)
                && messages.equals(other.messages)
                && toolCall.equals(other.toolCall)
                && function.equals(other.function)
                && server.equals(other.server);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.async, this.messages, this.toolCall, this.function, this.server);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ToolCallStage builder() {
        return new Builder();
    }

    public interface ToolCallStage {
        _FinalStage toolCall(@NotNull ToolCall toolCall);

        Builder from(GoHighLevelCalendarAvailabilityToolWithToolCall other);
    }

    public interface _FinalStage {
        GoHighLevelCalendarAvailabilityToolWithToolCall build();

        _FinalStage async(Optional<Boolean> async);

        _FinalStage async(Boolean async);

        _FinalStage messages(Optional<List<GoHighLevelCalendarAvailabilityToolWithToolCallMessagesItem>> messages);

        _FinalStage messages(List<GoHighLevelCalendarAvailabilityToolWithToolCallMessagesItem> messages);

        _FinalStage function(Optional<OpenAiFunction> function);

        _FinalStage function(OpenAiFunction function);

        _FinalStage server(Optional<Server> server);

        _FinalStage server(Server server);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ToolCallStage, _FinalStage {
        private ToolCall toolCall;

        private Optional<Server> server = Optional.empty();

        private Optional<OpenAiFunction> function = Optional.empty();

        private Optional<List<GoHighLevelCalendarAvailabilityToolWithToolCallMessagesItem>> messages = Optional.empty();

        private Optional<Boolean> async = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(GoHighLevelCalendarAvailabilityToolWithToolCall other) {
            async(other.getAsync());
            messages(other.getMessages());
            toolCall(other.getToolCall());
            function(other.getFunction());
            server(other.getServer());
            return this;
        }

        @java.lang.Override
        @JsonSetter("toolCall")
        public _FinalStage toolCall(@NotNull ToolCall toolCall) {
            this.toolCall = Objects.requireNonNull(toolCall, "toolCall must not be null");
            return this;
        }

        /**
         * <p>This is the server that will be hit when this tool is requested by the model.</p>
         * <p>All requests will be sent with the call object among other things. You can find more details in the Server URL documentation.</p>
         * <p>This overrides the serverUrl set on the org and the phoneNumber. Order of precedence: highest tool.server.url, then assistant.serverUrl, then phoneNumber.serverUrl, then org.serverUrl.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage server(Server server) {
            this.server = Optional.ofNullable(server);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "server", nulls = Nulls.SKIP)
        public _FinalStage server(Optional<Server> server) {
            this.server = server;
            return this;
        }

        /**
         * <p>This is the function definition of the tool.</p>
         * <p>For <code>endCall</code>, <code>transferCall</code>, and <code>dtmf</code> tools, this is auto-filled based on tool-specific fields like <code>tool.destinations</code>. But, even in those cases, you can provide a custom function definition for advanced use cases.</p>
         * <p>An example of an advanced use case is if you want to customize the message that's spoken for <code>endCall</code> tool. You can specify a function where it returns an argument &quot;reason&quot;. Then, in <code>messages</code> array, you can have many &quot;request-complete&quot; messages. One of these messages will be triggered if the <code>messages[].conditions</code> matches the &quot;reason&quot; argument.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage function(OpenAiFunction function) {
            this.function = Optional.ofNullable(function);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "function", nulls = Nulls.SKIP)
        public _FinalStage function(Optional<OpenAiFunction> function) {
            this.function = function;
            return this;
        }

        /**
         * <p>These are the messages that will be spoken to the user as the tool is running.</p>
         * <p>For some tools, this is auto-filled based on special fields like <code>tool.destinations</code>. For others like the function tool, these can be custom configured.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage messages(List<GoHighLevelCalendarAvailabilityToolWithToolCallMessagesItem> messages) {
            this.messages = Optional.ofNullable(messages);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "messages", nulls = Nulls.SKIP)
        public _FinalStage messages(
                Optional<List<GoHighLevelCalendarAvailabilityToolWithToolCallMessagesItem>> messages) {
            this.messages = messages;
            return this;
        }

        /**
         * <p>This determines if the tool is async.</p>
         * <p>If async, the assistant will move forward without waiting for your server to respond. This is useful if you just want to trigger something on your server.</p>
         * <p>If sync, the assistant will wait for your server to respond. This is useful if want assistant to respond with the result from your server.</p>
         * <p>Defaults to synchronous (<code>false</code>).</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage async(Boolean async) {
            this.async = Optional.ofNullable(async);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "async", nulls = Nulls.SKIP)
        public _FinalStage async(Optional<Boolean> async) {
            this.async = async;
            return this;
        }

        @java.lang.Override
        public GoHighLevelCalendarAvailabilityToolWithToolCall build() {
            return new GoHighLevelCalendarAvailabilityToolWithToolCall(
                    async, messages, toolCall, function, server, additionalProperties);
        }
    }
}
