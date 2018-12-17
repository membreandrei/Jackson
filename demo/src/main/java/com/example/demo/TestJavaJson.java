package com.example.demo;



import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


public class TestJavaJson {

	@Test
	public void jsonToJava() throws JsonParseException, JsonMappingException, IOException {
		
		String json = "{\"nom\": \"Andrei\", \"address\": {\"zipcode\": \"93100\", \"rue\": \"Rue Etienne Marcel\"} }";
    	
    	assertEquals(Main.newPersonne(), Main.jsonToJavaObjectPersonne(json));
	}
	
	@Test
	public void javaToJson() throws JsonGenerationException, JsonMappingException, IOException {
			
		String json = "{\r\n" + 
				"  \"nom\" : \"Andrei\",\r\n" + 
				"  \"address\" : {\r\n" + 
				"    \"zipcode\" : \"93100\",\r\n" + 
				"    \"rue\" : \"Rue Etienne Marcel\"\r\n" + 
				"  }\r\n" + 
				"}";
		
		assertEquals(json, Main.javaToJsonObject(Main.newPersonne()).toString());
	}

}
