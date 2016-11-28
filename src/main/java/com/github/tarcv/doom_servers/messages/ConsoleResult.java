package com.github.tarcv.doom_servers.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Collections;
import java.util.List;

/**
 * Result of a console command execution
 */
@JsonTypeName
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ConsoleResult extends Message {
    @Getter
    private final List<String> lines;

    public ConsoleResult(@JsonProperty("lines") List<String> lines) {
        this.lines = Collections.unmodifiableList(lines);
    }
}
