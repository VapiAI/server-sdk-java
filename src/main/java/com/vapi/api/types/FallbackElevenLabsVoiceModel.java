/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FallbackElevenLabsVoiceModel {
    ELEVEN_MULTILINGUAL_V_2("eleven_multilingual_v2"),

    ELEVEN_TURBO_V_2("eleven_turbo_v2"),

    ELEVEN_TURBO_V_2_5("eleven_turbo_v2_5"),

    ELEVEN_MONOLINGUAL_V_1("eleven_monolingual_v1");

    private final String value;

    FallbackElevenLabsVoiceModel(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
