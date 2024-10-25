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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = TranscriptPlan.Builder.class)
public final class TranscriptPlan {
    private final Optional<Boolean> enabled;

    private final Optional<String> assistantName;

    private final Optional<String> userName;

    private final Map<String, Object> additionalProperties;

    private TranscriptPlan(
            Optional<Boolean> enabled,
            Optional<String> assistantName,
            Optional<String> userName,
            Map<String, Object> additionalProperties) {
        this.enabled = enabled;
        this.assistantName = assistantName;
        this.userName = userName;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This determines whether the transcript is stored in <code>call.artifact.transcript</code>. Defaults to true.
     * <p>@default true</p>
     */
    @JsonProperty("enabled")
    public Optional<Boolean> getEnabled() {
        return enabled;
    }

    /**
     * @return This is the name of the assistant in the transcript. Defaults to 'AI'.
     * <p>Usage:</p>
     * <ul>
     * <li>If you want to change the name of the assistant in the transcript, set this. Example, here is what the transcript would look like with <code>assistantName</code> set to 'Buyer':</li>
     * </ul>
     * <pre><code>User: Hello, how are you?
     * Buyer: I'm fine.
     * User: Do you want to buy a car?
     * Buyer: No.
     * </code></pre>
     * <p>@default 'AI'</p>
     */
    @JsonProperty("assistantName")
    public Optional<String> getAssistantName() {
        return assistantName;
    }

    /**
     * @return This is the name of the user in the transcript. Defaults to 'User'.
     * <p>Usage:</p>
     * <ul>
     * <li>If you want to change the name of the user in the transcript, set this. Example, here is what the transcript would look like with <code>userName</code> set to 'Seller':</li>
     * </ul>
     * <pre><code>Seller: Hello, how are you?
     * AI: I'm fine.
     * Seller: Do you want to buy a car?
     * AI: No.
     * </code></pre>
     * <p>@default 'User'</p>
     */
    @JsonProperty("userName")
    public Optional<String> getUserName() {
        return userName;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TranscriptPlan && equalTo((TranscriptPlan) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TranscriptPlan other) {
        return enabled.equals(other.enabled)
                && assistantName.equals(other.assistantName)
                && userName.equals(other.userName);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.enabled, this.assistantName, this.userName);
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
        private Optional<Boolean> enabled = Optional.empty();

        private Optional<String> assistantName = Optional.empty();

        private Optional<String> userName = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TranscriptPlan other) {
            enabled(other.getEnabled());
            assistantName(other.getAssistantName());
            userName(other.getUserName());
            return this;
        }

        @JsonSetter(value = "enabled", nulls = Nulls.SKIP)
        public Builder enabled(Optional<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Optional.ofNullable(enabled);
            return this;
        }

        @JsonSetter(value = "assistantName", nulls = Nulls.SKIP)
        public Builder assistantName(Optional<String> assistantName) {
            this.assistantName = assistantName;
            return this;
        }

        public Builder assistantName(String assistantName) {
            this.assistantName = Optional.ofNullable(assistantName);
            return this;
        }

        @JsonSetter(value = "userName", nulls = Nulls.SKIP)
        public Builder userName(Optional<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = Optional.ofNullable(userName);
            return this;
        }

        public TranscriptPlan build() {
            return new TranscriptPlan(enabled, assistantName, userName, additionalProperties);
        }
    }
}
