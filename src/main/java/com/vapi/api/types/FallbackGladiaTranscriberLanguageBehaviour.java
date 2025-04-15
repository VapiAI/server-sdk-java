/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FallbackGladiaTranscriberLanguageBehaviour {
    MANUAL("manual"),

    AUTOMATIC_SINGLE_LANGUAGE("automatic single language"),

    AUTOMATIC_MULTIPLE_LANGUAGES("automatic multiple languages");

    private final String value;

    FallbackGladiaTranscriberLanguageBehaviour(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
