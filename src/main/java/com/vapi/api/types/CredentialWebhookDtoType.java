/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CredentialWebhookDtoType {
    AUTH("auth"),

    SYNC("sync"),

    FORWARD("forward");

    private final String value;

    CredentialWebhookDtoType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
