package com.github.tarcv.doom_servers.messages;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.EqualsAndHashCode;

/**
 * Command to run a server
 */
@JsonTypeName
@EqualsAndHashCode(callSuper = true)
public class ServerStarted extends Message {
    Throwable error;

    public ServerStarted(@JsonProperty("error") Throwable error) {
        this.error = error;
    }

    @JsonIgnore
    public boolean isSuccessful() {
        return (error == null);
    }

    public Throwable getError() {
        return this.error;
    }

    public String toString() {
        return "com.github.tarcv.doom_servers.messages.ServerStarted(error=" + this.getError() + ")";
    }
}
