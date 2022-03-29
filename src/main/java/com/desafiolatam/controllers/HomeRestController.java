package com.desafiolatam.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
	
	@RequestMapping("/")
	public String hola () {
		return "Hola Clase";// o mensaje, o jsp, u otra ruta (controlador)
	}
	@RequestMapping("/hola")
	public String saludo() {
		return "Hola Clase 2";// o mensaje, o jsp, u otra ruta (controlador)
	}

}
