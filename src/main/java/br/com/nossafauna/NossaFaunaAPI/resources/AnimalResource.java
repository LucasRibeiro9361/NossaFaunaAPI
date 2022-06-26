package br.com.nossafauna.NossaFaunaAPI.resources;

import br.com.nossafauna.NossaFaunaAPI.models.Animal;
import br.com.nossafauna.NossaFaunaAPI.repository.AnimalRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Animais")
@CrossOrigin(origins="*")

public class AnimalResource {

    @Autowired
    AnimalRepository animalRepository;

    @GetMapping("/animalsByCategoria/{id}")
    @ApiOperation(value="")
    public List<Animal> listaAnimais(@PathVariable(value="id") long id){
        return animalRepository.findAnimalsByCategoria(id);
    }
    @GetMapping("/animal/{id}")
    @ApiOperation(value="")
    public Optional<Animal> listaAnimalPorId(@PathVariable(value="id") long id ){
        return animalRepository.findById(id);
    }
    @GetMapping("/animais")
    @ApiOperation(value="")
    public List<Animal> listaAnimais(){
        return animalRepository.findAll();
    }
    @PostMapping("/animal")
    @ApiOperation(value="")
    public Animal salvaAnimal(@RequestBody Animal animal){
        return animalRepository.save(animal);
    }
    @DeleteMapping("/animal/{id}")
    @ApiOperation(value="")
    public void deletaAnimal(@PathVariable(value="id") long id){
        animalRepository.deleteById(id);
    }
    @PutMapping("/animal")
    @ApiOperation(value="")
    public Animal atualizaAnimal(@RequestBody Animal animal){
        return animalRepository.save(animal);
    }

}
