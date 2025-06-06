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

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CreateWebCallDto.Builder.class)
public final class CreateWebCallDto {
    private final Optional<String> assistantId;

    private final Optional<CreateAssistantDto> assistant;

    private final Optional<AssistantOverrides> assistantOverrides;

    private final Optional<String> squadId;

    private final Optional<CreateSquadDto> squad;

    private final Optional<String> workflowId;

    private final Optional<CreateWorkflowDto> workflow;

    private final Map<String, Object> additionalProperties;

    private CreateWebCallDto(
            Optional<String> assistantId,
            Optional<CreateAssistantDto> assistant,
            Optional<AssistantOverrides> assistantOverrides,
            Optional<String> squadId,
            Optional<CreateSquadDto> squad,
            Optional<String> workflowId,
            Optional<CreateWorkflowDto> workflow,
            Map<String, Object> additionalProperties) {
        this.assistantId = assistantId;
        this.assistant = assistant;
        this.assistantOverrides = assistantOverrides;
        this.squadId = squadId;
        this.squad = squad;
        this.workflowId = workflowId;
        this.workflow = workflow;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the assistant ID that will be used for the call. To use a transient assistant, use <code>assistant</code> instead.
     * <p>To start a call with:</p>
     * <ul>
     * <li>Assistant, use <code>assistantId</code> or <code>assistant</code></li>
     * <li>Squad, use <code>squadId</code> or <code>squad</code></li>
     * <li>Workflow, use <code>workflowId</code> or <code>workflow</code></li>
     * </ul>
     */
    @JsonProperty("assistantId")
    public Optional<String> getAssistantId() {
        return assistantId;
    }

    /**
     * @return This is the assistant that will be used for the call. To use an existing assistant, use <code>assistantId</code> instead.
     * <p>To start a call with:</p>
     * <ul>
     * <li>Assistant, use <code>assistant</code></li>
     * <li>Squad, use <code>squad</code></li>
     * <li>Workflow, use <code>workflow</code></li>
     * </ul>
     */
    @JsonProperty("assistant")
    public Optional<CreateAssistantDto> getAssistant() {
        return assistant;
    }

    /**
     * @return These are the overrides for the <code>assistant</code> or <code>assistantId</code>'s settings and template variables.
     */
    @JsonProperty("assistantOverrides")
    public Optional<AssistantOverrides> getAssistantOverrides() {
        return assistantOverrides;
    }

    /**
     * @return This is the squad that will be used for the call. To use a transient squad, use <code>squad</code> instead.
     * <p>To start a call with:</p>
     * <ul>
     * <li>Assistant, use <code>assistant</code> or <code>assistantId</code></li>
     * <li>Squad, use <code>squad</code> or <code>squadId</code></li>
     * <li>Workflow, use <code>workflow</code> or <code>workflowId</code></li>
     * </ul>
     */
    @JsonProperty("squadId")
    public Optional<String> getSquadId() {
        return squadId;
    }

    /**
     * @return This is a squad that will be used for the call. To use an existing squad, use <code>squadId</code> instead.
     * <p>To start a call with:</p>
     * <ul>
     * <li>Assistant, use <code>assistant</code> or <code>assistantId</code></li>
     * <li>Squad, use <code>squad</code> or <code>squadId</code></li>
     * <li>Workflow, use <code>workflow</code> or <code>workflowId</code></li>
     * </ul>
     */
    @JsonProperty("squad")
    public Optional<CreateSquadDto> getSquad() {
        return squad;
    }

    /**
     * @return [BETA] This feature is in active development. The API and behavior are subject to change as we refine it based on user feedback.
     * <p>This is the workflow that will be used for the call. To use a transient workflow, use <code>workflow</code> instead.</p>
     * <p>To start a call with:</p>
     * <ul>
     * <li>Assistant, use <code>assistant</code> or <code>assistantId</code></li>
     * <li>Squad, use <code>squad</code> or <code>squadId</code></li>
     * <li>Workflow, use <code>workflow</code> or <code>workflowId</code></li>
     * </ul>
     */
    @JsonProperty("workflowId")
    public Optional<String> getWorkflowId() {
        return workflowId;
    }

    /**
     * @return [BETA] This feature is in active development. The API and behavior are subject to change as we refine it based on user feedback.
     * <p>This is a workflow that will be used for the call. To use an existing workflow, use <code>workflowId</code> instead.</p>
     * <p>To start a call with:</p>
     * <ul>
     * <li>Assistant, use <code>assistant</code> or <code>assistantId</code></li>
     * <li>Squad, use <code>squad</code> or <code>squadId</code></li>
     * <li>Workflow, use <code>workflow</code> or <code>workflowId</code></li>
     * </ul>
     */
    @JsonProperty("workflow")
    public Optional<CreateWorkflowDto> getWorkflow() {
        return workflow;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreateWebCallDto && equalTo((CreateWebCallDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreateWebCallDto other) {
        return assistantId.equals(other.assistantId)
                && assistant.equals(other.assistant)
                && assistantOverrides.equals(other.assistantOverrides)
                && squadId.equals(other.squadId)
                && squad.equals(other.squad)
                && workflowId.equals(other.workflowId)
                && workflow.equals(other.workflow);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.assistantId,
                this.assistant,
                this.assistantOverrides,
                this.squadId,
                this.squad,
                this.workflowId,
                this.workflow);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> assistantId = Optional.empty();

        private Optional<CreateAssistantDto> assistant = Optional.empty();

        private Optional<AssistantOverrides> assistantOverrides = Optional.empty();

        private Optional<String> squadId = Optional.empty();

        private Optional<CreateSquadDto> squad = Optional.empty();

        private Optional<String> workflowId = Optional.empty();

        private Optional<CreateWorkflowDto> workflow = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CreateWebCallDto other) {
            assistantId(other.getAssistantId());
            assistant(other.getAssistant());
            assistantOverrides(other.getAssistantOverrides());
            squadId(other.getSquadId());
            squad(other.getSquad());
            workflowId(other.getWorkflowId());
            workflow(other.getWorkflow());
            return this;
        }

        @JsonSetter(value = "assistantId", nulls = Nulls.SKIP)
        public Builder assistantId(Optional<String> assistantId) {
            this.assistantId = assistantId;
            return this;
        }

        public Builder assistantId(String assistantId) {
            this.assistantId = Optional.ofNullable(assistantId);
            return this;
        }

        @JsonSetter(value = "assistant", nulls = Nulls.SKIP)
        public Builder assistant(Optional<CreateAssistantDto> assistant) {
            this.assistant = assistant;
            return this;
        }

        public Builder assistant(CreateAssistantDto assistant) {
            this.assistant = Optional.ofNullable(assistant);
            return this;
        }

        @JsonSetter(value = "assistantOverrides", nulls = Nulls.SKIP)
        public Builder assistantOverrides(Optional<AssistantOverrides> assistantOverrides) {
            this.assistantOverrides = assistantOverrides;
            return this;
        }

        public Builder assistantOverrides(AssistantOverrides assistantOverrides) {
            this.assistantOverrides = Optional.ofNullable(assistantOverrides);
            return this;
        }

        @JsonSetter(value = "squadId", nulls = Nulls.SKIP)
        public Builder squadId(Optional<String> squadId) {
            this.squadId = squadId;
            return this;
        }

        public Builder squadId(String squadId) {
            this.squadId = Optional.ofNullable(squadId);
            return this;
        }

        @JsonSetter(value = "squad", nulls = Nulls.SKIP)
        public Builder squad(Optional<CreateSquadDto> squad) {
            this.squad = squad;
            return this;
        }

        public Builder squad(CreateSquadDto squad) {
            this.squad = Optional.ofNullable(squad);
            return this;
        }

        @JsonSetter(value = "workflowId", nulls = Nulls.SKIP)
        public Builder workflowId(Optional<String> workflowId) {
            this.workflowId = workflowId;
            return this;
        }

        public Builder workflowId(String workflowId) {
            this.workflowId = Optional.ofNullable(workflowId);
            return this;
        }

        @JsonSetter(value = "workflow", nulls = Nulls.SKIP)
        public Builder workflow(Optional<CreateWorkflowDto> workflow) {
            this.workflow = workflow;
            return this;
        }

        public Builder workflow(CreateWorkflowDto workflow) {
            this.workflow = Optional.ofNullable(workflow);
            return this;
        }

        public CreateWebCallDto build() {
            return new CreateWebCallDto(
                    assistantId,
                    assistant,
                    assistantOverrides,
                    squadId,
                    squad,
                    workflowId,
                    workflow,
                    additionalProperties);
        }
    }
}
