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
@JsonDeserialize(builder = TavusVoice.Builder.class)
public final class TavusVoice {
    private final TavusVoiceVoiceId voiceId;

    private final Optional<ChunkPlan> chunkPlan;

    private final Optional<String> personaId;

    private final Optional<String> callbackUrl;

    private final Optional<String> conversationName;

    private final Optional<String> conversationalContext;

    private final Optional<String> customGreeting;

    private final Optional<TavusConversationProperties> properties;

    private final Optional<FallbackPlan> fallbackPlan;

    private final Map<String, Object> additionalProperties;

    private TavusVoice(
            TavusVoiceVoiceId voiceId,
            Optional<ChunkPlan> chunkPlan,
            Optional<String> personaId,
            Optional<String> callbackUrl,
            Optional<String> conversationName,
            Optional<String> conversationalContext,
            Optional<String> customGreeting,
            Optional<TavusConversationProperties> properties,
            Optional<FallbackPlan> fallbackPlan,
            Map<String, Object> additionalProperties) {
        this.voiceId = voiceId;
        this.chunkPlan = chunkPlan;
        this.personaId = personaId;
        this.callbackUrl = callbackUrl;
        this.conversationName = conversationName;
        this.conversationalContext = conversationalContext;
        this.customGreeting = customGreeting;
        this.properties = properties;
        this.fallbackPlan = fallbackPlan;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the provider-specific ID that will be used.
     */
    @JsonProperty("voiceId")
    public TavusVoiceVoiceId getVoiceId() {
        return voiceId;
    }

    /**
     * @return This is the plan for chunking the model output before it is sent to the voice provider.
     */
    @JsonProperty("chunkPlan")
    public Optional<ChunkPlan> getChunkPlan() {
        return chunkPlan;
    }

    /**
     * @return This is the unique identifier for the persona that the replica will use in the conversation.
     */
    @JsonProperty("personaId")
    public Optional<String> getPersonaId() {
        return personaId;
    }

    /**
     * @return This is the url that will receive webhooks with updates regarding the conversation state.
     */
    @JsonProperty("callbackUrl")
    public Optional<String> getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * @return This is the name for the conversation.
     */
    @JsonProperty("conversationName")
    public Optional<String> getConversationName() {
        return conversationName;
    }

    /**
     * @return This is the context that will be appended to any context provided in the persona, if one is provided.
     */
    @JsonProperty("conversationalContext")
    public Optional<String> getConversationalContext() {
        return conversationalContext;
    }

    /**
     * @return This is the custom greeting that the replica will give once a participant joines the conversation.
     */
    @JsonProperty("customGreeting")
    public Optional<String> getCustomGreeting() {
        return customGreeting;
    }

    /**
     * @return These are optional properties used to customize the conversation.
     */
    @JsonProperty("properties")
    public Optional<TavusConversationProperties> getProperties() {
        return properties;
    }

    /**
     * @return This is the plan for voice provider fallbacks in the event that the primary voice provider fails.
     */
    @JsonProperty("fallbackPlan")
    public Optional<FallbackPlan> getFallbackPlan() {
        return fallbackPlan;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TavusVoice && equalTo((TavusVoice) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TavusVoice other) {
        return voiceId.equals(other.voiceId)
                && chunkPlan.equals(other.chunkPlan)
                && personaId.equals(other.personaId)
                && callbackUrl.equals(other.callbackUrl)
                && conversationName.equals(other.conversationName)
                && conversationalContext.equals(other.conversationalContext)
                && customGreeting.equals(other.customGreeting)
                && properties.equals(other.properties)
                && fallbackPlan.equals(other.fallbackPlan);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.voiceId,
                this.chunkPlan,
                this.personaId,
                this.callbackUrl,
                this.conversationName,
                this.conversationalContext,
                this.customGreeting,
                this.properties,
                this.fallbackPlan);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static VoiceIdStage builder() {
        return new Builder();
    }

    public interface VoiceIdStage {
        _FinalStage voiceId(@NotNull TavusVoiceVoiceId voiceId);

        Builder from(TavusVoice other);
    }

    public interface _FinalStage {
        TavusVoice build();

        _FinalStage chunkPlan(Optional<ChunkPlan> chunkPlan);

        _FinalStage chunkPlan(ChunkPlan chunkPlan);

        _FinalStage personaId(Optional<String> personaId);

        _FinalStage personaId(String personaId);

        _FinalStage callbackUrl(Optional<String> callbackUrl);

        _FinalStage callbackUrl(String callbackUrl);

        _FinalStage conversationName(Optional<String> conversationName);

        _FinalStage conversationName(String conversationName);

        _FinalStage conversationalContext(Optional<String> conversationalContext);

        _FinalStage conversationalContext(String conversationalContext);

        _FinalStage customGreeting(Optional<String> customGreeting);

        _FinalStage customGreeting(String customGreeting);

        _FinalStage properties(Optional<TavusConversationProperties> properties);

        _FinalStage properties(TavusConversationProperties properties);

        _FinalStage fallbackPlan(Optional<FallbackPlan> fallbackPlan);

        _FinalStage fallbackPlan(FallbackPlan fallbackPlan);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements VoiceIdStage, _FinalStage {
        private TavusVoiceVoiceId voiceId;

        private Optional<FallbackPlan> fallbackPlan = Optional.empty();

        private Optional<TavusConversationProperties> properties = Optional.empty();

        private Optional<String> customGreeting = Optional.empty();

        private Optional<String> conversationalContext = Optional.empty();

        private Optional<String> conversationName = Optional.empty();

        private Optional<String> callbackUrl = Optional.empty();

        private Optional<String> personaId = Optional.empty();

        private Optional<ChunkPlan> chunkPlan = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TavusVoice other) {
            voiceId(other.getVoiceId());
            chunkPlan(other.getChunkPlan());
            personaId(other.getPersonaId());
            callbackUrl(other.getCallbackUrl());
            conversationName(other.getConversationName());
            conversationalContext(other.getConversationalContext());
            customGreeting(other.getCustomGreeting());
            properties(other.getProperties());
            fallbackPlan(other.getFallbackPlan());
            return this;
        }

        /**
         * <p>This is the provider-specific ID that will be used.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("voiceId")
        public _FinalStage voiceId(@NotNull TavusVoiceVoiceId voiceId) {
            this.voiceId = Objects.requireNonNull(voiceId, "voiceId must not be null");
            return this;
        }

        /**
         * <p>This is the plan for voice provider fallbacks in the event that the primary voice provider fails.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage fallbackPlan(FallbackPlan fallbackPlan) {
            this.fallbackPlan = Optional.ofNullable(fallbackPlan);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "fallbackPlan", nulls = Nulls.SKIP)
        public _FinalStage fallbackPlan(Optional<FallbackPlan> fallbackPlan) {
            this.fallbackPlan = fallbackPlan;
            return this;
        }

        /**
         * <p>These are optional properties used to customize the conversation.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage properties(TavusConversationProperties properties) {
            this.properties = Optional.ofNullable(properties);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "properties", nulls = Nulls.SKIP)
        public _FinalStage properties(Optional<TavusConversationProperties> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * <p>This is the custom greeting that the replica will give once a participant joines the conversation.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage customGreeting(String customGreeting) {
            this.customGreeting = Optional.ofNullable(customGreeting);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "customGreeting", nulls = Nulls.SKIP)
        public _FinalStage customGreeting(Optional<String> customGreeting) {
            this.customGreeting = customGreeting;
            return this;
        }

        /**
         * <p>This is the context that will be appended to any context provided in the persona, if one is provided.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage conversationalContext(String conversationalContext) {
            this.conversationalContext = Optional.ofNullable(conversationalContext);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "conversationalContext", nulls = Nulls.SKIP)
        public _FinalStage conversationalContext(Optional<String> conversationalContext) {
            this.conversationalContext = conversationalContext;
            return this;
        }

        /**
         * <p>This is the name for the conversation.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage conversationName(String conversationName) {
            this.conversationName = Optional.ofNullable(conversationName);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "conversationName", nulls = Nulls.SKIP)
        public _FinalStage conversationName(Optional<String> conversationName) {
            this.conversationName = conversationName;
            return this;
        }

        /**
         * <p>This is the url that will receive webhooks with updates regarding the conversation state.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage callbackUrl(String callbackUrl) {
            this.callbackUrl = Optional.ofNullable(callbackUrl);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "callbackUrl", nulls = Nulls.SKIP)
        public _FinalStage callbackUrl(Optional<String> callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>This is the unique identifier for the persona that the replica will use in the conversation.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage personaId(String personaId) {
            this.personaId = Optional.ofNullable(personaId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "personaId", nulls = Nulls.SKIP)
        public _FinalStage personaId(Optional<String> personaId) {
            this.personaId = personaId;
            return this;
        }

        /**
         * <p>This is the plan for chunking the model output before it is sent to the voice provider.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage chunkPlan(ChunkPlan chunkPlan) {
            this.chunkPlan = Optional.ofNullable(chunkPlan);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "chunkPlan", nulls = Nulls.SKIP)
        public _FinalStage chunkPlan(Optional<ChunkPlan> chunkPlan) {
            this.chunkPlan = chunkPlan;
            return this;
        }

        @java.lang.Override
        public TavusVoice build() {
            return new TavusVoice(
                    voiceId,
                    chunkPlan,
                    personaId,
                    callbackUrl,
                    conversationName,
                    conversationalContext,
                    customGreeting,
                    properties,
                    fallbackPlan,
                    additionalProperties);
        }
    }
}
