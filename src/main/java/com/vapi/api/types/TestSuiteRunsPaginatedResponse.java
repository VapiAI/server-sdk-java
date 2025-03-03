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
@JsonDeserialize(builder = TestSuiteRunsPaginatedResponse.Builder.class)
public final class TestSuiteRunsPaginatedResponse {
    private final List<TestSuiteRun> results;

    private final PaginationMeta metadata;

    private final Map<String, Object> additionalProperties;

    private TestSuiteRunsPaginatedResponse(
            List<TestSuiteRun> results, PaginationMeta metadata, Map<String, Object> additionalProperties) {
        this.results = results;
        this.metadata = metadata;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("results")
    public List<TestSuiteRun> getResults() {
        return results;
    }

    @JsonProperty("metadata")
    public PaginationMeta getMetadata() {
        return metadata;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TestSuiteRunsPaginatedResponse && equalTo((TestSuiteRunsPaginatedResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TestSuiteRunsPaginatedResponse other) {
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

        Builder from(TestSuiteRunsPaginatedResponse other);
    }

    public interface _FinalStage {
        TestSuiteRunsPaginatedResponse build();

        _FinalStage results(List<TestSuiteRun> results);

        _FinalStage addResults(TestSuiteRun results);

        _FinalStage addAllResults(List<TestSuiteRun> results);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements MetadataStage, _FinalStage {
        private PaginationMeta metadata;

        private List<TestSuiteRun> results = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TestSuiteRunsPaginatedResponse other) {
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
        public _FinalStage addAllResults(List<TestSuiteRun> results) {
            this.results.addAll(results);
            return this;
        }

        @java.lang.Override
        public _FinalStage addResults(TestSuiteRun results) {
            this.results.add(results);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "results", nulls = Nulls.SKIP)
        public _FinalStage results(List<TestSuiteRun> results) {
            this.results.clear();
            this.results.addAll(results);
            return this;
        }

        @java.lang.Override
        public TestSuiteRunsPaginatedResponse build() {
            return new TestSuiteRunsPaginatedResponse(results, metadata, additionalProperties);
        }
    }
}
