/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TestSuiteRunStatus {
    QUEUED("queued"),

    IN_PROGRESS("in-progress"),

    COMPLETED("completed"),

    FAILED("failed");

    private final String value;

    TestSuiteRunStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
