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
@JsonDeserialize(builder = TrieveKnowledgeBase.Builder.class)
public final class TrieveKnowledgeBase {
    private final Optional<String> name;

    private final TrieveKnowledgeBaseVectorStoreSearchPlan vectorStoreSearchPlan;

    private final Optional<TrieveKnowledgeBaseVectorStoreCreatePlan> vectorStoreCreatePlan;

    private final Optional<String> vectorStoreProviderId;

    private final String id;

    private final String orgId;

    private final Map<String, Object> additionalProperties;

    private TrieveKnowledgeBase(
            Optional<String> name,
            TrieveKnowledgeBaseVectorStoreSearchPlan vectorStoreSearchPlan,
            Optional<TrieveKnowledgeBaseVectorStoreCreatePlan> vectorStoreCreatePlan,
            Optional<String> vectorStoreProviderId,
            String id,
            String orgId,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.vectorStoreSearchPlan = vectorStoreSearchPlan;
        this.vectorStoreCreatePlan = vectorStoreCreatePlan;
        this.vectorStoreProviderId = vectorStoreProviderId;
        this.id = id;
        this.orgId = orgId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the name of the knowledge base.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return This is the plan on how to search the vector store while a call is going on.
     */
    @JsonProperty("vectorStoreSearchPlan")
    public TrieveKnowledgeBaseVectorStoreSearchPlan getVectorStoreSearchPlan() {
        return vectorStoreSearchPlan;
    }

    /**
     * @return This is the plan if you want us to create a new vector store on your behalf. To use an existing vector store from your account, use <code>vectoreStoreProviderId</code>
     */
    @JsonProperty("vectorStoreCreatePlan")
    public Optional<TrieveKnowledgeBaseVectorStoreCreatePlan> getVectorStoreCreatePlan() {
        return vectorStoreCreatePlan;
    }

    /**
     * @return This is an vector store that you already have on your account with the provider. To create a new vector store, use vectorStoreCreatePlan.
     * <p>Usage:</p>
     * <ul>
     * <li>To bring your own vector store from Trieve, go to https://trieve.ai</li>
     * <li>Create a dataset, and use the datasetId here.</li>
     * </ul>
     */
    @JsonProperty("vectorStoreProviderId")
    public Optional<String> getVectorStoreProviderId() {
        return vectorStoreProviderId;
    }

    /**
     * @return This is the id of the knowledge base.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return This is the org id of the knowledge base.
     */
    @JsonProperty("orgId")
    public String getOrgId() {
        return orgId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TrieveKnowledgeBase && equalTo((TrieveKnowledgeBase) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TrieveKnowledgeBase other) {
        return name.equals(other.name)
                && vectorStoreSearchPlan.equals(other.vectorStoreSearchPlan)
                && vectorStoreCreatePlan.equals(other.vectorStoreCreatePlan)
                && vectorStoreProviderId.equals(other.vectorStoreProviderId)
                && id.equals(other.id)
                && orgId.equals(other.orgId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.vectorStoreSearchPlan,
                this.vectorStoreCreatePlan,
                this.vectorStoreProviderId,
                this.id,
                this.orgId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static VectorStoreSearchPlanStage builder() {
        return new Builder();
    }

    public interface VectorStoreSearchPlanStage {
        IdStage vectorStoreSearchPlan(@NotNull TrieveKnowledgeBaseVectorStoreSearchPlan vectorStoreSearchPlan);

        Builder from(TrieveKnowledgeBase other);
    }

    public interface IdStage {
        OrgIdStage id(@NotNull String id);
    }

    public interface OrgIdStage {
        _FinalStage orgId(@NotNull String orgId);
    }

    public interface _FinalStage {
        TrieveKnowledgeBase build();

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage vectorStoreCreatePlan(Optional<TrieveKnowledgeBaseVectorStoreCreatePlan> vectorStoreCreatePlan);

        _FinalStage vectorStoreCreatePlan(TrieveKnowledgeBaseVectorStoreCreatePlan vectorStoreCreatePlan);

        _FinalStage vectorStoreProviderId(Optional<String> vectorStoreProviderId);

        _FinalStage vectorStoreProviderId(String vectorStoreProviderId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements VectorStoreSearchPlanStage, IdStage, OrgIdStage, _FinalStage {
        private TrieveKnowledgeBaseVectorStoreSearchPlan vectorStoreSearchPlan;

        private String id;

        private String orgId;

        private Optional<String> vectorStoreProviderId = Optional.empty();

        private Optional<TrieveKnowledgeBaseVectorStoreCreatePlan> vectorStoreCreatePlan = Optional.empty();

        private Optional<String> name = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TrieveKnowledgeBase other) {
            name(other.getName());
            vectorStoreSearchPlan(other.getVectorStoreSearchPlan());
            vectorStoreCreatePlan(other.getVectorStoreCreatePlan());
            vectorStoreProviderId(other.getVectorStoreProviderId());
            id(other.getId());
            orgId(other.getOrgId());
            return this;
        }

        /**
         * <p>This is the plan on how to search the vector store while a call is going on.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("vectorStoreSearchPlan")
        public IdStage vectorStoreSearchPlan(@NotNull TrieveKnowledgeBaseVectorStoreSearchPlan vectorStoreSearchPlan) {
            this.vectorStoreSearchPlan =
                    Objects.requireNonNull(vectorStoreSearchPlan, "vectorStoreSearchPlan must not be null");
            return this;
        }

        /**
         * <p>This is the id of the knowledge base.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public OrgIdStage id(@NotNull String id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        /**
         * <p>This is the org id of the knowledge base.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("orgId")
        public _FinalStage orgId(@NotNull String orgId) {
            this.orgId = Objects.requireNonNull(orgId, "orgId must not be null");
            return this;
        }

        /**
         * <p>This is an vector store that you already have on your account with the provider. To create a new vector store, use vectorStoreCreatePlan.</p>
         * <p>Usage:</p>
         * <ul>
         * <li>To bring your own vector store from Trieve, go to https://trieve.ai</li>
         * <li>Create a dataset, and use the datasetId here.</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage vectorStoreProviderId(String vectorStoreProviderId) {
            this.vectorStoreProviderId = Optional.ofNullable(vectorStoreProviderId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "vectorStoreProviderId", nulls = Nulls.SKIP)
        public _FinalStage vectorStoreProviderId(Optional<String> vectorStoreProviderId) {
            this.vectorStoreProviderId = vectorStoreProviderId;
            return this;
        }

        /**
         * <p>This is the plan if you want us to create a new vector store on your behalf. To use an existing vector store from your account, use <code>vectoreStoreProviderId</code></p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage vectorStoreCreatePlan(TrieveKnowledgeBaseVectorStoreCreatePlan vectorStoreCreatePlan) {
            this.vectorStoreCreatePlan = Optional.ofNullable(vectorStoreCreatePlan);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "vectorStoreCreatePlan", nulls = Nulls.SKIP)
        public _FinalStage vectorStoreCreatePlan(
                Optional<TrieveKnowledgeBaseVectorStoreCreatePlan> vectorStoreCreatePlan) {
            this.vectorStoreCreatePlan = vectorStoreCreatePlan;
            return this;
        }

        /**
         * <p>This is the name of the knowledge base.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public _FinalStage name(Optional<String> name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        public TrieveKnowledgeBase build() {
            return new TrieveKnowledgeBase(
                    name,
                    vectorStoreSearchPlan,
                    vectorStoreCreatePlan,
                    vectorStoreProviderId,
                    id,
                    orgId,
                    additionalProperties);
        }
    }
}
