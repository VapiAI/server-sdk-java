/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SyncVoiceLibraryDtoProvidersItem {
    ELEVEN_LABS("11labs"),

    AZURE("azure"),

    CARTESIA("cartesia"),

    CUSTOM_VOICE("custom-voice"),

    DEEPGRAM("deepgram"),

    LMNT("lmnt"),

    NEETS("neets"),

    OPENAI("openai"),

    PLAYHT("playht"),

    RIME_AI("rime-ai");

    private final String value;

    SyncVoiceLibraryDtoProvidersItem(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}