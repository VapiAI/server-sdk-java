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
@JsonDeserialize(builder = CustomMessage.Builder.class)
public final class CustomMessage {
    private final Optional<List<TextContent>> contents;

    private final Optional<String> content;

    private final Map<String, Object> additionalProperties;

    private CustomMessage(
            Optional<List<TextContent>> contents, Optional<String> content, Map<String, Object> additionalProperties) {
        this.contents = contents;
        this.content = content;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is an alternative to the <code>content</code> property. It allows to specify variants of the same content, one per language.
     * <p>Usage:</p>
     * <ul>
     * <li>If your assistants are multilingual, you can provide content for each language.</li>
     * <li>If you don't provide content for a language, the first item in the array will be automatically translated to the active language at that moment.</li>
     * </ul>
     * <p>This will override the <code>content</code> property.</p>
     */
    @JsonProperty("contents")
    public Optional<List<TextContent>> getContents() {
        return contents;
    }

    /**
     * @return This is a custom message.
     */
    @JsonProperty("type")
    public String getType() {
        return "custom-message";
    }

    /**
     * @return This is the content that the assistant will say when this message is triggered.
     */
    @JsonProperty("content")
    public Optional<String> getContent() {
        return content;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CustomMessage && equalTo((CustomMessage) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CustomMessage other) {
        return contents.equals(other.contents) && content.equals(other.content);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.contents, this.content);
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
        private Optional<List<TextContent>> contents = Optional.empty();

        private Optional<String> content = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CustomMessage other) {
            contents(other.getContents());
            content(other.getContent());
            return this;
        }

        @JsonSetter(value = "contents", nulls = Nulls.SKIP)
        public Builder contents(Optional<List<TextContent>> contents) {
            this.contents = contents;
            return this;
        }

        public Builder contents(List<TextContent> contents) {
            this.contents = Optional.ofNullable(contents);
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

        public CustomMessage build() {
            return new CustomMessage(contents, content, additionalProperties);
        }
    }
}
