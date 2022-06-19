package br.com.nossafauna.NossaFaunaAPI.resources;

import br.com.nossafauna.NossaFaunaAPI.models.Animal;
import br.com.nossafauna.NossaFaunaAPI.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api")

public class AnimalResource {

    @Autowired
    AnimalRepository animalRepository;

    @GetMapping("/animalsByCategoria/{id}")
    public List<Animal> listaAnimais(@PathVariable(value="id") long id){
        return animalRepository.findAnimalsByCategoria(id);
    }
    @GetMapping("/animal/{id}")
    public Optional<Animal> listaAnimalPorId(@PathVariable(value="id") long id ){
        return animalRepository.findById(id);
    }
    @PostMapping("/animal")
    public Animal salvaAnimal(@RequestBody Animal animal){
        return animalRepository.save(animal);
    }
    @DeleteMapping("/animal/{id}")
    public void deletaAnimal(@PathVariable(value="id") long id){
        animalRepository.deleteById(id);
    }
    @PutMapping("/animal")
    public Animal atualizaAnimal(@RequestBody Animal animal){
        return animalRepository.save(animal);
    }

}
