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

public final class CreateToolTemplateDtoDetails {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private CreateToolTemplateDtoDetails(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static CreateToolTemplateDtoDetails dtmf(CreateDtmfToolDto value) {
        return new CreateToolTemplateDtoDetails(new DtmfValue(value));
    }

    public static CreateToolTemplateDtoDetails endCall(CreateEndCallToolDto value) {
        return new CreateToolTemplateDtoDetails(new EndCallValue(value));
    }

    public static CreateToolTemplateDtoDetails voicemail(CreateVoicemailToolDto value) {
        return new CreateToolTemplateDtoDetails(new VoicemailValue(value));
    }

    public static CreateToolTemplateDtoDetails function(CreateFunctionToolDto value) {
        return new CreateToolTemplateDtoDetails(new FunctionValue(value));
    }

    public static CreateToolTemplateDtoDetails ghl(CreateGhlToolDto value) {
        return new CreateToolTemplateDtoDetails(new GhlValue(value));
    }

    public static CreateToolTemplateDtoDetails make(CreateMakeToolDto value) {
        return new CreateToolTemplateDtoDetails(new MakeValue(value));
    }

    public static CreateToolTemplateDtoDetails transferCall(CreateTransferCallToolDto value) {
        return new CreateToolTemplateDtoDetails(new TransferCallValue(value));
    }

    public static CreateToolTemplateDtoDetails googleCalendarEventCreate(CreateGoogleCalendarCreateEventToolDto value) {
        return new CreateToolTemplateDtoDetails(new GoogleCalendarEventCreateValue(value));
    }

    public static CreateToolTemplateDtoDetails googleSheetsRowAppend(CreateGoogleSheetsRowAppendToolDto value) {
        return new CreateToolTemplateDtoDetails(new GoogleSheetsRowAppendValue(value));
    }

    public boolean isDtmf() {
        return value instanceof DtmfValue;
    }

    public boolean isEndCall() {
        return value instanceof EndCallValue;
    }

    public boolean isVoicemail() {
        return value instanceof VoicemailValue;
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

    public boolean isGoogleCalendarEventCreate() {
        return value instanceof GoogleCalendarEventCreateValue;
    }

    public boolean isGoogleSheetsRowAppend() {
        return value instanceof GoogleSheetsRowAppendValue;
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

    public Optional<CreateVoicemailToolDto> getVoicemail() {
        if (isVoicemail()) {
            return Optional.of(((VoicemailValue) value).value);
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

    public Optional<CreateGoogleCalendarCreateEventToolDto> getGoogleCalendarEventCreate() {
        if (isGoogleCalendarEventCreate()) {
            return Optional.of(((GoogleCalendarEventCreateValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateGoogleSheetsRowAppendToolDto> getGoogleSheetsRowAppend() {
        if (isGoogleSheetsRowAppend()) {
            return Optional.of(((GoogleSheetsRowAppendValue) value).value);
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

        T visitVoicemail(CreateVoicemailToolDto voicemail);

        T visitFunction(CreateFunctionToolDto function);

        T visitGhl(CreateGhlToolDto ghl);

        T visitMake(CreateMakeToolDto make);

        T visitTransferCall(CreateTransferCallToolDto transferCall);

        T visitGoogleCalendarEventCreate(CreateGoogleCalendarCreateEventToolDto googleCalendarEventCreate);

        T visitGoogleSheetsRowAppend(CreateGoogleSheetsRowAppendToolDto googleSheetsRowAppend);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(DtmfValue.class),
        @JsonSubTypes.Type(EndCallValue.class),
        @JsonSubTypes.Type(VoicemailValue.class),
        @JsonSubTypes.Type(FunctionValue.class),
        @JsonSubTypes.Type(GhlValue.class),
        @JsonSubTypes.Type(MakeValue.class),
        @JsonSubTypes.Type(TransferCallValue.class),
        @JsonSubTypes.Type(GoogleCalendarEventCreateValue.class),
        @JsonSubTypes.Type(GoogleSheetsRowAppendValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("dtmf")
    @JsonIgnoreProperties("type")
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
            return "CreateToolTemplateDtoDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("endCall")
    @JsonIgnoreProperties("type")
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
            return "CreateToolTemplateDtoDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("voicemail")
    @JsonIgnoreProperties("type")
    private static final class VoicemailValue implements Value {
        @JsonUnwrapped
        private CreateVoicemailToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private VoicemailValue() {}

        private VoicemailValue(CreateVoicemailToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitVoicemail(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof VoicemailValue && equalTo((VoicemailValue) other);
        }

        private boolean equalTo(VoicemailValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "CreateToolTemplateDtoDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("function")
    @JsonIgnoreProperties("type")
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
            return "CreateToolTemplateDtoDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("ghl")
    @JsonIgnoreProperties("type")
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
            return "CreateToolTemplateDtoDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("make")
    @JsonIgnoreProperties("type")
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
            return "CreateToolTemplateDtoDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("transferCall")
    @JsonIgnoreProperties("type")
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
            return "CreateToolTemplateDtoDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("google.calendar.event.create")
    @JsonIgnoreProperties("type")
    private static final class GoogleCalendarEventCreateValue implements Value {
        @JsonUnwrapped
        private CreateGoogleCalendarCreateEventToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private GoogleCalendarEventCreateValue() {}

        private GoogleCalendarEventCreateValue(CreateGoogleCalendarCreateEventToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitGoogleCalendarEventCreate(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof GoogleCalendarEventCreateValue && equalTo((GoogleCalendarEventCreateValue) other);
        }

        private boolean equalTo(GoogleCalendarEventCreateValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "CreateToolTemplateDtoDetails{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("google.sheets.row.append")
    @JsonIgnoreProperties("type")
    private static final class GoogleSheetsRowAppendValue implements Value {
        @JsonUnwrapped
        private CreateGoogleSheetsRowAppendToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private GoogleSheetsRowAppendValue() {}

        private GoogleSheetsRowAppendValue(CreateGoogleSheetsRowAppendToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitGoogleSheetsRowAppend(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof GoogleSheetsRowAppendValue && equalTo((GoogleSheetsRowAppendValue) other);
        }

        private boolean equalTo(GoogleSheetsRowAppendValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "CreateToolTemplateDtoDetails{" + "value: " + value + "}";
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
            return "CreateToolTemplateDtoDetails{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
