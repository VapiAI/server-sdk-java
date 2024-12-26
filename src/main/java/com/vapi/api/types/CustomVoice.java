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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.vapi.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CustomVoice.Builder.class)
public final class CustomVoice {
    private final Optional<ChunkPlan> chunkPlan;

    private final Server server;

    private final Optional<FallbackPlan> fallbackPlan;

    private final Map<String, Object> additionalProperties;

    private CustomVoice(
            Optional<ChunkPlan> chunkPlan,
            Server server,
            Optional<FallbackPlan> fallbackPlan,
            Map<String, Object> additionalProperties) {
        this.chunkPlan = chunkPlan;
        this.server = server;
        this.fallbackPlan = fallbackPlan;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the plan for chunking the model output before it is sent to the voice provider.
     */
    @JsonProperty("chunkPlan")
    public Optional<ChunkPlan> getChunkPlan() {
        return chunkPlan;
    }

    /**
     * @return This is where the voice request will be sent.
     * <p>Request Example:</p>
     * <p>POST https://{server.url}
     * Content-Type: application/json</p>
     * <p>{
     * &quot;message&quot;: {
     * &quot;type&quot;: &quot;voice-request&quot;,
     * &quot;text&quot;: &quot;Hello, world!&quot;,
     * &quot;sampleRate&quot;: 24000,
     * ...other metadata about the call...
     * }
     * }</p>
     * <p>Response Expected: 1-channel 16-bit raw PCM audio at the sample rate specified in the request. Here is how the response will be piped to the transport:</p>
     * <pre><code>response.on('data', (chunk: Buffer) =&gt; {
     *   outputStream.write(chunk);
     * });
     * </code></pre>
     */
    @JsonProperty("server")
    public Server getServer() {
        return server;
    }

    /**
     * @return This is the plan for voice provider fallbacks in the event that the primary voice provider fails.
     */
    @JsonProperty("fallbackPlan")
    public Optional<FallbackPlan> getFallbackPlan() {
        return fallbackPlan;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CustomVoice && equalTo((CustomVoice) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CustomVoice other) {
        return chunkPlan.equals(other.chunkPlan)
                && server.equals(other.server)
                && fallbackPlan.equals(other.fallbackPlan);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.chunkPlan, this.server, this.fallbackPlan);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ServerStage builder() {
        return new Builder();
    }

    public interface ServerStage {
        _FinalStage server(@NotNull Server server);

        Builder from(CustomVoice other);
    }

    public interface _FinalStage {
        CustomVoice build();

        _FinalStage chunkPlan(Optional<ChunkPlan> chunkPlan);

        _FinalStage chunkPlan(ChunkPlan chunkPlan);

        _FinalStage fallbackPlan(Optional<FallbackPlan> fallbackPlan);

        _FinalStage fallbackPlan(FallbackPlan fallbackPlan);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ServerStage, _FinalStage {
        private Server server;

        private Optional<FallbackPlan> fallbackPlan = Optional.empty();

        private Optional<ChunkPlan> chunkPlan = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CustomVoice other) {
            chunkPlan(other.getChunkPlan());
            server(other.getServer());
            fallbackPlan(other.getFallbackPlan());
            return this;
        }

        /**
         * <p>This is where the voice request will be sent.</p>
         * <p>Request Example:</p>
         * <p>POST https://{server.url}
         * Content-Type: application/json</p>
         * <p>{
         * &quot;message&quot;: {
         * &quot;type&quot;: &quot;voice-request&quot;,
         * &quot;text&quot;: &quot;Hello, world!&quot;,
         * &quot;sampleRate&quot;: 24000,
         * ...other metadata about the call...
         * }
         * }</p>
         * <p>Response Expected: 1-channel 16-bit raw PCM audio at the sample rate specified in the request. Here is how the response will be piped to the transport:</p>
         * <pre><code>response.on('data', (chunk: Buffer) =&gt; {
         *   outputStream.write(chunk);
         * });
         * </code></pre>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("server")
        public _FinalStage server(@NotNull Server server) {
            this.server = Objects.requireNonNull(server, "server must not be null");
            return this;
        }

        /**
         * <p>This is the plan for voice provider fallbacks in the event that the primary voice provider fails.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage fallbackPlan(FallbackPlan fallbackPlan) {
            this.fallbackPlan = Optional.ofNullable(fallbackPlan);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "fallbackPlan", nulls = Nulls.SKIP)
        public _FinalStage fallbackPlan(Optional<FallbackPlan> fallbackPlan) {
            this.fallbackPlan = fallbackPlan;
            return this;
        }

        /**
         * <p>This is the plan for chunking the model output before it is sent to the voice provider.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage chunkPlan(ChunkPlan chunkPlan) {
            this.chunkPlan = Optional.ofNullable(chunkPlan);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "chunkPlan", nulls = Nulls.SKIP)
        public _FinalStage chunkPlan(Optional<ChunkPlan> chunkPlan) {
            this.chunkPlan = chunkPlan;
            return this;
        }

        @java.lang.Override
        public CustomVoice build() {
            return new CustomVoice(chunkPlan, server, fallbackPlan, additionalProperties);
        }
    }
}