package com.github.tarcv.doom_servers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xebia.jacksonlombok.JacksonLombokAnnotationIntrospector;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Serializer/Deserializer
 */
public class Mapper {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper().setAnnotationIntrospector(new JacksonLombokAnnotationIntrospector());

    private Mapper() {
    }

    public static String writeValueAsString(Message message) throws JsonProcessingException {
        return OBJECT_MAPPER.writeValueAsString(message);
    }

    public static void writeValue(OutputStream stream, Message message) throws IOException {
        OBJECT_MAPPER.writeValue(stream, message);
    }
    public static Message readValue(String json, Class<? extends Message> messageClass) throws IOException {
        return OBJECT_MAPPER.readValue(json, messageClass);
    }

}
