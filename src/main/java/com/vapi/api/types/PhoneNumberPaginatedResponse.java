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
@JsonDeserialize(builder = PhoneNumberPaginatedResponse.Builder.class)
public final class PhoneNumberPaginatedResponse {
    private final List<PhoneNumberPaginatedResponseResultsItem> results;

    private final PaginationMeta metadata;

    private final Map<String, Object> additionalProperties;

    private PhoneNumberPaginatedResponse(
            List<PhoneNumberPaginatedResponseResultsItem> results,
            PaginationMeta metadata,
            Map<String, Object> additionalProperties) {
        this.results = results;
        this.metadata = metadata;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return A list of phone numbers, which can be of any provider type.
     */
    @JsonProperty("results")
    public List<PhoneNumberPaginatedResponseResultsItem> getResults() {
        return results;
    }

    /**
     * @return Metadata about the pagination.
     */
    @JsonProperty("metadata")
    public PaginationMeta getMetadata() {
        return metadata;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PhoneNumberPaginatedResponse && equalTo((PhoneNumberPaginatedResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PhoneNumberPaginatedResponse other) {
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

        Builder from(PhoneNumberPaginatedResponse other);
    }

    public interface _FinalStage {
        PhoneNumberPaginatedResponse build();

        _FinalStage results(List<PhoneNumberPaginatedResponseResultsItem> results);

        _FinalStage addResults(PhoneNumberPaginatedResponseResultsItem results);

        _FinalStage addAllResults(List<PhoneNumberPaginatedResponseResultsItem> results);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements MetadataStage, _FinalStage {
        private PaginationMeta metadata;

        private List<PhoneNumberPaginatedResponseResultsItem> results = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(PhoneNumberPaginatedResponse other) {
            results(other.getResults());
            metadata(other.getMetadata());
            return this;
        }

        /**
         * <p>Metadata about the pagination.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("metadata")
        public _FinalStage metadata(@NotNull PaginationMeta metadata) {
            this.metadata = Objects.requireNonNull(metadata, "metadata must not be null");
            return this;
        }

        /**
         * <p>A list of phone numbers, which can be of any provider type.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllResults(List<PhoneNumberPaginatedResponseResultsItem> results) {
            this.results.addAll(results);
            return this;
        }

        /**
         * <p>A list of phone numbers, which can be of any provider type.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addResults(PhoneNumberPaginatedResponseResultsItem results) {
            this.results.add(results);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "results", nulls = Nulls.SKIP)
        public _FinalStage results(List<PhoneNumberPaginatedResponseResultsItem> results) {
            this.results.clear();
            this.results.addAll(results);
            return this;
        }

        @java.lang.Override
        public PhoneNumberPaginatedResponse build() {
            return new PhoneNumberPaginatedResponse(results, metadata, additionalProperties);
        }
    }
}