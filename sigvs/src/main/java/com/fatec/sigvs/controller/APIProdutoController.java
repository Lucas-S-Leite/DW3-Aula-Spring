package com.fatec.sigvs.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.sigvs.servico.IProdutoServico;
@RestController
@RequestMapping("/api/v1/produtos")
		public class APIProdutoController {
		Logger logger = LogManager.getLogger(this.getClass());
		@Autowired
		IProdutoServico produtoServico;
		/**
		 * Consulta catalogo
		 * @return - JSON Array com todos os produtos ou um JSON Array vazio
		 */
		@CrossOrigin // desabilita o cors do spring security
		@GetMapping
		public ResponseEntity<Object> consultaTodos() {
		 logger.info(">>>>>> apicontroller consulta todos");
		 return ResponseEntity.status(HttpStatus.OK).body(produtoServico.consultaCatalogo());
		}
}
