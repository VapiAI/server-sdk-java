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

@JsonDeserialize(using = ClientMessageMessage.Deserializer.class)
public final class ClientMessageMessage {
    private final Object value;

    private final int type;

    private ClientMessageMessage(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((ClientMessageWorkflowNodeStarted) this.value);
        } else if (this.type == 1) {
            return visitor.visit((ClientMessageConversationUpdate) this.value);
        } else if (this.type == 2) {
            return visitor.visit((ClientMessageHang) this.value);
        } else if (this.type == 3) {
            return visitor.visit((ClientMessageMetadata) this.value);
        } else if (this.type == 4) {
            return visitor.visit((ClientMessageModelOutput) this.value);
        } else if (this.type == 5) {
            return visitor.visit((ClientMessageSpeechUpdate) this.value);
        } else if (this.type == 6) {
            return visitor.visit((ClientMessageTranscript) this.value);
        } else if (this.type == 7) {
            return visitor.visit((ClientMessageToolCalls) this.value);
        } else if (this.type == 8) {
            return visitor.visit((ClientMessageToolCallsResult) this.value);
        } else if (this.type == 9) {
            return visitor.visit((ClientMessageTransferUpdate) this.value);
        } else if (this.type == 10) {
            return visitor.visit((ClientMessageUserInterrupted) this.value);
        } else if (this.type == 11) {
            return visitor.visit((ClientMessageLanguageChangeDetected) this.value);
        } else if (this.type == 12) {
            return visitor.visit((ClientMessageVoiceInput) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ClientMessageMessage && equalTo((ClientMessageMessage) other);
    }

    private boolean equalTo(ClientMessageMessage other) {
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

    public static ClientMessageMessage of(ClientMessageWorkflowNodeStarted value) {
        return new ClientMessageMessage(value, 0);
    }

    public static ClientMessageMessage of(ClientMessageConversationUpdate value) {
        return new ClientMessageMessage(value, 1);
    }

    public static ClientMessageMessage of(ClientMessageHang value) {
        return new ClientMessageMessage(value, 2);
    }

    public static ClientMessageMessage of(ClientMessageMetadata value) {
        return new ClientMessageMessage(value, 3);
    }

    public static ClientMessageMessage of(ClientMessageModelOutput value) {
        return new ClientMessageMessage(value, 4);
    }

    public static ClientMessageMessage of(ClientMessageSpeechUpdate value) {
        return new ClientMessageMessage(value, 5);
    }

    public static ClientMessageMessage of(ClientMessageTranscript value) {
        return new ClientMessageMessage(value, 6);
    }

    public static ClientMessageMessage of(ClientMessageToolCalls value) {
        return new ClientMessageMessage(value, 7);
    }

    public static ClientMessageMessage of(ClientMessageToolCallsResult value) {
        return new ClientMessageMessage(value, 8);
    }

    public static ClientMessageMessage of(ClientMessageTransferUpdate value) {
        return new ClientMessageMessage(value, 9);
    }

    public static ClientMessageMessage of(ClientMessageUserInterrupted value) {
        return new ClientMessageMessage(value, 10);
    }

    public static ClientMessageMessage of(ClientMessageLanguageChangeDetected value) {
        return new ClientMessageMessage(value, 11);
    }

    public static ClientMessageMessage of(ClientMessageVoiceInput value) {
        return new ClientMessageMessage(value, 12);
    }

    public interface Visitor<T> {
        T visit(ClientMessageWorkflowNodeStarted value);

        T visit(ClientMessageConversationUpdate value);

        T visit(ClientMessageHang value);

        T visit(ClientMessageMetadata value);

        T visit(ClientMessageModelOutput value);

        T visit(ClientMessageSpeechUpdate value);

        T visit(ClientMessageTranscript value);

        T visit(ClientMessageToolCalls value);

        T visit(ClientMessageToolCallsResult value);

        T visit(ClientMessageTransferUpdate value);

        T visit(ClientMessageUserInterrupted value);

        T visit(ClientMessageLanguageChangeDetected value);

        T visit(ClientMessageVoiceInput value);
    }

    static final class Deserializer extends StdDeserializer<ClientMessageMessage> {
        Deserializer() {
            super(ClientMessageMessage.class);
        }

        @java.lang.Override
        public ClientMessageMessage deserialize(JsonParser p, DeserializationContext context) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ClientMessageWorkflowNodeStarted.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ClientMessageConversationUpdate.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ClientMessageHang.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ClientMessageMetadata.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ClientMessageModelOutput.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ClientMessageSpeechUpdate.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ClientMessageTranscript.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ClientMessageToolCalls.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ClientMessageToolCallsResult.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ClientMessageTransferUpdate.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ClientMessageUserInterrupted.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ClientMessageLanguageChangeDetected.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, ClientMessageVoiceInput.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
