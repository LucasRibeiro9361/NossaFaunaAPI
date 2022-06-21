package br.com.nossafauna.NossaFaunaAPI.resources;

import br.com.nossafauna.NossaFaunaAPI.models.Categoria;
import br.com.nossafauna.NossaFaunaAPI.repository.CategoriaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Categorias")
@CrossOrigin(origins="*")
public class CategoriaResource {

    @Autowired
    CategoriaRepository categoriaRepository;

    @GetMapping("/categorias")
    @ApiOperation(value="")
    public List<Categoria> listaCategoria(){
        return categoriaRepository.findAll();
    };
    @GetMapping("/categoria/{id}")
    @ApiOperation(value="")
    public Optional<Categoria> listaCategoriaPorId(@PathVariable(value="id") long id ){
        return categoriaRepository.findById(id);
    }
    @PostMapping("/categoria")
    @ApiOperation(value="")
    public Categoria salvaCategoria(@RequestBody Categoria categoria){
        return categoriaRepository.save(categoria);
    }
    @DeleteMapping("/categoria/{id}")
    @ApiOperation(value="")
    public void deletaCategoria(@PathVariable(value="id") long id){
        categoriaRepository.deleteById(id);
    }
    @PutMapping("/categoria")
    @ApiOperation(value="")
    public Categoria atualizaCategoria(@RequestBody Categoria categoria){
        return categoriaRepository.save(categoria);
    }

}
