package br.com.nossafauna.NossaFaunaAPI.repository;

import br.com.nossafauna.NossaFaunaAPI.models.Animal;
import br.com.nossafauna.NossaFaunaAPI.models.Imagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ImagemRepository extends JpaRepository<Imagem,Long > {

    @Query( value = "SELECT * FROM imagem i WHERE i.id_animal = ?1", nativeQuery = true )
    List<Imagem> findImagesByAnimal(long id );

}
