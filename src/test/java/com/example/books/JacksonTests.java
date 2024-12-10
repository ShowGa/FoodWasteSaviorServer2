package com.example.books;

import com.example.books.domain.Book;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JacksonTests {

    // demonstrate how to use the Jackson object mapper by doing this
    @Test
    public void testThatObjectMapperCanCreateJsonFormatObject() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        Book book = Book.builder().isbn("123-456-7").title("ShowGod Legend").author("ShowGa").yearPublished("2024").build();

        String result = objectMapper.writeValueAsString(book);

        assertThat(result).isEqualTo("{\"isbn\":\"123-456-7\",\"title\":\"ShowGod Legend\",\"author\":\"ShowGa\",\"year\":\"2024\"}");
    }

    @Test
    public void testThatObjectMapperCanCreateJavaObject() throws JsonProcessingException {
        // wait for the check
        Book book = Book.builder().isbn("123-456-7").title("ShowGod Legend").author("ShowGa").yearPublished("2024").build();

        String json = "{\"isbt\":\"123-456-7\",\"isbn\":\"123-456-7\",\"title\":\"ShowGod Legend\",\"author\":\"ShowGa\",\"year\":\"2024\"}";

        ObjectMapper objectMapper = new ObjectMapper();

        Book result = objectMapper.readValue(json, Book.class);

        assertThat(result).isEqualTo(book);
    }
}
