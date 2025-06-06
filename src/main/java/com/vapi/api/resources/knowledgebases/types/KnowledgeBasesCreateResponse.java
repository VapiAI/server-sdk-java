/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.resources.knowledgebases.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.vapi.api.types.CustomKnowledgeBase;
import com.vapi.api.types.TrieveKnowledgeBase;
import java.util.Objects;
import java.util.Optional;

public final class KnowledgeBasesCreateResponse {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private KnowledgeBasesCreateResponse(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static KnowledgeBasesCreateResponse trieve(TrieveKnowledgeBase value) {
        return new KnowledgeBasesCreateResponse(new TrieveValue(value));
    }

    public static KnowledgeBasesCreateResponse customKnowledgeBase(CustomKnowledgeBase value) {
        return new KnowledgeBasesCreateResponse(new CustomKnowledgeBaseValue(value));
    }

    public boolean isTrieve() {
        return value instanceof TrieveValue;
    }

    public boolean isCustomKnowledgeBase() {
        return value instanceof CustomKnowledgeBaseValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<TrieveKnowledgeBase> getTrieve() {
        if (isTrieve()) {
            return Optional.of(((TrieveValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CustomKnowledgeBase> getCustomKnowledgeBase() {
        if (isCustomKnowledgeBase()) {
            return Optional.of(((CustomKnowledgeBaseValue) value).value);
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
        T visitTrieve(TrieveKnowledgeBase trieve);

        T visitCustomKnowledgeBase(CustomKnowledgeBase customKnowledgeBase);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "provider", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({@JsonSubTypes.Type(TrieveValue.class), @JsonSubTypes.Type(CustomKnowledgeBaseValue.class)})
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("trieve")
    @JsonIgnoreProperties("provider")
    private static final class TrieveValue implements Value {
        @JsonUnwrapped
        private TrieveKnowledgeBase value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private TrieveValue() {}

        private TrieveValue(TrieveKnowledgeBase value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitTrieve(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof TrieveValue && equalTo((TrieveValue) other);
        }

        private boolean equalTo(TrieveValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "KnowledgeBasesCreateResponse{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("custom-knowledge-base")
    @JsonIgnoreProperties("provider")
    private static final class CustomKnowledgeBaseValue implements Value {
        @JsonUnwrapped
        private CustomKnowledgeBase value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CustomKnowledgeBaseValue() {}

        private CustomKnowledgeBaseValue(CustomKnowledgeBase value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitCustomKnowledgeBase(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof CustomKnowledgeBaseValue && equalTo((CustomKnowledgeBaseValue) other);
        }

        private boolean equalTo(CustomKnowledgeBaseValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "KnowledgeBasesCreateResponse{" + "value: " + value + "}";
        }
    }

    @JsonIgnoreProperties("provider")
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
            return "KnowledgeBasesCreateResponse{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
