package com.github.tarcv.doom_servers.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * Console command to run on server
 */
@JsonTypeName
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ConsoleCommand extends Message {
    @Getter
    private final List<String> command;

    public ConsoleCommand(@JsonProperty("command") List<String> command) {
        this.command = command;
    }
}
