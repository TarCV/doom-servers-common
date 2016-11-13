package com.github.tarcv.doom_servers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by TarCV on 05.11.2016.
 */
public class ServerConfiguration {
    /**
     * Command-line arguments which should be passed to the game executable.
     *
     * @return list of command-line arguments
     */
    @Getter
    private final List<String> commandline;

    /**
     * Configuration files content in the following format:<br />
     * (filename => list of file lines) <br />
     * File lines will be joined at Agent with System.lineSeparator() as delimiter
     *
     * @return Configuration files data
     */
    @Getter
    private final Map<String, List<String>> configs;

    public ServerConfiguration(
            @JsonProperty("commandline") List<String> commandline,
            @JsonProperty("configs") Map<String, List<String>> configs)
    {
        this.commandline = Collections.unmodifiableList(commandline);

        // We need to make List<String> unmodifiable too
        Map<String, List<String>> unmodifiableConfigs = configs.entrySet().parallelStream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        nameLines -> Collections.unmodifiableList(nameLines.getValue())
                ));
        this.configs = Collections.unmodifiableMap(unmodifiableConfigs);
    }

}
