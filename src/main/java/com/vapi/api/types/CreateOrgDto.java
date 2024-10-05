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
@JsonDeserialize(builder = CreateOrgDto.Builder.class)
public final class CreateOrgDto {
    private final Optional<Boolean> hipaaEnabled;

    private final Optional<String> name;

    private final Optional<Double> billingLimit;

    private final Optional<String> serverUrl;

    private final Optional<String> serverUrlSecret;

    private final Optional<Double> concurrencyLimit;

    private final Map<String, Object> additionalProperties;

    private CreateOrgDto(
            Optional<Boolean> hipaaEnabled,
            Optional<String> name,
            Optional<Double> billingLimit,
            Optional<String> serverUrl,
            Optional<String> serverUrlSecret,
            Optional<Double> concurrencyLimit,
            Map<String, Object> additionalProperties) {
        this.hipaaEnabled = hipaaEnabled;
        this.name = name;
        this.billingLimit = billingLimit;
        this.serverUrl = serverUrl;
        this.serverUrlSecret = serverUrlSecret;
        this.concurrencyLimit = concurrencyLimit;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return When this is enabled, no logs, recordings, or transcriptions will be stored. At the end of the call, you will still receive an end-of-call-report message to store on your server. Defaults to false.
     * When HIPAA is enabled, only OpenAI/Custom LLM or Azure Providers will be available for LLM and Voice respectively.
     * This is due to the compliance requirements of HIPAA. Other providers may not meet these requirements.
     */
    @JsonProperty("hipaaEnabled")
    public Optional<Boolean> getHipaaEnabled() {
        return hipaaEnabled;
    }

    /**
     * @return This is the name of the org. This is just for your own reference.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return This is the monthly billing limit for the org. To go beyond $1000/mo, please contact us at support@vapi.ai.
     */
    @JsonProperty("billingLimit")
    public Optional<Double> getBillingLimit() {
        return billingLimit;
    }

    /**
     * @return This is the URL Vapi will communicate with via HTTP GET and POST Requests. This is used for retrieving context, function calling, and end-of-call reports.
     * <p>All requests will be sent with the call object among other things relevant to that message. You can find more details in the Server URL documentation.</p>
     */
    @JsonProperty("serverUrl")
    public Optional<String> getServerUrl() {
        return serverUrl;
    }

    /**
     * @return This is the secret you can set that Vapi will send with every request to your server. Will be sent as a header called x-vapi-secret.
     */
    @JsonProperty("serverUrlSecret")
    public Optional<String> getServerUrlSecret() {
        return serverUrlSecret;
    }

    /**
     * @return This is the concurrency limit for the org. This is the maximum number of calls that can be active at any given time. To go beyond 10, please contact us at support@vapi.ai.
     */
    @JsonProperty("concurrencyLimit")
    public Optional<Double> getConcurrencyLimit() {
        return concurrencyLimit;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CreateOrgDto && equalTo((CreateOrgDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CreateOrgDto other) {
        return hipaaEnabled.equals(other.hipaaEnabled)
                && name.equals(other.name)
                && billingLimit.equals(other.billingLimit)
                && serverUrl.equals(other.serverUrl)
                && serverUrlSecret.equals(other.serverUrlSecret)
                && concurrencyLimit.equals(other.concurrencyLimit);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.hipaaEnabled,
                this.name,
                this.billingLimit,
                this.serverUrl,
                this.serverUrlSecret,
                this.concurrencyLimit);
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
        private Optional<Boolean> hipaaEnabled = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<Double> billingLimit = Optional.empty();

        private Optional<String> serverUrl = Optional.empty();

        private Optional<String> serverUrlSecret = Optional.empty();

        private Optional<Double> concurrencyLimit = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CreateOrgDto other) {
            hipaaEnabled(other.getHipaaEnabled());
            name(other.getName());
            billingLimit(other.getBillingLimit());
            serverUrl(other.getServerUrl());
            serverUrlSecret(other.getServerUrlSecret());
            concurrencyLimit(other.getConcurrencyLimit());
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

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @JsonSetter(value = "billingLimit", nulls = Nulls.SKIP)
        public Builder billingLimit(Optional<Double> billingLimit) {
            this.billingLimit = billingLimit;
            return this;
        }

        public Builder billingLimit(Double billingLimit) {
            this.billingLimit = Optional.ofNullable(billingLimit);
            return this;
        }

        @JsonSetter(value = "serverUrl", nulls = Nulls.SKIP)
        public Builder serverUrl(Optional<String> serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }

        public Builder serverUrl(String serverUrl) {
            this.serverUrl = Optional.ofNullable(serverUrl);
            return this;
        }

        @JsonSetter(value = "serverUrlSecret", nulls = Nulls.SKIP)
        public Builder serverUrlSecret(Optional<String> serverUrlSecret) {
            this.serverUrlSecret = serverUrlSecret;
            return this;
        }

        public Builder serverUrlSecret(String serverUrlSecret) {
            this.serverUrlSecret = Optional.ofNullable(serverUrlSecret);
            return this;
        }

        @JsonSetter(value = "concurrencyLimit", nulls = Nulls.SKIP)
        public Builder concurrencyLimit(Optional<Double> concurrencyLimit) {
            this.concurrencyLimit = concurrencyLimit;
            return this;
        }

        public Builder concurrencyLimit(Double concurrencyLimit) {
            this.concurrencyLimit = Optional.ofNullable(concurrencyLimit);
            return this;
        }

        public CreateOrgDto build() {
            return new CreateOrgDto(
                    hipaaEnabled,
                    name,
                    billingLimit,
                    serverUrl,
                    serverUrlSecret,
                    concurrencyLimit,
                    additionalProperties);
        }
    }
}