/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.vapi.api.core.ObjectMappers;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = CartesiaExperimentalControlsSpeed.Deserializer.class)
public final class CartesiaExperimentalControlsSpeed {
    private final Object value;

    private final int type;

    private CartesiaExperimentalControlsSpeed(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((CartesiaExperimentalControlsSpeed) this.value);
        } else if (this.type == 1) {
            return visitor.visit((double) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CartesiaExperimentalControlsSpeed && equalTo((CartesiaExperimentalControlsSpeed) other);
    }

    private boolean equalTo(CartesiaExperimentalControlsSpeed other) {
        return value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @java.lang.Override
    public String toString() {
        return this.value.toString();
    }

    public static CartesiaExperimentalControlsSpeed of(CartesiaExperimentalControlsSpeed value) {
        return new CartesiaExperimentalControlsSpeed(value, 0);
    }

    public static CartesiaExperimentalControlsSpeed of(double value) {
        return new CartesiaExperimentalControlsSpeed(value, 1);
    }

    public interface Visitor<T> {
        T visit(CartesiaExperimentalControlsSpeed value);

        T visit(double value);
    }

    static final class Deserializer extends StdDeserializer<CartesiaExperimentalControlsSpeed> {
        Deserializer() {
            super(CartesiaExperimentalControlsSpeed.class);
        }

        @java.lang.Override
        public CartesiaExperimentalControlsSpeed deserialize(JsonParser p, DeserializationContext context)
                throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, CartesiaExperimentalControlsSpeed.class));
            } catch (IllegalArgumentException e) {
            }
            if (value instanceof Double) {
                return of((Double) value);
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
