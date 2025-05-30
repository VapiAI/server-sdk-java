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
@JsonDeserialize(builder = CartesiaExperimentalControls.Builder.class)
public final class CartesiaExperimentalControls {
    private final Optional<CartesiaSpeedControl> speed;

    private final Optional<CartesiaExperimentalControlsEmotion> emotion;

    private final Map<String, Object> additionalProperties;

    private CartesiaExperimentalControls(
            Optional<CartesiaSpeedControl> speed,
            Optional<CartesiaExperimentalControlsEmotion> emotion,
            Map<String, Object> additionalProperties) {
        this.speed = speed;
        this.emotion = emotion;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("speed")
    public Optional<CartesiaSpeedControl> getSpeed() {
        return speed;
    }

    @JsonProperty("emotion")
    public Optional<CartesiaExperimentalControlsEmotion> getEmotion() {
        return emotion;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CartesiaExperimentalControls && equalTo((CartesiaExperimentalControls) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CartesiaExperimentalControls other) {
        return speed.equals(other.speed) && emotion.equals(other.emotion);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.speed, this.emotion);
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
        private Optional<CartesiaSpeedControl> speed = Optional.empty();

        private Optional<CartesiaExperimentalControlsEmotion> emotion = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CartesiaExperimentalControls other) {
            speed(other.getSpeed());
            emotion(other.getEmotion());
            return this;
        }

        @JsonSetter(value = "speed", nulls = Nulls.SKIP)
        public Builder speed(Optional<CartesiaSpeedControl> speed) {
            this.speed = speed;
            return this;
        }

        public Builder speed(CartesiaSpeedControl speed) {
            this.speed = Optional.ofNullable(speed);
            return this;
        }

        @JsonSetter(value = "emotion", nulls = Nulls.SKIP)
        public Builder emotion(Optional<CartesiaExperimentalControlsEmotion> emotion) {
            this.emotion = emotion;
            return this;
        }

        public Builder emotion(CartesiaExperimentalControlsEmotion emotion) {
            this.emotion = Optional.ofNullable(emotion);
            return this;
        }

        public CartesiaExperimentalControls build() {
            return new CartesiaExperimentalControls(speed, emotion, additionalProperties);
        }
    }
}
