package com.devsuperior.crudclientes.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.crudclientes.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Alessia", "678.842.568-11", 0.0,  Instant.parse("1999-12-31T00:00:00.00Z"), 0));
		list.add(new Client(2L, "João" , "102.932.234-79", 1.0, Instant.parse("1990-10-23T00:00:00.00Z"), 0));
		return ResponseEntity.ok().body(list);
	}
	
	

	
}
