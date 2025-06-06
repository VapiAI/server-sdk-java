/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.vapi.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UpdateAzureCredentialDtoRegion {
    AUSTRALIA("australia"),

    CANADAEAST("canadaeast"),

    CANADACENTRAL("canadacentral"),

    EASTUS_2("eastus2"),

    EASTUS("eastus"),

    FRANCE("france"),

    INDIA("india"),

    JAPANEAST("japaneast"),

    JAPANWEST("japanwest"),

    UAENORTH("uaenorth"),

    NORTHCENTRALUS("northcentralus"),

    NORWAY("norway"),

    SOUTHCENTRALUS("southcentralus"),

    SWEDENCENTRAL("swedencentral"),

    SWITZERLAND("switzerland"),

    UK("uk"),

    WESTUS("westus"),

    WESTUS_3("westus3");

    private final String value;

    UpdateAzureCredentialDtoRegion(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
