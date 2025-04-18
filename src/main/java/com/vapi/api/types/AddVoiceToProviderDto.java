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
@JsonDeserialize(builder = AddVoiceToProviderDto.Builder.class)
public final class AddVoiceToProviderDto {
    private final String ownerId;

    private final String voiceId;

    private final String name;

    private final Map<String, Object> additionalProperties;

    private AddVoiceToProviderDto(
            String ownerId, String voiceId, String name, Map<String, Object> additionalProperties) {
        this.ownerId = ownerId;
        this.voiceId = voiceId;
        this.name = name;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the owner_id of your shared voice which you want to add to your provider Account from Provider Voice Library
     */
    @JsonProperty("ownerId")
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * @return This is the voice_id of the shared voice which you want to add to your provider Account from Provider Voice Library
     */
    @JsonProperty("voiceId")
    public String getVoiceId() {
        return voiceId;
    }

    /**
     * @return This is the new name of the voice which you want to have once you have added voice to your provider Account from Provider Voice Library
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AddVoiceToProviderDto && equalTo((AddVoiceToProviderDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AddVoiceToProviderDto other) {
        return ownerId.equals(other.ownerId) && voiceId.equals(other.voiceId) && name.equals(other.name);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.ownerId, this.voiceId, this.name);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static OwnerIdStage builder() {
        return new Builder();
    }

    public interface OwnerIdStage {
        VoiceIdStage ownerId(@NotNull String ownerId);

        Builder from(AddVoiceToProviderDto other);
    }

    public interface VoiceIdStage {
        NameStage voiceId(@NotNull String voiceId);
    }

    public interface NameStage {
        _FinalStage name(@NotNull String name);
    }

    public interface _FinalStage {
        AddVoiceToProviderDto build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OwnerIdStage, VoiceIdStage, NameStage, _FinalStage {
        private String ownerId;

        private String voiceId;

        private String name;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AddVoiceToProviderDto other) {
            ownerId(other.getOwnerId());
            voiceId(other.getVoiceId());
            name(other.getName());
            return this;
        }

        /**
         * <p>This is the owner_id of your shared voice which you want to add to your provider Account from Provider Voice Library</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("ownerId")
        public VoiceIdStage ownerId(@NotNull String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId, "ownerId must not be null");
            return this;
        }

        /**
         * <p>This is the voice_id of the shared voice which you want to add to your provider Account from Provider Voice Library</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("voiceId")
        public NameStage voiceId(@NotNull String voiceId) {
            this.voiceId = Objects.requireNonNull(voiceId, "voiceId must not be null");
            return this;
        }

        /**
         * <p>This is the new name of the voice which you want to have once you have added voice to your provider Account from Provider Voice Library</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("name")
        public _FinalStage name(@NotNull String name) {
            this.name = Objects.requireNonNull(name, "name must not be null");
            return this;
        }

        @java.lang.Override
        public AddVoiceToProviderDto build() {
            return new AddVoiceToProviderDto(ownerId, voiceId, name, additionalProperties);
        }
    }
}
