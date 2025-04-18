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

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = TavusConversationProperties.Builder.class)
public final class TavusConversationProperties {
    private final Optional<Double> maxCallDuration;

    private final Optional<Double> participantLeftTimeout;

    private final Optional<Double> participantAbsentTimeout;

    private final Optional<Boolean> enableRecording;

    private final Optional<Boolean> enableTranscription;

    private final Optional<Boolean> applyGreenscreen;

    private final Optional<String> language;

    private final Optional<String> recordingS3BucketName;

    private final Optional<String> recordingS3BucketRegion;

    private final Optional<String> awsAssumeRoleArn;

    private final Map<String, Object> additionalProperties;

    private TavusConversationProperties(
            Optional<Double> maxCallDuration,
            Optional<Double> participantLeftTimeout,
            Optional<Double> participantAbsentTimeout,
            Optional<Boolean> enableRecording,
            Optional<Boolean> enableTranscription,
            Optional<Boolean> applyGreenscreen,
            Optional<String> language,
            Optional<String> recordingS3BucketName,
            Optional<String> recordingS3BucketRegion,
            Optional<String> awsAssumeRoleArn,
            Map<String, Object> additionalProperties) {
        this.maxCallDuration = maxCallDuration;
        this.participantLeftTimeout = participantLeftTimeout;
        this.participantAbsentTimeout = participantAbsentTimeout;
        this.enableRecording = enableRecording;
        this.enableTranscription = enableTranscription;
        this.applyGreenscreen = applyGreenscreen;
        this.language = language;
        this.recordingS3BucketName = recordingS3BucketName;
        this.recordingS3BucketRegion = recordingS3BucketRegion;
        this.awsAssumeRoleArn = awsAssumeRoleArn;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The maximum duration of the call in seconds. The default <code>maxCallDuration</code> is 3600 seconds (1 hour).
     * Once the time limit specified by this parameter has been reached, the conversation will automatically shut down.
     */
    @JsonProperty("maxCallDuration")
    public Optional<Double> getMaxCallDuration() {
        return maxCallDuration;
    }

    /**
     * @return The duration in seconds after which the call will be automatically shut down once the last participant leaves.
     */
    @JsonProperty("participantLeftTimeout")
    public Optional<Double> getParticipantLeftTimeout() {
        return participantLeftTimeout;
    }

    /**
     * @return Starting from conversation creation, the duration in seconds after which the call will be automatically shut down if no participant joins the call.
     * Default is 300 seconds (5 minutes).
     */
    @JsonProperty("participantAbsentTimeout")
    public Optional<Double> getParticipantAbsentTimeout() {
        return participantAbsentTimeout;
    }

    /**
     * @return If true, the user will be able to record the conversation.
     */
    @JsonProperty("enableRecording")
    public Optional<Boolean> getEnableRecording() {
        return enableRecording;
    }

    /**
     * @return If true, the user will be able to transcribe the conversation.
     * You can find more instructions on displaying transcriptions if you are using your custom DailyJS components here.
     * You need to have an event listener on Daily that listens for <code>app-messages</code>.
     */
    @JsonProperty("enableTranscription")
    public Optional<Boolean> getEnableTranscription() {
        return enableTranscription;
    }

    /**
     * @return If true, the background will be replaced with a greenscreen (RGB values: <code>[0, 255, 155]</code>).
     * You can use WebGL on the frontend to make the greenscreen transparent or change its color.
     */
    @JsonProperty("applyGreenscreen")
    public Optional<Boolean> getApplyGreenscreen() {
        return applyGreenscreen;
    }

    /**
     * @return The language of the conversation. Please provide the <strong>full language name</strong>, not the two-letter code.
     * If you are using your own TTS voice, please ensure it supports the language you provide.
     * If you are using a stock replica or default persona, please note that only ElevenLabs and Cartesia supported languages are available.
     * You can find a full list of supported languages for Cartesia here, for ElevenLabs here, and for PlayHT here.
     */
    @JsonProperty("language")
    public Optional<String> getLanguage() {
        return language;
    }

    /**
     * @return The name of the S3 bucket where the recording will be stored.
     */
    @JsonProperty("recordingS3BucketName")
    public Optional<String> getRecordingS3BucketName() {
        return recordingS3BucketName;
    }

    /**
     * @return The region of the S3 bucket where the recording will be stored.
     */
    @JsonProperty("recordingS3BucketRegion")
    public Optional<String> getRecordingS3BucketRegion() {
        return recordingS3BucketRegion;
    }

    /**
     * @return The ARN of the role that will be assumed to access the S3 bucket.
     */
    @JsonProperty("awsAssumeRoleArn")
    public Optional<String> getAwsAssumeRoleArn() {
        return awsAssumeRoleArn;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TavusConversationProperties && equalTo((TavusConversationProperties) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TavusConversationProperties other) {
        return maxCallDuration.equals(other.maxCallDuration)
                && participantLeftTimeout.equals(other.participantLeftTimeout)
                && participantAbsentTimeout.equals(other.participantAbsentTimeout)
                && enableRecording.equals(other.enableRecording)
                && enableTranscription.equals(other.enableTranscription)
                && applyGreenscreen.equals(other.applyGreenscreen)
                && language.equals(other.language)
                && recordingS3BucketName.equals(other.recordingS3BucketName)
                && recordingS3BucketRegion.equals(other.recordingS3BucketRegion)
                && awsAssumeRoleArn.equals(other.awsAssumeRoleArn);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.maxCallDuration,
                this.participantLeftTimeout,
                this.participantAbsentTimeout,
                this.enableRecording,
                this.enableTranscription,
                this.applyGreenscreen,
                this.language,
                this.recordingS3BucketName,
                this.recordingS3BucketRegion,
                this.awsAssumeRoleArn);
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
        private Optional<Double> maxCallDuration = Optional.empty();

        private Optional<Double> participantLeftTimeout = Optional.empty();

        private Optional<Double> participantAbsentTimeout = Optional.empty();

        private Optional<Boolean> enableRecording = Optional.empty();

        private Optional<Boolean> enableTranscription = Optional.empty();

        private Optional<Boolean> applyGreenscreen = Optional.empty();

        private Optional<String> language = Optional.empty();

        private Optional<String> recordingS3BucketName = Optional.empty();

        private Optional<String> recordingS3BucketRegion = Optional.empty();

        private Optional<String> awsAssumeRoleArn = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TavusConversationProperties other) {
            maxCallDuration(other.getMaxCallDuration());
            participantLeftTimeout(other.getParticipantLeftTimeout());
            participantAbsentTimeout(other.getParticipantAbsentTimeout());
            enableRecording(other.getEnableRecording());
            enableTranscription(other.getEnableTranscription());
            applyGreenscreen(other.getApplyGreenscreen());
            language(other.getLanguage());
            recordingS3BucketName(other.getRecordingS3BucketName());
            recordingS3BucketRegion(other.getRecordingS3BucketRegion());
            awsAssumeRoleArn(other.getAwsAssumeRoleArn());
            return this;
        }

        @JsonSetter(value = "maxCallDuration", nulls = Nulls.SKIP)
        public Builder maxCallDuration(Optional<Double> maxCallDuration) {
            this.maxCallDuration = maxCallDuration;
            return this;
        }

        public Builder maxCallDuration(Double maxCallDuration) {
            this.maxCallDuration = Optional.ofNullable(maxCallDuration);
            return this;
        }

        @JsonSetter(value = "participantLeftTimeout", nulls = Nulls.SKIP)
        public Builder participantLeftTimeout(Optional<Double> participantLeftTimeout) {
            this.participantLeftTimeout = participantLeftTimeout;
            return this;
        }

        public Builder participantLeftTimeout(Double participantLeftTimeout) {
            this.participantLeftTimeout = Optional.ofNullable(participantLeftTimeout);
            return this;
        }

        @JsonSetter(value = "participantAbsentTimeout", nulls = Nulls.SKIP)
        public Builder participantAbsentTimeout(Optional<Double> participantAbsentTimeout) {
            this.participantAbsentTimeout = participantAbsentTimeout;
            return this;
        }

        public Builder participantAbsentTimeout(Double participantAbsentTimeout) {
            this.participantAbsentTimeout = Optional.ofNullable(participantAbsentTimeout);
            return this;
        }

        @JsonSetter(value = "enableRecording", nulls = Nulls.SKIP)
        public Builder enableRecording(Optional<Boolean> enableRecording) {
            this.enableRecording = enableRecording;
            return this;
        }

        public Builder enableRecording(Boolean enableRecording) {
            this.enableRecording = Optional.ofNullable(enableRecording);
            return this;
        }

        @JsonSetter(value = "enableTranscription", nulls = Nulls.SKIP)
        public Builder enableTranscription(Optional<Boolean> enableTranscription) {
            this.enableTranscription = enableTranscription;
            return this;
        }

        public Builder enableTranscription(Boolean enableTranscription) {
            this.enableTranscription = Optional.ofNullable(enableTranscription);
            return this;
        }

        @JsonSetter(value = "applyGreenscreen", nulls = Nulls.SKIP)
        public Builder applyGreenscreen(Optional<Boolean> applyGreenscreen) {
            this.applyGreenscreen = applyGreenscreen;
            return this;
        }

        public Builder applyGreenscreen(Boolean applyGreenscreen) {
            this.applyGreenscreen = Optional.ofNullable(applyGreenscreen);
            return this;
        }

        @JsonSetter(value = "language", nulls = Nulls.SKIP)
        public Builder language(Optional<String> language) {
            this.language = language;
            return this;
        }

        public Builder language(String language) {
            this.language = Optional.ofNullable(language);
            return this;
        }

        @JsonSetter(value = "recordingS3BucketName", nulls = Nulls.SKIP)
        public Builder recordingS3BucketName(Optional<String> recordingS3BucketName) {
            this.recordingS3BucketName = recordingS3BucketName;
            return this;
        }

        public Builder recordingS3BucketName(String recordingS3BucketName) {
            this.recordingS3BucketName = Optional.ofNullable(recordingS3BucketName);
            return this;
        }

        @JsonSetter(value = "recordingS3BucketRegion", nulls = Nulls.SKIP)
        public Builder recordingS3BucketRegion(Optional<String> recordingS3BucketRegion) {
            this.recordingS3BucketRegion = recordingS3BucketRegion;
            return this;
        }

        public Builder recordingS3BucketRegion(String recordingS3BucketRegion) {
            this.recordingS3BucketRegion = Optional.ofNullable(recordingS3BucketRegion);
            return this;
        }

        @JsonSetter(value = "awsAssumeRoleArn", nulls = Nulls.SKIP)
        public Builder awsAssumeRoleArn(Optional<String> awsAssumeRoleArn) {
            this.awsAssumeRoleArn = awsAssumeRoleArn;
            return this;
        }

        public Builder awsAssumeRoleArn(String awsAssumeRoleArn) {
            this.awsAssumeRoleArn = Optional.ofNullable(awsAssumeRoleArn);
            return this;
        }

        public TavusConversationProperties build() {
            return new TavusConversationProperties(
                    maxCallDuration,
                    participantLeftTimeout,
                    participantAbsentTimeout,
                    enableRecording,
                    enableTranscription,
                    applyGreenscreen,
                    language,
                    recordingS3BucketName,
                    recordingS3BucketRegion,
                    awsAssumeRoleArn,
                    additionalProperties);
        }
    }
}
