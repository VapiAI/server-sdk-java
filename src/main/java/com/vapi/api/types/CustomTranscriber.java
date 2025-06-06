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
@JsonDeserialize(builder = CustomTranscriber.Builder.class)
public final class CustomTranscriber {
    private final Server server;

    private final Optional<FallbackTranscriberPlan> fallbackPlan;

    private final Map<String, Object> additionalProperties;

    private CustomTranscriber(
            Server server, Optional<FallbackTranscriberPlan> fallbackPlan, Map<String, Object> additionalProperties) {
        this.server = server;
        this.fallbackPlan = fallbackPlan;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is where the transcription request will be sent.
     * <p>Usage:</p>
     * <ol>
     * <li>
     * <p>Vapi will initiate a websocket connection with <code>server.url</code>.</p>
     * </li>
     * <li>
     * <p>Vapi will send an initial text frame with the sample rate. Format:</p>
     * </li>
     * </ol>
     * <pre><code>    {
     *       &quot;type&quot;: &quot;start&quot;,
     *       &quot;encoding&quot;: &quot;linear16&quot;, // 16-bit raw PCM format
     *       &quot;container&quot;: &quot;raw&quot;,
     *       &quot;sampleRate&quot;: {{sampleRate}},
     *       &quot;channels&quot;: 2 // customer is channel 0, assistant is channel 1
     *     }
     * </code></pre>
     * <ol start="3">
     * <li>
     * <p>Vapi will send the audio data in 16-bit raw PCM format as binary frames.</p>
     * </li>
     * <li>
     * <p>You can read the messages something like this:</p>
     * </li>
     * </ol>
     * <pre><code>ws.on('message', (data, isBinary) =&gt; {
     *   if (isBinary) {
     *     pcmBuffer = Buffer.concat([pcmBuffer, data]);
     *     console.log(`Received PCM data, buffer size: ${pcmBuffer.length}`);
     *   } else {
     *     console.log('Received message:', JSON.parse(data.toString()));
     *   }
     * });
     * </code></pre>
     * <ol start="5">
     * <li>You will respond with transcriptions as you have them. Format:</li>
     * </ol>
     * <pre><code> {
     *     &quot;type&quot;: &quot;transcriber-response&quot;,
     *     &quot;transcription&quot;: &quot;Hello, world!&quot;,
     *     &quot;channel&quot;: &quot;customer&quot; | &quot;assistant&quot;
     *  }
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
    public Optional<FallbackTranscriberPlan> getFallbackPlan() {
        return fallbackPlan;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CustomTranscriber && equalTo((CustomTranscriber) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CustomTranscriber other) {
        return server.equals(other.server) && fallbackPlan.equals(other.fallbackPlan);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.server, this.fallbackPlan);
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

        Builder from(CustomTranscriber other);
    }

    public interface _FinalStage {
        CustomTranscriber build();

        _FinalStage fallbackPlan(Optional<FallbackTranscriberPlan> fallbackPlan);

        _FinalStage fallbackPlan(FallbackTranscriberPlan fallbackPlan);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ServerStage, _FinalStage {
        private Server server;

        private Optional<FallbackTranscriberPlan> fallbackPlan = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CustomTranscriber other) {
            server(other.getServer());
            fallbackPlan(other.getFallbackPlan());
            return this;
        }

        /**
         * <p>This is where the transcription request will be sent.</p>
         * <p>Usage:</p>
         * <ol>
         * <li>
         * <p>Vapi will initiate a websocket connection with <code>server.url</code>.</p>
         * </li>
         * <li>
         * <p>Vapi will send an initial text frame with the sample rate. Format:</p>
         * </li>
         * </ol>
         * <pre><code>    {
         *       &quot;type&quot;: &quot;start&quot;,
         *       &quot;encoding&quot;: &quot;linear16&quot;, // 16-bit raw PCM format
         *       &quot;container&quot;: &quot;raw&quot;,
         *       &quot;sampleRate&quot;: {{sampleRate}},
         *       &quot;channels&quot;: 2 // customer is channel 0, assistant is channel 1
         *     }
         * </code></pre>
         * <ol start="3">
         * <li>
         * <p>Vapi will send the audio data in 16-bit raw PCM format as binary frames.</p>
         * </li>
         * <li>
         * <p>You can read the messages something like this:</p>
         * </li>
         * </ol>
         * <pre><code>ws.on('message', (data, isBinary) =&gt; {
         *   if (isBinary) {
         *     pcmBuffer = Buffer.concat([pcmBuffer, data]);
         *     console.log(`Received PCM data, buffer size: ${pcmBuffer.length}`);
         *   } else {
         *     console.log('Received message:', JSON.parse(data.toString()));
         *   }
         * });
         * </code></pre>
         * <ol start="5">
         * <li>You will respond with transcriptions as you have them. Format:</li>
         * </ol>
         * <pre><code> {
         *     &quot;type&quot;: &quot;transcriber-response&quot;,
         *     &quot;transcription&quot;: &quot;Hello, world!&quot;,
         *     &quot;channel&quot;: &quot;customer&quot; | &quot;assistant&quot;
         *  }
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
        public _FinalStage fallbackPlan(FallbackTranscriberPlan fallbackPlan) {
            this.fallbackPlan = Optional.ofNullable(fallbackPlan);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "fallbackPlan", nulls = Nulls.SKIP)
        public _FinalStage fallbackPlan(Optional<FallbackTranscriberPlan> fallbackPlan) {
            this.fallbackPlan = fallbackPlan;
            return this;
        }

        @java.lang.Override
        public CustomTranscriber build() {
            return new CustomTranscriber(server, fallbackPlan, additionalProperties);
        }
    }
}
