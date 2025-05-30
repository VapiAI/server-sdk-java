/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vapi.api.core.Nullable;
import com.vapi.api.core.NullableNonemptyFilter;
import com.vapi.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ChatCompletionMessageWorkflows.Builder.class)
public final class ChatCompletionMessageWorkflows {
    private final Map<String, Object> role;

    private final Optional<String> content;

    private final Optional<ChatCompletionMessageMetadata> metadata;

    private final Map<String, Object> additionalProperties;

    private ChatCompletionMessageWorkflows(
            Map<String, Object> role,
            Optional<String> content,
            Optional<ChatCompletionMessageMetadata> metadata,
            Map<String, Object> additionalProperties) {
        this.role = role;
        this.content = content;
        this.metadata = metadata;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("role")
    public Map<String, Object> getRole() {
        return role;
    }

    @JsonIgnore
    public Optional<String> getContent() {
        if (content == null) {
            return Optional.empty();
        }
        return content;
    }

    @JsonProperty("metadata")
    public Optional<ChatCompletionMessageMetadata> getMetadata() {
        return metadata;
    }

    @JsonInclude(value = JsonInclude.Include.CUSTOM, valueFilter = NullableNonemptyFilter.class)
    @JsonProperty("content")
    private Optional<String> _getContent() {
        return content;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ChatCompletionMessageWorkflows && equalTo((ChatCompletionMessageWorkflows) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ChatCompletionMessageWorkflows other) {
        return role.equals(other.role) && content.equals(other.content) && metadata.equals(other.metadata);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.role, this.content, this.metadata);
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
        private Map<String, Object> role = new LinkedHashMap<>();

        private Optional<String> content = Optional.empty();

        private Optional<ChatCompletionMessageMetadata> metadata = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ChatCompletionMessageWorkflows other) {
            role(other.getRole());
            content(other.getContent());
            metadata(other.getMetadata());
            return this;
        }

        @JsonSetter(value = "role", nulls = Nulls.SKIP)
        public Builder role(Map<String, Object> role) {
            this.role.clear();
            this.role.putAll(role);
            return this;
        }

        public Builder putAllRole(Map<String, Object> role) {
            this.role.putAll(role);
            return this;
        }

        public Builder role(String key, Object value) {
            this.role.put(key, value);
            return this;
        }

        @JsonSetter(value = "content", nulls = Nulls.SKIP)
        public Builder content(Optional<String> content) {
            this.content = content;
            return this;
        }

        public Builder content(String content) {
            this.content = Optional.ofNullable(content);
            return this;
        }

        public Builder content(Nullable<String> content) {
            if (content.isNull()) {
                this.content = null;
            } else if (content.isEmpty()) {
                this.content = Optional.empty();
            } else {
                this.content = Optional.of(content.get());
            }
            return this;
        }

        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public Builder metadata(Optional<ChatCompletionMessageMetadata> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(ChatCompletionMessageMetadata metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public ChatCompletionMessageWorkflows build() {
            return new ChatCompletionMessageWorkflows(role, content, metadata, additionalProperties);
        }
    }
}
