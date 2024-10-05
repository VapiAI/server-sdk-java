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
@JsonDeserialize(builder = BlockCompleteMessage.Builder.class)
public final class BlockCompleteMessage {
    private final Optional<List<BlockCompleteMessageConditionsItem>> conditions;

    private final String content;

    private final Map<String, Object> additionalProperties;

    private BlockCompleteMessage(
            Optional<List<BlockCompleteMessageConditionsItem>> conditions,
            String content,
            Map<String, Object> additionalProperties) {
        this.conditions = conditions;
        this.content = content;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is an optional array of conditions that must be met for this message to be triggered.
     */
    @JsonProperty("conditions")
    public Optional<List<BlockCompleteMessageConditionsItem>> getConditions() {
        return conditions;
    }

    /**
     * @return This is the content that the assistant will say when this message is triggered.
     */
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BlockCompleteMessage && equalTo((BlockCompleteMessage) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BlockCompleteMessage other) {
        return conditions.equals(other.conditions) && content.equals(other.content);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.conditions, this.content);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ContentStage builder() {
        return new Builder();
    }

    public interface ContentStage {
        _FinalStage content(@NotNull String content);

        Builder from(BlockCompleteMessage other);
    }

    public interface _FinalStage {
        BlockCompleteMessage build();

        _FinalStage conditions(Optional<List<BlockCompleteMessageConditionsItem>> conditions);

        _FinalStage conditions(List<BlockCompleteMessageConditionsItem> conditions);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ContentStage, _FinalStage {
        private String content;

        private Optional<List<BlockCompleteMessageConditionsItem>> conditions = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(BlockCompleteMessage other) {
            conditions(other.getConditions());
            content(other.getContent());
            return this;
        }

        /**
         * <p>This is the content that the assistant will say when this message is triggered.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("content")
        public _FinalStage content(@NotNull String content) {
            this.content = Objects.requireNonNull(content, "content must not be null");
            return this;
        }

        /**
         * <p>This is an optional array of conditions that must be met for this message to be triggered.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage conditions(List<BlockCompleteMessageConditionsItem> conditions) {
            this.conditions = Optional.ofNullable(conditions);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "conditions", nulls = Nulls.SKIP)
        public _FinalStage conditions(Optional<List<BlockCompleteMessageConditionsItem>> conditions) {
            this.conditions = conditions;
            return this;
        }

        @java.lang.Override
        public BlockCompleteMessage build() {
            return new BlockCompleteMessage(conditions, content, additionalProperties);
        }
    }
}