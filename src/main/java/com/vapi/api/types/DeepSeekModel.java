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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = DeepSeekModel.Builder.class)
public final class DeepSeekModel {
    private final Optional<List<OpenAiMessage>> messages;

    private final Optional<List<DeepSeekModelToolsItem>> tools;

    private final Optional<List<String>> toolIds;

    private final Optional<CreateCustomKnowledgeBaseDto> knowledgeBase;

    private final Optional<String> knowledgeBaseId;

    private final DeepSeekModelModel model;

    private final Optional<Double> temperature;

    private final Optional<Double> maxTokens;

    private final Optional<Boolean> emotionRecognitionEnabled;

    private final Optional<Double> numFastTurns;

    private final Map<String, Object> additionalProperties;

    private DeepSeekModel(
            Optional<List<OpenAiMessage>> messages,
            Optional<List<DeepSeekModelToolsItem>> tools,
            Optional<List<String>> toolIds,
            Optional<CreateCustomKnowledgeBaseDto> knowledgeBase,
            Optional<String> knowledgeBaseId,
            DeepSeekModelModel model,
            Optional<Double> temperature,
            Optional<Double> maxTokens,
            Optional<Boolean> emotionRecognitionEnabled,
            Optional<Double> numFastTurns,
            Map<String, Object> additionalProperties) {
        this.messages = messages;
        this.tools = tools;
        this.toolIds = toolIds;
        this.knowledgeBase = knowledgeBase;
        this.knowledgeBaseId = knowledgeBaseId;
        this.model = model;
        this.temperature = temperature;
        this.maxTokens = maxTokens;
        this.emotionRecognitionEnabled = emotionRecognitionEnabled;
        this.numFastTurns = numFastTurns;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the starting state for the conversation.
     */
    @JsonProperty("messages")
    public Optional<List<OpenAiMessage>> getMessages() {
        return messages;
    }

    /**
     * @return These are the tools that the assistant can use during the call. To use existing tools, use <code>toolIds</code>.
     * <p>Both <code>tools</code> and <code>toolIds</code> can be used together.</p>
     */
    @JsonProperty("tools")
    public Optional<List<DeepSeekModelToolsItem>> getTools() {
        return tools;
    }

    /**
     * @return These are the tools that the assistant can use during the call. To use transient tools, use <code>tools</code>.
     * <p>Both <code>tools</code> and <code>toolIds</code> can be used together.</p>
     */
    @JsonProperty("toolIds")
    public Optional<List<String>> getToolIds() {
        return toolIds;
    }

    /**
     * @return These are the options for the knowledge base.
     */
    @JsonProperty("knowledgeBase")
    public Optional<CreateCustomKnowledgeBaseDto> getKnowledgeBase() {
        return knowledgeBase;
    }

    /**
     * @return This is the ID of the knowledge base the model will use.
     */
    @JsonProperty("knowledgeBaseId")
    public Optional<String> getKnowledgeBaseId() {
        return knowledgeBaseId;
    }

    /**
     * @return This is the name of the model. Ex. cognitivecomputations/dolphin-mixtral-8x7b
     */
    @JsonProperty("model")
    public DeepSeekModelModel getModel() {
        return model;
    }

    /**
     * @return This is the temperature that will be used for calls. Default is 0 to leverage caching for lower latency.
     */
    @JsonProperty("temperature")
    public Optional<Double> getTemperature() {
        return temperature;
    }

    /**
     * @return This is the max number of tokens that the assistant will be allowed to generate in each turn of the conversation. Default is 250.
     */
    @JsonProperty("maxTokens")
    public Optional<Double> getMaxTokens() {
        return maxTokens;
    }

    /**
     * @return This determines whether we detect user's emotion while they speak and send it as an additional info to model.
     * <p>Default <code>false</code> because the model is usually are good at understanding the user's emotion from text.</p>
     * <p>@default false</p>
     */
    @JsonProperty("emotionRecognitionEnabled")
    public Optional<Boolean> getEmotionRecognitionEnabled() {
        return emotionRecognitionEnabled;
    }

    /**
     * @return This sets how many turns at the start of the conversation to use a smaller, faster model from the same provider before switching to the primary model. Example, gpt-3.5-turbo if provider is openai.
     * <p>Default is 0.</p>
     * <p>@default 0</p>
     */
    @JsonProperty("numFastTurns")
    public Optional<Double> getNumFastTurns() {
        return numFastTurns;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DeepSeekModel && equalTo((DeepSeekModel) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DeepSeekModel other) {
        return messages.equals(other.messages)
                && tools.equals(other.tools)
                && toolIds.equals(other.toolIds)
                && knowledgeBase.equals(other.knowledgeBase)
                && knowledgeBaseId.equals(other.knowledgeBaseId)
                && model.equals(other.model)
                && temperature.equals(other.temperature)
                && maxTokens.equals(other.maxTokens)
                && emotionRecognitionEnabled.equals(other.emotionRecognitionEnabled)
                && numFastTurns.equals(other.numFastTurns);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.messages,
                this.tools,
                this.toolIds,
                this.knowledgeBase,
                this.knowledgeBaseId,
                this.model,
                this.temperature,
                this.maxTokens,
                this.emotionRecognitionEnabled,
                this.numFastTurns);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ModelStage builder() {
        return new Builder();
    }

    public interface ModelStage {
        _FinalStage model(@NotNull DeepSeekModelModel model);

        Builder from(DeepSeekModel other);
    }

    public interface _FinalStage {
        DeepSeekModel build();

        _FinalStage messages(Optional<List<OpenAiMessage>> messages);

        _FinalStage messages(List<OpenAiMessage> messages);

        _FinalStage tools(Optional<List<DeepSeekModelToolsItem>> tools);

        _FinalStage tools(List<DeepSeekModelToolsItem> tools);

        _FinalStage toolIds(Optional<List<String>> toolIds);

        _FinalStage toolIds(List<String> toolIds);

        _FinalStage knowledgeBase(Optional<CreateCustomKnowledgeBaseDto> knowledgeBase);

        _FinalStage knowledgeBase(CreateCustomKnowledgeBaseDto knowledgeBase);

        _FinalStage knowledgeBaseId(Optional<String> knowledgeBaseId);

        _FinalStage knowledgeBaseId(String knowledgeBaseId);

        _FinalStage temperature(Optional<Double> temperature);

        _FinalStage temperature(Double temperature);

        _FinalStage maxTokens(Optional<Double> maxTokens);

        _FinalStage maxTokens(Double maxTokens);

        _FinalStage emotionRecognitionEnabled(Optional<Boolean> emotionRecognitionEnabled);

        _FinalStage emotionRecognitionEnabled(Boolean emotionRecognitionEnabled);

        _FinalStage numFastTurns(Optional<Double> numFastTurns);

        _FinalStage numFastTurns(Double numFastTurns);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ModelStage, _FinalStage {
        private DeepSeekModelModel model;

        private Optional<Double> numFastTurns = Optional.empty();

        private Optional<Boolean> emotionRecognitionEnabled = Optional.empty();

        private Optional<Double> maxTokens = Optional.empty();

        private Optional<Double> temperature = Optional.empty();

        private Optional<String> knowledgeBaseId = Optional.empty();

        private Optional<CreateCustomKnowledgeBaseDto> knowledgeBase = Optional.empty();

        private Optional<List<String>> toolIds = Optional.empty();

        private Optional<List<DeepSeekModelToolsItem>> tools = Optional.empty();

        private Optional<List<OpenAiMessage>> messages = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(DeepSeekModel other) {
            messages(other.getMessages());
            tools(other.getTools());
            toolIds(other.getToolIds());
            knowledgeBase(other.getKnowledgeBase());
            knowledgeBaseId(other.getKnowledgeBaseId());
            model(other.getModel());
            temperature(other.getTemperature());
            maxTokens(other.getMaxTokens());
            emotionRecognitionEnabled(other.getEmotionRecognitionEnabled());
            numFastTurns(other.getNumFastTurns());
            return this;
        }

        /**
         * <p>This is the name of the model. Ex. cognitivecomputations/dolphin-mixtral-8x7b</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("model")
        public _FinalStage model(@NotNull DeepSeekModelModel model) {
            this.model = Objects.requireNonNull(model, "model must not be null");
            return this;
        }

        /**
         * <p>This sets how many turns at the start of the conversation to use a smaller, faster model from the same provider before switching to the primary model. Example, gpt-3.5-turbo if provider is openai.</p>
         * <p>Default is 0.</p>
         * <p>@default 0</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage numFastTurns(Double numFastTurns) {
            this.numFastTurns = Optional.ofNullable(numFastTurns);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "numFastTurns", nulls = Nulls.SKIP)
        public _FinalStage numFastTurns(Optional<Double> numFastTurns) {
            this.numFastTurns = numFastTurns;
            return this;
        }

        /**
         * <p>This determines whether we detect user's emotion while they speak and send it as an additional info to model.</p>
         * <p>Default <code>false</code> because the model is usually are good at understanding the user's emotion from text.</p>
         * <p>@default false</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage emotionRecognitionEnabled(Boolean emotionRecognitionEnabled) {
            this.emotionRecognitionEnabled = Optional.ofNullable(emotionRecognitionEnabled);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "emotionRecognitionEnabled", nulls = Nulls.SKIP)
        public _FinalStage emotionRecognitionEnabled(Optional<Boolean> emotionRecognitionEnabled) {
            this.emotionRecognitionEnabled = emotionRecognitionEnabled;
            return this;
        }

        /**
         * <p>This is the max number of tokens that the assistant will be allowed to generate in each turn of the conversation. Default is 250.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage maxTokens(Double maxTokens) {
            this.maxTokens = Optional.ofNullable(maxTokens);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "maxTokens", nulls = Nulls.SKIP)
        public _FinalStage maxTokens(Optional<Double> maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }

        /**
         * <p>This is the temperature that will be used for calls. Default is 0 to leverage caching for lower latency.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage temperature(Double temperature) {
            this.temperature = Optional.ofNullable(temperature);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "temperature", nulls = Nulls.SKIP)
        public _FinalStage temperature(Optional<Double> temperature) {
            this.temperature = temperature;
            return this;
        }

        /**
         * <p>This is the ID of the knowledge base the model will use.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = Optional.ofNullable(knowledgeBaseId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "knowledgeBaseId", nulls = Nulls.SKIP)
        public _FinalStage knowledgeBaseId(Optional<String> knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>These are the options for the knowledge base.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage knowledgeBase(CreateCustomKnowledgeBaseDto knowledgeBase) {
            this.knowledgeBase = Optional.ofNullable(knowledgeBase);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "knowledgeBase", nulls = Nulls.SKIP)
        public _FinalStage knowledgeBase(Optional<CreateCustomKnowledgeBaseDto> knowledgeBase) {
            this.knowledgeBase = knowledgeBase;
            return this;
        }

        /**
         * <p>These are the tools that the assistant can use during the call. To use transient tools, use <code>tools</code>.</p>
         * <p>Both <code>tools</code> and <code>toolIds</code> can be used together.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage toolIds(List<String> toolIds) {
            this.toolIds = Optional.ofNullable(toolIds);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "toolIds", nulls = Nulls.SKIP)
        public _FinalStage toolIds(Optional<List<String>> toolIds) {
            this.toolIds = toolIds;
            return this;
        }

        /**
         * <p>These are the tools that the assistant can use during the call. To use existing tools, use <code>toolIds</code>.</p>
         * <p>Both <code>tools</code> and <code>toolIds</code> can be used together.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage tools(List<DeepSeekModelToolsItem> tools) {
            this.tools = Optional.ofNullable(tools);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "tools", nulls = Nulls.SKIP)
        public _FinalStage tools(Optional<List<DeepSeekModelToolsItem>> tools) {
            this.tools = tools;
            return this;
        }

        /**
         * <p>This is the starting state for the conversation.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage messages(List<OpenAiMessage> messages) {
            this.messages = Optional.ofNullable(messages);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "messages", nulls = Nulls.SKIP)
        public _FinalStage messages(Optional<List<OpenAiMessage>> messages) {
            this.messages = messages;
            return this;
        }

        @java.lang.Override
        public DeepSeekModel build() {
            return new DeepSeekModel(
                    messages,
                    tools,
                    toolIds,
                    knowledgeBase,
                    knowledgeBaseId,
                    model,
                    temperature,
                    maxTokens,
                    emotionRecognitionEnabled,
                    numFastTurns,
                    additionalProperties);
        }
    }
}
