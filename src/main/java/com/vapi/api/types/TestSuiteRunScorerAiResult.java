/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TestSuiteRunScorerAiResult {
    PASS("pass"),

    FAIL("fail");

    private final String value;

    TestSuiteRunScorerAiResult(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
