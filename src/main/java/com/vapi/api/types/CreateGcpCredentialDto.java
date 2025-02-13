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
@JsonDeserialize(builder = CreateGcpCredentialDto.Builder.class)
public final class CreateGcpCredentialDto {
    private final GcpKey gcpKey;

    private final Optional<BucketPlan> bucketPlan;

    private final Optional<String> name;

    private final Map<String, Object> additionalProperties;

    private CreateGcpCredentialDto(
            GcpKey gcpKey,
            Optional<BucketPlan> bucketPlan,
            Optional<String> name,
            Map<String, Object> additionalProperties) {
        this.gcpKey = gcpKey;
        this.bucketPlan = bucketPlan;
        this.name = name;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the GCP key. This is the JSON that can be generated in the Google Cloud Console at https://console.cloud.google.com/iam-admin/serviceaccounts/details/&lt;service-account-id&gt;/keys.
     * <p>The schema is identical to the JSON that GCP outputs.</p>
     */
    @JsonProperty("gcpKey")
    public GcpKey getGcpKey() {
        return gcpKey;
    }

    /**
     * @return This is the bucket plan that can be provided to store call artifacts in GCP.
     */
    @JsonProperty("bucketPlan")
    public Optional<BucketPlan> getBucketPlan() {
        return bucketPlan;
    }

    /**
     * @return This is the name of credential. This is just for your reference.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreateGcpCredentialDto && equalTo((CreateGcpCredentialDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreateGcpCredentialDto other) {
        return gcpKey.equals(other.gcpKey) && bucketPlan.equals(other.bucketPlan) && name.equals(other.name);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.gcpKey, this.bucketPlan, this.name);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static GcpKeyStage builder() {
        return new Builder();
    }

    public interface GcpKeyStage {
        _FinalStage gcpKey(@NotNull GcpKey gcpKey);

        Builder from(CreateGcpCredentialDto other);
    }

    public interface _FinalStage {
        CreateGcpCredentialDto build();

        _FinalStage bucketPlan(Optional<BucketPlan> bucketPlan);

        _FinalStage bucketPlan(BucketPlan bucketPlan);

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements GcpKeyStage, _FinalStage {
        private GcpKey gcpKey;

        private Optional<String> name = Optional.empty();

        private Optional<BucketPlan> bucketPlan = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CreateGcpCredentialDto other) {
            gcpKey(other.getGcpKey());
            bucketPlan(other.getBucketPlan());
            name(other.getName());
            return this;
        }

        /**
         * <p>This is the GCP key. This is the JSON that can be generated in the Google Cloud Console at https://console.cloud.google.com/iam-admin/serviceaccounts/details/&lt;service-account-id&gt;/keys.</p>
         * <p>The schema is identical to the JSON that GCP outputs.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("gcpKey")
        public _FinalStage gcpKey(@NotNull GcpKey gcpKey) {
            this.gcpKey = Objects.requireNonNull(gcpKey, "gcpKey must not be null");
            return this;
        }

        /**
         * <p>This is the name of credential. This is just for your reference.</p>
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
         * <p>This is the bucket plan that can be provided to store call artifacts in GCP.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage bucketPlan(BucketPlan bucketPlan) {
            this.bucketPlan = Optional.ofNullable(bucketPlan);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "bucketPlan", nulls = Nulls.SKIP)
        public _FinalStage bucketPlan(Optional<BucketPlan> bucketPlan) {
            this.bucketPlan = bucketPlan;
            return this;
        }

        @java.lang.Override
        public CreateGcpCredentialDto build() {
            return new CreateGcpCredentialDto(gcpKey, bucketPlan, name, additionalProperties);
        }
    }
}
