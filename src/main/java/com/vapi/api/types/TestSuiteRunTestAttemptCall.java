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
@JsonDeserialize(builder = TestSuiteRunTestAttemptCall.Builder.class)
public final class TestSuiteRunTestAttemptCall {
    private final Artifact artifact;

    private final Map<String, Object> additionalProperties;

    private TestSuiteRunTestAttemptCall(Artifact artifact, Map<String, Object> additionalProperties) {
        this.artifact = artifact;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the artifact of the call.
     */
    @JsonProperty("artifact")
    public Artifact getArtifact() {
        return artifact;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TestSuiteRunTestAttemptCall && equalTo((TestSuiteRunTestAttemptCall) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TestSuiteRunTestAttemptCall other) {
        return artifact.equals(other.artifact);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.artifact);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ArtifactStage builder() {
        return new Builder();
    }

    public interface ArtifactStage {
        _FinalStage artifact(@NotNull Artifact artifact);

        Builder from(TestSuiteRunTestAttemptCall other);
    }

    public interface _FinalStage {
        TestSuiteRunTestAttemptCall build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ArtifactStage, _FinalStage {
        private Artifact artifact;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TestSuiteRunTestAttemptCall other) {
            artifact(other.getArtifact());
            return this;
        }

        /**
         * <p>This is the artifact of the call.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("artifact")
        public _FinalStage artifact(@NotNull Artifact artifact) {
            this.artifact = Objects.requireNonNull(artifact, "artifact must not be null");
            return this;
        }

        @java.lang.Override
        public TestSuiteRunTestAttemptCall build() {
            return new TestSuiteRunTestAttemptCall(artifact, additionalProperties);
        }
    }
}
