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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Metrics.Builder.class)
public final class Metrics {
    private final String orgId;

    private final String rangeStart;

    private final String rangeEnd;

    private final double bill;

    private final boolean billWithinBillingLimit;

    private final Map<String, Object> billDailyBreakdown;

    private final double callActive;

    private final boolean callActiveWithinConcurrencyLimit;

    private final double callMinutes;

    private final Map<String, Object> callMinutesDailyBreakdown;

    private final double callMinutesAverage;

    private final Map<String, Object> callMinutesAverageDailyBreakdown;

    private final double callCount;

    private final Map<String, Object> callCountDailyBreakdown;

    private final Map<String, Object> additionalProperties;

    private Metrics(
            String orgId,
            String rangeStart,
            String rangeEnd,
            double bill,
            boolean billWithinBillingLimit,
            Map<String, Object> billDailyBreakdown,
            double callActive,
            boolean callActiveWithinConcurrencyLimit,
            double callMinutes,
            Map<String, Object> callMinutesDailyBreakdown,
            double callMinutesAverage,
            Map<String, Object> callMinutesAverageDailyBreakdown,
            double callCount,
            Map<String, Object> callCountDailyBreakdown,
            Map<String, Object> additionalProperties) {
        this.orgId = orgId;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
        this.bill = bill;
        this.billWithinBillingLimit = billWithinBillingLimit;
        this.billDailyBreakdown = billDailyBreakdown;
        this.callActive = callActive;
        this.callActiveWithinConcurrencyLimit = callActiveWithinConcurrencyLimit;
        this.callMinutes = callMinutes;
        this.callMinutesDailyBreakdown = callMinutesDailyBreakdown;
        this.callMinutesAverage = callMinutesAverage;
        this.callMinutesAverageDailyBreakdown = callMinutesAverageDailyBreakdown;
        this.callCount = callCount;
        this.callCountDailyBreakdown = callCountDailyBreakdown;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("orgId")
    public String getOrgId() {
        return orgId;
    }

    @JsonProperty("rangeStart")
    public String getRangeStart() {
        return rangeStart;
    }

    @JsonProperty("rangeEnd")
    public String getRangeEnd() {
        return rangeEnd;
    }

    @JsonProperty("bill")
    public double getBill() {
        return bill;
    }

    @JsonProperty("billWithinBillingLimit")
    public boolean getBillWithinBillingLimit() {
        return billWithinBillingLimit;
    }

    @JsonProperty("billDailyBreakdown")
    public Map<String, Object> getBillDailyBreakdown() {
        return billDailyBreakdown;
    }

    @JsonProperty("callActive")
    public double getCallActive() {
        return callActive;
    }

    @JsonProperty("callActiveWithinConcurrencyLimit")
    public boolean getCallActiveWithinConcurrencyLimit() {
        return callActiveWithinConcurrencyLimit;
    }

    @JsonProperty("callMinutes")
    public double getCallMinutes() {
        return callMinutes;
    }

    @JsonProperty("callMinutesDailyBreakdown")
    public Map<String, Object> getCallMinutesDailyBreakdown() {
        return callMinutesDailyBreakdown;
    }

    @JsonProperty("callMinutesAverage")
    public double getCallMinutesAverage() {
        return callMinutesAverage;
    }

    @JsonProperty("callMinutesAverageDailyBreakdown")
    public Map<String, Object> getCallMinutesAverageDailyBreakdown() {
        return callMinutesAverageDailyBreakdown;
    }

    @JsonProperty("callCount")
    public double getCallCount() {
        return callCount;
    }

    @JsonProperty("callCountDailyBreakdown")
    public Map<String, Object> getCallCountDailyBreakdown() {
        return callCountDailyBreakdown;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Metrics && equalTo((Metrics) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Metrics other) {
        return orgId.equals(other.orgId)
                && rangeStart.equals(other.rangeStart)
                && rangeEnd.equals(other.rangeEnd)
                && bill == other.bill
                && billWithinBillingLimit == other.billWithinBillingLimit
                && billDailyBreakdown.equals(other.billDailyBreakdown)
                && callActive == other.callActive
                && callActiveWithinConcurrencyLimit == other.callActiveWithinConcurrencyLimit
                && callMinutes == other.callMinutes
                && callMinutesDailyBreakdown.equals(other.callMinutesDailyBreakdown)
                && callMinutesAverage == other.callMinutesAverage
                && callMinutesAverageDailyBreakdown.equals(other.callMinutesAverageDailyBreakdown)
                && callCount == other.callCount
                && callCountDailyBreakdown.equals(other.callCountDailyBreakdown);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.orgId,
                this.rangeStart,
                this.rangeEnd,
                this.bill,
                this.billWithinBillingLimit,
                this.billDailyBreakdown,
                this.callActive,
                this.callActiveWithinConcurrencyLimit,
                this.callMinutes,
                this.callMinutesDailyBreakdown,
                this.callMinutesAverage,
                this.callMinutesAverageDailyBreakdown,
                this.callCount,
                this.callCountDailyBreakdown);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static OrgIdStage builder() {
        return new Builder();
    }

    public interface OrgIdStage {
        RangeStartStage orgId(@NotNull String orgId);

        Builder from(Metrics other);
    }

    public interface RangeStartStage {
        RangeEndStage rangeStart(@NotNull String rangeStart);
    }

    public interface RangeEndStage {
        BillStage rangeEnd(@NotNull String rangeEnd);
    }

    public interface BillStage {
        BillWithinBillingLimitStage bill(double bill);
    }

    public interface BillWithinBillingLimitStage {
        CallActiveStage billWithinBillingLimit(boolean billWithinBillingLimit);
    }

    public interface CallActiveStage {
        CallActiveWithinConcurrencyLimitStage callActive(double callActive);
    }

    public interface CallActiveWithinConcurrencyLimitStage {
        CallMinutesStage callActiveWithinConcurrencyLimit(boolean callActiveWithinConcurrencyLimit);
    }

    public interface CallMinutesStage {
        CallMinutesAverageStage callMinutes(double callMinutes);
    }

    public interface CallMinutesAverageStage {
        CallCountStage callMinutesAverage(double callMinutesAverage);
    }

    public interface CallCountStage {
        _FinalStage callCount(double callCount);
    }

    public interface _FinalStage {
        Metrics build();

        _FinalStage billDailyBreakdown(Map<String, Object> billDailyBreakdown);

        _FinalStage putAllBillDailyBreakdown(Map<String, Object> billDailyBreakdown);

        _FinalStage billDailyBreakdown(String key, Object value);

        _FinalStage callMinutesDailyBreakdown(Map<String, Object> callMinutesDailyBreakdown);

        _FinalStage putAllCallMinutesDailyBreakdown(Map<String, Object> callMinutesDailyBreakdown);

        _FinalStage callMinutesDailyBreakdown(String key, Object value);

        _FinalStage callMinutesAverageDailyBreakdown(Map<String, Object> callMinutesAverageDailyBreakdown);

        _FinalStage putAllCallMinutesAverageDailyBreakdown(Map<String, Object> callMinutesAverageDailyBreakdown);

        _FinalStage callMinutesAverageDailyBreakdown(String key, Object value);

        _FinalStage callCountDailyBreakdown(Map<String, Object> callCountDailyBreakdown);

        _FinalStage putAllCallCountDailyBreakdown(Map<String, Object> callCountDailyBreakdown);

        _FinalStage callCountDailyBreakdown(String key, Object value);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements OrgIdStage,
                    RangeStartStage,
                    RangeEndStage,
                    BillStage,
                    BillWithinBillingLimitStage,
                    CallActiveStage,
                    CallActiveWithinConcurrencyLimitStage,
                    CallMinutesStage,
                    CallMinutesAverageStage,
                    CallCountStage,
                    _FinalStage {
        private String orgId;

        private String rangeStart;

        private String rangeEnd;

        private double bill;

        private boolean billWithinBillingLimit;

        private double callActive;

        private boolean callActiveWithinConcurrencyLimit;

        private double callMinutes;

        private double callMinutesAverage;

        private double callCount;

        private Map<String, Object> callCountDailyBreakdown = new LinkedHashMap<>();

        private Map<String, Object> callMinutesAverageDailyBreakdown = new LinkedHashMap<>();

        private Map<String, Object> callMinutesDailyBreakdown = new LinkedHashMap<>();

        private Map<String, Object> billDailyBreakdown = new LinkedHashMap<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Metrics other) {
            orgId(other.getOrgId());
            rangeStart(other.getRangeStart());
            rangeEnd(other.getRangeEnd());
            bill(other.getBill());
            billWithinBillingLimit(other.getBillWithinBillingLimit());
            billDailyBreakdown(other.getBillDailyBreakdown());
            callActive(other.getCallActive());
            callActiveWithinConcurrencyLimit(other.getCallActiveWithinConcurrencyLimit());
            callMinutes(other.getCallMinutes());
            callMinutesDailyBreakdown(other.getCallMinutesDailyBreakdown());
            callMinutesAverage(other.getCallMinutesAverage());
            callMinutesAverageDailyBreakdown(other.getCallMinutesAverageDailyBreakdown());
            callCount(other.getCallCount());
            callCountDailyBreakdown(other.getCallCountDailyBreakdown());
            return this;
        }

        @java.lang.Override
        @JsonSetter("orgId")
        public RangeStartStage orgId(@NotNull String orgId) {
            this.orgId = Objects.requireNonNull(orgId, "orgId must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("rangeStart")
        public RangeEndStage rangeStart(@NotNull String rangeStart) {
            this.rangeStart = Objects.requireNonNull(rangeStart, "rangeStart must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("rangeEnd")
        public BillStage rangeEnd(@NotNull String rangeEnd) {
            this.rangeEnd = Objects.requireNonNull(rangeEnd, "rangeEnd must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("bill")
        public BillWithinBillingLimitStage bill(double bill) {
            this.bill = bill;
            return this;
        }

        @java.lang.Override
        @JsonSetter("billWithinBillingLimit")
        public CallActiveStage billWithinBillingLimit(boolean billWithinBillingLimit) {
            this.billWithinBillingLimit = billWithinBillingLimit;
            return this;
        }

        @java.lang.Override
        @JsonSetter("callActive")
        public CallActiveWithinConcurrencyLimitStage callActive(double callActive) {
            this.callActive = callActive;
            return this;
        }

        @java.lang.Override
        @JsonSetter("callActiveWithinConcurrencyLimit")
        public CallMinutesStage callActiveWithinConcurrencyLimit(boolean callActiveWithinConcurrencyLimit) {
            this.callActiveWithinConcurrencyLimit = callActiveWithinConcurrencyLimit;
            return this;
        }

        @java.lang.Override
        @JsonSetter("callMinutes")
        public CallMinutesAverageStage callMinutes(double callMinutes) {
            this.callMinutes = callMinutes;
            return this;
        }

        @java.lang.Override
        @JsonSetter("callMinutesAverage")
        public CallCountStage callMinutesAverage(double callMinutesAverage) {
            this.callMinutesAverage = callMinutesAverage;
            return this;
        }

        @java.lang.Override
        @JsonSetter("callCount")
        public _FinalStage callCount(double callCount) {
            this.callCount = callCount;
            return this;
        }

        @java.lang.Override
        public _FinalStage callCountDailyBreakdown(String key, Object value) {
            this.callCountDailyBreakdown.put(key, value);
            return this;
        }

        @java.lang.Override
        public _FinalStage putAllCallCountDailyBreakdown(Map<String, Object> callCountDailyBreakdown) {
            this.callCountDailyBreakdown.putAll(callCountDailyBreakdown);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "callCountDailyBreakdown", nulls = Nulls.SKIP)
        public _FinalStage callCountDailyBreakdown(Map<String, Object> callCountDailyBreakdown) {
            this.callCountDailyBreakdown.clear();
            this.callCountDailyBreakdown.putAll(callCountDailyBreakdown);
            return this;
        }

        @java.lang.Override
        public _FinalStage callMinutesAverageDailyBreakdown(String key, Object value) {
            this.callMinutesAverageDailyBreakdown.put(key, value);
            return this;
        }

        @java.lang.Override
        public _FinalStage putAllCallMinutesAverageDailyBreakdown(
                Map<String, Object> callMinutesAverageDailyBreakdown) {
            this.callMinutesAverageDailyBreakdown.putAll(callMinutesAverageDailyBreakdown);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "callMinutesAverageDailyBreakdown", nulls = Nulls.SKIP)
        public _FinalStage callMinutesAverageDailyBreakdown(Map<String, Object> callMinutesAverageDailyBreakdown) {
            this.callMinutesAverageDailyBreakdown.clear();
            this.callMinutesAverageDailyBreakdown.putAll(callMinutesAverageDailyBreakdown);
            return this;
        }

        @java.lang.Override
        public _FinalStage callMinutesDailyBreakdown(String key, Object value) {
            this.callMinutesDailyBreakdown.put(key, value);
            return this;
        }

        @java.lang.Override
        public _FinalStage putAllCallMinutesDailyBreakdown(Map<String, Object> callMinutesDailyBreakdown) {
            this.callMinutesDailyBreakdown.putAll(callMinutesDailyBreakdown);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "callMinutesDailyBreakdown", nulls = Nulls.SKIP)
        public _FinalStage callMinutesDailyBreakdown(Map<String, Object> callMinutesDailyBreakdown) {
            this.callMinutesDailyBreakdown.clear();
            this.callMinutesDailyBreakdown.putAll(callMinutesDailyBreakdown);
            return this;
        }

        @java.lang.Override
        public _FinalStage billDailyBreakdown(String key, Object value) {
            this.billDailyBreakdown.put(key, value);
            return this;
        }

        @java.lang.Override
        public _FinalStage putAllBillDailyBreakdown(Map<String, Object> billDailyBreakdown) {
            this.billDailyBreakdown.putAll(billDailyBreakdown);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "billDailyBreakdown", nulls = Nulls.SKIP)
        public _FinalStage billDailyBreakdown(Map<String, Object> billDailyBreakdown) {
            this.billDailyBreakdown.clear();
            this.billDailyBreakdown.putAll(billDailyBreakdown);
            return this;
        }

        @java.lang.Override
        public Metrics build() {
            return new Metrics(
                    orgId,
                    rangeStart,
                    rangeEnd,
                    bill,
                    billWithinBillingLimit,
                    billDailyBreakdown,
                    callActive,
                    callActiveWithinConcurrencyLimit,
                    callMinutes,
                    callMinutesDailyBreakdown,
                    callMinutesAverage,
                    callMinutesAverageDailyBreakdown,
                    callCount,
                    callCountDailyBreakdown,
                    additionalProperties);
        }
    }
}