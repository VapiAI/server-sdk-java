/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.resources.tools.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.vapi.api.types.CreateBashToolDto;
import com.vapi.api.types.CreateComputerToolDto;
import com.vapi.api.types.CreateDtmfToolDto;
import com.vapi.api.types.CreateEndCallToolDto;
import com.vapi.api.types.CreateFunctionToolDto;
import com.vapi.api.types.CreateGhlToolDto;
import com.vapi.api.types.CreateMakeToolDto;
import com.vapi.api.types.CreateOutputToolDto;
import com.vapi.api.types.CreateTextEditorToolDto;
import com.vapi.api.types.CreateTransferCallToolDto;
import java.util.Objects;
import java.util.Optional;

public final class ToolsCreateRequest {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private ToolsCreateRequest(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static ToolsCreateRequest dtmf(CreateDtmfToolDto value) {
        return new ToolsCreateRequest(new DtmfValue(value));
    }

    public static ToolsCreateRequest endCall(CreateEndCallToolDto value) {
        return new ToolsCreateRequest(new EndCallValue(value));
    }

    public static ToolsCreateRequest function(CreateFunctionToolDto value) {
        return new ToolsCreateRequest(new FunctionValue(value));
    }

    public static ToolsCreateRequest ghl(CreateGhlToolDto value) {
        return new ToolsCreateRequest(new GhlValue(value));
    }

    public static ToolsCreateRequest make(CreateMakeToolDto value) {
        return new ToolsCreateRequest(new MakeValue(value));
    }

    public static ToolsCreateRequest transferCall(CreateTransferCallToolDto value) {
        return new ToolsCreateRequest(new TransferCallValue(value));
    }

    public static ToolsCreateRequest output(CreateOutputToolDto value) {
        return new ToolsCreateRequest(new OutputValue(value));
    }

    public static ToolsCreateRequest bash(CreateBashToolDto value) {
        return new ToolsCreateRequest(new BashValue(value));
    }

    public static ToolsCreateRequest computer(CreateComputerToolDto value) {
        return new ToolsCreateRequest(new ComputerValue(value));
    }

    public static ToolsCreateRequest textEditor(CreateTextEditorToolDto value) {
        return new ToolsCreateRequest(new TextEditorValue(value));
    }

    public boolean isDtmf() {
        return value instanceof DtmfValue;
    }

    public boolean isEndCall() {
        return value instanceof EndCallValue;
    }

    public boolean isFunction() {
        return value instanceof FunctionValue;
    }

    public boolean isGhl() {
        return value instanceof GhlValue;
    }

    public boolean isMake() {
        return value instanceof MakeValue;
    }

    public boolean isTransferCall() {
        return value instanceof TransferCallValue;
    }

    public boolean isOutput() {
        return value instanceof OutputValue;
    }

    public boolean isBash() {
        return value instanceof BashValue;
    }

    public boolean isComputer() {
        return value instanceof ComputerValue;
    }

    public boolean isTextEditor() {
        return value instanceof TextEditorValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<CreateDtmfToolDto> getDtmf() {
        if (isDtmf()) {
            return Optional.of(((DtmfValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateEndCallToolDto> getEndCall() {
        if (isEndCall()) {
            return Optional.of(((EndCallValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateFunctionToolDto> getFunction() {
        if (isFunction()) {
            return Optional.of(((FunctionValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateGhlToolDto> getGhl() {
        if (isGhl()) {
            return Optional.of(((GhlValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateMakeToolDto> getMake() {
        if (isMake()) {
            return Optional.of(((MakeValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateTransferCallToolDto> getTransferCall() {
        if (isTransferCall()) {
            return Optional.of(((TransferCallValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateOutputToolDto> getOutput() {
        if (isOutput()) {
            return Optional.of(((OutputValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateBashToolDto> getBash() {
        if (isBash()) {
            return Optional.of(((BashValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateComputerToolDto> getComputer() {
        if (isComputer()) {
            return Optional.of(((ComputerValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateTextEditorToolDto> getTextEditor() {
        if (isTextEditor()) {
            return Optional.of(((TextEditorValue) value).value);
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
        T visitDtmf(CreateDtmfToolDto dtmf);

        T visitEndCall(CreateEndCallToolDto endCall);

        T visitFunction(CreateFunctionToolDto function);

        T visitGhl(CreateGhlToolDto ghl);

        T visitMake(CreateMakeToolDto make);

        T visitTransferCall(CreateTransferCallToolDto transferCall);

        T visitOutput(CreateOutputToolDto output);

        T visitBash(CreateBashToolDto bash);

        T visitComputer(CreateComputerToolDto computer);

        T visitTextEditor(CreateTextEditorToolDto textEditor);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(DtmfValue.class),
        @JsonSubTypes.Type(EndCallValue.class),
        @JsonSubTypes.Type(FunctionValue.class),
        @JsonSubTypes.Type(GhlValue.class),
        @JsonSubTypes.Type(MakeValue.class),
        @JsonSubTypes.Type(TransferCallValue.class),
        @JsonSubTypes.Type(OutputValue.class),
        @JsonSubTypes.Type(BashValue.class),
        @JsonSubTypes.Type(ComputerValue.class),
        @JsonSubTypes.Type(TextEditorValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("dtmf")
    private static final class DtmfValue implements Value {
        @JsonUnwrapped
        private CreateDtmfToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private DtmfValue() {}

        private DtmfValue(CreateDtmfToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitDtmf(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof DtmfValue && equalTo((DtmfValue) other);
        }

        private boolean equalTo(DtmfValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ToolsCreateRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("endCall")
    private static final class EndCallValue implements Value {
        @JsonUnwrapped
        private CreateEndCallToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private EndCallValue() {}

        private EndCallValue(CreateEndCallToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitEndCall(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof EndCallValue && equalTo((EndCallValue) other);
        }

        private boolean equalTo(EndCallValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ToolsCreateRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("function")
    private static final class FunctionValue implements Value {
        @JsonUnwrapped
        private CreateFunctionToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private FunctionValue() {}

        private FunctionValue(CreateFunctionToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitFunction(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof FunctionValue && equalTo((FunctionValue) other);
        }

        private boolean equalTo(FunctionValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ToolsCreateRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("ghl")
    private static final class GhlValue implements Value {
        @JsonUnwrapped
        private CreateGhlToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private GhlValue() {}

        private GhlValue(CreateGhlToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitGhl(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof GhlValue && equalTo((GhlValue) other);
        }

        private boolean equalTo(GhlValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ToolsCreateRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("make")
    private static final class MakeValue implements Value {
        @JsonUnwrapped
        private CreateMakeToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private MakeValue() {}

        private MakeValue(CreateMakeToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitMake(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof MakeValue && equalTo((MakeValue) other);
        }

        private boolean equalTo(MakeValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ToolsCreateRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("transferCall")
    private static final class TransferCallValue implements Value {
        @JsonUnwrapped
        private CreateTransferCallToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private TransferCallValue() {}

        private TransferCallValue(CreateTransferCallToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitTransferCall(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof TransferCallValue && equalTo((TransferCallValue) other);
        }

        private boolean equalTo(TransferCallValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ToolsCreateRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("output")
    private static final class OutputValue implements Value {
        @JsonUnwrapped
        private CreateOutputToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private OutputValue() {}

        private OutputValue(CreateOutputToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitOutput(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof OutputValue && equalTo((OutputValue) other);
        }

        private boolean equalTo(OutputValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ToolsCreateRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("bash")
    private static final class BashValue implements Value {
        @JsonUnwrapped
        private CreateBashToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private BashValue() {}

        private BashValue(CreateBashToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitBash(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof BashValue && equalTo((BashValue) other);
        }

        private boolean equalTo(BashValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ToolsCreateRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("computer")
    private static final class ComputerValue implements Value {
        @JsonUnwrapped
        private CreateComputerToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private ComputerValue() {}

        private ComputerValue(CreateComputerToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitComputer(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof ComputerValue && equalTo((ComputerValue) other);
        }

        private boolean equalTo(ComputerValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ToolsCreateRequest{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("textEditor")
    private static final class TextEditorValue implements Value {
        @JsonUnwrapped
        private CreateTextEditorToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private TextEditorValue() {}

        private TextEditorValue(CreateTextEditorToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitTextEditor(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof TextEditorValue && equalTo((TextEditorValue) other);
        }

        private boolean equalTo(TextEditorValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ToolsCreateRequest{" + "value: " + value + "}";
        }
    }

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
            return "ToolsCreateRequest{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
