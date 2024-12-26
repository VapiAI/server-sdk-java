/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FallbackCartesiaVoiceModel {
    SONIC_ENGLISH("sonic-english"),

    SONIC_MULTILINGUAL("sonic-multilingual");

    private final String value;

    FallbackCartesiaVoiceModel(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}