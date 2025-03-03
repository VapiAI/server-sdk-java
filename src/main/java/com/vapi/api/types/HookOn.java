/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum HookOn {
    TASK_START("task.start"),

    TASK_OUTPUT_CONFIRMATION("task.output.confirmation"),

    TASK_DELAYED("task.delayed");

    private final String value;

    HookOn(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
