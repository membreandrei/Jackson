package com.example.demo;

import java.io.IOException;
import java.io.StringWriter;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	String json = "{\"nom\": \"Andrei\", \"address\": {\"zipcode\": \"93100\", \"rue\": \"Rue Etienne Marcel\"} }";
    	
    	Personne p = jsonToJavaObjectPersonne(json);
    	
    	p.address.setZipcode("93101");
    	
    	System.out.println("Personne Object\n" + p);
    	
    	Personne p1 = newPersonne();
    	
    	System.out.println("\nPersonne JSON\n" + javaToJsonObject(p1));

    }
    
    public static Personne jsonToJavaObjectPersonne(String json) throws JsonParseException, JsonMappingException, IOException {
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	
    	Personne p = objectMapper.readValue(json, Personne.class);
    	
    	return p;
    }
    
    public static StringWriter javaToJsonObject(Object o) throws JsonGenerationException, JsonMappingException, IOException{
    	
    	ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
	       

		StringWriter stringPers = new StringWriter();
		objectMapper.writeValue(stringPers, o);
		return stringPers;
    }
    
    public static Personne newPersonne() {
        
    	Address a = new Address("93100", "Rue Etienne Marcel");
    	
    	Personne p = new Personne("Andrei", a);        
       
        return p;
    }
}
