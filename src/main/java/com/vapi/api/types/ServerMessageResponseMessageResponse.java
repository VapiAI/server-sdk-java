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

@JsonDeserialize(using = ServerMessageResponseMessageResponse.Deserializer.class)
public final class ServerMessageResponseMessageResponse {
    private final Object value;

    private final int type;

    private ServerMessageResponseMessageResponse(Object value, int type) {
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
            return visitor.visit((ServerMessageResponseAssistantRequest) this.value);
        } else if (this.type == 1) {
            return visitor.visit((ServerMessageResponseKnowledgeBaseRequest) this.value);
        } else if (this.type == 2) {
            return visitor.visit((ServerMessageResponseToolCalls) this.value);
        } else if (this.type == 3) {
            return visitor.visit((ServerMessageResponseTransferDestinationRequest) this.value);
        } else if (this.type == 4) {
            return visitor.visit((ServerMessageResponseVoiceRequest) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ServerMessageResponseMessageResponse
                && equalTo((ServerMessageResponseMessageResponse) other);
    }

    private boolean equalTo(ServerMessageResponseMessageResponse other) {
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

    public static ServerMessageResponseMessageResponse of(ServerMessageResponseAssistantRequest value) {
        return new ServerMessageResponseMessageResponse(value, 0);
    }

    public static ServerMessageResponseMessageResponse of(ServerMessageResponseKnowledgeBaseRequest value) {
        return new ServerMessageResponseMessageResponse(value, 1);
    }

    public static ServerMessageResponseMessageResponse of(ServerMessageResponseToolCalls value) {
        return new ServerMessageResponseMessageResponse(value, 2);
    }

    public static ServerMessageResponseMessageResponse of(ServerMessageResponseTransferDestinationRequest value) {
        return new ServerMessageResponseMessageResponse(value, 3);
    }

    public static ServerMessageResponseMessageResponse of(ServerMessageResponseVoiceRequest value) {
        return new ServerMessageResponseMessageResponse(value, 4);
    }

    public interface Visitor<T> {
        T visit(ServerMessageResponseAssistantRequest value);

        T visit(ServerMessageResponseKnowledgeBaseRequest value);

        T visit(ServerMessageResponseToolCalls value);

        T visit(ServerMessageResponseTransferDestinationRequest value);

        T visit(ServerMessageResponseVoiceRequest value);
    }

    static final class Deserializer extends StdDeserializer<ServerMessageResponseMessageResponse> {
        Deserializer() {
            super(ServerMessageResponseMessageResponse.class);
        }

        @java.lang.Override
        public ServerMessageResponseMessageResponse deserialize(JsonParser p, DeserializationContext context)
                throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ServerMessageResponseAssistantRequest.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(
                        ObjectMappers.JSON_MAPPER.convertValue(value, ServerMessageResponseKnowledgeBaseRequest.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ServerMessageResponseToolCalls.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(
                        value, ServerMessageResponseTransferDestinationRequest.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ServerMessageResponseVoiceRequest.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
