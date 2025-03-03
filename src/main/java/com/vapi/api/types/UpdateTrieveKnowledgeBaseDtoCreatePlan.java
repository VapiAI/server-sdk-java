/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

public final class UpdateTrieveKnowledgeBaseDtoCreatePlan {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private UpdateTrieveKnowledgeBaseDtoCreatePlan(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static UpdateTrieveKnowledgeBaseDtoCreatePlan create(TrieveKnowledgeBaseCreate value) {
        return new UpdateTrieveKnowledgeBaseDtoCreatePlan(new CreateValue(value));
    }

    public static UpdateTrieveKnowledgeBaseDtoCreatePlan import_(TrieveKnowledgeBaseImport value) {
        return new UpdateTrieveKnowledgeBaseDtoCreatePlan(new ImportValue(value));
    }

    public boolean isCreate() {
        return value instanceof CreateValue;
    }

    public boolean isImport() {
        return value instanceof ImportValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<TrieveKnowledgeBaseCreate> getCreate() {
        if (isCreate()) {
            return Optional.of(((CreateValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<TrieveKnowledgeBaseImport> getImport() {
        if (isImport()) {
            return Optional.of(((ImportValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<Object> _getUnknown() {
        if (_isUnknown()) {
            return Optional.of(((_UnknownValue) value).value);
        }
        return Optional.empty();
    }

    @JsonValue
    private Value getValue() {
        return this.value;
    }

    public interface Visitor<T> {
        T visitCreate(TrieveKnowledgeBaseCreate create);

        T visitImport(TrieveKnowledgeBaseImport import_);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({@JsonSubTypes.Type(CreateValue.class), @JsonSubTypes.Type(ImportValue.class)})
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("create")
    @JsonIgnoreProperties("type")
    private static final class CreateValue implements Value {
        @JsonUnwrapped
        private TrieveKnowledgeBaseCreate value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CreateValue() {}

        private CreateValue(TrieveKnowledgeBaseCreate value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitCreate(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof CreateValue && equalTo((CreateValue) other);
        }

        private boolean equalTo(CreateValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "UpdateTrieveKnowledgeBaseDtoCreatePlan{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("import")
    @JsonIgnoreProperties("type")
    private static final class ImportValue implements Value {
        @JsonUnwrapped
        private TrieveKnowledgeBaseImport value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private ImportValue() {}

        private ImportValue(TrieveKnowledgeBaseImport value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitImport(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof ImportValue && equalTo((ImportValue) other);
        }

        private boolean equalTo(ImportValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "UpdateTrieveKnowledgeBaseDtoCreatePlan{" + "value: " + value + "}";
        }
    }

    @JsonIgnoreProperties("type")
    private static final class _UnknownValue implements Value {
        private String type;

        @JsonValue
        private Object value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private _UnknownValue(@JsonProperty("value") Object value) {}

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor._visitUnknown(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof _UnknownValue && equalTo((_UnknownValue) other);
        }

        private boolean equalTo(_UnknownValue other) {
            return type.equals(other.type) && value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.type, this.value);
        }

        @java.lang.Override
        public String toString() {
            return "UpdateTrieveKnowledgeBaseDtoCreatePlan{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
