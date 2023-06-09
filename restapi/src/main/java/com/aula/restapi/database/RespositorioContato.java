package com.aula.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.restapi.model.Contato;

public interface RespositorioContato extends JpaRepository<Contato,Long>{
    
}
