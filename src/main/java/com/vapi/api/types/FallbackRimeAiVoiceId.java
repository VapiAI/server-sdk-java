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

@JsonDeserialize(using = FallbackRimeAiVoiceId.Deserializer.class)
public final class FallbackRimeAiVoiceId {
    private final Object value;

    private final int type;

    private FallbackRimeAiVoiceId(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((FallbackRimeAiVoiceIdEnum) this.value);
        } else if (this.type == 1) {
            return visitor.visit((String) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FallbackRimeAiVoiceId && equalTo((FallbackRimeAiVoiceId) other);
    }

    private boolean equalTo(FallbackRimeAiVoiceId other) {
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

    public static FallbackRimeAiVoiceId of(FallbackRimeAiVoiceIdEnum value) {
        return new FallbackRimeAiVoiceId(value, 0);
    }

    public static FallbackRimeAiVoiceId of(String value) {
        return new FallbackRimeAiVoiceId(value, 1);
    }

    public interface Visitor<T> {
        T visit(FallbackRimeAiVoiceIdEnum value);

        T visit(String value);
    }

    static final class Deserializer extends StdDeserializer<FallbackRimeAiVoiceId> {
        Deserializer() {
            super(FallbackRimeAiVoiceId.class);
        }

        @java.lang.Override
        public FallbackRimeAiVoiceId deserialize(JsonParser p, DeserializationContext context) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, FallbackRimeAiVoiceIdEnum.class));
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
