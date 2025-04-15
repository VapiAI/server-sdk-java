/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CartesiaVoiceModel {
    SONIC_2("sonic-2"),

    SONIC_ENGLISH("sonic-english"),

    SONIC_MULTILINGUAL("sonic-multilingual"),

    SONIC_PREVIEW("sonic-preview"),

    SONIC("sonic");

    private final String value;

    CartesiaVoiceModel(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
