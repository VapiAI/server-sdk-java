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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = TestSuiteTestVoice.Builder.class)
public final class TestSuiteTestVoice {
    private final List<TestSuiteTestScorerAi> scorers;

    private final String id;

    private final String testSuiteId;

    private final String orgId;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Optional<String> name;

    private final String script;

    private final Optional<Double> numAttempts;

    private final Map<String, Object> additionalProperties;

    private TestSuiteTestVoice(
            List<TestSuiteTestScorerAi> scorers,
            String id,
            String testSuiteId,
            String orgId,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Optional<String> name,
            String script,
            Optional<Double> numAttempts,
            Map<String, Object> additionalProperties) {
        this.scorers = scorers;
        this.id = id;
        this.testSuiteId = testSuiteId;
        this.orgId = orgId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.name = name;
        this.script = script;
        this.numAttempts = numAttempts;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return These are the scorers used to evaluate the test.
     */
    @JsonProperty("scorers")
    public List<TestSuiteTestScorerAi> getScorers() {
        return scorers;
    }

    /**
     * @return This is the unique identifier for the test.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return This is the unique identifier for the test suite this test belongs to.
     */
    @JsonProperty("testSuiteId")
    public String getTestSuiteId() {
        return testSuiteId;
    }

    /**
     * @return This is the unique identifier for the organization this test belongs to.
     */
    @JsonProperty("orgId")
    public String getOrgId() {
        return orgId;
    }

    /**
     * @return This is the ISO 8601 date-time string of when the test was created.
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * @return This is the ISO 8601 date-time string of when the test was last updated.
     */
    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @return This is the name of the test.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return This is the script to be used for the voice test.
     */
    @JsonProperty("script")
    public String getScript() {
        return script;
    }

    /**
     * @return This is the number of attempts allowed for the test.
     */
    @JsonProperty("numAttempts")
    public Optional<Double> getNumAttempts() {
        return numAttempts;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TestSuiteTestVoice && equalTo((TestSuiteTestVoice) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TestSuiteTestVoice other) {
        return scorers.equals(other.scorers)
                && id.equals(other.id)
                && testSuiteId.equals(other.testSuiteId)
                && orgId.equals(other.orgId)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt)
                && name.equals(other.name)
                && script.equals(other.script)
                && numAttempts.equals(other.numAttempts);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.scorers,
                this.id,
                this.testSuiteId,
                this.orgId,
                this.createdAt,
                this.updatedAt,
                this.name,
                this.script,
                this.numAttempts);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        TestSuiteIdStage id(@NotNull String id);

        Builder from(TestSuiteTestVoice other);
    }

    public interface TestSuiteIdStage {
        OrgIdStage testSuiteId(@NotNull String testSuiteId);
    }

    public interface OrgIdStage {
        CreatedAtStage orgId(@NotNull String orgId);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(@NotNull OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        ScriptStage updatedAt(@NotNull OffsetDateTime updatedAt);
    }

    public interface ScriptStage {
        _FinalStage script(@NotNull String script);
    }

    public interface _FinalStage {
        TestSuiteTestVoice build();

        _FinalStage scorers(List<TestSuiteTestScorerAi> scorers);

        _FinalStage addScorers(TestSuiteTestScorerAi scorers);

        _FinalStage addAllScorers(List<TestSuiteTestScorerAi> scorers);

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage numAttempts(Optional<Double> numAttempts);

        _FinalStage numAttempts(Double numAttempts);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage, TestSuiteIdStage, OrgIdStage, CreatedAtStage, UpdatedAtStage, ScriptStage, _FinalStage {
        private String id;

        private String testSuiteId;

        private String orgId;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private String script;

        private Optional<Double> numAttempts = Optional.empty();

        private Optional<String> name = Optional.empty();

        private List<TestSuiteTestScorerAi> scorers = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TestSuiteTestVoice other) {
            scorers(other.getScorers());
            id(other.getId());
            testSuiteId(other.getTestSuiteId());
            orgId(other.getOrgId());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            name(other.getName());
            script(other.getScript());
            numAttempts(other.getNumAttempts());
            return this;
        }

        /**
         * <p>This is the unique identifier for the test.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public TestSuiteIdStage id(@NotNull String id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        /**
         * <p>This is the unique identifier for the test suite this test belongs to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("testSuiteId")
        public OrgIdStage testSuiteId(@NotNull String testSuiteId) {
            this.testSuiteId = Objects.requireNonNull(testSuiteId, "testSuiteId must not be null");
            return this;
        }

        /**
         * <p>This is the unique identifier for the organization this test belongs to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("orgId")
        public CreatedAtStage orgId(@NotNull String orgId) {
            this.orgId = Objects.requireNonNull(orgId, "orgId must not be null");
            return this;
        }

        /**
         * <p>This is the ISO 8601 date-time string of when the test was created.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(@NotNull OffsetDateTime createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt, "createdAt must not be null");
            return this;
        }

        /**
         * <p>This is the ISO 8601 date-time string of when the test was last updated.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("updatedAt")
        public ScriptStage updatedAt(@NotNull OffsetDateTime updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt, "updatedAt must not be null");
            return this;
        }

        /**
         * <p>This is the script to be used for the voice test.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("script")
        public _FinalStage script(@NotNull String script) {
            this.script = Objects.requireNonNull(script, "script must not be null");
            return this;
        }

        /**
         * <p>This is the number of attempts allowed for the test.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage numAttempts(Double numAttempts) {
            this.numAttempts = Optional.ofNullable(numAttempts);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "numAttempts", nulls = Nulls.SKIP)
        public _FinalStage numAttempts(Optional<Double> numAttempts) {
            this.numAttempts = numAttempts;
            return this;
        }

        /**
         * <p>This is the name of the test.</p>
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

        /**
         * <p>These are the scorers used to evaluate the test.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllScorers(List<TestSuiteTestScorerAi> scorers) {
            this.scorers.addAll(scorers);
            return this;
        }

        /**
         * <p>These are the scorers used to evaluate the test.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addScorers(TestSuiteTestScorerAi scorers) {
            this.scorers.add(scorers);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "scorers", nulls = Nulls.SKIP)
        public _FinalStage scorers(List<TestSuiteTestScorerAi> scorers) {
            this.scorers.clear();
            this.scorers.addAll(scorers);
            return this;
        }

        @java.lang.Override
        public TestSuiteTestVoice build() {
            return new TestSuiteTestVoice(
                    scorers,
                    id,
                    testSuiteId,
                    orgId,
                    createdAt,
                    updatedAt,
                    name,
                    script,
                    numAttempts,
                    additionalProperties);
        }
    }
}
