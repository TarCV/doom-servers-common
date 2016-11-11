package com.github.tarcv.doom_servers;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * 'Hello' message sent to Back by Agent
 */
@JsonTypeName
@Value
@EqualsAndHashCode(callSuper = true)
public class Hello extends Message {
    /**
     * Auth key of an agent
     */
    String key;
}
