package com.algaworks.osworks.domain.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.algaworks.osworks.api.model.Comentario;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Long>{

}
