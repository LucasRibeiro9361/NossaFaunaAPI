package br.com.nossafauna.NossaFaunaAPI.resources;

import br.com.nossafauna.NossaFaunaAPI.models.Categoria;
import br.com.nossafauna.NossaFaunaAPI.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api")

public class CategoriaResource {

    @Autowired
    CategoriaRepository categoriaRepository;

    @GetMapping("/categorias")
    public List<Categoria> listaCategoria(){
        return categoriaRepository.findAll();
    };
    @GetMapping("/categoria/{id}")
    public Optional<Categoria> listaCategoriaPorId(@PathVariable(value="id") long id ){
        return categoriaRepository.findById(id);
    }
    @PostMapping("/categoria")
    public Categoria salvaCategoria(@RequestBody Categoria categoria){
        return categoriaRepository.save(categoria);
    }
    @DeleteMapping("/categoria/{id}")
    public void deletaCategoria(@PathVariable(value="id") long id){
        categoriaRepository.deleteById(id);
    }
    @PutMapping("/categoria")
    public Categoria atualizaCategoria(@RequestBody Categoria categoria){
        return categoriaRepository.save(categoria);
    }

}
