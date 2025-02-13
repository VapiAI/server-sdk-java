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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = LogsPaginatedResponse.Builder.class)
public final class LogsPaginatedResponse {
    private final List<Log> results;

    private final PaginationMeta metadata;

    private final Map<String, Object> additionalProperties;

    private LogsPaginatedResponse(
            List<Log> results, PaginationMeta metadata, Map<String, Object> additionalProperties) {
        this.results = results;
        this.metadata = metadata;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("results")
    public List<Log> getResults() {
        return results;
    }

    @JsonProperty("metadata")
    public PaginationMeta getMetadata() {
        return metadata;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LogsPaginatedResponse && equalTo((LogsPaginatedResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(LogsPaginatedResponse other) {
        return results.equals(other.results) && metadata.equals(other.metadata);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.results, this.metadata);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static MetadataStage builder() {
        return new Builder();
    }

    public interface MetadataStage {
        _FinalStage metadata(@NotNull PaginationMeta metadata);

        Builder from(LogsPaginatedResponse other);
    }

    public interface _FinalStage {
        LogsPaginatedResponse build();

        _FinalStage results(List<Log> results);

        _FinalStage addResults(Log results);

        _FinalStage addAllResults(List<Log> results);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements MetadataStage, _FinalStage {
        private PaginationMeta metadata;

        private List<Log> results = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(LogsPaginatedResponse other) {
            results(other.getResults());
            metadata(other.getMetadata());
            return this;
        }

        @java.lang.Override
        @JsonSetter("metadata")
        public _FinalStage metadata(@NotNull PaginationMeta metadata) {
            this.metadata = Objects.requireNonNull(metadata, "metadata must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllResults(List<Log> results) {
            this.results.addAll(results);
            return this;
        }

        @java.lang.Override
        public _FinalStage addResults(Log results) {
            this.results.add(results);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "results", nulls = Nulls.SKIP)
        public _FinalStage results(List<Log> results) {
            this.results.clear();
            this.results.addAll(results);
            return this;
        }

        @java.lang.Override
        public LogsPaginatedResponse build() {
            return new LogsPaginatedResponse(results, metadata, additionalProperties);
        }
    }
}
