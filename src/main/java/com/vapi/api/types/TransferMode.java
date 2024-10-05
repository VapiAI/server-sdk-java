/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TransferMode {
    ROLLING_HISTORY("rolling-history"),

    SWAP_SYSTEM_MESSAGE_IN_HISTORY("swap-system-message-in-history");

    private final String value;

    TransferMode(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}