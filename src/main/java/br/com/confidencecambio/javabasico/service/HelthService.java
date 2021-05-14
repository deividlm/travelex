package br.com.confidencecambio.javabasico.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.confidencecambio.javabasico.iservice.IHelthService;

@Service
public class HelthService implements IHelthService {
	
	@Override
	public Double calculateImc(Double weight, Double height) {
		Double doubleHeight = Math.pow(height,2);
		Optional<Double> imc = Optional.ofNullable(weight/(doubleHeight)) ;
		
		return imc.orElse(0.0);
	}


}
