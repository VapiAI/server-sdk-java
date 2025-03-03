/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AssistantOverridesServerMessagesItem {
    CONVERSATION_UPDATE("conversation-update"),

    END_OF_CALL_REPORT("end-of-call-report"),

    FUNCTION_CALL("function-call"),

    HANG("hang"),

    LANGUAGE_CHANGED("language-changed"),

    LANGUAGE_CHANGE_DETECTED("language-change-detected"),

    MODEL_OUTPUT("model-output"),

    PHONE_CALL_CONTROL("phone-call-control"),

    SPEECH_UPDATE("speech-update"),

    STATUS_UPDATE("status-update"),

    TRANSCRIPT("transcript"),

    TRANSCRIPT_TRANSCRIPT_TYPE_FINAL("transcript[transcriptType='final']"),

    TOOL_CALLS("tool-calls"),

    TRANSFER_DESTINATION_REQUEST("transfer-destination-request"),

    TRANSFER_UPDATE("transfer-update"),

    USER_INTERRUPTED("user-interrupted"),

    VOICE_INPUT("voice-input");

    private final String value;

    AssistantOverridesServerMessagesItem(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
