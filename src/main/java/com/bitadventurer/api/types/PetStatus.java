/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.bitadventurer.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PetStatus {
    AVAILABLE("available"),

    PENDING("pending"),

    SOLD("sold");

    private final String value;

    PetStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
