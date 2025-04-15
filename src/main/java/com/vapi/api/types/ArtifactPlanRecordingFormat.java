/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ArtifactPlanRecordingFormat {
    WAV_L_16("wav;l16"),

    MP_3("mp3");

    private final String value;

    ArtifactPlanRecordingFormat(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
