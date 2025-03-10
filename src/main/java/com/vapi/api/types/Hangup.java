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
@JsonDeserialize(builder = Hangup.Builder.class)
public final class Hangup {
    private final String name;

    private final Optional<Map<String, Object>> metadata;

    private final Map<String, Object> additionalProperties;

    private Hangup(String name, Optional<Map<String, Object>> metadata, Map<String, Object> additionalProperties) {
        this.name = name;
        this.metadata = metadata;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return This is for metadata you want to store on the task.
     */
    @JsonProperty("metadata")
    public Optional<Map<String, Object>> getMetadata() {
        return metadata;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Hangup && equalTo((Hangup) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Hangup other) {
        return name.equals(other.name) && metadata.equals(other.metadata);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.name, this.metadata);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        _FinalStage name(@NotNull String name);

        Builder from(Hangup other);
    }

    public interface _FinalStage {
        Hangup build();

        _FinalStage metadata(Optional<Map<String, Object>> metadata);

        _FinalStage metadata(Map<String, Object> metadata);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, _FinalStage {
        private String name;

        private Optional<Map<String, Object>> metadata = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Hangup other) {
            name(other.getName());
            metadata(other.getMetadata());
            return this;
        }

        @java.lang.Override
        @JsonSetter("name")
        public _FinalStage name(@NotNull String name) {
            this.name = Objects.requireNonNull(name, "name must not be null");
            return this;
        }

        /**
         * <p>This is for metadata you want to store on the task.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage metadata(Map<String, Object> metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public _FinalStage metadata(Optional<Map<String, Object>> metadata) {
            this.metadata = metadata;
            return this;
        }

        @java.lang.Override
        public Hangup build() {
            return new Hangup(name, metadata, additionalProperties);
        }
    }
}
