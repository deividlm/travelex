package br.com.confidencecambio.javabasico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.iservice.IHelthService;

@RestController()
@RequestMapping(path = "/helth")
public class HelthController {
	
	
	@Autowired
	private IHelthService helthService;
	
	@PostMapping(path="/imc")
	public ResponseEntity<Double> calculateImc(
			@RequestParam(value="weight", defaultValue="0") Double weight,
			@RequestParam(value="height", defaultValue="0") Double height){
		
		return ResponseEntity.ok(helthService.calculateImc(weight, height));
	}

}
