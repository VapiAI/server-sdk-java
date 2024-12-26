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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = AssistantOverrides.Builder.class)
public final class AssistantOverrides {
    private final Optional<AssistantOverridesTranscriber> transcriber;

    private final Optional<AssistantOverridesModel> model;

    private final Optional<AssistantOverridesVoice> voice;

    private final Optional<String> firstMessage;

    private final Optional<AssistantOverridesFirstMessageMode> firstMessageMode;

    private final Optional<Boolean> hipaaEnabled;

    private final Optional<List<AssistantOverridesClientMessagesItem>> clientMessages;

    private final Optional<List<AssistantOverridesServerMessagesItem>> serverMessages;

    private final Optional<Double> silenceTimeoutSeconds;

    private final Optional<Double> maxDurationSeconds;

    private final Optional<AssistantOverridesBackgroundSound> backgroundSound;

    private final Optional<Boolean> backgroundDenoisingEnabled;

    private final Optional<Boolean> modelOutputInMessagesEnabled;

    private final Optional<List<TransportConfigurationTwilio>> transportConfigurations;

    private final Optional<Map<String, Object>> variableValues;

    private final Optional<String> name;

    private final Optional<TwilioVoicemailDetection> voicemailDetection;

    private final Optional<String> voicemailMessage;

    private final Optional<String> endCallMessage;

    private final Optional<List<String>> endCallPhrases;

    private final Optional<Map<String, Object>> metadata;

    private final Optional<AnalysisPlan> analysisPlan;

    private final Optional<ArtifactPlan> artifactPlan;

    private final Optional<MessagePlan> messagePlan;

    private final Optional<StartSpeakingPlan> startSpeakingPlan;

    private final Optional<StopSpeakingPlan> stopSpeakingPlan;

    private final Optional<MonitorPlan> monitorPlan;

    private final Optional<List<String>> credentialIds;

    private final Optional<Server> server;

    private final Map<String, Object> additionalProperties;

