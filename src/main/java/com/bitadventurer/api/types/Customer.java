/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.bitadventurer.api.types;

import com.bitadventurer.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Customer.Builder.class)
public final class Customer {
    private final Optional<Long> id;

    private final Optional<String> username;

    private final Optional<List<Address>> address;

    private final Map<String, Object> additionalProperties;

    private Customer(
            Optional<Long> id,
            Optional<String> username,
            Optional<List<Address>> address,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.username = username;
        this.address = address;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    @JsonProperty("username")
    public Optional<String> getUsername() {
        return username;
    }

    @JsonProperty("address")
    public Optional<List<Address>> getAddress() {
        return address;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Customer && equalTo((Customer) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Customer other) {
        return id.equals(other.id) && username.equals(other.username) && address.equals(other.address);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.username, this.address);
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
        private Optional<Long> id = Optional.empty();

        private Optional<String> username = Optional.empty();

        private Optional<List<Address>> address = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Customer other) {
            id(other.getId());
            username(other.getUsername());
            address(other.getAddress());
            return this;
        }

        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public Builder id(Optional<Long> id) {
            this.id = id;
            return this;
        }

        public Builder id(Long id) {
            this.id = Optional.ofNullable(id);
            return this;
        }

        @JsonSetter(value = "username", nulls = Nulls.SKIP)
        public Builder username(Optional<String> username) {
            this.username = username;
            return this;
        }

        public Builder username(String username) {
            this.username = Optional.ofNullable(username);
            return this;
        }

        @JsonSetter(value = "address", nulls = Nulls.SKIP)
        public Builder address(Optional<List<Address>> address) {
            this.address = address;
            return this;
        }

        public Builder address(List<Address> address) {
            this.address = Optional.ofNullable(address);
            return this;
        }

        public Customer build() {
            return new Customer(id, username, address, additionalProperties);
        }
    }
}
