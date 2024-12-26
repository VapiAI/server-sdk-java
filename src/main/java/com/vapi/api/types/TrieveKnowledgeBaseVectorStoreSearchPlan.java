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
@JsonDeserialize(builder = TrieveKnowledgeBaseVectorStoreSearchPlan.Builder.class)
public final class TrieveKnowledgeBaseVectorStoreSearchPlan {
    private final Optional<Boolean> removeStopWords;

    private final Optional<Double> scoreThreshold;

    private final TrieveKnowledgeBaseVectorStoreSearchPlanSearchType searchType;

    private final Map<String, Object> additionalProperties;

    private TrieveKnowledgeBaseVectorStoreSearchPlan(
            Optional<Boolean> removeStopWords,
            Optional<Double> scoreThreshold,
            TrieveKnowledgeBaseVectorStoreSearchPlanSearchType searchType,
            Map<String, Object> additionalProperties) {
        this.removeStopWords = removeStopWords;
        this.scoreThreshold = scoreThreshold;
        this.searchType = searchType;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return If true, stop words (specified in server/src/stop-words.txt in the git repo) will be removed. This will preserve queries that are entirely stop words.
     */
    @JsonProperty("removeStopWords")
    public Optional<Boolean> getRemoveStopWords() {
        return removeStopWords;
    }

    /**
     * @return This is the score threshold to filter out chunks with a score below the threshold for cosine distance metric. For Manhattan Distance, Euclidean Distance, and Dot Product, it will filter out scores above the threshold distance. This threshold applies before weight and bias modifications. If not specified, this defaults to no threshold. A threshold of 0 will default to no threshold.
     */
    @JsonProperty("scoreThreshold")
    public Optional<Double> getScoreThreshold() {
        return scoreThreshold;
    }

    /**
     * @return This is the search method used when searching for relevant chunks from the vector store.
     */
    @JsonProperty("searchType")
    public TrieveKnowledgeBaseVectorStoreSearchPlanSearchType getSearchType() {
        return searchType;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TrieveKnowledgeBaseVectorStoreSearchPlan
                && equalTo((TrieveKnowledgeBaseVectorStoreSearchPlan) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TrieveKnowledgeBaseVectorStoreSearchPlan other) {
        return removeStopWords.equals(other.removeStopWords)
                && scoreThreshold.equals(other.scoreThreshold)
                && searchType.equals(other.searchType);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.removeStopWords, this.scoreThreshold, this.searchType);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static SearchTypeStage builder() {
        return new Builder();
    }

    public interface SearchTypeStage {
        _FinalStage searchType(@NotNull TrieveKnowledgeBaseVectorStoreSearchPlanSearchType searchType);

        Builder from(TrieveKnowledgeBaseVectorStoreSearchPlan other);
    }

    public interface _FinalStage {
        TrieveKnowledgeBaseVectorStoreSearchPlan build();

        _FinalStage removeStopWords(Optional<Boolean> removeStopWords);

        _FinalStage removeStopWords(Boolean removeStopWords);

        _FinalStage scoreThreshold(Optional<Double> scoreThreshold);

        _FinalStage scoreThreshold(Double scoreThreshold);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements SearchTypeStage, _FinalStage {
        private TrieveKnowledgeBaseVectorStoreSearchPlanSearchType searchType;

        private Optional<Double> scoreThreshold = Optional.empty();

        private Optional<Boolean> removeStopWords = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TrieveKnowledgeBaseVectorStoreSearchPlan other) {
            removeStopWords(other.getRemoveStopWords());
            scoreThreshold(other.getScoreThreshold());
            searchType(other.getSearchType());
            return this;
        }

        /**
         * <p>This is the search method used when searching for relevant chunks from the vector store.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("searchType")
        public _FinalStage searchType(@NotNull TrieveKnowledgeBaseVectorStoreSearchPlanSearchType searchType) {
            this.searchType = Objects.requireNonNull(searchType, "searchType must not be null");
            return this;
        }

        /**
         * <p>This is the score threshold to filter out chunks with a score below the threshold for cosine distance metric. For Manhattan Distance, Euclidean Distance, and Dot Product, it will filter out scores above the threshold distance. This threshold applies before weight and bias modifications. If not specified, this defaults to no threshold. A threshold of 0 will default to no threshold.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage scoreThreshold(Double scoreThreshold) {
            this.scoreThreshold = Optional.ofNullable(scoreThreshold);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "scoreThreshold", nulls = Nulls.SKIP)
        public _FinalStage scoreThreshold(Optional<Double> scoreThreshold) {
            this.scoreThreshold = scoreThreshold;
            return this;
        }

        /**
         * <p>If true, stop words (specified in server/src/stop-words.txt in the git repo) will be removed. This will preserve queries that are entirely stop words.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage removeStopWords(Boolean removeStopWords) {
            this.removeStopWords = Optional.ofNullable(removeStopWords);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "removeStopWords", nulls = Nulls.SKIP)
        public _FinalStage removeStopWords(Optional<Boolean> removeStopWords) {
            this.removeStopWords = removeStopWords;
            return this;
        }

        @java.lang.Override
        public TrieveKnowledgeBaseVectorStoreSearchPlan build() {
            return new TrieveKnowledgeBaseVectorStoreSearchPlan(
                    removeStopWords, scoreThreshold, searchType, additionalProperties);
        }
    }
}