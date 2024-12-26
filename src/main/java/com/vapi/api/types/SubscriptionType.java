/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SubscriptionType {
    TRIAL("trial"),

    PAY_AS_YOU_GO("pay-as-you-go"),

    ENTERPRISE("enterprise");

    private final String value;

    SubscriptionType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}