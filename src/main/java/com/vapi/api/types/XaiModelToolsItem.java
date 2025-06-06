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

public final class XaiModelToolsItem {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private XaiModelToolsItem(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static XaiModelToolsItem apiRequest(CreateApiRequestToolDto value) {
        return new XaiModelToolsItem(new ApiRequestValue(value));
    }

    public static XaiModelToolsItem bash(CreateBashToolDto value) {
        return new XaiModelToolsItem(new BashValue(value));
    }

    public static XaiModelToolsItem computer(CreateComputerToolDto value) {
        return new XaiModelToolsItem(new ComputerValue(value));
    }

    public static XaiModelToolsItem dtmf(CreateDtmfToolDto value) {
        return new XaiModelToolsItem(new DtmfValue(value));
    }

    public static XaiModelToolsItem endCall(CreateEndCallToolDto value) {
        return new XaiModelToolsItem(new EndCallValue(value));
    }

    public static XaiModelToolsItem function(CreateFunctionToolDto value) {
        return new XaiModelToolsItem(new FunctionValue(value));
    }

    public static XaiModelToolsItem gohighlevelCalendarAvailabilityCheck(
            CreateGoHighLevelCalendarAvailabilityToolDto value) {
        return new XaiModelToolsItem(new GohighlevelCalendarAvailabilityCheckValue(value));
    }

    public static XaiModelToolsItem gohighlevelCalendarEventCreate(CreateGoHighLevelCalendarEventCreateToolDto value) {
        return new XaiModelToolsItem(new GohighlevelCalendarEventCreateValue(value));
    }

    public static XaiModelToolsItem gohighlevelContactCreate(CreateGoHighLevelContactCreateToolDto value) {
        return new XaiModelToolsItem(new GohighlevelContactCreateValue(value));
    }

    public static XaiModelToolsItem gohighlevelContactGet(CreateGoHighLevelContactGetToolDto value) {
        return new XaiModelToolsItem(new GohighlevelContactGetValue(value));
    }

    public static XaiModelToolsItem googleCalendarAvailabilityCheck(
            CreateGoogleCalendarCheckAvailabilityToolDto value) {
        return new XaiModelToolsItem(new GoogleCalendarAvailabilityCheckValue(value));
    }

    public static XaiModelToolsItem googleCalendarEventCreate(CreateGoogleCalendarCreateEventToolDto value) {
        return new XaiModelToolsItem(new GoogleCalendarEventCreateValue(value));
    }

    public static XaiModelToolsItem googleSheetsRowAppend(CreateGoogleSheetsRowAppendToolDto value) {
        return new XaiModelToolsItem(new GoogleSheetsRowAppendValue(value));
    }

    public static XaiModelToolsItem mcp(CreateMcpToolDto value) {
        return new XaiModelToolsItem(new McpValue(value));
    }

    public static XaiModelToolsItem query(CreateQueryToolDto value) {
        return new XaiModelToolsItem(new QueryValue(value));
    }

    public static XaiModelToolsItem slackMessageSend(CreateSlackSendMessageToolDto value) {
        return new XaiModelToolsItem(new SlackMessageSendValue(value));
    }

    public static XaiModelToolsItem sms(CreateSmsToolDto value) {
        return new XaiModelToolsItem(new SmsValue(value));
    }

    public static XaiModelToolsItem textEditor(CreateTextEditorToolDto value) {
        return new XaiModelToolsItem(new TextEditorValue(value));
    }

    public static XaiModelToolsItem transferCall(CreateTransferCallToolDto value) {
        return new XaiModelToolsItem(new TransferCallValue(value));
    }

    public boolean isApiRequest() {
        return value instanceof ApiRequestValue;
    }

    public boolean isBash() {
        return value instanceof BashValue;
    }

    public boolean isComputer() {
        return value instanceof ComputerValue;
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

    public boolean isGohighlevelCalendarAvailabilityCheck() {
        return value instanceof GohighlevelCalendarAvailabilityCheckValue;
    }

    public boolean isGohighlevelCalendarEventCreate() {
        return value instanceof GohighlevelCalendarEventCreateValue;
    }

    public boolean isGohighlevelContactCreate() {
        return value instanceof GohighlevelContactCreateValue;
    }

    public boolean isGohighlevelContactGet() {
        return value instanceof GohighlevelContactGetValue;
    }

    public boolean isGoogleCalendarAvailabilityCheck() {
        return value instanceof GoogleCalendarAvailabilityCheckValue;
    }

    public boolean isGoogleCalendarEventCreate() {
        return value instanceof GoogleCalendarEventCreateValue;
    }

    public boolean isGoogleSheetsRowAppend() {
        return value instanceof GoogleSheetsRowAppendValue;
    }

    public boolean isMcp() {
        return value instanceof McpValue;
    }

    public boolean isQuery() {
        return value instanceof QueryValue;
    }

    public boolean isSlackMessageSend() {
        return value instanceof SlackMessageSendValue;
    }

    public boolean isSms() {
        return value instanceof SmsValue;
    }

    public boolean isTextEditor() {
        return value instanceof TextEditorValue;
    }

    public boolean isTransferCall() {
        return value instanceof TransferCallValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<CreateApiRequestToolDto> getApiRequest() {
        if (isApiRequest()) {
            return Optional.of(((ApiRequestValue) value).value);
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

    public Optional<CreateGoHighLevelCalendarAvailabilityToolDto> getGohighlevelCalendarAvailabilityCheck() {
        if (isGohighlevelCalendarAvailabilityCheck()) {
            return Optional.of(((GohighlevelCalendarAvailabilityCheckValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateGoHighLevelCalendarEventCreateToolDto> getGohighlevelCalendarEventCreate() {
        if (isGohighlevelCalendarEventCreate()) {
            return Optional.of(((GohighlevelCalendarEventCreateValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateGoHighLevelContactCreateToolDto> getGohighlevelContactCreate() {
        if (isGohighlevelContactCreate()) {
            return Optional.of(((GohighlevelContactCreateValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateGoHighLevelContactGetToolDto> getGohighlevelContactGet() {
        if (isGohighlevelContactGet()) {
            return Optional.of(((GohighlevelContactGetValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateGoogleCalendarCheckAvailabilityToolDto> getGoogleCalendarAvailabilityCheck() {
        if (isGoogleCalendarAvailabilityCheck()) {
            return Optional.of(((GoogleCalendarAvailabilityCheckValue) value).value);
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

    public Optional<CreateMcpToolDto> getMcp() {
        if (isMcp()) {
            return Optional.of(((McpValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateQueryToolDto> getQuery() {
        if (isQuery()) {
            return Optional.of(((QueryValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateSlackSendMessageToolDto> getSlackMessageSend() {
        if (isSlackMessageSend()) {
            return Optional.of(((SlackMessageSendValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateSmsToolDto> getSms() {
        if (isSms()) {
            return Optional.of(((SmsValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateTextEditorToolDto> getTextEditor() {
        if (isTextEditor()) {
            return Optional.of(((TextEditorValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CreateTransferCallToolDto> getTransferCall() {
        if (isTransferCall()) {
            return Optional.of(((TransferCallValue) value).value);
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
        T visitApiRequest(CreateApiRequestToolDto apiRequest);

        T visitBash(CreateBashToolDto bash);

        T visitComputer(CreateComputerToolDto computer);

        T visitDtmf(CreateDtmfToolDto dtmf);

        T visitEndCall(CreateEndCallToolDto endCall);

        T visitFunction(CreateFunctionToolDto function);

        T visitGohighlevelCalendarAvailabilityCheck(
                CreateGoHighLevelCalendarAvailabilityToolDto gohighlevelCalendarAvailabilityCheck);

        T visitGohighlevelCalendarEventCreate(
                CreateGoHighLevelCalendarEventCreateToolDto gohighlevelCalendarEventCreate);

        T visitGohighlevelContactCreate(CreateGoHighLevelContactCreateToolDto gohighlevelContactCreate);

        T visitGohighlevelContactGet(CreateGoHighLevelContactGetToolDto gohighlevelContactGet);

        T visitGoogleCalendarAvailabilityCheck(
                CreateGoogleCalendarCheckAvailabilityToolDto googleCalendarAvailabilityCheck);

        T visitGoogleCalendarEventCreate(CreateGoogleCalendarCreateEventToolDto googleCalendarEventCreate);

        T visitGoogleSheetsRowAppend(CreateGoogleSheetsRowAppendToolDto googleSheetsRowAppend);

        T visitMcp(CreateMcpToolDto mcp);

        T visitQuery(CreateQueryToolDto query);

        T visitSlackMessageSend(CreateSlackSendMessageToolDto slackMessageSend);

        T visitSms(CreateSmsToolDto sms);

        T visitTextEditor(CreateTextEditorToolDto textEditor);

        T visitTransferCall(CreateTransferCallToolDto transferCall);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(ApiRequestValue.class),
        @JsonSubTypes.Type(BashValue.class),
        @JsonSubTypes.Type(ComputerValue.class),
        @JsonSubTypes.Type(DtmfValue.class),
        @JsonSubTypes.Type(EndCallValue.class),
        @JsonSubTypes.Type(FunctionValue.class),
        @JsonSubTypes.Type(GohighlevelCalendarAvailabilityCheckValue.class),
        @JsonSubTypes.Type(GohighlevelCalendarEventCreateValue.class),
        @JsonSubTypes.Type(GohighlevelContactCreateValue.class),
        @JsonSubTypes.Type(GohighlevelContactGetValue.class),
        @JsonSubTypes.Type(GoogleCalendarAvailabilityCheckValue.class),
        @JsonSubTypes.Type(GoogleCalendarEventCreateValue.class),
        @JsonSubTypes.Type(GoogleSheetsRowAppendValue.class),
        @JsonSubTypes.Type(McpValue.class),
        @JsonSubTypes.Type(QueryValue.class),
        @JsonSubTypes.Type(SlackMessageSendValue.class),
        @JsonSubTypes.Type(SmsValue.class),
        @JsonSubTypes.Type(TextEditorValue.class),
        @JsonSubTypes.Type(TransferCallValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("apiRequest")
    @JsonIgnoreProperties("type")
    private static final class ApiRequestValue implements Value {
        @JsonUnwrapped
        private CreateApiRequestToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private ApiRequestValue() {}

        private ApiRequestValue(CreateApiRequestToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitApiRequest(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof ApiRequestValue && equalTo((ApiRequestValue) other);
        }

        private boolean equalTo(ApiRequestValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "XaiModelToolsItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("bash")
    @JsonIgnoreProperties("type")
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
            return "XaiModelToolsItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("computer")
    @JsonIgnoreProperties("type")
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
            return "XaiModelToolsItem{" + "value: " + value + "}";
        }
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
            return "XaiModelToolsItem{" + "value: " + value + "}";
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
            return "XaiModelToolsItem{" + "value: " + value + "}";
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
            return "XaiModelToolsItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("gohighlevel.calendar.availability.check")
    @JsonIgnoreProperties("type")
    private static final class GohighlevelCalendarAvailabilityCheckValue implements Value {
        @JsonUnwrapped
        private CreateGoHighLevelCalendarAvailabilityToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private GohighlevelCalendarAvailabilityCheckValue() {}

        private GohighlevelCalendarAvailabilityCheckValue(CreateGoHighLevelCalendarAvailabilityToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitGohighlevelCalendarAvailabilityCheck(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof GohighlevelCalendarAvailabilityCheckValue
                    && equalTo((GohighlevelCalendarAvailabilityCheckValue) other);
        }

        private boolean equalTo(GohighlevelCalendarAvailabilityCheckValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "XaiModelToolsItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("gohighlevel.calendar.event.create")
    @JsonIgnoreProperties("type")
    private static final class GohighlevelCalendarEventCreateValue implements Value {
        @JsonUnwrapped
        private CreateGoHighLevelCalendarEventCreateToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private GohighlevelCalendarEventCreateValue() {}

        private GohighlevelCalendarEventCreateValue(CreateGoHighLevelCalendarEventCreateToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitGohighlevelCalendarEventCreate(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof GohighlevelCalendarEventCreateValue
                    && equalTo((GohighlevelCalendarEventCreateValue) other);
        }

        private boolean equalTo(GohighlevelCalendarEventCreateValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "XaiModelToolsItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("gohighlevel.contact.create")
    @JsonIgnoreProperties("type")
    private static final class GohighlevelContactCreateValue implements Value {
        @JsonUnwrapped
        private CreateGoHighLevelContactCreateToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private GohighlevelContactCreateValue() {}

        private GohighlevelContactCreateValue(CreateGoHighLevelContactCreateToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitGohighlevelContactCreate(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof GohighlevelContactCreateValue && equalTo((GohighlevelContactCreateValue) other);
        }

        private boolean equalTo(GohighlevelContactCreateValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "XaiModelToolsItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("gohighlevel.contact.get")
    @JsonIgnoreProperties("type")
    private static final class GohighlevelContactGetValue implements Value {
        @JsonUnwrapped
        private CreateGoHighLevelContactGetToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private GohighlevelContactGetValue() {}

        private GohighlevelContactGetValue(CreateGoHighLevelContactGetToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitGohighlevelContactGet(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof GohighlevelContactGetValue && equalTo((GohighlevelContactGetValue) other);
        }

        private boolean equalTo(GohighlevelContactGetValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "XaiModelToolsItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("google.calendar.availability.check")
    @JsonIgnoreProperties("type")
    private static final class GoogleCalendarAvailabilityCheckValue implements Value {
        @JsonUnwrapped
        private CreateGoogleCalendarCheckAvailabilityToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private GoogleCalendarAvailabilityCheckValue() {}

        private GoogleCalendarAvailabilityCheckValue(CreateGoogleCalendarCheckAvailabilityToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitGoogleCalendarAvailabilityCheck(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof GoogleCalendarAvailabilityCheckValue
                    && equalTo((GoogleCalendarAvailabilityCheckValue) other);
        }

        private boolean equalTo(GoogleCalendarAvailabilityCheckValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "XaiModelToolsItem{" + "value: " + value + "}";
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
            return "XaiModelToolsItem{" + "value: " + value + "}";
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
            return "XaiModelToolsItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("mcp")
    @JsonIgnoreProperties("type")
    private static final class McpValue implements Value {
        @JsonUnwrapped
        private CreateMcpToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private McpValue() {}

        private McpValue(CreateMcpToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitMcp(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof McpValue && equalTo((McpValue) other);
        }

        private boolean equalTo(McpValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "XaiModelToolsItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("query")
    @JsonIgnoreProperties("type")
    private static final class QueryValue implements Value {
        @JsonUnwrapped
        private CreateQueryToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private QueryValue() {}

        private QueryValue(CreateQueryToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitQuery(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof QueryValue && equalTo((QueryValue) other);
        }

        private boolean equalTo(QueryValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "XaiModelToolsItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("slack.message.send")
    @JsonIgnoreProperties("type")
    private static final class SlackMessageSendValue implements Value {
        @JsonUnwrapped
        private CreateSlackSendMessageToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private SlackMessageSendValue() {}

        private SlackMessageSendValue(CreateSlackSendMessageToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitSlackMessageSend(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof SlackMessageSendValue && equalTo((SlackMessageSendValue) other);
        }

        private boolean equalTo(SlackMessageSendValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "XaiModelToolsItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("sms")
    @JsonIgnoreProperties("type")
    private static final class SmsValue implements Value {
        @JsonUnwrapped
        private CreateSmsToolDto value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private SmsValue() {}

        private SmsValue(CreateSmsToolDto value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitSms(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof SmsValue && equalTo((SmsValue) other);
        }

        private boolean equalTo(SmsValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "XaiModelToolsItem{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("textEditor")
    @JsonIgnoreProperties("type")
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
            return "XaiModelToolsItem{" + "value: " + value + "}";
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
            return "XaiModelToolsItem{" + "value: " + value + "}";
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
            return "XaiModelToolsItem{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
