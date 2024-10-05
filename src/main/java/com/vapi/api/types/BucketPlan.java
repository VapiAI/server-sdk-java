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
@JsonDeserialize(builder = BucketPlan.Builder.class)
public final class BucketPlan {
    private final String name;

    private final Optional<String> region;

    private final Optional<String> path;

    private final Optional<String> hmacAccessKey;

    private final Optional<String> hmacSecret;

    private final Map<String, Object> additionalProperties;

    private BucketPlan(
            String name,
            Optional<String> region,
            Optional<String> path,
            Optional<String> hmacAccessKey,
            Optional<String> hmacSecret,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.region = region;
        this.path = path;
        this.hmacAccessKey = hmacAccessKey;
        this.hmacSecret = hmacSecret;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the name of the bucket.
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return This is the region of the bucket.
     * <p>Usage:</p>
     * <ul>
     * <li>If <code>credential.type</code> is <code>aws</code>, then this is required.</li>
     * <li>If <code>credential.type</code> is <code>gcp</code>, then this is optional since GCP allows buckets to be accessed without a region but region is required for data residency requirements. Read here: https://cloud.google.com/storage/docs/request-endpoints</li>
     * </ul>
     */
    @JsonProperty("region")
    public Optional<String> getRegion() {
        return region;
    }

    /**
     * @return This is the path where call artifacts will be stored.
     * <p>Usage:</p>
     * <ul>
     * <li>To store call artifacts in a specific folder, set this to the full path. Eg. &quot;/folder-name1/folder-name2&quot;.</li>
     * <li>To store call artifacts in the root of the bucket, leave this blank.</li>
     * </ul>
     * <p>@default &quot;/&quot;</p>
     */
    @JsonProperty("path")
    public Optional<String> getPath() {
        return path;
    }

    /**
     * @return This is the HMAC access key offered by GCP for interoperability with S3 clients. Here is the guide on how to create: https://cloud.google.com/storage/docs/authentication/managing-hmackeys#console
     * <p>Usage:</p>
     * <ul>
     * <li>If <code>credential.type</code> is <code>gcp</code>, then this is required.</li>
     * <li>If <code>credential.type</code> is <code>aws</code>, then this is not required since credential.awsAccessKeyId is used instead.</li>
     * </ul>
     */
    @JsonProperty("hmacAccessKey")
    public Optional<String> getHmacAccessKey() {
        return hmacAccessKey;
    }

    /**
     * @return This is the secret for the HMAC access key. Here is the guide on how to create: https://cloud.google.com/storage/docs/authentication/managing-hmackeys#console
     * <p>Usage:</p>
     * <ul>
     * <li>If <code>credential.type</code> is <code>gcp</code>, then this is required.</li>
     * <li>If <code>credential.type</code> is <code>aws</code>, then this is not required since credential.awsSecretAccessKey is used instead.</li>
     * </ul>
     * <p>Note: This is not returned in the API.</p>
     */
    @JsonProperty("hmacSecret")
    public Optional<String> getHmacSecret() {
        return hmacSecret;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BucketPlan && equalTo((BucketPlan) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BucketPlan other) {
        return name.equals(other.name)
                && region.equals(other.region)
                && path.equals(other.path)
                && hmacAccessKey.equals(other.hmacAccessKey)
                && hmacSecret.equals(other.hmacSecret);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.name, this.region, this.path, this.hmacAccessKey, this.hmacSecret);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        _FinalStage name(@NotNull String name);

        Builder from(BucketPlan other);
    }

    public interface _FinalStage {
        BucketPlan build();

        _FinalStage region(Optional<String> region);

        _FinalStage region(String region);

        _FinalStage path(Optional<String> path);

        _FinalStage path(String path);

        _FinalStage hmacAccessKey(Optional<String> hmacAccessKey);

        _FinalStage hmacAccessKey(String hmacAccessKey);

        _FinalStage hmacSecret(Optional<String> hmacSecret);

        _FinalStage hmacSecret(String hmacSecret);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, _FinalStage {
        private String name;

        private Optional<String> hmacSecret = Optional.empty();

        private Optional<String> hmacAccessKey = Optional.empty();

        private Optional<String> path = Optional.empty();

        private Optional<String> region = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(BucketPlan other) {
            name(other.getName());
            region(other.getRegion());
            path(other.getPath());
            hmacAccessKey(other.getHmacAccessKey());
            hmacSecret(other.getHmacSecret());
            return this;
        }

        /**
         * <p>This is the name of the bucket.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("name")
        public _FinalStage name(@NotNull String name) {
            this.name = Objects.requireNonNull(name, "name must not be null");
            return this;
        }

        /**
         * <p>This is the secret for the HMAC access key. Here is the guide on how to create: https://cloud.google.com/storage/docs/authentication/managing-hmackeys#console</p>
         * <p>Usage:</p>
         * <ul>
         * <li>If <code>credential.type</code> is <code>gcp</code>, then this is required.</li>
         * <li>If <code>credential.type</code> is <code>aws</code>, then this is not required since credential.awsSecretAccessKey is used instead.</li>
         * </ul>
         * <p>Note: This is not returned in the API.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage hmacSecret(String hmacSecret) {
            this.hmacSecret = Optional.ofNullable(hmacSecret);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "hmacSecret", nulls = Nulls.SKIP)
        public _FinalStage hmacSecret(Optional<String> hmacSecret) {
            this.hmacSecret = hmacSecret;
            return this;
        }

        /**
         * <p>This is the HMAC access key offered by GCP for interoperability with S3 clients. Here is the guide on how to create: https://cloud.google.com/storage/docs/authentication/managing-hmackeys#console</p>
         * <p>Usage:</p>
         * <ul>
         * <li>If <code>credential.type</code> is <code>gcp</code>, then this is required.</li>
         * <li>If <code>credential.type</code> is <code>aws</code>, then this is not required since credential.awsAccessKeyId is used instead.</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage hmacAccessKey(String hmacAccessKey) {
            this.hmacAccessKey = Optional.ofNullable(hmacAccessKey);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "hmacAccessKey", nulls = Nulls.SKIP)
        public _FinalStage hmacAccessKey(Optional<String> hmacAccessKey) {
            this.hmacAccessKey = hmacAccessKey;
            return this;
        }

        /**
         * <p>This is the path where call artifacts will be stored.</p>
         * <p>Usage:</p>
         * <ul>
         * <li>To store call artifacts in a specific folder, set this to the full path. Eg. &quot;/folder-name1/folder-name2&quot;.</li>
         * <li>To store call artifacts in the root of the bucket, leave this blank.</li>
         * </ul>
         * <p>@default &quot;/&quot;</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage path(String path) {
            this.path = Optional.ofNullable(path);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "path", nulls = Nulls.SKIP)
        public _FinalStage path(Optional<String> path) {
            this.path = path;
            return this;
        }

        /**
         * <p>This is the region of the bucket.</p>
         * <p>Usage:</p>
         * <ul>
         * <li>If <code>credential.type</code> is <code>aws</code>, then this is required.</li>
         * <li>If <code>credential.type</code> is <code>gcp</code>, then this is optional since GCP allows buckets to be accessed without a region but region is required for data residency requirements. Read here: https://cloud.google.com/storage/docs/request-endpoints</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage region(String region) {
            this.region = Optional.ofNullable(region);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "region", nulls = Nulls.SKIP)
        public _FinalStage region(Optional<String> region) {
            this.region = region;
            return this;
        }

        @java.lang.Override
        public BucketPlan build() {
            return new BucketPlan(name, region, path, hmacAccessKey, hmacSecret, additionalProperties);
        }
    }
}