/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum VapiVoiceLanguage {
    EN_US("en-US"),

    EN_GB("en-GB"),

    EN_AU("en-AU"),

    EN_CA("en-CA"),

    JA("ja"),

    ZH("zh"),

    DE("de"),

    HI("hi"),

    FR_FR("fr-FR"),

    FR_CA("fr-CA"),

    KO("ko"),

    PT_BR("pt-BR"),

    PT_PT("pt-PT"),

    IT("it"),

    ES_ES("es-ES"),

    ES_MX("es-MX"),

    ID("id"),

    NL("nl"),

    TR("tr"),

    FIL("fil"),

    PL("pl"),

    SV("sv"),

    BG("bg"),

    RO("ro"),

    AR_SA("ar-SA"),

    AR_AE("ar-AE"),

    CS("cs"),

    EL("el"),

    FI("fi"),

    HR("hr"),

    MS("ms"),

    SK("sk"),

    DA("da"),

    TA("ta"),

    UK("uk"),

    RU("ru"),

    HU("hu"),

    NO("no"),

    VI("vi");

    private final String value;

    VapiVoiceLanguage(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
