/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OpenAiTranscriberModel {
    GPT_4_O_TRANSCRIBE("gpt-4o-transcribe"),

    GPT_4_O_MINI_TRANSCRIBE("gpt-4o-mini-transcribe");

    private final String value;

    OpenAiTranscriberModel(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
