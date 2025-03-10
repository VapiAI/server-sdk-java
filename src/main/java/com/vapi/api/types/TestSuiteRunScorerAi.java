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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vapi.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = TestSuiteRunScorerAi.Builder.class)
public final class TestSuiteRunScorerAi {
    private final TestSuiteRunScorerAiResult result;

    private final String reasoning;

    private final String rubric;

    private final Map<String, Object> additionalProperties;

    private TestSuiteRunScorerAi(
            TestSuiteRunScorerAiResult result,
            String reasoning,
            String rubric,
            Map<String, Object> additionalProperties) {
        this.result = result;
        this.reasoning = reasoning;
        this.rubric = rubric;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the type of the scorer, which must be AI.
     */
    @JsonProperty("type")
    public String getType() {
        return "ai";
    }

    /**
     * @return This is the result of the test suite.
     */
    @JsonProperty("result")
    public TestSuiteRunScorerAiResult getResult() {
        return result;
    }

    /**
     * @return This is the reasoning provided by the AI scorer.
     */
    @JsonProperty("reasoning")
    public String getReasoning() {
        return reasoning;
    }

    /**
     * @return This is the rubric used by the AI scorer.
     */
    @JsonProperty("rubric")
    public String getRubric() {
        return rubric;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TestSuiteRunScorerAi && equalTo((TestSuiteRunScorerAi) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TestSuiteRunScorerAi other) {
        return result.equals(other.result) && reasoning.equals(other.reasoning) && rubric.equals(other.rubric);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.result, this.reasoning, this.rubric);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ResultStage builder() {
        return new Builder();
    }

    public interface ResultStage {
        ReasoningStage result(@NotNull TestSuiteRunScorerAiResult result);

        Builder from(TestSuiteRunScorerAi other);
    }

    public interface ReasoningStage {
        RubricStage reasoning(@NotNull String reasoning);
    }

    public interface RubricStage {
        _FinalStage rubric(@NotNull String rubric);
    }

    public interface _FinalStage {
        TestSuiteRunScorerAi build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ResultStage, ReasoningStage, RubricStage, _FinalStage {
        private TestSuiteRunScorerAiResult result;

        private String reasoning;

        private String rubric;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TestSuiteRunScorerAi other) {
            result(other.getResult());
            reasoning(other.getReasoning());
            rubric(other.getRubric());
            return this;
        }

        /**
         * <p>This is the result of the test suite.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("result")
        public ReasoningStage result(@NotNull TestSuiteRunScorerAiResult result) {
            this.result = Objects.requireNonNull(result, "result must not be null");
            return this;
        }

        /**
         * <p>This is the reasoning provided by the AI scorer.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("reasoning")
        public RubricStage reasoning(@NotNull String reasoning) {
            this.reasoning = Objects.requireNonNull(reasoning, "reasoning must not be null");
            return this;
        }

        /**
         * <p>This is the rubric used by the AI scorer.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("rubric")
        public _FinalStage rubric(@NotNull String rubric) {
            this.rubric = Objects.requireNonNull(rubric, "rubric must not be null");
            return this;
        }

        @java.lang.Override
        public TestSuiteRunScorerAi build() {
            return new TestSuiteRunScorerAi(result, reasoning, rubric, additionalProperties);
        }
    }
}
