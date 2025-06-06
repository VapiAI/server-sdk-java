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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = AnalysisPlan.Builder.class)
public final class AnalysisPlan {
    private final Optional<SummaryPlan> summaryPlan;

    private final Optional<StructuredDataPlan> structuredDataPlan;

    private final Optional<List<StructuredDataMultiPlan>> structuredDataMultiPlan;

    private final Optional<SuccessEvaluationPlan> successEvaluationPlan;

    private final Map<String, Object> additionalProperties;

    private AnalysisPlan(
            Optional<SummaryPlan> summaryPlan,
            Optional<StructuredDataPlan> structuredDataPlan,
            Optional<List<StructuredDataMultiPlan>> structuredDataMultiPlan,
            Optional<SuccessEvaluationPlan> successEvaluationPlan,
            Map<String, Object> additionalProperties) {
        this.summaryPlan = summaryPlan;
        this.structuredDataPlan = structuredDataPlan;
        this.structuredDataMultiPlan = structuredDataMultiPlan;
        this.successEvaluationPlan = successEvaluationPlan;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the plan for generating the summary of the call. This outputs to <code>call.analysis.summary</code>.
     */
    @JsonProperty("summaryPlan")
    public Optional<SummaryPlan> getSummaryPlan() {
        return summaryPlan;
    }

    /**
     * @return This is the plan for generating the structured data from the call. This outputs to <code>call.analysis.structuredData</code>.
     */
    @JsonProperty("structuredDataPlan")
    public Optional<StructuredDataPlan> getStructuredDataPlan() {
        return structuredDataPlan;
    }

    /**
     * @return This is an array of structured data plan catalogs. Each entry includes a <code>key</code> and a <code>plan</code> for generating the structured data from the call. This outputs to <code>call.analysis.structuredDataMulti</code>.
     */
    @JsonProperty("structuredDataMultiPlan")
    public Optional<List<StructuredDataMultiPlan>> getStructuredDataMultiPlan() {
        return structuredDataMultiPlan;
    }

    /**
     * @return This is the plan for generating the success evaluation of the call. This outputs to <code>call.analysis.successEvaluation</code>.
     */
    @JsonProperty("successEvaluationPlan")
    public Optional<SuccessEvaluationPlan> getSuccessEvaluationPlan() {
        return successEvaluationPlan;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AnalysisPlan && equalTo((AnalysisPlan) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AnalysisPlan other) {
        return summaryPlan.equals(other.summaryPlan)
                && structuredDataPlan.equals(other.structuredDataPlan)
                && structuredDataMultiPlan.equals(other.structuredDataMultiPlan)
                && successEvaluationPlan.equals(other.successEvaluationPlan);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.summaryPlan, this.structuredDataPlan, this.structuredDataMultiPlan, this.successEvaluationPlan);
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
        private Optional<SummaryPlan> summaryPlan = Optional.empty();

        private Optional<StructuredDataPlan> structuredDataPlan = Optional.empty();

        private Optional<List<StructuredDataMultiPlan>> structuredDataMultiPlan = Optional.empty();

        private Optional<SuccessEvaluationPlan> successEvaluationPlan = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(AnalysisPlan other) {
            summaryPlan(other.getSummaryPlan());
            structuredDataPlan(other.getStructuredDataPlan());
            structuredDataMultiPlan(other.getStructuredDataMultiPlan());
            successEvaluationPlan(other.getSuccessEvaluationPlan());
            return this;
        }

        @JsonSetter(value = "summaryPlan", nulls = Nulls.SKIP)
        public Builder summaryPlan(Optional<SummaryPlan> summaryPlan) {
            this.summaryPlan = summaryPlan;
            return this;
        }

        public Builder summaryPlan(SummaryPlan summaryPlan) {
            this.summaryPlan = Optional.ofNullable(summaryPlan);
            return this;
        }

        @JsonSetter(value = "structuredDataPlan", nulls = Nulls.SKIP)
        public Builder structuredDataPlan(Optional<StructuredDataPlan> structuredDataPlan) {
            this.structuredDataPlan = structuredDataPlan;
            return this;
        }

        public Builder structuredDataPlan(StructuredDataPlan structuredDataPlan) {
            this.structuredDataPlan = Optional.ofNullable(structuredDataPlan);
            return this;
        }

        @JsonSetter(value = "structuredDataMultiPlan", nulls = Nulls.SKIP)
        public Builder structuredDataMultiPlan(Optional<List<StructuredDataMultiPlan>> structuredDataMultiPlan) {
            this.structuredDataMultiPlan = structuredDataMultiPlan;
            return this;
        }

        public Builder structuredDataMultiPlan(List<StructuredDataMultiPlan> structuredDataMultiPlan) {
            this.structuredDataMultiPlan = Optional.ofNullable(structuredDataMultiPlan);
            return this;
        }

        @JsonSetter(value = "successEvaluationPlan", nulls = Nulls.SKIP)
        public Builder successEvaluationPlan(Optional<SuccessEvaluationPlan> successEvaluationPlan) {
            this.successEvaluationPlan = successEvaluationPlan;
            return this;
        }

        public Builder successEvaluationPlan(SuccessEvaluationPlan successEvaluationPlan) {
            this.successEvaluationPlan = Optional.ofNullable(successEvaluationPlan);
            return this;
        }

        public AnalysisPlan build() {
            return new AnalysisPlan(
                    summaryPlan,
                    structuredDataPlan,
                    structuredDataMultiPlan,
                    successEvaluationPlan,
                    additionalProperties);
        }
    }
}
