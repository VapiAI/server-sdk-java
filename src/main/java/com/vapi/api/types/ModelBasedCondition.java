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
@JsonDeserialize(builder = ModelBasedCondition.Builder.class)
public final class ModelBasedCondition {
    private final String instruction;

    private final Map<String, Object> additionalProperties;

    private ModelBasedCondition(String instruction, Map<String, Object> additionalProperties) {
        this.instruction = instruction;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the instruction which should output a boolean value when passed to a model.
     * <p>You can reference any variable in the context of the current block execution (step):</p>
     * <ul>
     * <li>&quot;{{output.your-property-name}}&quot; for current step's output</li>
     * <li>&quot;{{input.your-property-name}}&quot; for current step's input</li>
     * <li>&quot;{{your-step-name.output.your-property-name}}&quot; for another step's output (in the same workflow; read caveat #1)</li>
     * <li>&quot;{{your-step-name.input.your-property-name}}&quot; for another step's input (in the same workflow; read caveat #1)</li>
     * <li>&quot;{{your-block-name.output.your-property-name}}&quot; for another block's output (in the same workflow; read caveat #2)</li>
     * <li>&quot;{{your-block-name.input.your-property-name}}&quot; for another block's input (in the same workflow; read caveat #2)</li>
     * <li>&quot;{{workflow.input.your-property-name}}&quot; for the current workflow's input</li>
     * <li>&quot;{{global.your-property-name}}&quot; for the global context</li>
     * </ul>
     * <p>You can also talk about the current step's output or input directly:</p>
     * <ul>
     * <li>&quot;{{output.your-property-name}} is greater than 10&quot;</li>
     * <li>&quot;{{input.your-property-name}} is greater than 10&quot;</li>
     * </ul>
     * <p>Examples:</p>
     * <ul>
     * <li>&quot;{{input.age}} is greater than 10&quot;</li>
     * <li>&quot;{{input.age}} is greater than {{input.age2}}&quot;</li>
     * <li>&quot;{{output.age}} is greater than 10&quot;</li>
     * </ul>
     * <p>Caveats:</p>
     * <ol>
     * <li>a workflow can execute a step multiple times. example, if a loop is used in the graph. {{stepName.input/output.propertyName}} will reference the latest usage of the step.</li>
     * <li>a workflow can execute a block multiple times. example, if a step is called multiple times or if a block is used in multiple steps. {{blockName.input/output.propertyName}} will reference the latest usage of the block. this liquid variable is just provided for convenience when creating blocks outside of a workflow with steps.</li>
     * </ol>
     */
    @JsonProperty("instruction")
    public String getInstruction() {
        return instruction;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ModelBasedCondition && equalTo((ModelBasedCondition) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ModelBasedCondition other) {
        return instruction.equals(other.instruction);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.instruction);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static InstructionStage builder() {
        return new Builder();
    }

    public interface InstructionStage {
        _FinalStage instruction(@NotNull String instruction);

        Builder from(ModelBasedCondition other);
    }

    public interface _FinalStage {
        ModelBasedCondition build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements InstructionStage, _FinalStage {
        private String instruction;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ModelBasedCondition other) {
            instruction(other.getInstruction());
            return this;
        }

        /**
         * <p>This is the instruction which should output a boolean value when passed to a model.</p>
         * <p>You can reference any variable in the context of the current block execution (step):</p>
         * <ul>
         * <li>&quot;{{output.your-property-name}}&quot; for current step's output</li>
         * <li>&quot;{{input.your-property-name}}&quot; for current step's input</li>
         * <li>&quot;{{your-step-name.output.your-property-name}}&quot; for another step's output (in the same workflow; read caveat #1)</li>
         * <li>&quot;{{your-step-name.input.your-property-name}}&quot; for another step's input (in the same workflow; read caveat #1)</li>
         * <li>&quot;{{your-block-name.output.your-property-name}}&quot; for another block's output (in the same workflow; read caveat #2)</li>
         * <li>&quot;{{your-block-name.input.your-property-name}}&quot; for another block's input (in the same workflow; read caveat #2)</li>
         * <li>&quot;{{workflow.input.your-property-name}}&quot; for the current workflow's input</li>
         * <li>&quot;{{global.your-property-name}}&quot; for the global context</li>
         * </ul>
         * <p>You can also talk about the current step's output or input directly:</p>
         * <ul>
         * <li>&quot;{{output.your-property-name}} is greater than 10&quot;</li>
         * <li>&quot;{{input.your-property-name}} is greater than 10&quot;</li>
         * </ul>
         * <p>Examples:</p>
         * <ul>
         * <li>&quot;{{input.age}} is greater than 10&quot;</li>
         * <li>&quot;{{input.age}} is greater than {{input.age2}}&quot;</li>
         * <li>&quot;{{output.age}} is greater than 10&quot;</li>
         * </ul>
         * <p>Caveats:</p>
         * <ol>
         * <li>a workflow can execute a step multiple times. example, if a loop is used in the graph. {{stepName.input/output.propertyName}} will reference the latest usage of the step.</li>
         * <li>a workflow can execute a block multiple times. example, if a step is called multiple times or if a block is used in multiple steps. {{blockName.input/output.propertyName}} will reference the latest usage of the block. this liquid variable is just provided for convenience when creating blocks outside of a workflow with steps.</li>
         * </ol>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("instruction")
        public _FinalStage instruction(@NotNull String instruction) {
            this.instruction = Objects.requireNonNull(instruction, "instruction must not be null");
            return this;
        }

        @java.lang.Override
        public ModelBasedCondition build() {
            return new ModelBasedCondition(instruction, additionalProperties);
        }
    }
}