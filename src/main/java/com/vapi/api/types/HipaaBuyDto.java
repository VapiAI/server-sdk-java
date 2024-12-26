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
@JsonDeserialize(builder = HipaaBuyDto.Builder.class)
public final class HipaaBuyDto {
    private final String recipientName;

    private final String recipientOrganization;

    private final Map<String, Object> additionalProperties;

    private HipaaBuyDto(String recipientName, String recipientOrganization, Map<String, Object> additionalProperties) {
        this.recipientName = recipientName;
        this.recipientOrganization = recipientOrganization;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the name of the recipient.
     */
    @JsonProperty("recipientName")
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * @return This is the name of the recipient organization.
     */
    @JsonProperty("recipientOrganization")
    public String getRecipientOrganization() {
        return recipientOrganization;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof HipaaBuyDto && equalTo((HipaaBuyDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(HipaaBuyDto other) {
        return recipientName.equals(other.recipientName) && recipientOrganization.equals(other.recipientOrganization);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.recipientName, this.recipientOrganization);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RecipientNameStage builder() {
        return new Builder();
    }

    public interface RecipientNameStage {
        RecipientOrganizationStage recipientName(@NotNull String recipientName);

        Builder from(HipaaBuyDto other);
    }

    public interface RecipientOrganizationStage {
        _FinalStage recipientOrganization(@NotNull String recipientOrganization);
    }

    public interface _FinalStage {
        HipaaBuyDto build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements RecipientNameStage, RecipientOrganizationStage, _FinalStage {
        private String recipientName;

        private String recipientOrganization;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(HipaaBuyDto other) {
            recipientName(other.getRecipientName());
            recipientOrganization(other.getRecipientOrganization());
            return this;
        }

        /**
         * <p>This is the name of the recipient.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("recipientName")
        public RecipientOrganizationStage recipientName(@NotNull String recipientName) {
            this.recipientName = Objects.requireNonNull(recipientName, "recipientName must not be null");
            return this;
        }

        /**
         * <p>This is the name of the recipient organization.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("recipientOrganization")
        public _FinalStage recipientOrganization(@NotNull String recipientOrganization) {
            this.recipientOrganization =
                    Objects.requireNonNull(recipientOrganization, "recipientOrganization must not be null");
            return this;
        }

        @java.lang.Override
        public HipaaBuyDto build() {
            return new HipaaBuyDto(recipientName, recipientOrganization, additionalProperties);
        }
    }
}