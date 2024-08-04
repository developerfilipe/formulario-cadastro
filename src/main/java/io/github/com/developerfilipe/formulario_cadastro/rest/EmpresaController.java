package io.github.com.developerfilipe.formulario_cadastro.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.com.developerfilipe.formulario_cadastro.dto.EmpresaDTO;
import io.github.com.developerfilipe.formulario_cadastro.entity.EmpresaEntity;
import io.github.com.developerfilipe.formulario_cadastro.service.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
	
	
	@Autowired
	private EmpresaService empresaService;
	
	@PostMapping("/criar-empresa")
	public EmpresaEntity  criarEmpresa(@RequestBody EmpresaDTO dto) {
		return empresaService.salvarEmpresa(dto.getNomeEmpresa(), dto.getEmailEmpresa()); 
	}

}
