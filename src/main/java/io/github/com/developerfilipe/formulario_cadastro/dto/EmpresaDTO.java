package io.github.com.developerfilipe.formulario_cadastro.dto;

import java.time.LocalDate;


public class EmpresaDTO{
	
	private Long id;
	
	
	private String nomeEmpresa;
	
	
	private String emailEmpresa;

   
    private LocalDate dataCriacao;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNomeEmpresa() {
		return nomeEmpresa;
	}


	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}


	public String getEmailEmpresa() {
		return emailEmpresa;
	}


	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}


	public LocalDate getDataCriacao() {
		return dataCriacao;
	}


	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
    
    
}
