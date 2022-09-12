package com.packagepractico.ejerciciospring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FichaMedicaRepository extends CrudRepository<FichaMedica, String> {
    
}
