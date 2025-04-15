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

    private final Optional<TrieveKnowledgeBaseSearchPlan> searchPlan;

    private final Optional<TrieveKnowledgeBaseImport> createPlan;

    private final String id;

    private final String orgId;

    private final Map<String, Object> additionalProperties;

    private TrieveKnowledgeBase(
            Optional<String> name,
            Optional<TrieveKnowledgeBaseSearchPlan> searchPlan,
            Optional<TrieveKnowledgeBaseImport> createPlan,
            String id,
            String orgId,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.searchPlan = searchPlan;
        this.createPlan = createPlan;
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
     * @return This is the searching plan used when searching for relevant chunks from the vector store.
     * <p>You should configure this if you're running into these issues:</p>
     * <ul>
     * <li>Too much unnecessary context is being fed as knowledge base context.</li>
     * <li>Not enough relevant context is being fed as knowledge base context.</li>
     * </ul>
     */
    @JsonProperty("searchPlan")
    public Optional<TrieveKnowledgeBaseSearchPlan> getSearchPlan() {
        return searchPlan;
    }

    /**
     * @return This is the plan if you want us to create/import a new vector store using Trieve.
     */
    @JsonProperty("createPlan")
    public Optional<TrieveKnowledgeBaseImport> getCreatePlan() {
        return createPlan;
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
                && searchPlan.equals(other.searchPlan)
                && createPlan.equals(other.createPlan)
                && id.equals(other.id)
                && orgId.equals(other.orgId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.name, this.searchPlan, this.createPlan, this.id, this.orgId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        OrgIdStage id(@NotNull String id);

        Builder from(TrieveKnowledgeBase other);
    }

    public interface OrgIdStage {
        _FinalStage orgId(@NotNull String orgId);
    }

    public interface _FinalStage {
        TrieveKnowledgeBase build();

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage searchPlan(Optional<TrieveKnowledgeBaseSearchPlan> searchPlan);

        _FinalStage searchPlan(TrieveKnowledgeBaseSearchPlan searchPlan);

        _FinalStage createPlan(Optional<TrieveKnowledgeBaseImport> createPlan);

        _FinalStage createPlan(TrieveKnowledgeBaseImport createPlan);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, OrgIdStage, _FinalStage {
        private String id;

        private String orgId;

        private Optional<TrieveKnowledgeBaseImport> createPlan = Optional.empty();

        private Optional<TrieveKnowledgeBaseSearchPlan> searchPlan = Optional.empty();

        private Optional<String> name = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TrieveKnowledgeBase other) {
            name(other.getName());
            searchPlan(other.getSearchPlan());
            createPlan(other.getCreatePlan());
            id(other.getId());
            orgId(other.getOrgId());
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
         * <p>This is the plan if you want us to create/import a new vector store using Trieve.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage createPlan(TrieveKnowledgeBaseImport createPlan) {
            this.createPlan = Optional.ofNullable(createPlan);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "createPlan", nulls = Nulls.SKIP)
        public _FinalStage createPlan(Optional<TrieveKnowledgeBaseImport> createPlan) {
            this.createPlan = createPlan;
            return this;
        }

        /**
         * <p>This is the searching plan used when searching for relevant chunks from the vector store.</p>
         * <p>You should configure this if you're running into these issues:</p>
         * <ul>
         * <li>Too much unnecessary context is being fed as knowledge base context.</li>
         * <li>Not enough relevant context is being fed as knowledge base context.</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage searchPlan(TrieveKnowledgeBaseSearchPlan searchPlan) {
            this.searchPlan = Optional.ofNullable(searchPlan);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "searchPlan", nulls = Nulls.SKIP)
        public _FinalStage searchPlan(Optional<TrieveKnowledgeBaseSearchPlan> searchPlan) {
            this.searchPlan = searchPlan;
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
            return new TrieveKnowledgeBase(name, searchPlan, createPlan, id, orgId, additionalProperties);
        }
    }
}
