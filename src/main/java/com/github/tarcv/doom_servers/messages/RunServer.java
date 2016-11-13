package com.github.tarcv.doom_servers.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.github.tarcv.doom_servers.ServerConfiguration;
import lombok.EqualsAndHashCode;

/**
 * Command to run a server
 */
@JsonTypeName
@EqualsAndHashCode(callSuper = true)
public class RunServer extends Message {
    ServerConfiguration configuration;

    public RunServer(@JsonProperty("configuration") ServerConfiguration configuration) {
        this.configuration = configuration;
    }

    public ServerConfiguration getConfiguration() {
        return this.configuration;
    }

    public String toString() {
        return "com.github.tarcv.doom_servers.messages.RunServer(configuration=" + this.getConfiguration() + ")";
    }
}
