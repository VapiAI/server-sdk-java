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

@JsonDeserialize(using = PlayHtVoiceId.Deserializer.class)
public final class PlayHtVoiceId {
    private final Object value;

    private final int type;

    private PlayHtVoiceId(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    @SuppressWarnings("unchecked")
    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((PlayHtVoiceIdEnum) this.value);
        } else if (this.type == 1) {
            return visitor.visit((String) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PlayHtVoiceId && equalTo((PlayHtVoiceId) other);
    }

    private boolean equalTo(PlayHtVoiceId other) {
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

    public static PlayHtVoiceId of(PlayHtVoiceIdEnum value) {
        return new PlayHtVoiceId(value, 0);
    }

    public static PlayHtVoiceId of(String value) {
        return new PlayHtVoiceId(value, 1);
    }

    public interface Visitor<T> {
        T visit(PlayHtVoiceIdEnum value);

        T visit(String value);
    }

    static final class Deserializer extends StdDeserializer<PlayHtVoiceId> {
        Deserializer() {
            super(PlayHtVoiceId.class);
        }

        @java.lang.Override
        public PlayHtVoiceId deserialize(JsonParser p, DeserializationContext context) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, PlayHtVoiceIdEnum.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, String.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
