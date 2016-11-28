package com.github.tarcv.doom_servers.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Command to run a server
 */
@JsonTypeName
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Error extends Message {
    @Getter
    private final Throwable error;

    public Error(@JsonProperty("error") Throwable error) {
        this.error = error;
    }
}
