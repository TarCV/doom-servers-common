package com.github.tarcv.doom_servers.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.EqualsAndHashCode;

/**
 * Result of an authentication attempt
 */
@JsonTypeName
@EqualsAndHashCode(callSuper = true)
public class Authenticated extends Message {
    boolean successful;

    public Authenticated(@JsonProperty("successful") boolean successful) {
        this.successful = successful;
    }

    public boolean isSuccessful() {
        return this.successful;
    }

    public String toString() {
        return "com.github.tarcv.doom_servers.messages.Authenticated(successful=" + this.isSuccessful() + ")";
    }
}
