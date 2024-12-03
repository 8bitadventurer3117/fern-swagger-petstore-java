/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.bitadventurer.api.resources.pet.requests;

import com.bitadventurer.api.core.ObjectMappers;
import com.bitadventurer.api.resources.pet.types.FindPetsByStatusRequestStatus;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = FindPetsByStatusRequest.Builder.class)
public final class FindPetsByStatusRequest {
    private final Optional<FindPetsByStatusRequestStatus> status;

    private final Map<String, Object> additionalProperties;

    private FindPetsByStatusRequest(
            Optional<FindPetsByStatusRequestStatus> status, Map<String, Object> additionalProperties) {
        this.status = status;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Status values that need to be considered for filter
     */
    @JsonProperty("status")
    public Optional<FindPetsByStatusRequestStatus> getStatus() {
        return status;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FindPetsByStatusRequest && equalTo((FindPetsByStatusRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FindPetsByStatusRequest other) {
        return status.equals(other.status);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.status);
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
        private Optional<FindPetsByStatusRequestStatus> status = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(FindPetsByStatusRequest other) {
            status(other.getStatus());
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<FindPetsByStatusRequestStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(FindPetsByStatusRequestStatus status) {
            this.status = Optional.ofNullable(status);
            return this;
        }

        public FindPetsByStatusRequest build() {
            return new FindPetsByStatusRequest(status, additionalProperties);
        }
    }
}
