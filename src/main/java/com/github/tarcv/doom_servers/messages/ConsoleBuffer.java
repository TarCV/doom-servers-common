package com.github.tarcv.doom_servers.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Collections;
import java.util.List;

/**
 * Console lines that are not result of any agent command (i.e. not {@link ConsoleResult})
 */
@JsonTypeName
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ConsoleBuffer extends Message {
    @Getter
    private final List<String> lines;

    public ConsoleBuffer(@JsonProperty("lines") List<String> lines) {
        this.lines = Collections.unmodifiableList(lines);
    }
}
