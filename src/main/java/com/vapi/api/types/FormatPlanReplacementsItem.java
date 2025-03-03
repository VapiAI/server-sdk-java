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

public final class FormatPlanReplacementsItem {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private FormatPlanReplacementsItem(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static FormatPlanReplacementsItem exact(ExactReplacement value) {
        return new FormatPlanReplacementsItem(new ExactValue(value));
    }

    public static FormatPlanReplacementsItem regex(RegexReplacement value) {
        return new FormatPlanReplacementsItem(new RegexValue(value));
    }

    public boolean isExact() {
        return value instanceof ExactValue;
    }

    public boolean isRegex() {
        return value instanceof RegexValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<ExactReplacement> getExact() {
        if (isExact()) {
            return Optional.of(((ExactValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<RegexReplacement> getRegex() {
        if (isRegex()) {
            return Optional.of(((RegexValue) value).value);
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
        T visitExact(ExactReplacement exact);

        T visitRegex(RegexReplacement regex);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({@JsonSubTypes.Type(ExactValue.class), @JsonSubTypes.Type(RegexValue.class)})
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("exact")
    @JsonIgnoreProperties("type")
    private static final class ExactValue implements Value {
        @JsonUnwrapped
        private ExactReplacement value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private ExactValue() {}

        private ExactValue(ExactReplacement value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitExact(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof ExactValue && equalTo((ExactValue) other);
        }

        private boolean equalTo(ExactValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "FormatPlanReplacementsItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("regex")
    @JsonIgnoreProperties("type")
    private static final class RegexValue implements Value {
        @JsonUnwrapped
        private RegexReplacement value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private RegexValue() {}

        private RegexValue(RegexReplacement value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitRegex(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof RegexValue && equalTo((RegexValue) other);
        }

        private boolean equalTo(RegexValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "FormatPlanReplacementsItem{" + "value: " + value + "}";
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
            return "FormatPlanReplacementsItem{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
