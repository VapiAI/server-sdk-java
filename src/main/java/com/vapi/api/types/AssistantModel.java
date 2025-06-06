/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.Optional;

public final class AssistantModel {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private AssistantModel(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static AssistantModel anthropic(AnthropicModel value) {
        return new AssistantModel(new AnthropicValue(value));
    }

    public static AssistantModel anyscale(AnyscaleModel value) {
        return new AssistantModel(new AnyscaleValue(value));
    }

    public static AssistantModel cerebras(CerebrasModel value) {
        return new AssistantModel(new CerebrasValue(value));
    }

    public static AssistantModel customLlm(CustomLlmModel value) {
        return new AssistantModel(new CustomLlmValue(value));
    }

    public static AssistantModel deepinfra(DeepInfraModel value) {
        return new AssistantModel(new DeepinfraValue(value));
    }

    public static AssistantModel deepSeek(DeepSeekModel value) {
        return new AssistantModel(new DeepSeekValue(value));
    }

    public static AssistantModel google(GoogleModel value) {
        return new AssistantModel(new GoogleValue(value));
    }

    public static AssistantModel groq(GroqModel value) {
        return new AssistantModel(new GroqValue(value));
    }

    public static AssistantModel inflectionAi(InflectionAiModel value) {
        return new AssistantModel(new InflectionAiValue(value));
    }

    public static AssistantModel openai(OpenAiModel value) {
        return new AssistantModel(new OpenaiValue(value));
    }

    public static AssistantModel openrouter(OpenRouterModel value) {
        return new AssistantModel(new OpenrouterValue(value));
    }

    public static AssistantModel perplexityAi(PerplexityAiModel value) {
        return new AssistantModel(new PerplexityAiValue(value));
    }

    public static AssistantModel togetherAi(TogetherAiModel value) {
        return new AssistantModel(new TogetherAiValue(value));
    }

    public static AssistantModel xai(XaiModel value) {
        return new AssistantModel(new XaiValue(value));
    }

    public boolean isAnthropic() {
        return value instanceof AnthropicValue;
    }

    public boolean isAnyscale() {
        return value instanceof AnyscaleValue;
    }

    public boolean isCerebras() {
        return value instanceof CerebrasValue;
    }

    public boolean isCustomLlm() {
        return value instanceof CustomLlmValue;
    }

    public boolean isDeepinfra() {
        return value instanceof DeepinfraValue;
    }

    public boolean isDeepSeek() {
        return value instanceof DeepSeekValue;
    }

    public boolean isGoogle() {
        return value instanceof GoogleValue;
    }

    public boolean isGroq() {
        return value instanceof GroqValue;
    }

    public boolean isInflectionAi() {
        return value instanceof InflectionAiValue;
    }

    public boolean isOpenai() {
        return value instanceof OpenaiValue;
    }

    public boolean isOpenrouter() {
        return value instanceof OpenrouterValue;
    }

    public boolean isPerplexityAi() {
        return value instanceof PerplexityAiValue;
    }

    public boolean isTogetherAi() {
        return value instanceof TogetherAiValue;
    }

    public boolean isXai() {
        return value instanceof XaiValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<AnthropicModel> getAnthropic() {
        if (isAnthropic()) {
            return Optional.of(((AnthropicValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<AnyscaleModel> getAnyscale() {
        if (isAnyscale()) {
            return Optional.of(((AnyscaleValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CerebrasModel> getCerebras() {
        if (isCerebras()) {
            return Optional.of(((CerebrasValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<CustomLlmModel> getCustomLlm() {
        if (isCustomLlm()) {
            return Optional.of(((CustomLlmValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<DeepInfraModel> getDeepinfra() {
        if (isDeepinfra()) {
            return Optional.of(((DeepinfraValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<DeepSeekModel> getDeepSeek() {
        if (isDeepSeek()) {
            return Optional.of(((DeepSeekValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<GoogleModel> getGoogle() {
        if (isGoogle()) {
            return Optional.of(((GoogleValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<GroqModel> getGroq() {
        if (isGroq()) {
            return Optional.of(((GroqValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<InflectionAiModel> getInflectionAi() {
        if (isInflectionAi()) {
            return Optional.of(((InflectionAiValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<OpenAiModel> getOpenai() {
        if (isOpenai()) {
            return Optional.of(((OpenaiValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<OpenRouterModel> getOpenrouter() {
        if (isOpenrouter()) {
            return Optional.of(((OpenrouterValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<PerplexityAiModel> getPerplexityAi() {
        if (isPerplexityAi()) {
            return Optional.of(((PerplexityAiValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<TogetherAiModel> getTogetherAi() {
        if (isTogetherAi()) {
            return Optional.of(((TogetherAiValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<XaiModel> getXai() {
        if (isXai()) {
            return Optional.of(((XaiValue) value).value);
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
        T visitAnthropic(AnthropicModel anthropic);

        T visitAnyscale(AnyscaleModel anyscale);

        T visitCerebras(CerebrasModel cerebras);

        T visitCustomLlm(CustomLlmModel customLlm);

        T visitDeepinfra(DeepInfraModel deepinfra);

        T visitDeepSeek(DeepSeekModel deepSeek);

        T visitGoogle(GoogleModel google);

        T visitGroq(GroqModel groq);

        T visitInflectionAi(InflectionAiModel inflectionAi);

        T visitOpenai(OpenAiModel openai);

        T visitOpenrouter(OpenRouterModel openrouter);

        T visitPerplexityAi(PerplexityAiModel perplexityAi);

        T visitTogetherAi(TogetherAiModel togetherAi);

        T visitXai(XaiModel xai);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "provider", visible = true, defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(AnthropicValue.class),
        @JsonSubTypes.Type(AnyscaleValue.class),
        @JsonSubTypes.Type(CerebrasValue.class),
        @JsonSubTypes.Type(CustomLlmValue.class),
        @JsonSubTypes.Type(DeepinfraValue.class),
        @JsonSubTypes.Type(DeepSeekValue.class),
        @JsonSubTypes.Type(GoogleValue.class),
        @JsonSubTypes.Type(GroqValue.class),
        @JsonSubTypes.Type(InflectionAiValue.class),
        @JsonSubTypes.Type(OpenaiValue.class),
        @JsonSubTypes.Type(OpenrouterValue.class),
        @JsonSubTypes.Type(PerplexityAiValue.class),
        @JsonSubTypes.Type(TogetherAiValue.class),
        @JsonSubTypes.Type(XaiValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("anthropic")
    @JsonIgnoreProperties("provider")
    private static final class AnthropicValue implements Value {
        @JsonUnwrapped
        private AnthropicModel value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private AnthropicValue() {}

        private AnthropicValue(AnthropicModel value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitAnthropic(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof AnthropicValue && equalTo((AnthropicValue) other);
        }

        private boolean equalTo(AnthropicValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AssistantModel{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("anyscale")
    @JsonIgnoreProperties("provider")
    private static final class AnyscaleValue implements Value {
        @JsonUnwrapped
        private AnyscaleModel value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private AnyscaleValue() {}

        private AnyscaleValue(AnyscaleModel value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitAnyscale(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof AnyscaleValue && equalTo((AnyscaleValue) other);
        }

        private boolean equalTo(AnyscaleValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AssistantModel{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("cerebras")
    @JsonIgnoreProperties("provider")
    private static final class CerebrasValue implements Value {
        @JsonUnwrapped
        private CerebrasModel value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CerebrasValue() {}

        private CerebrasValue(CerebrasModel value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitCerebras(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof CerebrasValue && equalTo((CerebrasValue) other);
        }

        private boolean equalTo(CerebrasValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AssistantModel{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("custom-llm")
    @JsonIgnoreProperties("provider")
    private static final class CustomLlmValue implements Value {
        @JsonUnwrapped
        private CustomLlmModel value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CustomLlmValue() {}

        private CustomLlmValue(CustomLlmModel value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitCustomLlm(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof CustomLlmValue && equalTo((CustomLlmValue) other);
        }

        private boolean equalTo(CustomLlmValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AssistantModel{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("deepinfra")
    @JsonIgnoreProperties("provider")
    private static final class DeepinfraValue implements Value {
        @JsonUnwrapped
        private DeepInfraModel value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private DeepinfraValue() {}

        private DeepinfraValue(DeepInfraModel value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitDeepinfra(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof DeepinfraValue && equalTo((DeepinfraValue) other);
        }

        private boolean equalTo(DeepinfraValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AssistantModel{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("deep-seek")
    @JsonIgnoreProperties("provider")
    private static final class DeepSeekValue implements Value {
        @JsonUnwrapped
        private DeepSeekModel value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private DeepSeekValue() {}

        private DeepSeekValue(DeepSeekModel value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitDeepSeek(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof DeepSeekValue && equalTo((DeepSeekValue) other);
        }

        private boolean equalTo(DeepSeekValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AssistantModel{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("google")
    @JsonIgnoreProperties("provider")
    private static final class GoogleValue implements Value {
        @JsonUnwrapped
        private GoogleModel value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private GoogleValue() {}

        private GoogleValue(GoogleModel value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitGoogle(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof GoogleValue && equalTo((GoogleValue) other);
        }

        private boolean equalTo(GoogleValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AssistantModel{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("groq")
    @JsonIgnoreProperties("provider")
    private static final class GroqValue implements Value {
        @JsonUnwrapped
        private GroqModel value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private GroqValue() {}

        private GroqValue(GroqModel value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitGroq(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof GroqValue && equalTo((GroqValue) other);
        }

        private boolean equalTo(GroqValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AssistantModel{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("inflection-ai")
    @JsonIgnoreProperties("provider")
    private static final class InflectionAiValue implements Value {
        @JsonUnwrapped
        private InflectionAiModel value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private InflectionAiValue() {}

        private InflectionAiValue(InflectionAiModel value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitInflectionAi(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof InflectionAiValue && equalTo((InflectionAiValue) other);
        }

        private boolean equalTo(InflectionAiValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AssistantModel{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("openai")
    @JsonIgnoreProperties("provider")
    private static final class OpenaiValue implements Value {
        @JsonUnwrapped
        private OpenAiModel value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private OpenaiValue() {}

        private OpenaiValue(OpenAiModel value) {
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
            return "AssistantModel{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("openrouter")
    @JsonIgnoreProperties("provider")
    private static final class OpenrouterValue implements Value {
        @JsonUnwrapped
        private OpenRouterModel value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private OpenrouterValue() {}

        private OpenrouterValue(OpenRouterModel value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitOpenrouter(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof OpenrouterValue && equalTo((OpenrouterValue) other);
        }

        private boolean equalTo(OpenrouterValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AssistantModel{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("perplexity-ai")
    @JsonIgnoreProperties("provider")
    private static final class PerplexityAiValue implements Value {
        @JsonUnwrapped
        private PerplexityAiModel value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private PerplexityAiValue() {}

        private PerplexityAiValue(PerplexityAiModel value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitPerplexityAi(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof PerplexityAiValue && equalTo((PerplexityAiValue) other);
        }

        private boolean equalTo(PerplexityAiValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AssistantModel{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("together-ai")
    @JsonIgnoreProperties("provider")
    private static final class TogetherAiValue implements Value {
        @JsonUnwrapped
        private TogetherAiModel value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private TogetherAiValue() {}

        private TogetherAiValue(TogetherAiModel value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitTogetherAi(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof TogetherAiValue && equalTo((TogetherAiValue) other);
        }

        private boolean equalTo(TogetherAiValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AssistantModel{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("xai")
    @JsonIgnoreProperties("provider")
    private static final class XaiValue implements Value {
        @JsonUnwrapped
        private XaiModel value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private XaiValue() {}

        private XaiValue(XaiModel value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitXai(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof XaiValue && equalTo((XaiValue) other);
        }

        private boolean equalTo(XaiValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "AssistantModel{" + "value: " + value + "}";
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
            return "AssistantModel{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
