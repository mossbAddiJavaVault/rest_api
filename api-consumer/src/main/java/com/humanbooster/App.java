package com.humanbooster;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String baseUrl = "http://localhost:8080/persons";
        try {
            
            String allPersons  = RestClient.sendRequest(baseUrl, "GET", null);
            System.out.println("All persons: " + allPersons);
    
    
            // POST a new person
            Person newPerson = new Person("John", "Doe");
            ObjectMapper objectMapper = new ObjectMapper();
            String newPersonJson = objectMapper.writeValueAsString(newPerson);
            String postResponse = RestClient.sendRequest(baseUrl, "POST", newPersonJson);
            System.out.println("POST response: " + postResponse);


            
        } catch (Exception e) {
        }




    }
}
