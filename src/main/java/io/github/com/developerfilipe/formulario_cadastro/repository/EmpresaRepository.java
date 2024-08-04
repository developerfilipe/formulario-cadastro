package io.github.com.developerfilipe.formulario_cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.com.developerfilipe.formulario_cadastro.entity.EmpresaEntity;

@Repository
public interface EmpresaRepository extends JpaRepository<EmpresaEntity, Long>{

}
