package com.github.tarcv.doom_servers.messages;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import static com.fasterxml.jackson.annotation.JsonSubTypes.*;

/**
 * Base class for all messages
 */
@JsonTypeInfo(use= JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.WRAPPER_OBJECT)
@JsonSubTypes({
    @Type(Authenticated.class),
    @Type(ConsoleBuffer.class),
    @Type(ConsoleCommand.class),
    @Type(ConsoleResult.class),
    @Type(Error.class),
    @Type(Hello.class),
        //Mapper.class is not a message class
    @Type(RunServer.class),
    @Type(ServerStarted.class),
})
public abstract class Message
{
}
