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
@JsonDeserialize(builder = TransferDestinationAssistant.Builder.class)
public final class TransferDestinationAssistant {
    private final Optional<TransferDestinationAssistantMessage> message;

    private final Optional<TransferMode> transferMode;

    private final String assistantName;

    private final Optional<String> description;

    private final Map<String, Object> additionalProperties;

    private TransferDestinationAssistant(
            Optional<TransferDestinationAssistantMessage> message,
            Optional<TransferMode> transferMode,
            String assistantName,
            Optional<String> description,
            Map<String, Object> additionalProperties) {
        this.message = message;
        this.transferMode = transferMode;
        this.assistantName = assistantName;
        this.description = description;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is spoken to the customer before connecting them to the destination.
     * <p>Usage:</p>
     * <ul>
     * <li>If this is not provided and transfer tool messages is not provided, default is &quot;Transferring the call now&quot;.</li>
     * <li>If set to &quot;&quot;, nothing is spoken. This is useful when you want to silently transfer. This is especially useful when transferring between assistants in a squad. In this scenario, you likely also want to set <code>assistant.firstMessageMode=assistant-speaks-first-with-model-generated-message</code> for the destination assistant.</li>
     * </ul>
     * <p>This accepts a string or a ToolMessageStart class. Latter is useful if you want to specify multiple messages for different languages through the <code>contents</code> field.</p>
     */
    @JsonProperty("message")
    public Optional<TransferDestinationAssistantMessage> getMessage() {
        return message;
    }

    /**
     * @return This is the mode to use for the transfer. Defaults to <code>rolling-history</code>.
     * <ul>
     * <li>
     * <p><code>rolling-history</code>: This is the default mode. It keeps the entire conversation history and appends the new assistant's system message on transfer.</p>
     * <p>Example:</p>
     * <p>Pre-transfer:
     * system: assistant1 system message
     * assistant: assistant1 first message
     * user: hey, good morning
     * assistant: how can i help?
     * user: i need help with my account
     * assistant: (destination.message)</p>
     * <p>Post-transfer:
     * system: assistant1 system message
     * assistant: assistant1 first message
     * user: hey, good morning
     * assistant: how can i help?
     * user: i need help with my account
     * assistant: (destination.message)
     * system: assistant2 system message
     * assistant: assistant2 first message (or model generated if firstMessageMode is set to <code>assistant-speaks-first-with-model-generated-message</code>)</p>
     * </li>
     * <li>
     * <p><code>swap-system-message-in-history</code>: This replaces the original system message with the new assistant's system message on transfer.</p>
     * <p>Example:</p>
     * <p>Pre-transfer:
     * system: assistant1 system message
     * assistant: assistant1 first message
     * user: hey, good morning
     * assistant: how can i help?
     * user: i need help with my account
     * assistant: (destination.message)</p>
     * <p>Post-transfer:
     * system: assistant2 system message
     * assistant: assistant1 first message
     * user: hey, good morning
     * assistant: how can i help?
     * user: i need help with my account
     * assistant: (destination.message)
     * assistant: assistant2 first message (or model generated if firstMessageMode is set to <code>assistant-speaks-first-with-model-generated-message</code>)</p>
     * </li>
     * <li>
     * <p><code>delete-history</code>: This deletes the entire conversation history on transfer.</p>
     * <p>Example:</p>
     * <p>Pre-transfer:
     * system: assistant1 system message
     * assistant: assistant1 first message
     * user: hey, good morning
     * assistant: how can i help?
     * user: i need help with my account
     * assistant: (destination.message)</p>
     * <p>Post-transfer:
     * system: assistant2 system message
     * assistant: assistant2 first message
     * user: Yes, please
     * assistant: how can i help?
     * user: i need help with my account</p>
     * </li>
     * <li>
     * <p><code>swap-system-message-in-history-and-remove-transfer-tool-messages</code>: This replaces the original system message with the new assistant's system message on transfer and removes transfer tool messages from conversation history sent to the LLM.</p>
     * <p>Example:</p>
     * <p>Pre-transfer:
     * system: assistant1 system message
     * assistant: assistant1 first message
     * user: hey, good morning
     * assistant: how can i help?
     * user: i need help with my account
     * transfer-tool
     * transfer-tool-result
     * assistant: (destination.message)</p>
     * <p>Post-transfer:
     * system: assistant2 system message
     * assistant: assistant1 first message
     * user: hey, good morning
     * assistant: how can i help?
     * user: i need help with my account
     * assistant: (destination.message)
     * assistant: assistant2 first message (or model generated if firstMessageMode is set to <code>assistant-speaks-first-with-model-generated-message</code>)</p>
     * </li>
     * </ul>
     * <p>@default 'rolling-history'</p>
     */
    @JsonProperty("transferMode")
    public Optional<TransferMode> getTransferMode() {
        return transferMode;
    }

    /**
     * @return This is the assistant to transfer the call to.
     */
    @JsonProperty("assistantName")
    public String getAssistantName() {
        return assistantName;
    }

    /**
     * @return This is the description of the destination, used by the AI to choose when and how to transfer the call.
     */
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TransferDestinationAssistant && equalTo((TransferDestinationAssistant) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TransferDestinationAssistant other) {
        return message.equals(other.message)
                && transferMode.equals(other.transferMode)
                && assistantName.equals(other.assistantName)
                && description.equals(other.description);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.message, this.transferMode, this.assistantName, this.description);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AssistantNameStage builder() {
        return new Builder();
    }

    public interface AssistantNameStage {
        _FinalStage assistantName(@NotNull String assistantName);

        Builder from(TransferDestinationAssistant other);
    }

    public interface _FinalStage {
        TransferDestinationAssistant build();

        _FinalStage message(Optional<TransferDestinationAssistantMessage> message);

        _FinalStage message(TransferDestinationAssistantMessage message);

        _FinalStage transferMode(Optional<TransferMode> transferMode);

        _FinalStage transferMode(TransferMode transferMode);

        _FinalStage description(Optional<String> description);

        _FinalStage description(String description);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AssistantNameStage, _FinalStage {
        private String assistantName;

        private Optional<String> description = Optional.empty();

        private Optional<TransferMode> transferMode = Optional.empty();

        private Optional<TransferDestinationAssistantMessage> message = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TransferDestinationAssistant other) {
            message(other.getMessage());
            transferMode(other.getTransferMode());
            assistantName(other.getAssistantName());
            description(other.getDescription());
            return this;
        }

        /**
         * <p>This is the assistant to transfer the call to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("assistantName")
        public _FinalStage assistantName(@NotNull String assistantName) {
            this.assistantName = Objects.requireNonNull(assistantName, "assistantName must not be null");
            return this;
        }

        /**
         * <p>This is the description of the destination, used by the AI to choose when and how to transfer the call.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage description(String description) {
            this.description = Optional.ofNullable(description);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public _FinalStage description(Optional<String> description) {
            this.description = description;
            return this;
        }

        /**
         * <p>This is the mode to use for the transfer. Defaults to <code>rolling-history</code>.</p>
         * <ul>
         * <li>
         * <p><code>rolling-history</code>: This is the default mode. It keeps the entire conversation history and appends the new assistant's system message on transfer.</p>
         * <p>Example:</p>
         * <p>Pre-transfer:
         * system: assistant1 system message
         * assistant: assistant1 first message
         * user: hey, good morning
         * assistant: how can i help?
         * user: i need help with my account
         * assistant: (destination.message)</p>
         * <p>Post-transfer:
         * system: assistant1 system message
         * assistant: assistant1 first message
         * user: hey, good morning
         * assistant: how can i help?
         * user: i need help with my account
         * assistant: (destination.message)
         * system: assistant2 system message
         * assistant: assistant2 first message (or model generated if firstMessageMode is set to <code>assistant-speaks-first-with-model-generated-message</code>)</p>
         * </li>
         * <li>
         * <p><code>swap-system-message-in-history</code>: This replaces the original system message with the new assistant's system message on transfer.</p>
         * <p>Example:</p>
         * <p>Pre-transfer:
         * system: assistant1 system message
         * assistant: assistant1 first message
         * user: hey, good morning
         * assistant: how can i help?
         * user: i need help with my account
         * assistant: (destination.message)</p>
         * <p>Post-transfer:
         * system: assistant2 system message
         * assistant: assistant1 first message
         * user: hey, good morning
         * assistant: how can i help?
         * user: i need help with my account
         * assistant: (destination.message)
         * assistant: assistant2 first message (or model generated if firstMessageMode is set to <code>assistant-speaks-first-with-model-generated-message</code>)</p>
         * </li>
         * <li>
         * <p><code>delete-history</code>: This deletes the entire conversation history on transfer.</p>
         * <p>Example:</p>
         * <p>Pre-transfer:
         * system: assistant1 system message
         * assistant: assistant1 first message
         * user: hey, good morning
         * assistant: how can i help?
         * user: i need help with my account
         * assistant: (destination.message)</p>
         * <p>Post-transfer:
         * system: assistant2 system message
         * assistant: assistant2 first message
         * user: Yes, please
         * assistant: how can i help?
         * user: i need help with my account</p>
         * </li>
         * <li>
         * <p><code>swap-system-message-in-history-and-remove-transfer-tool-messages</code>: This replaces the original system message with the new assistant's system message on transfer and removes transfer tool messages from conversation history sent to the LLM.</p>
         * <p>Example:</p>
         * <p>Pre-transfer:
         * system: assistant1 system message
         * assistant: assistant1 first message
         * user: hey, good morning
         * assistant: how can i help?
         * user: i need help with my account
         * transfer-tool
         * transfer-tool-result
         * assistant: (destination.message)</p>
         * <p>Post-transfer:
         * system: assistant2 system message
         * assistant: assistant1 first message
         * user: hey, good morning
         * assistant: how can i help?
         * user: i need help with my account
         * assistant: (destination.message)
         * assistant: assistant2 first message (or model generated if firstMessageMode is set to <code>assistant-speaks-first-with-model-generated-message</code>)</p>
         * </li>
         * </ul>
         * <p>@default 'rolling-history'</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage transferMode(TransferMode transferMode) {
            this.transferMode = Optional.ofNullable(transferMode);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "transferMode", nulls = Nulls.SKIP)
        public _FinalStage transferMode(Optional<TransferMode> transferMode) {
            this.transferMode = transferMode;
            return this;
        }

        /**
         * <p>This is spoken to the customer before connecting them to the destination.</p>
         * <p>Usage:</p>
         * <ul>
         * <li>If this is not provided and transfer tool messages is not provided, default is &quot;Transferring the call now&quot;.</li>
         * <li>If set to &quot;&quot;, nothing is spoken. This is useful when you want to silently transfer. This is especially useful when transferring between assistants in a squad. In this scenario, you likely also want to set <code>assistant.firstMessageMode=assistant-speaks-first-with-model-generated-message</code> for the destination assistant.</li>
         * </ul>
         * <p>This accepts a string or a ToolMessageStart class. Latter is useful if you want to specify multiple messages for different languages through the <code>contents</code> field.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage message(TransferDestinationAssistantMessage message) {
            this.message = Optional.ofNullable(message);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "message", nulls = Nulls.SKIP)
        public _FinalStage message(Optional<TransferDestinationAssistantMessage> message) {
            this.message = message;
            return this;
        }

        @java.lang.Override
        public TransferDestinationAssistant build() {
            return new TransferDestinationAssistant(
                    message, transferMode, assistantName, description, additionalProperties);
        }
    }
}
