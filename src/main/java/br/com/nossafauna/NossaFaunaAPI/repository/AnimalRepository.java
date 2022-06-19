package br.com.nossafauna.NossaFaunaAPI.repository;

import br.com.nossafauna.NossaFaunaAPI.models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    @Query( value = "SELECT * FROM animal a WHERE a.id_categoria = ?1", nativeQuery = true )
    List<Animal> findAnimalsByCategoria( long id );

}
