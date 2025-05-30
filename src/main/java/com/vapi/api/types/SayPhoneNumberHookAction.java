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
@JsonDeserialize(builder = SayPhoneNumberHookAction.Builder.class)
public final class SayPhoneNumberHookAction {
    private final String exact;

    private final Map<String, Object> additionalProperties;

    private SayPhoneNumberHookAction(String exact, Map<String, Object> additionalProperties) {
        this.exact = exact;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the message to say
     */
    @JsonProperty("exact")
    public String getExact() {
        return exact;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SayPhoneNumberHookAction && equalTo((SayPhoneNumberHookAction) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SayPhoneNumberHookAction other) {
        return exact.equals(other.exact);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.exact);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ExactStage builder() {
        return new Builder();
    }

    public interface ExactStage {
        _FinalStage exact(@NotNull String exact);

        Builder from(SayPhoneNumberHookAction other);
    }

    public interface _FinalStage {
        SayPhoneNumberHookAction build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ExactStage, _FinalStage {
        private String exact;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(SayPhoneNumberHookAction other) {
            exact(other.getExact());
            return this;
        }

        /**
         * <p>This is the message to say</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("exact")
        public _FinalStage exact(@NotNull String exact) {
            this.exact = Objects.requireNonNull(exact, "exact must not be null");
            return this;
        }

        @java.lang.Override
        public SayPhoneNumberHookAction build() {
            return new SayPhoneNumberHookAction(exact, additionalProperties);
        }
    }
}
