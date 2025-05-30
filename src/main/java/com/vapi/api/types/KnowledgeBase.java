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
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = KnowledgeBase.Builder.class)
public final class KnowledgeBase {
    private final String name;

    private final Optional<KnowledgeBaseModel> model;

    private final String description;

    private final List<String> fileIds;

    private final Map<String, Object> additionalProperties;

    private KnowledgeBase(
            String name,
            Optional<KnowledgeBaseModel> model,
            String description,
            List<String> fileIds,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.model = model;
        this.description = description;
        this.fileIds = fileIds;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The name of the knowledge base
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return The provider of the knowledge base
     */
    @JsonProperty("provider")
    public String getProvider() {
        return "google";
    }

    /**
     * @return The model to use for the knowledge base
     */
    @JsonProperty("model")
    public Optional<KnowledgeBaseModel> getModel() {
        return model;
    }

    /**
     * @return A description of the knowledge base
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * @return The file IDs associated with this knowledge base
     */
    @JsonProperty("fileIds")
    public List<String> getFileIds() {
        return fileIds;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof KnowledgeBase && equalTo((KnowledgeBase) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(KnowledgeBase other) {
        return name.equals(other.name)
                && model.equals(other.model)
                && description.equals(other.description)
                && fileIds.equals(other.fileIds);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.name, this.model, this.description, this.fileIds);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        DescriptionStage name(@NotNull String name);

        Builder from(KnowledgeBase other);
    }

    public interface DescriptionStage {
        _FinalStage description(@NotNull String description);
    }

    public interface _FinalStage {
        KnowledgeBase build();

        _FinalStage model(Optional<KnowledgeBaseModel> model);

        _FinalStage model(KnowledgeBaseModel model);

        _FinalStage fileIds(List<String> fileIds);

        _FinalStage addFileIds(String fileIds);

        _FinalStage addAllFileIds(List<String> fileIds);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, DescriptionStage, _FinalStage {
        private String name;

        private String description;

        private List<String> fileIds = new ArrayList<>();

        private Optional<KnowledgeBaseModel> model = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(KnowledgeBase other) {
            name(other.getName());
            model(other.getModel());
            description(other.getDescription());
            fileIds(other.getFileIds());
            return this;
        }

        /**
         * <p>The name of the knowledge base</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("name")
        public DescriptionStage name(@NotNull String name) {
            this.name = Objects.requireNonNull(name, "name must not be null");
            return this;
        }

        /**
         * <p>A description of the knowledge base</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("description")
        public _FinalStage description(@NotNull String description) {
            this.description = Objects.requireNonNull(description, "description must not be null");
            return this;
        }

        /**
         * <p>The file IDs associated with this knowledge base</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllFileIds(List<String> fileIds) {
            this.fileIds.addAll(fileIds);
            return this;
        }

        /**
         * <p>The file IDs associated with this knowledge base</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addFileIds(String fileIds) {
            this.fileIds.add(fileIds);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "fileIds", nulls = Nulls.SKIP)
        public _FinalStage fileIds(List<String> fileIds) {
            this.fileIds.clear();
            this.fileIds.addAll(fileIds);
            return this;
        }

        /**
         * <p>The model to use for the knowledge base</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage model(KnowledgeBaseModel model) {
            this.model = Optional.ofNullable(model);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "model", nulls = Nulls.SKIP)
        public _FinalStage model(Optional<KnowledgeBaseModel> model) {
            this.model = model;
            return this;
        }

        @java.lang.Override
        public KnowledgeBase build() {
            return new KnowledgeBase(name, model, description, fileIds, additionalProperties);
        }
    }
}
