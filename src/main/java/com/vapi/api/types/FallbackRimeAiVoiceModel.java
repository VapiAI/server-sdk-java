/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FallbackRimeAiVoiceModel {
    V_1("v1"),

    MIST("mist"),

    MISTV_2("mistv2");

    private final String value;

    FallbackRimeAiVoiceModel(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
