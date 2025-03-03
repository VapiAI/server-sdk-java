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
@JsonDeserialize(builder = ServerMessageVoiceRequest.Builder.class)
public final class ServerMessageVoiceRequest {
    private final Optional<ServerMessageVoiceRequestPhoneNumber> phoneNumber;

    private final Optional<String> timestamp;

    private final Optional<Artifact> artifact;

    private final Optional<CreateAssistantDto> assistant;

    private final Optional<CreateCustomerDto> customer;

    private final Optional<Call> call;

    private final String text;

    private final double sampleRate;

    private final Map<String, Object> additionalProperties;

    private ServerMessageVoiceRequest(
            Optional<ServerMessageVoiceRequestPhoneNumber> phoneNumber,
            Optional<String> timestamp,
            Optional<Artifact> artifact,
            Optional<CreateAssistantDto> assistant,
            Optional<CreateCustomerDto> customer,
            Optional<Call> call,
            String text,
            double sampleRate,
            Map<String, Object> additionalProperties) {
        this.phoneNumber = phoneNumber;
        this.timestamp = timestamp;
        this.artifact = artifact;
        this.assistant = assistant;
        this.customer = customer;
        this.call = call;
        this.text = text;
        this.sampleRate = sampleRate;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the phone number associated with the call.
     * <p>This matches one of the following:</p>
     * <ul>
     * <li><code>call.phoneNumber</code>,</li>
     * <li><code>call.phoneNumberId</code>.</li>
     * </ul>
     */
    @JsonProperty("phoneNumber")
    public Optional<ServerMessageVoiceRequestPhoneNumber> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @return This is the type of the message. &quot;voice-request&quot; is sent when using <code>assistant.voice={ &quot;type&quot;: &quot;custom-voice&quot; }</code>.
     * <p>Here is what the request will look like:</p>
     * <p>POST https://{assistant.voice.server.url}
     * Content-Type: application/json</p>
     * <p>{
     * &quot;messsage&quot;: {
     * &quot;type&quot;: &quot;voice-request&quot;,
     * &quot;text&quot;: &quot;Hello, world!&quot;,
     * &quot;sampleRate&quot;: 24000,
     * ...other metadata about the call...
     * }
     * }</p>
     * <p>The expected response is 1-channel 16-bit raw PCM audio at the sample rate specified in the request. Here is how the response will be piped to the transport:</p>
     * <pre><code>response.on('data', (chunk: Buffer) =&gt; {
     *   outputStream.write(chunk);
     * });
     * </code></pre>
     */
    @JsonProperty("type")
    public String getType() {
        return "voice-request";
    }

    /**
     * @return This is the ISO-8601 formatted timestamp of when the message was sent.
     */
    @JsonProperty("timestamp")
    public Optional<String> getTimestamp() {
        return timestamp;
    }

    /**
     * @return This is a live version of the <code>call.artifact</code>.
     * <p>This matches what is stored on <code>call.artifact</code> after the call.</p>
     */
    @JsonProperty("artifact")
    public Optional<Artifact> getArtifact() {
        return artifact;
    }

    /**
     * @return This is the assistant that is currently active. This is provided for convenience.
     * <p>This matches one of the following:</p>
     * <ul>
     * <li><code>call.assistant</code>,</li>
     * <li><code>call.assistantId</code>,</li>
     * <li><code>call.squad[n].assistant</code>,</li>
     * <li><code>call.squad[n].assistantId</code>,</li>
     * <li><code>call.squadId-&gt;[n].assistant</code>,</li>
     * <li><code>call.squadId-&gt;[n].assistantId</code>.</li>
     * </ul>
     */
    @JsonProperty("assistant")
    public Optional<CreateAssistantDto> getAssistant() {
        return assistant;
    }

    /**
     * @return This is the customer associated with the call.
     * <p>This matches one of the following:</p>
     * <ul>
     * <li><code>call.customer</code>,</li>
     * <li><code>call.customerId</code>.</li>
     * </ul>
     */
    @JsonProperty("customer")
    public Optional<CreateCustomerDto> getCustomer() {
        return customer;
    }

    /**
     * @return This is the call object.
     * <p>This matches what was returned in POST /call.</p>
     * <p>Note: This might get stale during the call. To get the latest call object, especially after the call is ended, use GET /call/:id.</p>
     */
    @JsonProperty("call")
    public Optional<Call> getCall() {
        return call;
    }

    /**
     * @return This is the text to be synthesized.
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * @return This is the sample rate to be synthesized.
     */
    @JsonProperty("sampleRate")
    public double getSampleRate() {
        return sampleRate;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ServerMessageVoiceRequest && equalTo((ServerMessageVoiceRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ServerMessageVoiceRequest other) {
        return phoneNumber.equals(other.phoneNumber)
                && timestamp.equals(other.timestamp)
                && artifact.equals(other.artifact)
                && assistant.equals(other.assistant)
                && customer.equals(other.customer)
                && call.equals(other.call)
                && text.equals(other.text)
                && sampleRate == other.sampleRate;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.phoneNumber,
                this.timestamp,
                this.artifact,
                this.assistant,
                this.customer,
                this.call,
                this.text,
                this.sampleRate);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TextStage builder() {
        return new Builder();
    }

    public interface TextStage {
        SampleRateStage text(@NotNull String text);

        Builder from(ServerMessageVoiceRequest other);
    }

    public interface SampleRateStage {
        _FinalStage sampleRate(double sampleRate);
    }

    public interface _FinalStage {
        ServerMessageVoiceRequest build();

        _FinalStage phoneNumber(Optional<ServerMessageVoiceRequestPhoneNumber> phoneNumber);

        _FinalStage phoneNumber(ServerMessageVoiceRequestPhoneNumber phoneNumber);

        _FinalStage timestamp(Optional<String> timestamp);

        _FinalStage timestamp(String timestamp);

        _FinalStage artifact(Optional<Artifact> artifact);

        _FinalStage artifact(Artifact artifact);

        _FinalStage assistant(Optional<CreateAssistantDto> assistant);

        _FinalStage assistant(CreateAssistantDto assistant);

        _FinalStage customer(Optional<CreateCustomerDto> customer);

        _FinalStage customer(CreateCustomerDto customer);

        _FinalStage call(Optional<Call> call);

        _FinalStage call(Call call);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TextStage, SampleRateStage, _FinalStage {
        private String text;

        private double sampleRate;

        private Optional<Call> call = Optional.empty();

        private Optional<CreateCustomerDto> customer = Optional.empty();

        private Optional<CreateAssistantDto> assistant = Optional.empty();

        private Optional<Artifact> artifact = Optional.empty();

        private Optional<String> timestamp = Optional.empty();

        private Optional<ServerMessageVoiceRequestPhoneNumber> phoneNumber = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ServerMessageVoiceRequest other) {
            phoneNumber(other.getPhoneNumber());
            timestamp(other.getTimestamp());
            artifact(other.getArtifact());
            assistant(other.getAssistant());
            customer(other.getCustomer());
            call(other.getCall());
            text(other.getText());
            sampleRate(other.getSampleRate());
            return this;
        }

        /**
         * <p>This is the text to be synthesized.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("text")
        public SampleRateStage text(@NotNull String text) {
            this.text = Objects.requireNonNull(text, "text must not be null");
            return this;
        }

        /**
         * <p>This is the sample rate to be synthesized.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("sampleRate")
        public _FinalStage sampleRate(double sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }

        /**
         * <p>This is the call object.</p>
         * <p>This matches what was returned in POST /call.</p>
         * <p>Note: This might get stale during the call. To get the latest call object, especially after the call is ended, use GET /call/:id.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage call(Call call) {
            this.call = Optional.ofNullable(call);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "call", nulls = Nulls.SKIP)
        public _FinalStage call(Optional<Call> call) {
            this.call = call;
            return this;
        }

        /**
         * <p>This is the customer associated with the call.</p>
         * <p>This matches one of the following:</p>
         * <ul>
         * <li><code>call.customer</code>,</li>
         * <li><code>call.customerId</code>.</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage customer(CreateCustomerDto customer) {
            this.customer = Optional.ofNullable(customer);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "customer", nulls = Nulls.SKIP)
        public _FinalStage customer(Optional<CreateCustomerDto> customer) {
            this.customer = customer;
            return this;
        }

        /**
         * <p>This is the assistant that is currently active. This is provided for convenience.</p>
         * <p>This matches one of the following:</p>
         * <ul>
         * <li><code>call.assistant</code>,</li>
         * <li><code>call.assistantId</code>,</li>
         * <li><code>call.squad[n].assistant</code>,</li>
         * <li><code>call.squad[n].assistantId</code>,</li>
         * <li><code>call.squadId-&gt;[n].assistant</code>,</li>
         * <li><code>call.squadId-&gt;[n].assistantId</code>.</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage assistant(CreateAssistantDto assistant) {
            this.assistant = Optional.ofNullable(assistant);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "assistant", nulls = Nulls.SKIP)
        public _FinalStage assistant(Optional<CreateAssistantDto> assistant) {
            this.assistant = assistant;
            return this;
        }

        /**
         * <p>This is a live version of the <code>call.artifact</code>.</p>
         * <p>This matches what is stored on <code>call.artifact</code> after the call.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage artifact(Artifact artifact) {
            this.artifact = Optional.ofNullable(artifact);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "artifact", nulls = Nulls.SKIP)
        public _FinalStage artifact(Optional<Artifact> artifact) {
            this.artifact = artifact;
            return this;
        }

        /**
         * <p>This is the ISO-8601 formatted timestamp of when the message was sent.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage timestamp(String timestamp) {
            this.timestamp = Optional.ofNullable(timestamp);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "timestamp", nulls = Nulls.SKIP)
        public _FinalStage timestamp(Optional<String> timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * <p>This is the phone number associated with the call.</p>
         * <p>This matches one of the following:</p>
         * <ul>
         * <li><code>call.phoneNumber</code>,</li>
         * <li><code>call.phoneNumberId</code>.</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage phoneNumber(ServerMessageVoiceRequestPhoneNumber phoneNumber) {
            this.phoneNumber = Optional.ofNullable(phoneNumber);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "phoneNumber", nulls = Nulls.SKIP)
        public _FinalStage phoneNumber(Optional<ServerMessageVoiceRequestPhoneNumber> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        @java.lang.Override
        public ServerMessageVoiceRequest build() {
            return new ServerMessageVoiceRequest(
                    phoneNumber,
                    timestamp,
                    artifact,
                    assistant,
                    customer,
                    call,
                    text,
                    sampleRate,
                    additionalProperties);
        }
    }
}
