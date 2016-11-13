package com.github.tarcv.doom_servers.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.EqualsAndHashCode;

/**
 * 'Hello' message sent to Back by Agent
 */
@JsonTypeName
@EqualsAndHashCode(callSuper = true)
public class Hello extends Message {
    /**
     * Auth key of an agent
     */
    String key;

    public Hello(@JsonProperty("key") String key) {
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }

    public String toString() {
        return "com.github.tarcv.doom_servers.messages.Hello(key=" + this.getKey() + ")";
    }
}
