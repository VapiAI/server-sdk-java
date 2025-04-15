/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.resources.assistants.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.vapi.api.types.AzureVoice;
import com.vapi.api.types.CartesiaVoice;
import com.vapi.api.types.CustomVoice;
import com.vapi.api.types.DeepgramVoice;
import com.vapi.api.types.ElevenLabsVoice;
import com.vapi.api.types.HumeVoice;
import com.vapi.api.types.LmntVoice;
import com.vapi.api.types.NeuphonicVoice;
import com.vapi.api.types.OpenAiVoice;
import com.vapi.api.types.PlayHtVoice;
import com.vapi.api.types.RimeAiVoice;
import com.vapi.api.types.SmallestAiVoice;
import com.vapi.api.types.TavusVoice;
import com.vapi.api.types.VapiVoice;
import java.util.Objects;
import java.util.Optional;

public final class UpdateAssistantDtoVoice {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private UpdateAssistantDtoVoice(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static UpdateAssistantDtoVoice azure(AzureVoice value) {
        return new UpdateAssistantDtoVoice(new AzureValue(value));
    }

    public static UpdateAssistantDtoVoice cartesia(CartesiaVoice value) {
        return new UpdateAssistantDtoVoice(new CartesiaValue(value));
    }

    public static UpdateAssistantDtoVoice customVoice(CustomVoice value) {
        return new UpdateAssistantDtoVoice(new CustomVoiceValue(value));
    }

    public static UpdateAssistantDtoVoice deepgram(DeepgramVoice value) {
        return new UpdateAssistantDtoVoice(new DeepgramValue(value));
    }

    public static UpdateAssistantDtoVoice _11Labs(ElevenLabsVoice value) {
        return new UpdateAssistantDtoVoice(new _11LabsValue(value));
    }

    public static UpdateAssistantDtoVoice hume(HumeVoice value) {
        return new UpdateAssistantDtoVoice(new HumeValue(value));
    }

    public static UpdateAssistantDtoVoice lmnt(LmntVoice value) {
        return new UpdateAssistantDtoVoice(new LmntValue(value));
    }

    public static UpdateAssistantDtoVoice neuphonic(NeuphonicVoice value) {
        return new UpdateAssistantDtoVoice(new NeuphonicValue(value));
    }

    public static UpdateAssistantDtoVoice openai(OpenAiVoice value) {
        return new UpdateAssistantDtoVoice(new OpenaiValue(value));
    }

    public static UpdateAssistantDtoVoice playht(PlayHtVoice value) {
        return new UpdateAssistantDtoVoice(new PlayhtValue(value));
    }

    public static UpdateAssistantDtoVoice rimeAi(RimeAiVoice value) {
        return new UpdateAssistantDtoVoice(new RimeAiValue(value));
    }

    public static UpdateAssistantDtoVoice smallestAi(SmallestAiVoice value) {
        return new UpdateAssistantDtoVoice(new SmallestAiValue(value));
    }

    public static UpdateAssistantDtoVoice tavus(TavusVoice value) {
        return new UpdateAssistantDtoVoice(new TavusValue(value));
    }

    public static UpdateAssistantDtoVoice vapi(VapiVoice value) {
        return new UpdateAssistantDtoVoice(new VapiValue(value));
    }

    public boolean isAzure() {
        return value instanceof AzureValue;
    }

    public boolean isCartesia() {
        return value instanceof CartesiaValue;
    }

    public boolean isCustomVoice() {
        return value instanceof CustomVoiceValue;
    }

    public boolean isDeepgram() {
        return value instanceof DeepgramValue;
    }

    public boolean is11Labs() {
        return value instanceof _11LabsValue;
    }

    public boolean isHume() {
        return value instanceof HumeValue;
    }

    public boolean isLmnt() {
        return value instanceof LmntValue;
    }

    public boolean isNeuphonic() {
        return value instanceof NeuphonicValue;
    }

    public boolean isOpenai() {
        return value instanceof OpenaiValue;
    }

    public boolean isPlayht() {
        return value instanceof PlayhtValue;
    }

    public boolean isRimeAi() {
        return value instanceof RimeAiValue;
    }

    public boolean isSmallestAi() {
        return value instanceof SmallestAiValue;
    }

    public boolean isTavus() {
        return value instanceof TavusValue;
    }

    public boolean isVapi() {
        return value instanceof VapiValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<AzureVoice> getAzure() {
        if (isAzure()) {
            return Optional.of(((AzureValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CartesiaVoice> getCartesia() {
        if (isCartesia()) {
            return Optional.of(((CartesiaValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CustomVoice> getCustomVoice() {
        if (isCustomVoice()) {
            return Optional.of(((CustomVoiceValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<DeepgramVoice> getDeepgram() {
        if (isDeepgram()) {
            return Optional.of(((DeepgramValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<ElevenLabsVoice> get11Labs() {
        if (is11Labs()) {
            return Optional.of(((_11LabsValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<HumeVoice> getHume() {
        if (isHume()) {
            return Optional.of(((HumeValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<LmntVoice> getLmnt() {
        if (isLmnt()) {
            return Optional.of(((LmntValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<NeuphonicVoice> getNeuphonic() {
        if (isNeuphonic()) {
            return Optional.of(((NeuphonicValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<OpenAiVoice> getOpenai() {
        if (isOpenai()) {
            return Optional.of(((OpenaiValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<PlayHtVoice> getPlayht() {
        if (isPlayht()) {
            return Optional.of(((PlayhtValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<RimeAiVoice> getRimeAi() {
        if (isRimeAi()) {
            return Optional.of(((RimeAiValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<SmallestAiVoice> getSmallestAi() {
        if (isSmallestAi()) {
            return Optional.of(((SmallestAiValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<TavusVoice> getTavus() {
        if (isTavus()) {
            return Optional.of(((TavusValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<VapiVoice> getVapi() {
        if (isVapi()) {
            return Optional.of(((VapiValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<Object> _getUnknown() {
        if (_isUnknown()) {
            return Optional.of(((_UnknownValue) value).value);
        }
        return Optional.empty();
    }

    @JsonValue
    private Value getValue() {
        return this.value;
    }

    public interface Visitor<T> {
        T visitAzure(AzureVoice azure);

        T visitCartesia(CartesiaVoice cartesia);

        T visitCustomVoice(CustomVoice customVoice);

        T visitDeepgram(DeepgramVoice deepgram);

        T visit11Labs(ElevenLabsVoice _11Labs);

        T visitHume(HumeVoice hume);

        T visitLmnt(LmntVoice lmnt);

        T visitNeuphonic(NeuphonicVoice neuphonic);

        T visitOpenai(OpenAiVoice openai);

        T visitPlayht(PlayHtVoice playht);

        T visitRimeAi(RimeAiVoice rimeAi);

        T visitSmallestAi(SmallestAiVoice smallestAi);

        T visitTavus(TavusVoice tavus);

        T visitVapi(VapiVoice vapi);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "provider", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(AzureValue.class),
        @JsonSubTypes.Type(CartesiaValue.class),
        @JsonSubTypes.Type(CustomVoiceValue.class),
        @JsonSubTypes.Type(DeepgramValue.class),
        @JsonSubTypes.Type(_11LabsValue.class),
        @JsonSubTypes.Type(HumeValue.class),
        @JsonSubTypes.Type(LmntValue.class),
        @JsonSubTypes.Type(NeuphonicValue.class),
        @JsonSubTypes.Type(OpenaiValue.class),
        @JsonSubTypes.Type(PlayhtValue.class),
        @JsonSubTypes.Type(RimeAiValue.class),
        @JsonSubTypes.Type(SmallestAiValue.class),
        @JsonSubTypes.Type(TavusValue.class),
        @JsonSubTypes.Type(VapiValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("azure")
    @JsonIgnoreProperties("provider")
    private static final class AzureValue implements Value {
        @JsonUnwrapped
        private AzureVoice value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private AzureValue() {}

        private AzureValue(AzureVoice value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitAzure(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof AzureValue && equalTo((AzureValue) other);
        }

        private boolean equalTo(AzureValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "UpdateAssistantDtoVoice{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("cartesia")
    @JsonIgnoreProperties("provider")
    private static final class CartesiaValue implements Value {
        @JsonUnwrapped
        private CartesiaVoice value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CartesiaValue() {}

        private CartesiaValue(CartesiaVoice value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitCartesia(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof CartesiaValue && equalTo((CartesiaValue) other);
        }

        private boolean equalTo(CartesiaValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "UpdateAssistantDtoVoice{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("custom-voice")
    @JsonIgnoreProperties("provider")
    private static final class CustomVoiceValue implements Value {
        @JsonUnwrapped
        private CustomVoice value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CustomVoiceValue() {}

        private CustomVoiceValue(CustomVoice value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitCustomVoice(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof CustomVoiceValue && equalTo((CustomVoiceValue) other);
        }

        private boolean equalTo(CustomVoiceValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "UpdateAssistantDtoVoice{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("deepgram")
    @JsonIgnoreProperties("provider")
    private static final class DeepgramValue implements Value {
        @JsonUnwrapped
        private DeepgramVoice value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private DeepgramValue() {}

        private DeepgramValue(DeepgramVoice value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitDeepgram(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof DeepgramValue && equalTo((DeepgramValue) other);
        }

        private boolean equalTo(DeepgramValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "UpdateAssistantDtoVoice{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("11labs")
    @JsonIgnoreProperties("provider")
    private static final class _11LabsValue implements Value {
        @JsonUnwrapped
        private ElevenLabsVoice value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private _11LabsValue() {}

        private _11LabsValue(ElevenLabsVoice value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visit11Labs(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof _11LabsValue && equalTo((_11LabsValue) other);
        }

        private boolean equalTo(_11LabsValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "UpdateAssistantDtoVoice{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("hume")
    @JsonIgnoreProperties("provider")
    private static final class HumeValue implements Value {
        @JsonUnwrapped
        private HumeVoice value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private HumeValue() {}

        private HumeValue(HumeVoice value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitHume(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof HumeValue && equalTo((HumeValue) other);
        }

        private boolean equalTo(HumeValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "UpdateAssistantDtoVoice{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("lmnt")
    @JsonIgnoreProperties("provider")
    private static final class LmntValue implements Value {
        @JsonUnwrapped
        private LmntVoice value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private LmntValue() {}

        private LmntValue(LmntVoice value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitLmnt(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof LmntValue && equalTo((LmntValue) other);
        }

        private boolean equalTo(LmntValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "UpdateAssistantDtoVoice{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("neuphonic")
    @JsonIgnoreProperties("provider")
    private static final class NeuphonicValue implements Value {
        @JsonUnwrapped
        private NeuphonicVoice value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private NeuphonicValue() {}

        private NeuphonicValue(NeuphonicVoice value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitNeuphonic(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof NeuphonicValue && equalTo((NeuphonicValue) other);
        }

        private boolean equalTo(NeuphonicValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "UpdateAssistantDtoVoice{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("openai")
    @JsonIgnoreProperties("provider")
    private static final class OpenaiValue implements Value {
        @JsonUnwrapped
        private OpenAiVoice value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private OpenaiValue() {}

        private OpenaiValue(OpenAiVoice value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitOpenai(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof OpenaiValue && equalTo((OpenaiValue) other);
        }

        private boolean equalTo(OpenaiValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "UpdateAssistantDtoVoice{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("playht")
    @JsonIgnoreProperties("provider")
    private static final class PlayhtValue implements Value {
        @JsonUnwrapped
        private PlayHtVoice value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private PlayhtValue() {}

        private PlayhtValue(PlayHtVoice value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitPlayht(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof PlayhtValue && equalTo((PlayhtValue) other);
        }

        private boolean equalTo(PlayhtValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "UpdateAssistantDtoVoice{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("rime-ai")
    @JsonIgnoreProperties("provider")
    private static final class RimeAiValue implements Value {
        @JsonUnwrapped
        private RimeAiVoice value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private RimeAiValue() {}

        private RimeAiValue(RimeAiVoice value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitRimeAi(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof RimeAiValue && equalTo((RimeAiValue) other);
        }

        private boolean equalTo(RimeAiValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "UpdateAssistantDtoVoice{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("smallest-ai")
    @JsonIgnoreProperties("provider")
    private static final class SmallestAiValue implements Value {
        @JsonUnwrapped
        private SmallestAiVoice value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private SmallestAiValue() {}

        private SmallestAiValue(SmallestAiVoice value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitSmallestAi(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof SmallestAiValue && equalTo((SmallestAiValue) other);
        }

        private boolean equalTo(SmallestAiValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "UpdateAssistantDtoVoice{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("tavus")
    @JsonIgnoreProperties("provider")
    private static final class TavusValue implements Value {
        @JsonUnwrapped
        private TavusVoice value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private TavusValue() {}

        private TavusValue(TavusVoice value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitTavus(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof TavusValue && equalTo((TavusValue) other);
        }

        private boolean equalTo(TavusValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "UpdateAssistantDtoVoice{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("vapi")
    @JsonIgnoreProperties("provider")
    private static final class VapiValue implements Value {
        @JsonUnwrapped
        private VapiVoice value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private VapiValue() {}

        private VapiValue(VapiVoice value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitVapi(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof VapiValue && equalTo((VapiValue) other);
        }

        private boolean equalTo(VapiValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "UpdateAssistantDtoVoice{" + "value: " + value + "}";
        }
    }

    @JsonIgnoreProperties("provider")
    private static final class _UnknownValue implements Value {
        private String type;

        @JsonValue
        private Object value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private _UnknownValue(@JsonProperty("value") Object value) {}

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor._visitUnknown(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof _UnknownValue && equalTo((_UnknownValue) other);
        }

        private boolean equalTo(_UnknownValue other) {
            return type.equals(other.type) && value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.type, this.value);
        }

        @java.lang.Override
        public String toString() {
            return "UpdateAssistantDtoVoice{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
