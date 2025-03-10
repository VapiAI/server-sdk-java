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
@JsonDeserialize(builder = ServerMessageResponseKnowledgeBaseRequest.Builder.class)
public final class ServerMessageResponseKnowledgeBaseRequest {
    private final Optional<List<KnowledgeBaseResponseDocument>> documents;

    private final Optional<CustomMessage> message;

    private final Map<String, Object> additionalProperties;

    private ServerMessageResponseKnowledgeBaseRequest(
            Optional<List<KnowledgeBaseResponseDocument>> documents,
            Optional<CustomMessage> message,
            Map<String, Object> additionalProperties) {
        this.documents = documents;
        this.message = message;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the list of documents that will be sent to the model alongside the <code>messages</code> to generate a response.
     */
    @JsonProperty("documents")
    public Optional<List<KnowledgeBaseResponseDocument>> getDocuments() {
        return documents;
    }

    /**
     * @return This can be used to skip the model output generation and speak a custom message.
     */
    @JsonProperty("message")
    public Optional<CustomMessage> getMessage() {
        return message;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ServerMessageResponseKnowledgeBaseRequest
                && equalTo((ServerMessageResponseKnowledgeBaseRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ServerMessageResponseKnowledgeBaseRequest other) {
        return documents.equals(other.documents) && message.equals(other.message);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.documents, this.message);
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
        private Optional<List<KnowledgeBaseResponseDocument>> documents = Optional.empty();

        private Optional<CustomMessage> message = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ServerMessageResponseKnowledgeBaseRequest other) {
            documents(other.getDocuments());
            message(other.getMessage());
            return this;
        }

        @JsonSetter(value = "documents", nulls = Nulls.SKIP)
        public Builder documents(Optional<List<KnowledgeBaseResponseDocument>> documents) {
            this.documents = documents;
            return this;
        }

        public Builder documents(List<KnowledgeBaseResponseDocument> documents) {
            this.documents = Optional.ofNullable(documents);
            return this;
        }

        @JsonSetter(value = "message", nulls = Nulls.SKIP)
        public Builder message(Optional<CustomMessage> message) {
            this.message = message;
            return this;
        }

        public Builder message(CustomMessage message) {
            this.message = Optional.ofNullable(message);
            return this;
        }

        public ServerMessageResponseKnowledgeBaseRequest build() {
            return new ServerMessageResponseKnowledgeBaseRequest(documents, message, additionalProperties);
        }
    }
}
