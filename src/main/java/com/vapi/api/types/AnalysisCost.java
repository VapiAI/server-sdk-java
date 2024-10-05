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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = AnalysisCost.Builder.class)
public final class AnalysisCost {
    private final AnalysisCostAnalysisType analysisType;

    private final Map<String, Object> model;

    private final double promptTokens;

    private final double completionTokens;

    private final double cost;

    private final Map<String, Object> additionalProperties;

    private AnalysisCost(
            AnalysisCostAnalysisType analysisType,
            Map<String, Object> model,
            double promptTokens,
            double completionTokens,
            double cost,
            Map<String, Object> additionalProperties) {
        this.analysisType = analysisType;
        this.model = model;
        this.promptTokens = promptTokens;
        this.completionTokens = completionTokens;
        this.cost = cost;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the type of analysis performed.
     */
    @JsonProperty("analysisType")
    public AnalysisCostAnalysisType getAnalysisType() {
        return analysisType;
    }

    /**
     * @return This is the model that was used to perform the analysis.
     */
    @JsonProperty("model")
    public Map<String, Object> getModel() {
        return model;
    }

    /**
     * @return This is the number of prompt tokens used in the analysis.
     */
    @JsonProperty("promptTokens")
    public double getPromptTokens() {
        return promptTokens;
    }

    /**
     * @return This is the number of completion tokens generated in the analysis.
     */
    @JsonProperty("completionTokens")
    public double getCompletionTokens() {
        return completionTokens;
    }

    /**
     * @return This is the cost of the component in USD.
     */
    @JsonProperty("cost")
    public double getCost() {
        return cost;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AnalysisCost && equalTo((AnalysisCost) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AnalysisCost other) {
        return analysisType.equals(other.analysisType)
                && model.equals(other.model)
                && promptTokens == other.promptTokens
                && completionTokens == other.completionTokens
                && cost == other.cost;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.analysisType, this.model, this.promptTokens, this.completionTokens, this.cost);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AnalysisTypeStage builder() {
        return new Builder();
    }

    public interface AnalysisTypeStage {
        PromptTokensStage analysisType(@NotNull AnalysisCostAnalysisType analysisType);

        Builder from(AnalysisCost other);
    }

    public interface PromptTokensStage {
        CompletionTokensStage promptTokens(double promptTokens);
    }

    public interface CompletionTokensStage {
        CostStage completionTokens(double completionTokens);
    }

    public interface CostStage {
        _FinalStage cost(double cost);
    }

    public interface _FinalStage {
        AnalysisCost build();

        _FinalStage model(Map<String, Object> model);

        _FinalStage putAllModel(Map<String, Object> model);

        _FinalStage model(String key, Object value);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements AnalysisTypeStage, PromptTokensStage, CompletionTokensStage, CostStage, _FinalStage {
        private AnalysisCostAnalysisType analysisType;

        private double promptTokens;

        private double completionTokens;

        private double cost;

        private Map<String, Object> model = new LinkedHashMap<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AnalysisCost other) {
            analysisType(other.getAnalysisType());
            model(other.getModel());
            promptTokens(other.getPromptTokens());
            completionTokens(other.getCompletionTokens());
            cost(other.getCost());
            return this;
        }

        /**
         * <p>This is the type of analysis performed.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("analysisType")
        public PromptTokensStage analysisType(@NotNull AnalysisCostAnalysisType analysisType) {
            this.analysisType = Objects.requireNonNull(analysisType, "analysisType must not be null");
            return this;
        }

        /**
         * <p>This is the number of prompt tokens used in the analysis.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("promptTokens")
        public CompletionTokensStage promptTokens(double promptTokens) {
            this.promptTokens = promptTokens;
            return this;
        }

        /**
         * <p>This is the number of completion tokens generated in the analysis.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("completionTokens")
        public CostStage completionTokens(double completionTokens) {
            this.completionTokens = completionTokens;
            return this;
        }

        /**
         * <p>This is the cost of the component in USD.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("cost")
        public _FinalStage cost(double cost) {
            this.cost = cost;
            return this;
        }

        /**
         * <p>This is the model that was used to perform the analysis.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage model(String key, Object value) {
            this.model.put(key, value);
            return this;
        }

        /**
         * <p>This is the model that was used to perform the analysis.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage putAllModel(Map<String, Object> model) {
            this.model.putAll(model);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "model", nulls = Nulls.SKIP)
        public _FinalStage model(Map<String, Object> model) {
            this.model.clear();
            this.model.putAll(model);
            return this;
        }

        @java.lang.Override
        public AnalysisCost build() {
            return new AnalysisCost(analysisType, model, promptTokens, completionTokens, cost, additionalProperties);
        }
    }
}