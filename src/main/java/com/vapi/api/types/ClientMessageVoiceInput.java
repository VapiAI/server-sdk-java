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
@JsonDeserialize(builder = ClientMessageVoiceInput.Builder.class)
public final class ClientMessageVoiceInput {
    private final String input;

    private final Map<String, Object> additionalProperties;

    private ClientMessageVoiceInput(String input, Map<String, Object> additionalProperties) {
        this.input = input;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the type of the message. &quot;voice-input&quot; is sent when a generation is requested from voice provider.
     */
    @JsonProperty("type")
    public String getType() {
        return "voice-input";
    }

    /**
     * @return This is the voice input content
     */
    @JsonProperty("input")
    public String getInput() {
        return input;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientMessageVoiceInput && equalTo((ClientMessageVoiceInput) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ClientMessageVoiceInput other) {
        return input.equals(other.input);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.input);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static InputStage builder() {
        return new Builder();
    }

    public interface InputStage {
        _FinalStage input(@NotNull String input);

        Builder from(ClientMessageVoiceInput other);
    }

    public interface _FinalStage {
        ClientMessageVoiceInput build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements InputStage, _FinalStage {
        private String input;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ClientMessageVoiceInput other) {
            input(other.getInput());
            return this;
        }

        /**
         * <p>This is the voice input content</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("input")
        public _FinalStage input(@NotNull String input) {
            this.input = Objects.requireNonNull(input, "input must not be null");
            return this;
        }

        @java.lang.Override
        public ClientMessageVoiceInput build() {
            return new ClientMessageVoiceInput(input, additionalProperties);
        }
    }
}
