/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum VoicemailDetectionCostProvider {
    TWILIO("twilio"),

    GOOGLE("google"),

    OPENAI("openai"),

    VAPI("vapi");

    private final String value;

    VoicemailDetectionCostProvider(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
