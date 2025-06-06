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
@JsonDeserialize(builder = TransferPlan.Builder.class)
public final class TransferPlan {
    private final TransferPlanMode mode;

    private final Optional<TransferPlanMessage> message;

    private final Optional<Map<String, Object>> sipVerb;

    private final Optional<String> holdAudioUrl;

    private final Optional<String> twiml;

    private final Optional<SummaryPlan> summaryPlan;

    private final Optional<Boolean> sipHeadersInReferToEnabled;

    private final Optional<TransferFallbackPlan> fallbackPlan;

    private final Map<String, Object> additionalProperties;

    private TransferPlan(
            TransferPlanMode mode,
            Optional<TransferPlanMessage> message,
            Optional<Map<String, Object>> sipVerb,
            Optional<String> holdAudioUrl,
            Optional<String> twiml,
            Optional<SummaryPlan> summaryPlan,
            Optional<Boolean> sipHeadersInReferToEnabled,
            Optional<TransferFallbackPlan> fallbackPlan,
            Map<String, Object> additionalProperties) {
        this.mode = mode;
        this.message = message;
        this.sipVerb = sipVerb;
        this.holdAudioUrl = holdAudioUrl;
        this.twiml = twiml;
        this.summaryPlan = summaryPlan;
        this.sipHeadersInReferToEnabled = sipHeadersInReferToEnabled;
        this.fallbackPlan = fallbackPlan;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This configures how transfer is executed and the experience of the destination party receiving the call.
     * <p>Usage:</p>
     * <ul>
     * <li><code>blind-transfer</code>: The assistant forwards the call to the destination without any message or summary.</li>
     * <li><code>blind-transfer-add-summary-to-sip-header</code>: The assistant forwards the call to the destination and adds a SIP header X-Transfer-Summary to the call to include the summary.</li>
     * <li><code>warm-transfer-say-message</code>: The assistant dials the destination, delivers the <code>message</code> to the destination party, connects the customer, and leaves the call.</li>
     * <li><code>warm-transfer-say-summary</code>: The assistant dials the destination, provides a summary of the call to the destination party, connects the customer, and leaves the call.</li>
     * <li><code>warm-transfer-wait-for-operator-to-speak-first-and-then-say-message</code>: The assistant dials the destination, waits for the operator to speak, delivers the <code>message</code> to the destination party, and then connects the customer.</li>
     * <li><code>warm-transfer-wait-for-operator-to-speak-first-and-then-say-summary</code>: The assistant dials the destination, waits for the operator to speak, provides a summary of the call to the destination party, and then connects the customer.</li>
     * <li><code>warm-transfer-twiml</code>: The assistant dials the destination, executes the twiml instructions on the destination call leg, connects the customer, and leaves the call.</li>
     * <li><code>warm-transfer-experimental</code>: The assistant puts the customer on hold, dials the destination, and if the destination answers (and is human), delivers a message or summary before connecting the customer. If the destination is unreachable or not human (e.g., with voicemail detection), the assistant delivers the <code>fallbackMessage</code> to the customer and optionally ends the call.</li>
     * </ul>
     * <p>@default 'blind-transfer'</p>
     */
    @JsonProperty("mode")
    public TransferPlanMode getMode() {
        return mode;
    }

    /**
     * @return This is the message the assistant will deliver to the destination party before connecting the customer.
     * <p>Usage:</p>
     * <ul>
     * <li>Used only when <code>mode</code> is <code>blind-transfer-add-summary-to-sip-header</code>, <code>warm-transfer-say-message</code>, <code>warm-transfer-wait-for-operator-to-speak-first-and-then-say-message</code>, or <code>warm-transfer-experimental</code>.</li>
     * </ul>
     */
    @JsonProperty("message")
    public Optional<TransferPlanMessage> getMessage() {
        return message;
    }

    /**
     * @return This specifies the SIP verb to use while transferring the call.
     * <ul>
     * <li>'refer': Uses SIP REFER to transfer the call (default)</li>
     * <li>'bye': Ends current call with SIP BYE</li>
     * <li>'dial': Uses SIP DIAL to transfer the call</li>
     * </ul>
     */
    @JsonProperty("sipVerb")
    public Optional<Map<String, Object>> getSipVerb() {
        return sipVerb;
    }

    /**
     * @return This is the URL to an audio file played while the customer is on hold during transfer.
     * <p>Usage:</p>
     * <ul>
     * <li>Used only when <code>mode</code> is <code>warm-transfer-experimental</code>.</li>
     * <li>Used when transferring calls to play hold audio for the customer.</li>
     * <li>Must be a publicly accessible URL to an audio file.</li>
     * <li>Supported formats: MP3 and WAV.</li>
     * <li>If not provided, the default hold audio will be used.</li>
     * </ul>
     */
    @JsonProperty("holdAudioUrl")
    public Optional<String> getHoldAudioUrl() {
        return holdAudioUrl;
    }

    /**
     * @return This is the TwiML instructions to execute on the destination call leg before connecting the customer.
     * <p>Usage:</p>
     * <ul>
     * <li>Used only when <code>mode</code> is <code>warm-transfer-twiml</code>.</li>
     * <li>Supports only <code>Play</code>, <code>Say</code>, <code>Gather</code>, <code>Hangup</code> and <code>Pause</code> verbs.</li>
     * <li>Maximum length is 4096 characters.</li>
     * </ul>
     * <p>Example:</p>
     * <pre><code>&lt;Say voice=&quot;alice&quot; language=&quot;en-US&quot;&gt;Hello, transferring a customer to you.&lt;/Say&gt;
     * &lt;Pause length=&quot;2&quot;/&gt;
     * &lt;Say&gt;They called about billing questions.&lt;/Say&gt;
     * </code></pre>
     */
    @JsonProperty("twiml")
    public Optional<String> getTwiml() {
        return twiml;
    }

    /**
     * @return This is the plan for generating a summary of the call to present to the destination party.
     * <p>Usage:</p>
     * <ul>
     * <li>Used only when <code>mode</code> is <code>blind-transfer-add-summary-to-sip-header</code> or <code>warm-transfer-say-summary</code> or <code>warm-transfer-wait-for-operator-to-speak-first-and-then-say-summary</code> or <code>warm-transfer-experimental</code>.</li>
     * </ul>
     */
    @JsonProperty("summaryPlan")
    public Optional<SummaryPlan> getSummaryPlan() {
        return summaryPlan;
    }

    /**
     * @return This flag includes the sipHeaders from above in the refer to sip uri as url encoded query params.
     * <p>@default false</p>
     */
    @JsonProperty("sipHeadersInReferToEnabled")
    public Optional<Boolean> getSipHeadersInReferToEnabled() {
        return sipHeadersInReferToEnabled;
    }

    /**
     * @return This configures the fallback plan when the transfer fails (destination unreachable, busy, or not human).
     * <p>Usage:</p>
     * <ul>
     * <li>Used only when <code>mode</code> is <code>warm-transfer-experimental</code>.</li>
     * <li>If not provided when using <code>warm-transfer-experimental</code>, a default message will be used.</li>
     * </ul>
     */
    @JsonProperty("fallbackPlan")
    public Optional<TransferFallbackPlan> getFallbackPlan() {
        return fallbackPlan;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TransferPlan && equalTo((TransferPlan) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TransferPlan other) {
        return mode.equals(other.mode)
                && message.equals(other.message)
                && sipVerb.equals(other.sipVerb)
                && holdAudioUrl.equals(other.holdAudioUrl)
                && twiml.equals(other.twiml)
                && summaryPlan.equals(other.summaryPlan)
                && sipHeadersInReferToEnabled.equals(other.sipHeadersInReferToEnabled)
                && fallbackPlan.equals(other.fallbackPlan);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.mode,
                this.message,
                this.sipVerb,
                this.holdAudioUrl,
                this.twiml,
                this.summaryPlan,
                this.sipHeadersInReferToEnabled,
                this.fallbackPlan);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ModeStage builder() {
        return new Builder();
    }

    public interface ModeStage {
        _FinalStage mode(@NotNull TransferPlanMode mode);

        Builder from(TransferPlan other);
    }

    public interface _FinalStage {
        TransferPlan build();

        _FinalStage message(Optional<TransferPlanMessage> message);

        _FinalStage message(TransferPlanMessage message);

        _FinalStage sipVerb(Optional<Map<String, Object>> sipVerb);

        _FinalStage sipVerb(Map<String, Object> sipVerb);

        _FinalStage holdAudioUrl(Optional<String> holdAudioUrl);

        _FinalStage holdAudioUrl(String holdAudioUrl);

        _FinalStage twiml(Optional<String> twiml);

        _FinalStage twiml(String twiml);

        _FinalStage summaryPlan(Optional<SummaryPlan> summaryPlan);

        _FinalStage summaryPlan(SummaryPlan summaryPlan);

        _FinalStage sipHeadersInReferToEnabled(Optional<Boolean> sipHeadersInReferToEnabled);

        _FinalStage sipHeadersInReferToEnabled(Boolean sipHeadersInReferToEnabled);

        _FinalStage fallbackPlan(Optional<TransferFallbackPlan> fallbackPlan);

        _FinalStage fallbackPlan(TransferFallbackPlan fallbackPlan);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ModeStage, _FinalStage {
        private TransferPlanMode mode;

        private Optional<TransferFallbackPlan> fallbackPlan = Optional.empty();

        private Optional<Boolean> sipHeadersInReferToEnabled = Optional.empty();

        private Optional<SummaryPlan> summaryPlan = Optional.empty();

        private Optional<String> twiml = Optional.empty();

        private Optional<String> holdAudioUrl = Optional.empty();

        private Optional<Map<String, Object>> sipVerb = Optional.empty();

        private Optional<TransferPlanMessage> message = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TransferPlan other) {
            mode(other.getMode());
            message(other.getMessage());
            sipVerb(other.getSipVerb());
            holdAudioUrl(other.getHoldAudioUrl());
            twiml(other.getTwiml());
            summaryPlan(other.getSummaryPlan());
            sipHeadersInReferToEnabled(other.getSipHeadersInReferToEnabled());
            fallbackPlan(other.getFallbackPlan());
            return this;
        }

        /**
         * <p>This configures how transfer is executed and the experience of the destination party receiving the call.</p>
         * <p>Usage:</p>
         * <ul>
         * <li><code>blind-transfer</code>: The assistant forwards the call to the destination without any message or summary.</li>
         * <li><code>blind-transfer-add-summary-to-sip-header</code>: The assistant forwards the call to the destination and adds a SIP header X-Transfer-Summary to the call to include the summary.</li>
         * <li><code>warm-transfer-say-message</code>: The assistant dials the destination, delivers the <code>message</code> to the destination party, connects the customer, and leaves the call.</li>
         * <li><code>warm-transfer-say-summary</code>: The assistant dials the destination, provides a summary of the call to the destination party, connects the customer, and leaves the call.</li>
         * <li><code>warm-transfer-wait-for-operator-to-speak-first-and-then-say-message</code>: The assistant dials the destination, waits for the operator to speak, delivers the <code>message</code> to the destination party, and then connects the customer.</li>
         * <li><code>warm-transfer-wait-for-operator-to-speak-first-and-then-say-summary</code>: The assistant dials the destination, waits for the operator to speak, provides a summary of the call to the destination party, and then connects the customer.</li>
         * <li><code>warm-transfer-twiml</code>: The assistant dials the destination, executes the twiml instructions on the destination call leg, connects the customer, and leaves the call.</li>
         * <li><code>warm-transfer-experimental</code>: The assistant puts the customer on hold, dials the destination, and if the destination answers (and is human), delivers a message or summary before connecting the customer. If the destination is unreachable or not human (e.g., with voicemail detection), the assistant delivers the <code>fallbackMessage</code> to the customer and optionally ends the call.</li>
         * </ul>
         * <p>@default 'blind-transfer'</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("mode")
        public _FinalStage mode(@NotNull TransferPlanMode mode) {
            this.mode = Objects.requireNonNull(mode, "mode must not be null");
            return this;
        }

        /**
         * <p>This configures the fallback plan when the transfer fails (destination unreachable, busy, or not human).</p>
         * <p>Usage:</p>
         * <ul>
         * <li>Used only when <code>mode</code> is <code>warm-transfer-experimental</code>.</li>
         * <li>If not provided when using <code>warm-transfer-experimental</code>, a default message will be used.</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage fallbackPlan(TransferFallbackPlan fallbackPlan) {
            this.fallbackPlan = Optional.ofNullable(fallbackPlan);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "fallbackPlan", nulls = Nulls.SKIP)
        public _FinalStage fallbackPlan(Optional<TransferFallbackPlan> fallbackPlan) {
            this.fallbackPlan = fallbackPlan;
            return this;
        }

        /**
         * <p>This flag includes the sipHeaders from above in the refer to sip uri as url encoded query params.</p>
         * <p>@default false</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage sipHeadersInReferToEnabled(Boolean sipHeadersInReferToEnabled) {
            this.sipHeadersInReferToEnabled = Optional.ofNullable(sipHeadersInReferToEnabled);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "sipHeadersInReferToEnabled", nulls = Nulls.SKIP)
        public _FinalStage sipHeadersInReferToEnabled(Optional<Boolean> sipHeadersInReferToEnabled) {
            this.sipHeadersInReferToEnabled = sipHeadersInReferToEnabled;
            return this;
        }

        /**
         * <p>This is the plan for generating a summary of the call to present to the destination party.</p>
         * <p>Usage:</p>
         * <ul>
         * <li>Used only when <code>mode</code> is <code>blind-transfer-add-summary-to-sip-header</code> or <code>warm-transfer-say-summary</code> or <code>warm-transfer-wait-for-operator-to-speak-first-and-then-say-summary</code> or <code>warm-transfer-experimental</code>.</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage summaryPlan(SummaryPlan summaryPlan) {
            this.summaryPlan = Optional.ofNullable(summaryPlan);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "summaryPlan", nulls = Nulls.SKIP)
        public _FinalStage summaryPlan(Optional<SummaryPlan> summaryPlan) {
            this.summaryPlan = summaryPlan;
            return this;
        }

        /**
         * <p>This is the TwiML instructions to execute on the destination call leg before connecting the customer.</p>
         * <p>Usage:</p>
         * <ul>
         * <li>Used only when <code>mode</code> is <code>warm-transfer-twiml</code>.</li>
         * <li>Supports only <code>Play</code>, <code>Say</code>, <code>Gather</code>, <code>Hangup</code> and <code>Pause</code> verbs.</li>
         * <li>Maximum length is 4096 characters.</li>
         * </ul>
         * <p>Example:</p>
         * <pre><code>&lt;Say voice=&quot;alice&quot; language=&quot;en-US&quot;&gt;Hello, transferring a customer to you.&lt;/Say&gt;
         * &lt;Pause length=&quot;2&quot;/&gt;
         * &lt;Say&gt;They called about billing questions.&lt;/Say&gt;
         * </code></pre>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage twiml(String twiml) {
            this.twiml = Optional.ofNullable(twiml);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "twiml", nulls = Nulls.SKIP)
        public _FinalStage twiml(Optional<String> twiml) {
            this.twiml = twiml;
            return this;
        }

        /**
         * <p>This is the URL to an audio file played while the customer is on hold during transfer.</p>
         * <p>Usage:</p>
         * <ul>
         * <li>Used only when <code>mode</code> is <code>warm-transfer-experimental</code>.</li>
         * <li>Used when transferring calls to play hold audio for the customer.</li>
         * <li>Must be a publicly accessible URL to an audio file.</li>
         * <li>Supported formats: MP3 and WAV.</li>
         * <li>If not provided, the default hold audio will be used.</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage holdAudioUrl(String holdAudioUrl) {
            this.holdAudioUrl = Optional.ofNullable(holdAudioUrl);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "holdAudioUrl", nulls = Nulls.SKIP)
        public _FinalStage holdAudioUrl(Optional<String> holdAudioUrl) {
            this.holdAudioUrl = holdAudioUrl;
            return this;
        }

        /**
         * <p>This specifies the SIP verb to use while transferring the call.</p>
         * <ul>
         * <li>'refer': Uses SIP REFER to transfer the call (default)</li>
         * <li>'bye': Ends current call with SIP BYE</li>
         * <li>'dial': Uses SIP DIAL to transfer the call</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage sipVerb(Map<String, Object> sipVerb) {
            this.sipVerb = Optional.ofNullable(sipVerb);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "sipVerb", nulls = Nulls.SKIP)
        public _FinalStage sipVerb(Optional<Map<String, Object>> sipVerb) {
            this.sipVerb = sipVerb;
            return this;
        }

        /**
         * <p>This is the message the assistant will deliver to the destination party before connecting the customer.</p>
         * <p>Usage:</p>
         * <ul>
         * <li>Used only when <code>mode</code> is <code>blind-transfer-add-summary-to-sip-header</code>, <code>warm-transfer-say-message</code>, <code>warm-transfer-wait-for-operator-to-speak-first-and-then-say-message</code>, or <code>warm-transfer-experimental</code>.</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage message(TransferPlanMessage message) {
            this.message = Optional.ofNullable(message);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "message", nulls = Nulls.SKIP)
        public _FinalStage message(Optional<TransferPlanMessage> message) {
            this.message = message;
            return this;
        }

        @java.lang.Override
        public TransferPlan build() {
            return new TransferPlan(
                    mode,
                    message,
                    sipVerb,
                    holdAudioUrl,
                    twiml,
                    summaryPlan,
                    sipHeadersInReferToEnabled,
                    fallbackPlan,
                    additionalProperties);
        }
    }
}
