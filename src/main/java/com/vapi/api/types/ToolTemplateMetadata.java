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
@JsonDeserialize(builder = ToolTemplateMetadata.Builder.class)
public final class ToolTemplateMetadata {
    private final Optional<String> collectionType;

    private final Optional<String> collectionId;

    private final Optional<String> collectionName;

    private final Map<String, Object> additionalProperties;

    private ToolTemplateMetadata(
            Optional<String> collectionType,
            Optional<String> collectionId,
            Optional<String> collectionName,
            Map<String, Object> additionalProperties) {
        this.collectionType = collectionType;
        this.collectionId = collectionId;
        this.collectionName = collectionName;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("collectionType")
    public Optional<String> getCollectionType() {
        return collectionType;
    }

    @JsonProperty("collectionId")
    public Optional<String> getCollectionId() {
        return collectionId;
    }

    @JsonProperty("collectionName")
    public Optional<String> getCollectionName() {
        return collectionName;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ToolTemplateMetadata && equalTo((ToolTemplateMetadata) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ToolTemplateMetadata other) {
        return collectionType.equals(other.collectionType)
                && collectionId.equals(other.collectionId)
                && collectionName.equals(other.collectionName);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.collectionType, this.collectionId, this.collectionName);
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
        private Optional<String> collectionType = Optional.empty();

        private Optional<String> collectionId = Optional.empty();

        private Optional<String> collectionName = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ToolTemplateMetadata other) {
            collectionType(other.getCollectionType());
            collectionId(other.getCollectionId());
            collectionName(other.getCollectionName());
            return this;
        }

        @JsonSetter(value = "collectionType", nulls = Nulls.SKIP)
        public Builder collectionType(Optional<String> collectionType) {
            this.collectionType = collectionType;
            return this;
        }

        public Builder collectionType(String collectionType) {
            this.collectionType = Optional.ofNullable(collectionType);
            return this;
        }

        @JsonSetter(value = "collectionId", nulls = Nulls.SKIP)
        public Builder collectionId(Optional<String> collectionId) {
            this.collectionId = collectionId;
            return this;
        }

        public Builder collectionId(String collectionId) {
            this.collectionId = Optional.ofNullable(collectionId);
            return this;
        }

        @JsonSetter(value = "collectionName", nulls = Nulls.SKIP)
        public Builder collectionName(Optional<String> collectionName) {
            this.collectionName = collectionName;
            return this;
        }

        public Builder collectionName(String collectionName) {
            this.collectionName = Optional.ofNullable(collectionName);
            return this;
        }

        public ToolTemplateMetadata build() {
            return new ToolTemplateMetadata(collectionType, collectionId, collectionName, additionalProperties);
        }
    }
}