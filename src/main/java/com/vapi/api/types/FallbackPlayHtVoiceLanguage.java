/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FallbackPlayHtVoiceLanguage {
    AFRIKAANS("afrikaans"),

    ALBANIAN("albanian"),

    AMHARIC("amharic"),

    ARABIC("arabic"),

    BENGALI("bengali"),

    BULGARIAN("bulgarian"),

    CATALAN("catalan"),

    CROATIAN("croatian"),

    CZECH("czech"),

    DANISH("danish"),

    DUTCH("dutch"),

    ENGLISH("english"),

    FRENCH("french"),

    GALICIAN("galician"),

    GERMAN("german"),

    GREEK("greek"),

    HEBREW("hebrew"),

    HINDI("hindi"),

    HUNGARIAN("hungarian"),

    INDONESIAN("indonesian"),

    ITALIAN("italian"),

    JAPANESE("japanese"),

    KOREAN("korean"),

    MALAY("malay"),

    MANDARIN("mandarin"),

    POLISH("polish"),

    PORTUGUESE("portuguese"),

    RUSSIAN("russian"),

    SERBIAN("serbian"),

    SPANISH("spanish"),

    SWEDISH("swedish"),

    TAGALOG("tagalog"),

    THAI("thai"),

    TURKISH("turkish"),

    UKRAINIAN("ukrainian"),

    URDU("urdu"),

    XHOSA("xhosa");

    private final String value;

    FallbackPlayHtVoiceLanguage(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
