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

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CreateGoHighLevelCalendarAvailabilityToolDto.Builder.class)
public final class CreateGoHighLevelCalendarAvailabilityToolDto {
    private final Optional<Boolean> async;

    private final Optional<List<CreateGoHighLevelCalendarAvailabilityToolDtoMessagesItem>> messages;

    private final Optional<OpenAiFunction> function;

    private final Optional<Server> server;

    private final Map<String, Object> additionalProperties;

    private CreateGoHighLevelCalendarAvailabilityToolDto(
            Optional<Boolean> async,
            Optional<List<CreateGoHighLevelCalendarAvailabilityToolDtoMessagesItem>> messages,
            Optional<OpenAiFunction> function,
            Optional<Server> server,
            Map<String, Object> additionalProperties) {
        this.async = async;
        this.messages = messages;
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
    public Optional<List<CreateGoHighLevelCalendarAvailabilityToolDtoMessagesItem>> getMessages() {
        return messages;
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
        return other instanceof CreateGoHighLevelCalendarAvailabilityToolDto
                && equalTo((CreateGoHighLevelCalendarAvailabilityToolDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreateGoHighLevelCalendarAvailabilityToolDto other) {
        return async.equals(other.async)
                && messages.equals(other.messages)
                && function.equals(other.function)
                && server.equals(other.server);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.async, this.messages, this.function, this.server);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<Boolean> async = Optional.empty();

        private Optional<List<CreateGoHighLevelCalendarAvailabilityToolDtoMessagesItem>> messages = Optional.empty();

        private Optional<OpenAiFunction> function = Optional.empty();

        private Optional<Server> server = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CreateGoHighLevelCalendarAvailabilityToolDto other) {
            async(other.getAsync());
            messages(other.getMessages());
            function(other.getFunction());
            server(other.getServer());
            return this;
        }

        @JsonSetter(value = "async", nulls = Nulls.SKIP)
        public Builder async(Optional<Boolean> async) {
            this.async = async;
            return this;
        }

        public Builder async(Boolean async) {
            this.async = Optional.ofNullable(async);
            return this;
        }

        @JsonSetter(value = "messages", nulls = Nulls.SKIP)
        public Builder messages(Optional<List<CreateGoHighLevelCalendarAvailabilityToolDtoMessagesItem>> messages) {
            this.messages = messages;
            return this;
        }

        public Builder messages(List<CreateGoHighLevelCalendarAvailabilityToolDtoMessagesItem> messages) {
            this.messages = Optional.ofNullable(messages);
            return this;
        }

        @JsonSetter(value = "function", nulls = Nulls.SKIP)
        public Builder function(Optional<OpenAiFunction> function) {
            this.function = function;
            return this;
        }

        public Builder function(OpenAiFunction function) {
            this.function = Optional.ofNullable(function);
            return this;
        }

        @JsonSetter(value = "server", nulls = Nulls.SKIP)
        public Builder server(Optional<Server> server) {
            this.server = server;
            return this;
        }

        public Builder server(Server server) {
            this.server = Optional.ofNullable(server);
            return this;
        }

        public CreateGoHighLevelCalendarAvailabilityToolDto build() {
            return new CreateGoHighLevelCalendarAvailabilityToolDto(
                    async, messages, function, server, additionalProperties);
        }
    }
}
