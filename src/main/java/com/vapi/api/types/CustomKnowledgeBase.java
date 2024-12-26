/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vapi.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CustomKnowledgeBase.Builder.class)
public final class CustomKnowledgeBase {
    private final Server server;

    private final String id;

    private final String orgId;

    private final Map<String, Object> additionalProperties;

    private CustomKnowledgeBase(Server server, String id, String orgId, Map<String, Object> additionalProperties) {
        this.server = server;
        this.id = id;
        this.orgId = orgId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return /**
     * This is where the knowledge base request will be sent.
     * <p>Request Example:</p>
     * <p>POST https://{server.url}
     * Content-Type: application/json</p>
     * <p>{
     * &quot;messsage&quot;: {
     * &quot;type&quot;: &quot;knowledge-base-request&quot;,
     * &quot;messages&quot;: [
     * {
     * &quot;role&quot;: &quot;user&quot;,
     * &quot;content&quot;: &quot;Why is ocean blue?&quot;
     * }
     * ],
     * ...other metadata about the call...
     * }
     * }</p>
     * <p>Response Expected:</p>
     * <pre><code>{
     *   &quot;message&quot;: {
     *      &quot;role&quot;: &quot;assistant&quot;,
     *      &quot;content&quot;: &quot;The ocean is blue because water absorbs everything but blue.&quot;,
     *   }, // YOU CAN RETURN THE EXACT RESPONSE TO SPEAK
     *   &quot;documents&quot;: [
     *     {
     *       &quot;content&quot;: &quot;The ocean is blue primarily because water absorbs colors in the red part of the light spectrum and scatters the blue light, making it more visible to our eyes.&quot;,
     *       &quot;similarity&quot;: 1
     *     },
     *     {
     *       &quot;content&quot;: &quot;Blue light is scattered more by the water molecules than other colors, enhancing the blue appearance of the ocean.&quot;,
     *       &quot;similarity&quot;: .5
     *     }
     *   ] // OR, YOU CAN RETURN AN ARRAY OF DOCUMENTS THAT WILL BE SENT TO THE MODEL
     * }
     * </code></pre>
     */
    @JsonProperty("server")
    public Server getServer() {
        return server;
    }

    /**
     * @return This is the id of the knowledge base.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return This is the org id of the knowledge base.
     */
    @JsonProperty("orgId")
    public String getOrgId() {
        return orgId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CustomKnowledgeBase && equalTo((CustomKnowledgeBase) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CustomKnowledgeBase other) {
        return server.equals(other.server) && id.equals(other.id) && orgId.equals(other.orgId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.server, this.id, this.orgId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ServerStage builder() {
        return new Builder();
    }

    public interface ServerStage {
        IdStage server(@NotNull Server server);

        Builder from(CustomKnowledgeBase other);
    }

    public interface IdStage {
        OrgIdStage id(@NotNull String id);
    }

    public interface OrgIdStage {
        _FinalStage orgId(@NotNull String orgId);
    }

    public interface _FinalStage {
        CustomKnowledgeBase build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ServerStage, IdStage, OrgIdStage, _FinalStage {
        private Server server;

        private String id;

        private String orgId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CustomKnowledgeBase other) {
            server(other.getServer());
            id(other.getId());
            orgId(other.getOrgId());
            return this;
        }

        /**
         * <p>/**
         * This is where the knowledge base request will be sent.</p>
         * <p>Request Example:</p>
         * <p>POST https://{server.url}
         * Content-Type: application/json</p>
         * <p>{
         * &quot;messsage&quot;: {
         * &quot;type&quot;: &quot;knowledge-base-request&quot;,
         * &quot;messages&quot;: [
         * {
         * &quot;role&quot;: &quot;user&quot;,
         * &quot;content&quot;: &quot;Why is ocean blue?&quot;
         * }
         * ],
         * ...other metadata about the call...
         * }
         * }</p>
         * <p>Response Expected:</p>
         * <pre><code>{
         *   &quot;message&quot;: {
         *      &quot;role&quot;: &quot;assistant&quot;,
         *      &quot;content&quot;: &quot;The ocean is blue because water absorbs everything but blue.&quot;,
         *   }, // YOU CAN RETURN THE EXACT RESPONSE TO SPEAK
         *   &quot;documents&quot;: [
         *     {
         *       &quot;content&quot;: &quot;The ocean is blue primarily because water absorbs colors in the red part of the light spectrum and scatters the blue light, making it more visible to our eyes.&quot;,
         *       &quot;similarity&quot;: 1
         *     },
         *     {
         *       &quot;content&quot;: &quot;Blue light is scattered more by the water molecules than other colors, enhancing the blue appearance of the ocean.&quot;,
         *       &quot;similarity&quot;: .5
         *     }
         *   ] // OR, YOU CAN RETURN AN ARRAY OF DOCUMENTS THAT WILL BE SENT TO THE MODEL
         * }
         * </code></pre>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("server")
        public IdStage server(@NotNull Server server) {
            this.server = Objects.requireNonNull(server, "server must not be null");
            return this;
        }

        /**
         * <p>This is the id of the knowledge base.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public OrgIdStage id(@NotNull String id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        /**
         * <p>This is the org id of the knowledge base.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("orgId")
        public _FinalStage orgId(@NotNull String orgId) {
            this.orgId = Objects.requireNonNull(orgId, "orgId must not be null");
            return this;
        }

        @java.lang.Override
        public CustomKnowledgeBase build() {
            return new CustomKnowledgeBase(server, id, orgId, additionalProperties);
        }
    }
}