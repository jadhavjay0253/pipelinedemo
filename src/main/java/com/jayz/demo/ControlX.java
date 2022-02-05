package com.jayz.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlX {

	@GetMapping("/show")
	public ResponseEntity<?> getIt() {
		return ResponseEntity.ok("Im Running...");
	}
}