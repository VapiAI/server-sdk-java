/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PlayHtVoiceModel {
    PLAY_HT_20("PlayHT2.0"),

    PLAY_HT_20_TURBO("PlayHT2.0-turbo"),

    PLAY_30_MINI("Play3.0-mini"),

    PLAY_DIALOG("PlayDialog");

    private final String value;

    PlayHtVoiceModel(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
