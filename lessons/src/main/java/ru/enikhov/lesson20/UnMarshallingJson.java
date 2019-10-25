package ru.enikhov.lesson20;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.net.URL;

public class UnMarshallingJson {
    public static void main(String[] args) {
        new Fact().getDescription();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            for (int i = 0; i < 10; i++) {
                URL url = new URL("http://numbersapi.com/random/year?json");
                Fact fact = objectMapper.readValue(url, Fact.class);
                System.out.println(fact);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
