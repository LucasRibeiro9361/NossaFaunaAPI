package br.com.nossafauna.NossaFaunaAPI.repository;

import br.com.nossafauna.NossaFaunaAPI.models.Animal;
import br.com.nossafauna.NossaFaunaAPI.models.Categoria;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;


import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class AnimalRepositoryTest {

    @Autowired
    private AnimalRepository animalRep;
    @Autowired
    private CategoriaRepository categoriaRep;

    @Test
    void findAnimalsByCategoria() {
        Categoria categoria = new Categoria(1,"mamifero","x");
        Animal animal = new Animal(8,categoria,"Leopardo","","","","","","","","",false,false,"");

        categoriaRep.save(categoria);
        animalRep.save(animal);

        List<Animal> animalNew = animalRep.findAnimalsByCategoria(1);

        assertSame("Leopardo", animalNew.get(0).getNome());
    }
}