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
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ExactReplacement.Builder.class)
public final class ExactReplacement {
    private final Optional<Boolean> replaceAllEnabled;

    private final String key;

    private final String value;

    private final Map<String, Object> additionalProperties;

    private ExactReplacement(
            Optional<Boolean> replaceAllEnabled, String key, String value, Map<String, Object> additionalProperties) {
        this.replaceAllEnabled = replaceAllEnabled;
        this.key = key;
        this.value = value;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This option let's you control whether to replace all instances of the key or only the first one. By default, it only replaces the first instance.
     * Examples:
     * <ul>
     * <li>For { type: 'exact', key: 'hello', value: 'hi', replaceAllEnabled: false }. Before: &quot;hello world, hello universe&quot; | After: &quot;hi world, hello universe&quot;</li>
     * <li>For { type: 'exact', key: 'hello', value: 'hi', replaceAllEnabled: true }. Before: &quot;hello world, hello universe&quot; | After: &quot;hi world, hi universe&quot;
     * @default false</li>
     * </ul>
     */
    @JsonProperty("replaceAllEnabled")
    public Optional<Boolean> getReplaceAllEnabled() {
        return replaceAllEnabled;
    }

    /**
     * @return This is the key to replace.
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * @return This is the value that will replace the match.
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ExactReplacement && equalTo((ExactReplacement) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ExactReplacement other) {
        return replaceAllEnabled.equals(other.replaceAllEnabled) && key.equals(other.key) && value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.replaceAllEnabled, this.key, this.value);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static KeyStage builder() {
        return new Builder();
    }

    public interface KeyStage {
        ValueStage key(@NotNull String key);

        Builder from(ExactReplacement other);
    }

    public interface ValueStage {
        _FinalStage value(@NotNull String value);
    }

    public interface _FinalStage {
        ExactReplacement build();

        _FinalStage replaceAllEnabled(Optional<Boolean> replaceAllEnabled);

        _FinalStage replaceAllEnabled(Boolean replaceAllEnabled);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements KeyStage, ValueStage, _FinalStage {
        private String key;

        private String value;

        private Optional<Boolean> replaceAllEnabled = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ExactReplacement other) {
            replaceAllEnabled(other.getReplaceAllEnabled());
            key(other.getKey());
            value(other.getValue());
            return this;
        }

        /**
         * <p>This is the key to replace.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("key")
        public ValueStage key(@NotNull String key) {
            this.key = Objects.requireNonNull(key, "key must not be null");
            return this;
        }

        /**
         * <p>This is the value that will replace the match.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("value")
        public _FinalStage value(@NotNull String value) {
            this.value = Objects.requireNonNull(value, "value must not be null");
            return this;
        }

        /**
         * <p>This option let's you control whether to replace all instances of the key or only the first one. By default, it only replaces the first instance.
         * Examples:</p>
         * <ul>
         * <li>For { type: 'exact', key: 'hello', value: 'hi', replaceAllEnabled: false }. Before: &quot;hello world, hello universe&quot; | After: &quot;hi world, hello universe&quot;</li>
         * <li>For { type: 'exact', key: 'hello', value: 'hi', replaceAllEnabled: true }. Before: &quot;hello world, hello universe&quot; | After: &quot;hi world, hi universe&quot;
         * @default false</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage replaceAllEnabled(Boolean replaceAllEnabled) {
            this.replaceAllEnabled = Optional.ofNullable(replaceAllEnabled);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "replaceAllEnabled", nulls = Nulls.SKIP)
        public _FinalStage replaceAllEnabled(Optional<Boolean> replaceAllEnabled) {
            this.replaceAllEnabled = replaceAllEnabled;
            return this;
        }

        @java.lang.Override
        public ExactReplacement build() {
            return new ExactReplacement(replaceAllEnabled, key, value, additionalProperties);
        }
    }
}
