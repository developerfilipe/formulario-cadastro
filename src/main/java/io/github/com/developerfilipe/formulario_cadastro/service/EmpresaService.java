package io.github.com.developerfilipe.formulario_cadastro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.com.developerfilipe.formulario_cadastro.entity.EmpresaEntity;
import io.github.com.developerfilipe.formulario_cadastro.repository.EmpresaRepository;

@Service
public class EmpresaService {
	
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	public EmpresaEntity salvarEmpresa(String nomeEmpresa, String emailEmpresa) {
		
		
		EmpresaEntity empresa = new EmpresaEntity();
		empresa.setEmailEmpresa(emailEmpresa);
		empresa.setNomeEmpresa(nomeEmpresa);
	       
	    return empresaRepository.save(empresa);
	}

}

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

//@Service
//public class ExemploEntidadeService {
//    @Autowired
//    private ExemploEntidadeRepository exemploEntidadeRepository;
//
//    public ExemploEntidade salvarEntidade(String nome) {
//        ExemploEntidade entidade = new ExemploEntidade();
//        entidade.setNome(nome);
//        return exemploEntidadeRepository.save(entidade);
//    }
//}
