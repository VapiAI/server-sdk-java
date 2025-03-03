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
@JsonDeserialize(builder = TestSuiteRunTestAttempt.Builder.class)
public final class TestSuiteRunTestAttempt {
    private final List<TestSuiteRunScorerAi> scorerResults;

    private final TestSuiteRunTestAttemptCall call;

    private final Map<String, Object> additionalProperties;

    private TestSuiteRunTestAttempt(
            List<TestSuiteRunScorerAi> scorerResults,
            TestSuiteRunTestAttemptCall call,
            Map<String, Object> additionalProperties) {
        this.scorerResults = scorerResults;
        this.call = call;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return These are the results of the scorers used to evaluate the test attempt.
     */
    @JsonProperty("scorerResults")
    public List<TestSuiteRunScorerAi> getScorerResults() {
        return scorerResults;
    }

    /**
     * @return This is the call made during the test attempt.
     */
    @JsonProperty("call")
    public TestSuiteRunTestAttemptCall getCall() {
        return call;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TestSuiteRunTestAttempt && equalTo((TestSuiteRunTestAttempt) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TestSuiteRunTestAttempt other) {
        return scorerResults.equals(other.scorerResults) && call.equals(other.call);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.scorerResults, this.call);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CallStage builder() {
        return new Builder();
    }

    public interface CallStage {
        _FinalStage call(@NotNull TestSuiteRunTestAttemptCall call);

        Builder from(TestSuiteRunTestAttempt other);
    }

    public interface _FinalStage {
        TestSuiteRunTestAttempt build();

        _FinalStage scorerResults(List<TestSuiteRunScorerAi> scorerResults);

        _FinalStage addScorerResults(TestSuiteRunScorerAi scorerResults);

        _FinalStage addAllScorerResults(List<TestSuiteRunScorerAi> scorerResults);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CallStage, _FinalStage {
        private TestSuiteRunTestAttemptCall call;

        private List<TestSuiteRunScorerAi> scorerResults = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TestSuiteRunTestAttempt other) {
            scorerResults(other.getScorerResults());
            call(other.getCall());
            return this;
        }

        /**
         * <p>This is the call made during the test attempt.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("call")
        public _FinalStage call(@NotNull TestSuiteRunTestAttemptCall call) {
            this.call = Objects.requireNonNull(call, "call must not be null");
            return this;
        }

        /**
         * <p>These are the results of the scorers used to evaluate the test attempt.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllScorerResults(List<TestSuiteRunScorerAi> scorerResults) {
            this.scorerResults.addAll(scorerResults);
            return this;
        }

        /**
         * <p>These are the results of the scorers used to evaluate the test attempt.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addScorerResults(TestSuiteRunScorerAi scorerResults) {
            this.scorerResults.add(scorerResults);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "scorerResults", nulls = Nulls.SKIP)
        public _FinalStage scorerResults(List<TestSuiteRunScorerAi> scorerResults) {
            this.scorerResults.clear();
            this.scorerResults.addAll(scorerResults);
            return this;
        }

        @java.lang.Override
        public TestSuiteRunTestAttempt build() {
            return new TestSuiteRunTestAttempt(scorerResults, call, additionalProperties);
        }
    }
}
