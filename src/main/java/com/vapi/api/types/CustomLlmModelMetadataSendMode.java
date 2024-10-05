/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CustomLlmModelMetadataSendMode {
    OFF("off"),

    VARIABLE("variable"),

    DESTRUCTURED("destructured");

    private final String value;

    CustomLlmModelMetadataSendMode(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}