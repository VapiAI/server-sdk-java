/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TimeRangeStep {
    MINUTE("minute"),

    HOUR("hour"),

    DAY("day"),

    WEEK("week"),

    MONTH("month"),

    QUARTER("quarter"),

    YEAR("year"),

    DECADE("decade"),

    CENTURY("century"),

    MILLENNIUM("millennium");

    private final String value;

    TimeRangeStep(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}