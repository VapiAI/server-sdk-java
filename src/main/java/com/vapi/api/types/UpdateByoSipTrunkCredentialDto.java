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
@JsonDeserialize(builder = UpdateByoSipTrunkCredentialDto.Builder.class)
public final class UpdateByoSipTrunkCredentialDto {
    private final Optional<String> name;

    private final Optional<List<SipTrunkGateway>> gateways;

    private final Optional<SipTrunkOutboundAuthenticationPlan> outboundAuthenticationPlan;

    private final Optional<Boolean> outboundLeadingPlusEnabled;

    private final Optional<String> techPrefix;

    private final Optional<String> sipDiversionHeader;

    private final Optional<SbcConfiguration> sbcConfiguration;

    private final Map<String, Object> additionalProperties;

    private UpdateByoSipTrunkCredentialDto(
            Optional<String> name,
            Optional<List<SipTrunkGateway>> gateways,
            Optional<SipTrunkOutboundAuthenticationPlan> outboundAuthenticationPlan,
            Optional<Boolean> outboundLeadingPlusEnabled,
            Optional<String> techPrefix,
            Optional<String> sipDiversionHeader,
            Optional<SbcConfiguration> sbcConfiguration,
            Map<String, Object> additionalProperties) {
        this.name = name;
        this.gateways = gateways;
        this.outboundAuthenticationPlan = outboundAuthenticationPlan;
        this.outboundLeadingPlusEnabled = outboundLeadingPlusEnabled;
        this.techPrefix = techPrefix;
        this.sipDiversionHeader = sipDiversionHeader;
        this.sbcConfiguration = sbcConfiguration;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This is the name of credential. This is just for your reference.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return This is the list of SIP trunk's gateways.
     */
    @JsonProperty("gateways")
    public Optional<List<SipTrunkGateway>> getGateways() {
        return gateways;
    }

    /**
     * @return This can be used to configure the outbound authentication if required by the SIP trunk.
     */
    @JsonProperty("outboundAuthenticationPlan")
    public Optional<SipTrunkOutboundAuthenticationPlan> getOutboundAuthenticationPlan() {
        return outboundAuthenticationPlan;
    }

    /**
     * @return This ensures the outbound origination attempts have a leading plus. Defaults to false to match conventional telecom behavior.
     * <p>Usage:</p>
     * <ul>
     * <li>Vonage/Twilio requires leading plus for all outbound calls. Set this to true.</li>
     * </ul>
     * <p>@default false</p>
     */
    @JsonProperty("outboundLeadingPlusEnabled")
    public Optional<Boolean> getOutboundLeadingPlusEnabled() {
        return outboundLeadingPlusEnabled;
    }

    /**
     * @return This can be used to configure the tech prefix on outbound calls. This is an advanced property.
     */
    @JsonProperty("techPrefix")
    public Optional<String> getTechPrefix() {
        return techPrefix;
    }

    /**
     * @return This can be used to enable the SIP diversion header for authenticating the calling number if the SIP trunk supports it. This is an advanced property.
     */
    @JsonProperty("sipDiversionHeader")
    public Optional<String> getSipDiversionHeader() {
        return sipDiversionHeader;
    }

    /**
     * @return This is an advanced configuration for enterprise deployments. This uses the onprem SBC to trunk into the SIP trunk's <code>gateways</code>, rather than the managed SBC provided by Vapi.
     */
    @JsonProperty("sbcConfiguration")
    public Optional<SbcConfiguration> getSbcConfiguration() {
        return sbcConfiguration;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UpdateByoSipTrunkCredentialDto && equalTo((UpdateByoSipTrunkCredentialDto) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UpdateByoSipTrunkCredentialDto other) {
        return name.equals(other.name)
                && gateways.equals(other.gateways)
                && outboundAuthenticationPlan.equals(other.outboundAuthenticationPlan)
                && outboundLeadingPlusEnabled.equals(other.outboundLeadingPlusEnabled)
                && techPrefix.equals(other.techPrefix)
                && sipDiversionHeader.equals(other.sipDiversionHeader)
                && sbcConfiguration.equals(other.sbcConfiguration);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.gateways,
                this.outboundAuthenticationPlan,
                this.outboundLeadingPlusEnabled,
                this.techPrefix,
                this.sipDiversionHeader,
                this.sbcConfiguration);
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
        private Optional<String> name = Optional.empty();

        private Optional<List<SipTrunkGateway>> gateways = Optional.empty();

        private Optional<SipTrunkOutboundAuthenticationPlan> outboundAuthenticationPlan = Optional.empty();

        private Optional<Boolean> outboundLeadingPlusEnabled = Optional.empty();

        private Optional<String> techPrefix = Optional.empty();

        private Optional<String> sipDiversionHeader = Optional.empty();

        private Optional<SbcConfiguration> sbcConfiguration = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(UpdateByoSipTrunkCredentialDto other) {
            name(other.getName());
            gateways(other.getGateways());
            outboundAuthenticationPlan(other.getOutboundAuthenticationPlan());
            outboundLeadingPlusEnabled(other.getOutboundLeadingPlusEnabled());
            techPrefix(other.getTechPrefix());
            sipDiversionHeader(other.getSipDiversionHeader());
            sbcConfiguration(other.getSbcConfiguration());
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

        @JsonSetter(value = "gateways", nulls = Nulls.SKIP)
        public Builder gateways(Optional<List<SipTrunkGateway>> gateways) {
            this.gateways = gateways;
            return this;
        }

        public Builder gateways(List<SipTrunkGateway> gateways) {
            this.gateways = Optional.ofNullable(gateways);
            return this;
        }

        @JsonSetter(value = "outboundAuthenticationPlan", nulls = Nulls.SKIP)
        public Builder outboundAuthenticationPlan(
                Optional<SipTrunkOutboundAuthenticationPlan> outboundAuthenticationPlan) {
            this.outboundAuthenticationPlan = outboundAuthenticationPlan;
            return this;
        }

        public Builder outboundAuthenticationPlan(SipTrunkOutboundAuthenticationPlan outboundAuthenticationPlan) {
            this.outboundAuthenticationPlan = Optional.ofNullable(outboundAuthenticationPlan);
            return this;
        }

        @JsonSetter(value = "outboundLeadingPlusEnabled", nulls = Nulls.SKIP)
        public Builder outboundLeadingPlusEnabled(Optional<Boolean> outboundLeadingPlusEnabled) {
            this.outboundLeadingPlusEnabled = outboundLeadingPlusEnabled;
            return this;
        }

        public Builder outboundLeadingPlusEnabled(Boolean outboundLeadingPlusEnabled) {
            this.outboundLeadingPlusEnabled = Optional.ofNullable(outboundLeadingPlusEnabled);
            return this;
        }

        @JsonSetter(value = "techPrefix", nulls = Nulls.SKIP)
        public Builder techPrefix(Optional<String> techPrefix) {
            this.techPrefix = techPrefix;
            return this;
        }

        public Builder techPrefix(String techPrefix) {
            this.techPrefix = Optional.ofNullable(techPrefix);
            return this;
        }

        @JsonSetter(value = "sipDiversionHeader", nulls = Nulls.SKIP)
        public Builder sipDiversionHeader(Optional<String> sipDiversionHeader) {
            this.sipDiversionHeader = sipDiversionHeader;
            return this;
        }

        public Builder sipDiversionHeader(String sipDiversionHeader) {
            this.sipDiversionHeader = Optional.ofNullable(sipDiversionHeader);
            return this;
        }

        @JsonSetter(value = "sbcConfiguration", nulls = Nulls.SKIP)
        public Builder sbcConfiguration(Optional<SbcConfiguration> sbcConfiguration) {
            this.sbcConfiguration = sbcConfiguration;
            return this;
        }

        public Builder sbcConfiguration(SbcConfiguration sbcConfiguration) {
            this.sbcConfiguration = Optional.ofNullable(sbcConfiguration);
            return this;
        }

        public UpdateByoSipTrunkCredentialDto build() {
            return new UpdateByoSipTrunkCredentialDto(
                    name,
                    gateways,
                    outboundAuthenticationPlan,
                    outboundLeadingPlusEnabled,
                    techPrefix,
                    sipDiversionHeader,
                    sbcConfiguration,
                    additionalProperties);
        }
    }
}
