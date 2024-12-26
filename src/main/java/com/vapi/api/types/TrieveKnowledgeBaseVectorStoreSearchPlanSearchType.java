/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TrieveKnowledgeBaseVectorStoreSearchPlanSearchType {
    FULLTEXT("fulltext"),

    SEMANTIC("semantic"),

    HYBRID("hybrid"),

    BM_25("bm25");

    private final String value;

    TrieveKnowledgeBaseVectorStoreSearchPlanSearchType(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
