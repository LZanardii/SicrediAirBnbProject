package br.sicredi.airbnb.demo.repository;

import br.sicredi.airbnb.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUsuario extends JpaRepository<Usuario, Long>{

}