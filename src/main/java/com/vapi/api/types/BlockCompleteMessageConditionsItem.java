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

public final class BlockCompleteMessageConditionsItem {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private BlockCompleteMessageConditionsItem(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static BlockCompleteMessageConditionsItem modelBased(ModelBasedCondition value) {
        return new BlockCompleteMessageConditionsItem(new ModelBasedValue(value));
    }

    public static BlockCompleteMessageConditionsItem ruleBased(RuleBasedCondition value) {
        return new BlockCompleteMessageConditionsItem(new RuleBasedValue(value));
    }

    public boolean isModelBased() {
        return value instanceof ModelBasedValue;
    }

    public boolean isRuleBased() {
        return value instanceof RuleBasedValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<ModelBasedCondition> getModelBased() {
        if (isModelBased()) {
            return Optional.of(((ModelBasedValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<RuleBasedCondition> getRuleBased() {
        if (isRuleBased()) {
            return Optional.of(((RuleBasedValue) value).value);
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
        T visitModelBased(ModelBasedCondition modelBased);

        T visitRuleBased(RuleBasedCondition ruleBased);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({@JsonSubTypes.Type(ModelBasedValue.class), @JsonSubTypes.Type(RuleBasedValue.class)})
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("model-based")
    @JsonIgnoreProperties("type")
    private static final class ModelBasedValue implements Value {
        @JsonUnwrapped
        private ModelBasedCondition value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private ModelBasedValue() {}

        private ModelBasedValue(ModelBasedCondition value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitModelBased(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof ModelBasedValue && equalTo((ModelBasedValue) other);
        }

        private boolean equalTo(ModelBasedValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "BlockCompleteMessageConditionsItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("rule-based")
    @JsonIgnoreProperties("type")
    private static final class RuleBasedValue implements Value {
        @JsonUnwrapped
        private RuleBasedCondition value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private RuleBasedValue() {}

        private RuleBasedValue(RuleBasedCondition value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitRuleBased(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof RuleBasedValue && equalTo((RuleBasedValue) other);
        }

        private boolean equalTo(RuleBasedValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "BlockCompleteMessageConditionsItem{" + "value: " + value + "}";
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
            return "BlockCompleteMessageConditionsItem{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