    private AssistantOverrides(
            Optional<AssistantOverridesTranscriber> transcriber,
            Optional<AssistantOverridesModel> model,
            Optional<AssistantOverridesVoice> voice,
            Optional<String> firstMessage,
            Optional<AssistantOverridesFirstMessageMode> firstMessageMode,
            Optional<Boolean> hipaaEnabled,
            Optional<List<AssistantOverridesClientMessagesItem>> clientMessages,
            Optional<List<AssistantOverridesServerMessagesItem>> serverMessages,
            Optional<Double> silenceTimeoutSeconds,
            Optional<Double> maxDurationSeconds,
            Optional<AssistantOverridesBackgroundSound> backgroundSound,
            Optional<Boolean> backgroundDenoisingEnabled,
            Optional<Boolean> modelOutputInMessagesEnabled,
            Optional<List<TransportConfigurationTwilio>> transportConfigurations,
            Optional<Map<String, Object>> variableValues,
            Optional<String> name,
            Optional<TwilioVoicemailDetection> voicemailDetection,
            Optional<String> voicemailMessage,
            Optional<String> endCallMessage,
            Optional<List<String>> endCallPhrases,
            Optional<Map<String, Object>> metadata,
            Optional<AnalysisPlan> analysisPlan,
            Optional<ArtifactPlan> artifactPlan,
            Optional<MessagePlan> messagePlan,
            Optional<StartSpeakingPlan> startSpeakingPlan,
            Optional<StopSpeakingPlan> stopSpeakingPlan,
            Optional<MonitorPlan> monitorPlan,
            Optional<List<String>> credentialIds,
            Optional<Server> server,
            Map<String, Object> additionalProperties) {
        this.transcriber = transcriber;
        this.model = model;
        this.voice = voice;
        this.firstMessage = firstMessage;
        this.firstMessageMode = firstMessageMode;
        this.hipaaEnabled = hipaaEnabled;
        this.clientMessages = clientMessages;
        this.serverMessages = serverMessages;
        this.silenceTimeoutSeconds = silenceTimeoutSeconds;
        this.maxDurationSeconds = maxDurationSeconds;
        this.backgroundSound = backgroundSound;
        this.backgroundDenoisingEnabled = backgroundDenoisingEnabled;
        this.modelOutputInMessagesEnabled = modelOutputInMessagesEnabled;
        this.transportConfigurations = transportConfigurations;
        this.variableValues = variableValues;
        this.name = name;
        this.voicemailDetection = voicemailDetection;
        this.voicemailMessage = voicemailMessage;
        this.endCallMessage = endCallMessage;
        this.endCallPhrases = endCallPhrases;
        this.metadata = metadata;
        this.analysisPlan = analysisPlan;
        this.artifactPlan = artifactPlan;
        this.messagePlan = messagePlan;
        this.startSpeakingPlan = startSpeakingPlan;
        this.stopSpeakingPlan = stopSpeakingPlan;
        this.monitorPlan = monitorPlan;
        this.credentialIds = credentialIds;
        this.server = server;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return These are the options for the assistant's transcriber.
     */
    @JsonProperty("transcriber")
    public Optional<AssistantOverridesTranscriber> getTranscriber() {
        return transcriber;
    }

    /**
     * @return These are the options for the assistant's LLM.
     */
    @JsonProperty("model")
    public Optional<AssistantOverridesModel> getModel() {
        return model;
    }

    /**
     * @return These are the options for the assistant's voice.
     */
    @JsonProperty("voice")
    public Optional<AssistantOverridesVoice> getVoice() {
        return voice;
    }

    /**
     * @return This is the first message that the assistant will say. This can also be a URL to a containerized audio file (mp3, wav, etc.).
     * <p>If unspecified, assistant will wait for user to speak and use the model to respond once they speak.</p>
     */
    @JsonProperty("firstMessage")
    public Optional<String> getFirstMessage() {
        return firstMessage;
    }

    /**
     * @return This is the mode for the first message. Default is 'assistant-speaks-first'.
     * <p>Use:</p>
     * <ul>
     * <li>'assistant-speaks-first' to have the assistant speak first.</li>
     * <li>'assistant-waits-for-user' to have the assistant wait for the user to speak first.</li>
     * <li>'assistant-speaks-first-with-model-generated-message' to have the assistant speak first with a message generated by the model based on the conversation state. (<code>assistant.model.messages</code> at call start, <code>call.messages</code> at squad transfer points).</li>
     * </ul>
     * <p>@default 'assistant-speaks-first'</p>
     */
    @JsonProperty("firstMessageMode")
    public Optional<AssistantOverridesFirstMessageMode> getFirstMessageMode() {
        return firstMessageMode;
    }

    /**
     * @return When this is enabled, no logs, recordings, or transcriptions will be stored. At the end of the call, you will still receive an end-of-call-report message to store on your server. Defaults to false.
     */
    @JsonProperty("hipaaEnabled")
    public Optional<Boolean> getHipaaEnabled() {
        return hipaaEnabled;
    }

    /**
     * @return These are the messages that will be sent to your Client SDKs. Default is conversation-update,function-call,hang,model-output,speech-update,status-update,transfer-update,transcript,tool-calls,user-interrupted,voice-input. You can check the shape of the messages in ClientMessage schema.
     */
    @JsonProperty("clientMessages")
    public Optional<List<AssistantOverridesClientMessagesItem>> getClientMessages() {
        return clientMessages;
    }

    /**
     * @return These are the messages that will be sent to your Server URL. Default is conversation-update,end-of-call-report,function-call,hang,speech-update,status-update,tool-calls,transfer-destination-request,user-interrupted. You can check the shape of the messages in ServerMessage schema.
     */
    @JsonProperty("serverMessages")
    public Optional<List<AssistantOverridesServerMessagesItem>> getServerMessages() {
        return serverMessages;
    }

    /**
     * @return How many seconds of silence to wait before ending the call. Defaults to 30.
     * <p>@default 30</p>
     */
    @JsonProperty("silenceTimeoutSeconds")
    public Optional<Double> getSilenceTimeoutSeconds() {
        return silenceTimeoutSeconds;
    }

    /**
     * @return This is the maximum number of seconds that the call will last. When the call reaches this duration, it will be ended.
     * <p>@default 600 (10 minutes)</p>
     */
    @JsonProperty("maxDurationSeconds")
    public Optional<Double> getMaxDurationSeconds() {
        return maxDurationSeconds;
    }

    /**
     * @return This is the background sound in the call. Default for phone calls is 'office' and default for web calls is 'off'.
     */
    @JsonProperty("backgroundSound")
    public Optional<AssistantOverridesBackgroundSound> getBackgroundSound() {
        return backgroundSound;
    }

    /**
     * @return This enables filtering of noise and background speech while the user is talking.
     * <p>Default <code>false</code> while in beta.</p>
     * <p>@default false</p>
     */
    @JsonProperty("backgroundDenoisingEnabled")
    public Optional<Boolean> getBackgroundDenoisingEnabled() {
        return backgroundDenoisingEnabled;
    }

    /**
     * @return This determines whether the model's output is used in conversation history rather than the transcription of assistant's speech.
     * <p>Default <code>false</code> while in beta.</p>
     * <p>@default false</p>
     */
    @JsonProperty("modelOutputInMessagesEnabled")
    public Optional<Boolean> getModelOutputInMessagesEnabled() {
        return modelOutputInMessagesEnabled;
    }

    /**
     * @return These are the configurations to be passed to the transport providers of assistant's calls, like Twilio. You can store multiple configurations for different transport providers. For a call, only the configuration matching the call transport provider is used.
     */
    @JsonProperty("transportConfigurations")
    public Optional<List<TransportConfigurationTwilio>> getTransportConfigurations() {
        return transportConfigurations;
    }

    /**
     * @return These are values that will be used to replace the template variables in the assistant messages and other text-based fields.
     * This uses LiquidJS syntax. https://liquidjs.com/tutorials/intro-to-liquid.html
     * <p>So for example, <code>{{ name }}</code> will be replaced with the value of <code>name</code> in <code>variableValues</code>.
     * <code>{{&quot;now&quot; | date: &quot;%b %d, %Y, %I:%M %p&quot;, &quot;America/New_York&quot;}}</code> will be replaced with the current date and time in New York.
     * Some VAPI reserved defaults:</p>
     * <ul>
     * <li><em>customer</em> - the customer object</li>
     * </ul>
     */
    @JsonProperty("variableValues")
    public Optional<Map<String, Object>> getVariableValues() {
        return variableValues;
    }

    /**
     * @return This is the name of the assistant.
     * <p>This is required when you want to transfer between assistants in a call.</p>
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return These are the settings to configure or disable voicemail detection. Alternatively, voicemail detection can be configured using the model.tools=[VoicemailTool].
     * This uses Twilio's built-in detection while the VoicemailTool relies on the model to detect if a voicemail was reached.
     * You can use neither of them, one of them, or both of them. By default, Twilio built-in detection is enabled while VoicemailTool is not.
     */
    @JsonProperty("voicemailDetection")
    public Optional<TwilioVoicemailDetection> getVoicemailDetection() {
        return voicemailDetection;
    }

    /**
     * @return This is the message that the assistant will say if the call is forwarded to voicemail.
     * <p>If unspecified, it will hang up.</p>
     */
    @JsonProperty("voicemailMessage")
    public Optional<String> getVoicemailMessage() {
        return voicemailMessage;
    }

    /**
     * @return This is the message that the assistant will say if it ends the call.
     * <p>If unspecified, it will hang up without saying anything.</p>
     */
    @JsonProperty("endCallMessage")
    public Optional<String> getEndCallMessage() {
        return endCallMessage;
    }

    /**
     * @return This list contains phrases that, if spoken by the assistant, will trigger the call to be hung up. Case insensitive.
     */
    @JsonProperty("endCallPhrases")
    public Optional<List<String>> getEndCallPhrases() {
        return endCallPhrases;
    }

    /**
     * @return This is for metadata you want to store on the assistant.
     */
    @JsonProperty("metadata")
    public Optional<Map<String, Object>> getMetadata() {
        return metadata;
    }

    /**
     * @return This is the plan for analysis of assistant's calls. Stored in <code>call.analysis</code>.
     */
    @JsonProperty("analysisPlan")
    public Optional<AnalysisPlan> getAnalysisPlan() {
        return analysisPlan;
    }

    /**
     * @return This is the plan for artifacts generated during assistant's calls. Stored in <code>call.artifact</code>.
     * <p>Note: <code>recordingEnabled</code> is currently at the root level. It will be moved to <code>artifactPlan</code> in the future, but will remain backwards compatible.</p>
     */
    @JsonProperty("artifactPlan")
    public Optional<ArtifactPlan> getArtifactPlan() {
        return artifactPlan;
    }

    /**
     * @return This is the plan for static predefined messages that can be spoken by the assistant during the call, like <code>idleMessages</code>.
     * <p>Note: <code>firstMessage</code>, <code>voicemailMessage</code>, and <code>endCallMessage</code> are currently at the root level. They will be moved to <code>messagePlan</code> in the future, but will remain backwards compatible.</p>
     */
    @JsonProperty("messagePlan")
    public Optional<MessagePlan> getMessagePlan() {
        return messagePlan;
    }

    /**
     * @return This is the plan for when the assistant should start talking.
     * <p>You should configure this if you're running into these issues:</p>
     * <ul>
     * <li>The assistant is too slow to start talking after the customer is done speaking.</li>
     * <li>The assistant is too fast to start talking after the customer is done speaking.</li>
     * <li>The assistant is so fast that it's actually interrupting the customer.</li>
     * </ul>
     */
    @JsonProperty("startSpeakingPlan")
    public Optional<StartSpeakingPlan> getStartSpeakingPlan() {
        return startSpeakingPlan;
    }

    /**
     * @return This is the plan for when assistant should stop talking on customer interruption.
     * <p>You should configure this if you're running into these issues:</p>
     * <ul>
     * <li>The assistant is too slow to recognize customer's interruption.</li>
     * <li>The assistant is too fast to recognize customer's interruption.</li>
     * <li>The assistant is getting interrupted by phrases that are just acknowledgments.</li>
     * <li>The assistant is getting interrupted by background noises.</li>
     * <li>The assistant is not properly stopping -- it starts talking right after getting interrupted.</li>
     * </ul>
     */
    @JsonProperty("stopSpeakingPlan")
    public Optional<StopSpeakingPlan> getStopSpeakingPlan() {
        return stopSpeakingPlan;
    }

    /**
     * @return This is the plan for real-time monitoring of the assistant's calls.
     * <p>Usage:</p>
     * <ul>
     * <li>To enable live listening of the assistant's calls, set <code>monitorPlan.listenEnabled</code> to <code>true</code>.</li>
     * <li>To enable live control of the assistant's calls, set <code>monitorPlan.controlEnabled</code> to <code>true</code>.</li>
     * </ul>
     * <p>Note, <code>serverMessages</code>, <code>clientMessages</code>, <code>serverUrl</code> and <code>serverUrlSecret</code> are currently at the root level but will be moved to <code>monitorPlan</code> in the future. Will remain backwards compatible</p>
     */
    @JsonProperty("monitorPlan")
    public Optional<MonitorPlan> getMonitorPlan() {
        return monitorPlan;
    }

    /**
     * @return These are the credentials that will be used for the assistant calls. By default, all the credentials are available for use in the call but you can provide a subset using this.
     */
    @JsonProperty("credentialIds")
    public Optional<List<String>> getCredentialIds() {
        return credentialIds;
    }

    /**
     * @return This is where Vapi will send webhooks. You can find all webhooks available along with their shape in ServerMessage schema.
     * <p>The order of precedence is:</p>
     * <ol>
     * <li>assistant.server.url</li>
     * <li>phoneNumber.serverUrl</li>
     * <li>org.serverUrl</li>
     * </ol>
     */
    @JsonProperty("server")
    public Optional<Server> getServer() {
        return server;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AssistantOverrides && equalTo((AssistantOverrides) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AssistantOverrides other) {
        return transcriber.equals(other.transcriber)
                && model.equals(other.model)
                && voice.equals(other.voice)
                && firstMessage.equals(other.firstMessage)
                && firstMessageMode.equals(other.firstMessageMode)
                && hipaaEnabled.equals(other.hipaaEnabled)
                && clientMessages.equals(other.clientMessages)
                && serverMessages.equals(other.serverMessages)
                && silenceTimeoutSeconds.equals(other.silenceTimeoutSeconds)
                && maxDurationSeconds.equals(other.maxDurationSeconds)
                && backgroundSound.equals(other.backgroundSound)
                && backgroundDenoisingEnabled.equals(other.backgroundDenoisingEnabled)
                && modelOutputInMessagesEnabled.equals(other.modelOutputInMessagesEnabled)
                && transportConfigurations.equals(other.transportConfigurations)
                && variableValues.equals(other.variableValues)
                && name.equals(other.name)
                && voicemailDetection.equals(other.voicemailDetection)
                && voicemailMessage.equals(other.voicemailMessage)
                && endCallMessage.equals(other.endCallMessage)
                && endCallPhrases.equals(other.endCallPhrases)
                && metadata.equals(other.metadata)
                && analysisPlan.equals(other.analysisPlan)
                && artifactPlan.equals(other.artifactPlan)
                && messagePlan.equals(other.messagePlan)
                && startSpeakingPlan.equals(other.startSpeakingPlan)
                && stopSpeakingPlan.equals(other.stopSpeakingPlan)
                && monitorPlan.equals(other.monitorPlan)
                && credentialIds.equals(other.credentialIds)
                && server.equals(other.server);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.transcriber,
                this.model,
                this.voice,
                this.firstMessage,
                this.firstMessageMode,
                this.hipaaEnabled,
                this.clientMessages,
                this.serverMessages,
                this.silenceTimeoutSeconds,
                this.maxDurationSeconds,
                this.backgroundSound,
                this.backgroundDenoisingEnabled,
                this.modelOutputInMessagesEnabled,
                this.transportConfigurations,
                this.variableValues,
                this.name,
                this.voicemailDetection,
                this.voicemailMessage,
                this.endCallMessage,
                this.endCallPhrases,
                this.metadata,
                this.analysisPlan,
                this.artifactPlan,
                this.messagePlan,
                this.startSpeakingPlan,
                this.stopSpeakingPlan,
                this.monitorPlan,
                this.credentialIds,
                this.server);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<AssistantOverridesTranscriber> transcriber = Optional.empty();

        private Optional<AssistantOverridesModel> model = Optional.empty();

        private Optional<AssistantOverridesVoice> voice = Optional.empty();

        private Optional<String> firstMessage = Optional.empty();

        private Optional<AssistantOverridesFirstMessageMode> firstMessageMode = Optional.empty();

        private Optional<Boolean> hipaaEnabled = Optional.empty();

        private Optional<List<AssistantOverridesClientMessagesItem>> clientMessages = Optional.empty();

        private Optional<List<AssistantOverridesServerMessagesItem>> serverMessages = Optional.empty();

        private Optional<Double> silenceTimeoutSeconds = Optional.empty();

        private Optional<Double> maxDurationSeconds = Optional.empty();

        private Optional<AssistantOverridesBackgroundSound> backgroundSound = Optional.empty();

        private Optional<Boolean> backgroundDenoisingEnabled = Optional.empty();

        private Optional<Boolean> modelOutputInMessagesEnabled = Optional.empty();

        private Optional<List<TransportConfigurationTwilio>> transportConfigurations = Optional.empty();

        private Optional<Map<String, Object>> variableValues = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<TwilioVoicemailDetection> voicemailDetection = Optional.empty();

        private Optional<String> voicemailMessage = Optional.empty();

        private Optional<String> endCallMessage = Optional.empty();

        private Optional<List<String>> endCallPhrases = Optional.empty();

        private Optional<Map<String, Object>> metadata = Optional.empty();

        private Optional<AnalysisPlan> analysisPlan = Optional.empty();

        private Optional<ArtifactPlan> artifactPlan = Optional.empty();

        private Optional<MessagePlan> messagePlan = Optional.empty();

        private Optional<StartSpeakingPlan> startSpeakingPlan = Optional.empty();

        private Optional<StopSpeakingPlan> stopSpeakingPlan = Optional.empty();

        private Optional<MonitorPlan> monitorPlan = Optional.empty();

        private Optional<List<String>> credentialIds = Optional.empty();

        private Optional<Server> server = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(AssistantOverrides other) {
            transcriber(other.getTranscriber());
            model(other.getModel());
            voice(other.getVoice());
            firstMessage(other.getFirstMessage());
            firstMessageMode(other.getFirstMessageMode());
            hipaaEnabled(other.getHipaaEnabled());
            clientMessages(other.getClientMessages());
            serverMessages(other.getServerMessages());
            silenceTimeoutSeconds(other.getSilenceTimeoutSeconds());
            maxDurationSeconds(other.getMaxDurationSeconds());
            backgroundSound(other.getBackgroundSound());
            backgroundDenoisingEnabled(other.getBackgroundDenoisingEnabled());
            modelOutputInMessagesEnabled(other.getModelOutputInMessagesEnabled());
            transportConfigurations(other.getTransportConfigurations());
            variableValues(other.getVariableValues());
            name(other.getName());
            voicemailDetection(other.getVoicemailDetection());
            voicemailMessage(other.getVoicemailMessage());
            endCallMessage(other.getEndCallMessage());
            endCallPhrases(other.getEndCallPhrases());
            metadata(other.getMetadata());
            analysisPlan(other.getAnalysisPlan());
            artifactPlan(other.getArtifactPlan());
            messagePlan(other.getMessagePlan());
            startSpeakingPlan(other.getStartSpeakingPlan());
            stopSpeakingPlan(other.getStopSpeakingPlan());
            monitorPlan(other.getMonitorPlan());
            credentialIds(other.getCredentialIds());
            server(other.getServer());
            return this;
        }

        @JsonSetter(value = "transcriber", nulls = Nulls.SKIP)
        public Builder transcriber(Optional<AssistantOverridesTranscriber> transcriber) {
            this.transcriber = transcriber;
            return this;
        }

        public Builder transcriber(AssistantOverridesTranscriber transcriber) {
            this.transcriber = Optional.ofNullable(transcriber);
            return this;
        }

        @JsonSetter(value = "model", nulls = Nulls.SKIP)
        public Builder model(Optional<AssistantOverridesModel> model) {
            this.model = model;
            return this;
        }

        public Builder model(AssistantOverridesModel model) {
            this.model = Optional.ofNullable(model);
            return this;
        }

        @JsonSetter(value = "voice", nulls = Nulls.SKIP)
        public Builder voice(Optional<AssistantOverridesVoice> voice) {
            this.voice = voice;
            return this;
        }

        public Builder voice(AssistantOverridesVoice voice) {
            this.voice = Optional.ofNullable(voice);
            return this;
        }

        @JsonSetter(value = "firstMessage", nulls = Nulls.SKIP)
        public Builder firstMessage(Optional<String> firstMessage) {
            this.firstMessage = firstMessage;
            return this;
        }

        public Builder firstMessage(String firstMessage) {
            this.firstMessage = Optional.ofNullable(firstMessage);
            return this;
        }

        @JsonSetter(value = "firstMessageMode", nulls = Nulls.SKIP)
        public Builder firstMessageMode(Optional<AssistantOverridesFirstMessageMode> firstMessageMode) {
            this.firstMessageMode = firstMessageMode;
            return this;
        }

        public Builder firstMessageMode(AssistantOverridesFirstMessageMode firstMessageMode) {
            this.firstMessageMode = Optional.ofNullable(firstMessageMode);
            return this;
        }

        @JsonSetter(value = "hipaaEnabled", nulls = Nulls.SKIP)
        public Builder hipaaEnabled(Optional<Boolean> hipaaEnabled) {
            this.hipaaEnabled = hipaaEnabled;
            return this;
        }

        public Builder hipaaEnabled(Boolean hipaaEnabled) {
            this.hipaaEnabled = Optional.ofNullable(hipaaEnabled);
            return this;
        }

        @JsonSetter(value = "clientMessages", nulls = Nulls.SKIP)
        public Builder clientMessages(Optional<List<AssistantOverridesClientMessagesItem>> clientMessages) {
            this.clientMessages = clientMessages;
            return this;
        }

        public Builder clientMessages(List<AssistantOverridesClientMessagesItem> clientMessages) {
            this.clientMessages = Optional.ofNullable(clientMessages);
            return this;
        }

        @JsonSetter(value = "serverMessages", nulls = Nulls.SKIP)
        public Builder serverMessages(Optional<List<AssistantOverridesServerMessagesItem>> serverMessages) {
            this.serverMessages = serverMessages;
            return this;
        }

        public Builder serverMessages(List<AssistantOverridesServerMessagesItem> serverMessages) {
            this.serverMessages = Optional.ofNullable(serverMessages);
            return this;
        }

        @JsonSetter(value = "silenceTimeoutSeconds", nulls = Nulls.SKIP)
        public Builder silenceTimeoutSeconds(Optional<Double> silenceTimeoutSeconds) {
            this.silenceTimeoutSeconds = silenceTimeoutSeconds;
            return this;
        }

        public Builder silenceTimeoutSeconds(Double silenceTimeoutSeconds) {
            this.silenceTimeoutSeconds = Optional.ofNullable(silenceTimeoutSeconds);
            return this;
        }

        @JsonSetter(value = "maxDurationSeconds", nulls = Nulls.SKIP)
        public Builder maxDurationSeconds(Optional<Double> maxDurationSeconds) {
            this.maxDurationSeconds = maxDurationSeconds;
            return this;
        }

        public Builder maxDurationSeconds(Double maxDurationSeconds) {
            this.maxDurationSeconds = Optional.ofNullable(maxDurationSeconds);
            return this;
        }

        @JsonSetter(value = "backgroundSound", nulls = Nulls.SKIP)
        public Builder backgroundSound(Optional<AssistantOverridesBackgroundSound> backgroundSound) {
            this.backgroundSound = backgroundSound;
            return this;
        }

        public Builder backgroundSound(AssistantOverridesBackgroundSound backgroundSound) {
            this.backgroundSound = Optional.ofNullable(backgroundSound);
            return this;
        }

        @JsonSetter(value = "backgroundDenoisingEnabled", nulls = Nulls.SKIP)
        public Builder backgroundDenoisingEnabled(Optional<Boolean> backgroundDenoisingEnabled) {
            this.backgroundDenoisingEnabled = backgroundDenoisingEnabled;
            return this;
        }

        public Builder backgroundDenoisingEnabled(Boolean backgroundDenoisingEnabled) {
            this.backgroundDenoisingEnabled = Optional.ofNullable(backgroundDenoisingEnabled);
            return this;
        }

        @JsonSetter(value = "modelOutputInMessagesEnabled", nulls = Nulls.SKIP)
        public Builder modelOutputInMessagesEnabled(Optional<Boolean> modelOutputInMessagesEnabled) {
            this.modelOutputInMessagesEnabled = modelOutputInMessagesEnabled;
            return this;
        }

        public Builder modelOutputInMessagesEnabled(Boolean modelOutputInMessagesEnabled) {
            this.modelOutputInMessagesEnabled = Optional.ofNullable(modelOutputInMessagesEnabled);
            return this;
        }

        @JsonSetter(value = "transportConfigurations", nulls = Nulls.SKIP)
        public Builder transportConfigurations(Optional<List<TransportConfigurationTwilio>> transportConfigurations) {
            this.transportConfigurations = transportConfigurations;
            return this;
        }

        public Builder transportConfigurations(List<TransportConfigurationTwilio> transportConfigurations) {
            this.transportConfigurations = Optional.ofNullable(transportConfigurations);
            return this;
        }

        @JsonSetter(value = "variableValues", nulls = Nulls.SKIP)
        public Builder variableValues(Optional<Map<String, Object>> variableValues) {
            this.variableValues = variableValues;
            return this;
        }

        public Builder variableValues(Map<String, Object> variableValues) {
            this.variableValues = Optional.ofNullable(variableValues);
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @JsonSetter(value = "voicemailDetection", nulls = Nulls.SKIP)
        public Builder voicemailDetection(Optional<TwilioVoicemailDetection> voicemailDetection) {
            this.voicemailDetection = voicemailDetection;
            return this;
        }

        public Builder voicemailDetection(TwilioVoicemailDetection voicemailDetection) {
            this.voicemailDetection = Optional.ofNullable(voicemailDetection);
            return this;
        }

        @JsonSetter(value = "voicemailMessage", nulls = Nulls.SKIP)
        public Builder voicemailMessage(Optional<String> voicemailMessage) {
            this.voicemailMessage = voicemailMessage;
            return this;
        }

        public Builder voicemailMessage(String voicemailMessage) {
            this.voicemailMessage = Optional.ofNullable(voicemailMessage);
            return this;
        }

        @JsonSetter(value = "endCallMessage", nulls = Nulls.SKIP)
        public Builder endCallMessage(Optional<String> endCallMessage) {
            this.endCallMessage = endCallMessage;
            return this;
        }

        public Builder endCallMessage(String endCallMessage) {
            this.endCallMessage = Optional.ofNullable(endCallMessage);
            return this;
        }

        @JsonSetter(value = "endCallPhrases", nulls = Nulls.SKIP)
        public Builder endCallPhrases(Optional<List<String>> endCallPhrases) {
            this.endCallPhrases = endCallPhrases;
            return this;
        }

        public Builder endCallPhrases(List<String> endCallPhrases) {
            this.endCallPhrases = Optional.ofNullable(endCallPhrases);
            return this;
        }

        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public Builder metadata(Optional<Map<String, Object>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(Map<String, Object> metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        @JsonSetter(value = "analysisPlan", nulls = Nulls.SKIP)
        public Builder analysisPlan(Optional<AnalysisPlan> analysisPlan) {
            this.analysisPlan = analysisPlan;
            return this;
        }

        public Builder analysisPlan(AnalysisPlan analysisPlan) {
            this.analysisPlan = Optional.ofNullable(analysisPlan);
            return this;
        }

        @JsonSetter(value = "artifactPlan", nulls = Nulls.SKIP)
        public Builder artifactPlan(Optional<ArtifactPlan> artifactPlan) {
            this.artifactPlan = artifactPlan;
            return this;
        }

        public Builder artifactPlan(ArtifactPlan artifactPlan) {
            this.artifactPlan = Optional.ofNullable(artifactPlan);
            return this;
        }

        @JsonSetter(value = "messagePlan", nulls = Nulls.SKIP)
        public Builder messagePlan(Optional<MessagePlan> messagePlan) {
            this.messagePlan = messagePlan;
            return this;
        }

        public Builder messagePlan(MessagePlan messagePlan) {
            this.messagePlan = Optional.ofNullable(messagePlan);
            return this;
        }

        @JsonSetter(value = "startSpeakingPlan", nulls = Nulls.SKIP)
        public Builder startSpeakingPlan(Optional<StartSpeakingPlan> startSpeakingPlan) {
            this.startSpeakingPlan = startSpeakingPlan;
            return this;
        }

        public Builder startSpeakingPlan(StartSpeakingPlan startSpeakingPlan) {
            this.startSpeakingPlan = Optional.ofNullable(startSpeakingPlan);
            return this;
        }

        @JsonSetter(value = "stopSpeakingPlan", nulls = Nulls.SKIP)
        public Builder stopSpeakingPlan(Optional<StopSpeakingPlan> stopSpeakingPlan) {
            this.stopSpeakingPlan = stopSpeakingPlan;
            return this;
        }

        public Builder stopSpeakingPlan(StopSpeakingPlan stopSpeakingPlan) {
            this.stopSpeakingPlan = Optional.ofNullable(stopSpeakingPlan);
            return this;
        }

        @JsonSetter(value = "monitorPlan", nulls = Nulls.SKIP)
        public Builder monitorPlan(Optional<MonitorPlan> monitorPlan) {
            this.monitorPlan = monitorPlan;
            return this;
        }

        public Builder monitorPlan(MonitorPlan monitorPlan) {
            this.monitorPlan = Optional.ofNullable(monitorPlan);
            return this;
        }

        @JsonSetter(value = "credentialIds", nulls = Nulls.SKIP)
        public Builder credentialIds(Optional<List<String>> credentialIds) {
            this.credentialIds = credentialIds;
            return this;
        }

        public Builder credentialIds(List<String> credentialIds) {
            this.credentialIds = Optional.ofNullable(credentialIds);
            return this;
        }

        @JsonSetter(value = "server", nulls = Nulls.SKIP)
        public Builder server(Optional<Server> server) {
            this.server = server;
            return this;
        }

        public Builder server(Server server) {
            this.server = Optional.ofNullable(server);
            return this;
        }

        public AssistantOverrides build() {
            return new AssistantOverrides(
                    transcriber,
                    model,
                    voice,
                    firstMessage,
                    firstMessageMode,
                    hipaaEnabled,
                    clientMessages,
                    serverMessages,
                    silenceTimeoutSeconds,
                    maxDurationSeconds,
                    backgroundSound,
                    backgroundDenoisingEnabled,
                    modelOutputInMessagesEnabled,
                    transportConfigurations,
                    variableValues,
                    name,
                    voicemailDetection,
                    voicemailMessage,
                    endCallMessage,
                    endCallPhrases,
                    metadata,
                    analysisPlan,
                    artifactPlan,
                    messagePlan,
                    startSpeakingPlan,
                    stopSpeakingPlan,
                    monitorPlan,
                    credentialIds,
                    server,
                    additionalProperties);
        }
    }
}
