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
@JsonDeserialize(builder = MessagePlan.Builder.class)
public final class MessagePlan {
    private final Optional<List<String>> idleMessages;

    private final Optional<Double> idleMessageMaxSpokenCount;

    private final Optional<Double> idleTimeoutSeconds;

    private final Map<String, Object> additionalProperties;

    private MessagePlan(
            Optional<List<String>> idleMessages,
            Optional<Double> idleMessageMaxSpokenCount,
            Optional<Double> idleTimeoutSeconds,
            Map<String, Object> additionalProperties) {
        this.idleMessages = idleMessages;
        this.idleMessageMaxSpokenCount = idleMessageMaxSpokenCount;
        this.idleTimeoutSeconds = idleTimeoutSeconds;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This are the messages that the assistant will speak when the user hasn't responded for <code>idleTimeoutSeconds</code>. Each time the timeout is triggered, a random message will be chosen from this array.
     * <p>Usage:</p>
     * <ul>
     * <li>If user gets distracted and doesn't respond for a while, this can be used to grab their attention.</li>
     * <li>If the transcriber doesn't pick up what the user said, this can be used to ask the user to repeat themselves. (From the perspective of the assistant, the conversation is idle since it didn't &quot;hear&quot; any user messages.)</li>
     * </ul>
     * <p>@default null (no idle message is spoken)</p>
     */
    @JsonProperty("idleMessages")
    public Optional<List<String>> getIdleMessages() {
        return idleMessages;
    }

    /**
     * @return This determines the maximum number of times <code>idleMessages</code> can be spoken during the call.
     * <p>@default 3</p>
     */
    @JsonProperty("idleMessageMaxSpokenCount")
    public Optional<Double> getIdleMessageMaxSpokenCount() {
        return idleMessageMaxSpokenCount;
    }

    /**
     * @return This is the timeout in seconds before a message from <code>idleMessages</code> is spoken. The clock starts when the assistant finishes speaking and remains active until the user speaks.
     * <p>@default 10</p>
     */
    @JsonProperty("idleTimeoutSeconds")
    public Optional<Double> getIdleTimeoutSeconds() {
        return idleTimeoutSeconds;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof MessagePlan && equalTo((MessagePlan) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(MessagePlan other) {
        return idleMessages.equals(other.idleMessages)
                && idleMessageMaxSpokenCount.equals(other.idleMessageMaxSpokenCount)
                && idleTimeoutSeconds.equals(other.idleTimeoutSeconds);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.idleMessages, this.idleMessageMaxSpokenCount, this.idleTimeoutSeconds);
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
        private Optional<List<String>> idleMessages = Optional.empty();

        private Optional<Double> idleMessageMaxSpokenCount = Optional.empty();

        private Optional<Double> idleTimeoutSeconds = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(MessagePlan other) {
            idleMessages(other.getIdleMessages());
            idleMessageMaxSpokenCount(other.getIdleMessageMaxSpokenCount());
            idleTimeoutSeconds(other.getIdleTimeoutSeconds());
            return this;
        }

        @JsonSetter(value = "idleMessages", nulls = Nulls.SKIP)
        public Builder idleMessages(Optional<List<String>> idleMessages) {
            this.idleMessages = idleMessages;
            return this;
        }

        public Builder idleMessages(List<String> idleMessages) {
            this.idleMessages = Optional.ofNullable(idleMessages);
            return this;
        }

        @JsonSetter(value = "idleMessageMaxSpokenCount", nulls = Nulls.SKIP)
        public Builder idleMessageMaxSpokenCount(Optional<Double> idleMessageMaxSpokenCount) {
            this.idleMessageMaxSpokenCount = idleMessageMaxSpokenCount;
            return this;
        }

        public Builder idleMessageMaxSpokenCount(Double idleMessageMaxSpokenCount) {
            this.idleMessageMaxSpokenCount = Optional.ofNullable(idleMessageMaxSpokenCount);
            return this;
        }

        @JsonSetter(value = "idleTimeoutSeconds", nulls = Nulls.SKIP)
        public Builder idleTimeoutSeconds(Optional<Double> idleTimeoutSeconds) {
            this.idleTimeoutSeconds = idleTimeoutSeconds;
            return this;
        }

        public Builder idleTimeoutSeconds(Double idleTimeoutSeconds) {
            this.idleTimeoutSeconds = Optional.ofNullable(idleTimeoutSeconds);
            return this;
        }

        public MessagePlan build() {
            return new MessagePlan(idleMessages, idleMessageMaxSpokenCount, idleTimeoutSeconds, additionalProperties);
        }
    }
}