package com.github.tarcv.doom_servers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class MessageTests {
    @Test
    public void helloShouldCorrectlySerialize() throws JsonProcessingException {
        String actual = Mapper.writeValueAsString(new Hello("someKey"));
        String expected = "{\"Hello\":{\"key\":\"someKey\"}}";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void helloShouldCorrectlyDeserialize() throws IOException {
        String json = "{\"Hello\":{\"key\":\"someKey\"}}";
        Message message = Mapper.readValue(json, Message.class);
        Assert.assertEquals(Hello.class, message.getClass());
        Assert.assertEquals("someKey", ((Hello)message).getKey());
    }

    @Test(expected = JsonMappingException.class)
    public void unknownTypeShouldCauseException() throws IOException {
        String json = "{\"SomeUnknownType\":{\"prop\":\"value\"}}";
        Mapper.readValue(json, Message.class);
    }
}
