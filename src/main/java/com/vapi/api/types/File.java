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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = File.Builder.class)
public final class File {
    private final Optional<String> _object;

    private final Optional<FileStatus> status;

    private final Optional<String> name;

    private final Optional<String> originalName;

    private final Optional<Double> bytes;

    private final Optional<String> purpose;

    private final Optional<String> mimetype;

    private final Optional<String> key;

    private final Optional<String> path;

    private final Optional<String> bucket;

    private final Optional<String> url;

    private final Optional<Map<String, Object>> metadata;

    private final String id;

    private final String orgId;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Map<String, Object> additionalProperties;

    private File(
            Optional<String> _object,
            Optional<FileStatus> status,
            Optional<String> name,
            Optional<String> originalName,
            Optional<Double> bytes,
            Optional<String> purpose,
            Optional<String> mimetype,
            Optional<String> key,
            Optional<String> path,
            Optional<String> bucket,
            Optional<String> url,
            Optional<Map<String, Object>> metadata,
            String id,
            String orgId,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Map<String, Object> additionalProperties) {
        this._object = _object;
        this.status = status;
        this.name = name;
        this.originalName = originalName;
        this.bytes = bytes;
        this.purpose = purpose;
        this.mimetype = mimetype;
        this.key = key;
        this.path = path;
        this.bucket = bucket;
        this.url = url;
        this.metadata = metadata;
        this.id = id;
        this.orgId = orgId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("object")
    public Optional<String> getObject() {
        return _object;
    }

    @JsonProperty("status")
    public Optional<FileStatus> getStatus() {
        return status;
    }

    /**
     * @return This is the name of the file. This is just for your own reference.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    @JsonProperty("originalName")
    public Optional<String> getOriginalName() {
        return originalName;
    }

    @JsonProperty("bytes")
    public Optional<Double> getBytes() {
        return bytes;
    }

    @JsonProperty("purpose")
    public Optional<String> getPurpose() {
        return purpose;
    }

    @JsonProperty("mimetype")
    public Optional<String> getMimetype() {
        return mimetype;
    }

    @JsonProperty("key")
    public Optional<String> getKey() {
        return key;
    }

    @JsonProperty("path")
    public Optional<String> getPath() {
        return path;
    }

    @JsonProperty("bucket")
    public Optional<String> getBucket() {
        return bucket;
    }

    @JsonProperty("url")
    public Optional<String> getUrl() {
        return url;
    }

    @JsonProperty("metadata")
    public Optional<Map<String, Object>> getMetadata() {
        return metadata;
    }

    /**
     * @return This is the unique identifier for the file.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return This is the unique identifier for the org that this file belongs to.
     */
    @JsonProperty("orgId")
    public String getOrgId() {
        return orgId;
    }

    /**
     * @return This is the ISO 8601 date-time string of when the file was created.
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * @return This is the ISO 8601 date-time string of when the file was last updated.
     */
    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof File && equalTo((File) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(File other) {
        return _object.equals(other._object)
                && status.equals(other.status)
                && name.equals(other.name)
                && originalName.equals(other.originalName)
                && bytes.equals(other.bytes)
                && purpose.equals(other.purpose)
                && mimetype.equals(other.mimetype)
                && key.equals(other.key)
                && path.equals(other.path)
                && bucket.equals(other.bucket)
                && url.equals(other.url)
                && metadata.equals(other.metadata)
                && id.equals(other.id)
                && orgId.equals(other.orgId)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this._object,
                this.status,
                this.name,
                this.originalName,
                this.bytes,
                this.purpose,
                this.mimetype,
                this.key,
                this.path,
                this.bucket,
                this.url,
                this.metadata,
                this.id,
                this.orgId,
                this.createdAt,
                this.updatedAt);
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

        Builder from(File other);
    }

    public interface OrgIdStage {
        CreatedAtStage orgId(@NotNull String orgId);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(@NotNull OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(@NotNull OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        File build();

        _FinalStage _object(Optional<String> _object);

        _FinalStage _object(String _object);

        _FinalStage status(Optional<FileStatus> status);

        _FinalStage status(FileStatus status);

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage originalName(Optional<String> originalName);

        _FinalStage originalName(String originalName);

        _FinalStage bytes(Optional<Double> bytes);

        _FinalStage bytes(Double bytes);

        _FinalStage purpose(Optional<String> purpose);

        _FinalStage purpose(String purpose);

        _FinalStage mimetype(Optional<String> mimetype);

        _FinalStage mimetype(String mimetype);

        _FinalStage key(Optional<String> key);

        _FinalStage key(String key);

        _FinalStage path(Optional<String> path);

        _FinalStage path(String path);

        _FinalStage bucket(Optional<String> bucket);

        _FinalStage bucket(String bucket);

        _FinalStage url(Optional<String> url);

        _FinalStage url(String url);

        _FinalStage metadata(Optional<Map<String, Object>> metadata);

        _FinalStage metadata(Map<String, Object> metadata);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, OrgIdStage, CreatedAtStage, UpdatedAtStage, _FinalStage {
        private String id;

        private String orgId;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Optional<Map<String, Object>> metadata = Optional.empty();

        private Optional<String> url = Optional.empty();

        private Optional<String> bucket = Optional.empty();

        private Optional<String> path = Optional.empty();

        private Optional<String> key = Optional.empty();

        private Optional<String> mimetype = Optional.empty();

        private Optional<String> purpose = Optional.empty();

        private Optional<Double> bytes = Optional.empty();

        private Optional<String> originalName = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<FileStatus> status = Optional.empty();

        private Optional<String> _object = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(File other) {
            _object(other.getObject());
            status(other.getStatus());
            name(other.getName());
            originalName(other.getOriginalName());
            bytes(other.getBytes());
            purpose(other.getPurpose());
            mimetype(other.getMimetype());
            key(other.getKey());
            path(other.getPath());
            bucket(other.getBucket());
            url(other.getUrl());
            metadata(other.getMetadata());
            id(other.getId());
            orgId(other.getOrgId());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        /**
         * <p>This is the unique identifier for the file.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public OrgIdStage id(@NotNull String id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        /**
         * <p>This is the unique identifier for the org that this file belongs to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("orgId")
        public CreatedAtStage orgId(@NotNull String orgId) {
            this.orgId = Objects.requireNonNull(orgId, "orgId must not be null");
            return this;
        }

        /**
         * <p>This is the ISO 8601 date-time string of when the file was created.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(@NotNull OffsetDateTime createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt, "createdAt must not be null");
            return this;
        }

        /**
         * <p>This is the ISO 8601 date-time string of when the file was last updated.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(@NotNull OffsetDateTime updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt, "updatedAt must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage metadata(Map<String, Object> metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public _FinalStage metadata(Optional<Map<String, Object>> metadata) {
            this.metadata = metadata;
            return this;
        }

        @java.lang.Override
        public _FinalStage url(String url) {
            this.url = Optional.ofNullable(url);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "url", nulls = Nulls.SKIP)
        public _FinalStage url(Optional<String> url) {
            this.url = url;
            return this;
        }

        @java.lang.Override
        public _FinalStage bucket(String bucket) {
            this.bucket = Optional.ofNullable(bucket);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "bucket", nulls = Nulls.SKIP)
        public _FinalStage bucket(Optional<String> bucket) {
            this.bucket = bucket;
            return this;
        }

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

        @java.lang.Override
        public _FinalStage key(String key) {
            this.key = Optional.ofNullable(key);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "key", nulls = Nulls.SKIP)
        public _FinalStage key(Optional<String> key) {
            this.key = key;
            return this;
        }

        @java.lang.Override
        public _FinalStage mimetype(String mimetype) {
            this.mimetype = Optional.ofNullable(mimetype);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "mimetype", nulls = Nulls.SKIP)
        public _FinalStage mimetype(Optional<String> mimetype) {
            this.mimetype = mimetype;
            return this;
        }

        @java.lang.Override
        public _FinalStage purpose(String purpose) {
            this.purpose = Optional.ofNullable(purpose);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "purpose", nulls = Nulls.SKIP)
        public _FinalStage purpose(Optional<String> purpose) {
            this.purpose = purpose;
            return this;
        }

        @java.lang.Override
        public _FinalStage bytes(Double bytes) {
            this.bytes = Optional.ofNullable(bytes);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "bytes", nulls = Nulls.SKIP)
        public _FinalStage bytes(Optional<Double> bytes) {
            this.bytes = bytes;
            return this;
        }

        @java.lang.Override
        public _FinalStage originalName(String originalName) {
            this.originalName = Optional.ofNullable(originalName);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "originalName", nulls = Nulls.SKIP)
        public _FinalStage originalName(Optional<String> originalName) {
            this.originalName = originalName;
            return this;
        }

        /**
         * <p>This is the name of the file. This is just for your own reference.</p>
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
        public _FinalStage status(FileStatus status) {
            this.status = Optional.ofNullable(status);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public _FinalStage status(Optional<FileStatus> status) {
            this.status = status;
            return this;
        }

        @java.lang.Override
        public _FinalStage _object(String _object) {
            this._object = Optional.ofNullable(_object);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "object", nulls = Nulls.SKIP)
        public _FinalStage _object(Optional<String> _object) {
            this._object = _object;
            return this;
        }

        @java.lang.Override
        public File build() {
            return new File(
                    _object,
                    status,
                    name,
                    originalName,
                    bytes,
                    purpose,
                    mimetype,
                    key,
                    path,
                    bucket,
                    url,
                    metadata,
                    id,
                    orgId,
                    createdAt,
                    updatedAt,
                    additionalProperties);
        }
    }
}