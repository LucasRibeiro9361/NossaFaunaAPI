package br.com.nossafauna.NossaFaunaAPI.repository;

import br.com.nossafauna.NossaFaunaAPI.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
