/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum GoogleTranscriberLanguage {
    MULTILINGUAL("Multilingual"),

    ARABIC("Arabic"),

    BENGALI("Bengali"),

    BULGARIAN("Bulgarian"),

    CHINESE("Chinese"),

    CROATIAN("Croatian"),

    CZECH("Czech"),

    DANISH("Danish"),

    DUTCH("Dutch"),

    ENGLISH("English"),

    ESTONIAN("Estonian"),

    FINNISH("Finnish"),

    FRENCH("French"),

    GERMAN("German"),

    GREEK("Greek"),

    HEBREW("Hebrew"),

    HINDI("Hindi"),

    HUNGARIAN("Hungarian"),

    INDONESIAN("Indonesian"),

    ITALIAN("Italian"),

    JAPANESE("Japanese"),

    KOREAN("Korean"),

    LATVIAN("Latvian"),

    LITHUANIAN("Lithuanian"),

    NORWEGIAN("Norwegian"),

    POLISH("Polish"),

    PORTUGUESE("Portuguese"),

    ROMANIAN("Romanian"),

    RUSSIAN("Russian"),

    SERBIAN("Serbian"),

    SLOVAK("Slovak"),

    SLOVENIAN("Slovenian"),

    SPANISH("Spanish"),

    SWAHILI("Swahili"),

    SWEDISH("Swedish"),

    THAI("Thai"),

    TURKISH("Turkish"),

    UKRAINIAN("Ukrainian"),

    VIETNAMESE("Vietnamese");

    private final String value;

    GoogleTranscriberLanguage(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
