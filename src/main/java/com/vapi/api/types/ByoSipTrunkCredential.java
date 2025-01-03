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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ByoSipTrunkCredential.Builder.class)
public final class ByoSipTrunkCredential {
    private final Optional<String> provider;

    private final String id;

    private final String orgId;

    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Optional<String> name;

    private final List<SipTrunkGateway> gateways;

    private final Optional<SipTrunkOutboundAuthenticationPlan> outboundAuthenticationPlan;

    private final Optional<Boolean> outboundLeadingPlusEnabled;

    private final Optional<String> techPrefix;

    private final Optional<String> sipDiversionHeader;

    private final Optional<SbcConfiguration> sbcConfiguration;

    private final Map<String, Object> additionalProperties;

    private ByoSipTrunkCredential(
            Optional<String> provider,
            String id,
            String orgId,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Optional<String> name,
            List<SipTrunkGateway> gateways,
            Optional<SipTrunkOutboundAuthenticationPlan> outboundAuthenticationPlan,
            Optional<Boolean> outboundLeadingPlusEnabled,
            Optional<String> techPrefix,
            Optional<String> sipDiversionHeader,
            Optional<SbcConfiguration> sbcConfiguration,
            Map<String, Object> additionalProperties) {
        this.provider = provider;
        this.id = id;
        this.orgId = orgId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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
     * @return This can be used to bring your own SIP trunks or to connect to a Carrier.
     */
    @JsonProperty("provider")
    public Optional<String> getProvider() {
        return provider;
    }

    /**
     * @return This is the unique identifier for the credential.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return This is the unique identifier for the org that this credential belongs to.
     */
    @JsonProperty("orgId")
    public String getOrgId() {
        return orgId;
    }

    /**
     * @return This is the ISO 8601 date-time string of when the credential was created.
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * @return This is the ISO 8601 date-time string of when the assistant was last updated.
     */
    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
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
    public List<SipTrunkGateway> getGateways() {
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
        return other instanceof ByoSipTrunkCredential && equalTo((ByoSipTrunkCredential) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ByoSipTrunkCredential other) {
        return provider.equals(other.provider)
                && id.equals(other.id)
                && orgId.equals(other.orgId)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt)
                && name.equals(other.name)
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
                this.provider,
                this.id,
                this.orgId,
                this.createdAt,
                this.updatedAt,
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

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        OrgIdStage id(@NotNull String id);

        Builder from(ByoSipTrunkCredential other);
    }

    public interface OrgIdStage {
        CreatedAtStage orgId(@NotNull String orgId);
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(@NotNull OffsetDateTime createdAt);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(@NotNull OffsetDateTime updatedAt);
    }

    public interface _FinalStage {
        ByoSipTrunkCredential build();

        _FinalStage provider(Optional<String> provider);

        _FinalStage provider(String provider);

        _FinalStage name(Optional<String> name);

        _FinalStage name(String name);

        _FinalStage gateways(List<SipTrunkGateway> gateways);

        _FinalStage addGateways(SipTrunkGateway gateways);

        _FinalStage addAllGateways(List<SipTrunkGateway> gateways);

        _FinalStage outboundAuthenticationPlan(Optional<SipTrunkOutboundAuthenticationPlan> outboundAuthenticationPlan);

        _FinalStage outboundAuthenticationPlan(SipTrunkOutboundAuthenticationPlan outboundAuthenticationPlan);

        _FinalStage outboundLeadingPlusEnabled(Optional<Boolean> outboundLeadingPlusEnabled);

        _FinalStage outboundLeadingPlusEnabled(Boolean outboundLeadingPlusEnabled);

        _FinalStage techPrefix(Optional<String> techPrefix);

        _FinalStage techPrefix(String techPrefix);

        _FinalStage sipDiversionHeader(Optional<String> sipDiversionHeader);

        _FinalStage sipDiversionHeader(String sipDiversionHeader);

        _FinalStage sbcConfiguration(Optional<SbcConfiguration> sbcConfiguration);

        _FinalStage sbcConfiguration(SbcConfiguration sbcConfiguration);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, OrgIdStage, CreatedAtStage, UpdatedAtStage, _FinalStage {
        private String id;

        private String orgId;

        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Optional<SbcConfiguration> sbcConfiguration = Optional.empty();

        private Optional<String> sipDiversionHeader = Optional.empty();

        private Optional<String> techPrefix = Optional.empty();

        private Optional<Boolean> outboundLeadingPlusEnabled = Optional.empty();

        private Optional<SipTrunkOutboundAuthenticationPlan> outboundAuthenticationPlan = Optional.empty();

        private List<SipTrunkGateway> gateways = new ArrayList<>();

        private Optional<String> name = Optional.empty();

        private Optional<String> provider = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ByoSipTrunkCredential other) {
            provider(other.getProvider());
            id(other.getId());
            orgId(other.getOrgId());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            name(other.getName());
            gateways(other.getGateways());
            outboundAuthenticationPlan(other.getOutboundAuthenticationPlan());
            outboundLeadingPlusEnabled(other.getOutboundLeadingPlusEnabled());
            techPrefix(other.getTechPrefix());
            sipDiversionHeader(other.getSipDiversionHeader());
            sbcConfiguration(other.getSbcConfiguration());
            return this;
        }

        /**
         * <p>This is the unique identifier for the credential.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public OrgIdStage id(@NotNull String id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        /**
         * <p>This is the unique identifier for the org that this credential belongs to.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("orgId")
        public CreatedAtStage orgId(@NotNull String orgId) {
            this.orgId = Objects.requireNonNull(orgId, "orgId must not be null");
            return this;
        }

        /**
         * <p>This is the ISO 8601 date-time string of when the credential was created.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(@NotNull OffsetDateTime createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt, "createdAt must not be null");
            return this;
        }

        /**
         * <p>This is the ISO 8601 date-time string of when the assistant was last updated.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("updatedAt")
        public _FinalStage updatedAt(@NotNull OffsetDateTime updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt, "updatedAt must not be null");
            return this;
        }

        /**
         * <p>This is an advanced configuration for enterprise deployments. This uses the onprem SBC to trunk into the SIP trunk's <code>gateways</code>, rather than the managed SBC provided by Vapi.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage sbcConfiguration(SbcConfiguration sbcConfiguration) {
            this.sbcConfiguration = Optional.ofNullable(sbcConfiguration);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "sbcConfiguration", nulls = Nulls.SKIP)
        public _FinalStage sbcConfiguration(Optional<SbcConfiguration> sbcConfiguration) {
            this.sbcConfiguration = sbcConfiguration;
            return this;
        }

        /**
         * <p>This can be used to enable the SIP diversion header for authenticating the calling number if the SIP trunk supports it. This is an advanced property.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage sipDiversionHeader(String sipDiversionHeader) {
            this.sipDiversionHeader = Optional.ofNullable(sipDiversionHeader);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "sipDiversionHeader", nulls = Nulls.SKIP)
        public _FinalStage sipDiversionHeader(Optional<String> sipDiversionHeader) {
            this.sipDiversionHeader = sipDiversionHeader;
            return this;
        }

        /**
         * <p>This can be used to configure the tech prefix on outbound calls. This is an advanced property.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage techPrefix(String techPrefix) {
            this.techPrefix = Optional.ofNullable(techPrefix);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "techPrefix", nulls = Nulls.SKIP)
        public _FinalStage techPrefix(Optional<String> techPrefix) {
            this.techPrefix = techPrefix;
            return this;
        }

        /**
         * <p>This ensures the outbound origination attempts have a leading plus. Defaults to false to match conventional telecom behavior.</p>
         * <p>Usage:</p>
         * <ul>
         * <li>Vonage/Twilio requires leading plus for all outbound calls. Set this to true.</li>
         * </ul>
         * <p>@default false</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage outboundLeadingPlusEnabled(Boolean outboundLeadingPlusEnabled) {
            this.outboundLeadingPlusEnabled = Optional.ofNullable(outboundLeadingPlusEnabled);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "outboundLeadingPlusEnabled", nulls = Nulls.SKIP)
        public _FinalStage outboundLeadingPlusEnabled(Optional<Boolean> outboundLeadingPlusEnabled) {
            this.outboundLeadingPlusEnabled = outboundLeadingPlusEnabled;
            return this;
        }

        /**
         * <p>This can be used to configure the outbound authentication if required by the SIP trunk.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage outboundAuthenticationPlan(SipTrunkOutboundAuthenticationPlan outboundAuthenticationPlan) {
            this.outboundAuthenticationPlan = Optional.ofNullable(outboundAuthenticationPlan);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "outboundAuthenticationPlan", nulls = Nulls.SKIP)
        public _FinalStage outboundAuthenticationPlan(
                Optional<SipTrunkOutboundAuthenticationPlan> outboundAuthenticationPlan) {
            this.outboundAuthenticationPlan = outboundAuthenticationPlan;
            return this;
        }

        /**
         * <p>This is the list of SIP trunk's gateways.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllGateways(List<SipTrunkGateway> gateways) {
            this.gateways.addAll(gateways);
            return this;
        }

        /**
         * <p>This is the list of SIP trunk's gateways.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addGateways(SipTrunkGateway gateways) {
            this.gateways.add(gateways);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "gateways", nulls = Nulls.SKIP)
        public _FinalStage gateways(List<SipTrunkGateway> gateways) {
            this.gateways.clear();
            this.gateways.addAll(gateways);
            return this;
        }

        /**
         * <p>This is the name of credential. This is just for your reference.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage name(String name) {
            this.name = Optional.ofNullable(name);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public _FinalStage name(Optional<String> name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This can be used to bring your own SIP trunks or to connect to a Carrier.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage provider(String provider) {
            this.provider = Optional.ofNullable(provider);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "provider", nulls = Nulls.SKIP)
        public _FinalStage provider(Optional<String> provider) {
            this.provider = provider;
            return this;
        }

        @java.lang.Override
        public ByoSipTrunkCredential build() {
            return new ByoSipTrunkCredential(
                    provider,
                    id,
                    orgId,
                    createdAt,
                    updatedAt,
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
