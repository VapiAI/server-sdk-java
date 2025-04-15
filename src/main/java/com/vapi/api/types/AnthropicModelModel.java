/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AnthropicModelModel {
    CLAUDE_3_OPUS_20240229("claude-3-opus-20240229"),

    CLAUDE_3_SONNET_20240229("claude-3-sonnet-20240229"),

    CLAUDE_3_HAIKU_20240307("claude-3-haiku-20240307"),

    CLAUDE_35_SONNET_20240620("claude-3-5-sonnet-20240620"),

    CLAUDE_35_SONNET_20241022("claude-3-5-sonnet-20241022"),

    CLAUDE_35_HAIKU_20241022("claude-3-5-haiku-20241022"),

    CLAUDE_37_SONNET_20250219("claude-3-7-sonnet-20250219");

    private final String value;

    AnthropicModelModel(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
