package br.com.nossafauna.NossaFaunaAPI.resources;

import br.com.nossafauna.NossaFaunaAPI.models.Imagem;
import br.com.nossafauna.NossaFaunaAPI.repository.ImagemRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Imagens")
@CrossOrigin(origins="*")

public class ImagemResource {
    @Autowired
    ImagemRepository imagemRepository;
    @GetMapping("/imagesByAnimal/{id}")
    @ApiOperation(value="")

    public List<Imagem> listarImagensByAnimal( @PathVariable(value="id") long id ){
        return imagemRepository.findImagesByAnimal( id );
    }
    @GetMapping("/imagens")
    @ApiOperation(value="")
    public List<Imagem> listarImagens(){
        return imagemRepository.findAll();
    }
    @GetMapping("/imagem/{id}")
    @ApiOperation(value="")
    public Optional<Imagem> listaImagemPorId(@PathVariable(value="id") long id ){
        return imagemRepository.findById(id);
    }
    @PostMapping("/imagem")
    @ApiOperation(value="")
    public Imagem salvaImagem(@RequestBody Imagem imagem){
        return imagemRepository.save(imagem);
    }
    @DeleteMapping("/imagem/{id}")
    @ApiOperation(value="")
    public void deletaImagem(@PathVariable(value="id") long id){
        imagemRepository.deleteById(id);
    }
    @PutMapping("/imagem")
    @ApiOperation(value="")
    public Imagem atualizaImagem(@RequestBody Imagem imagem){
        return imagemRepository.save(imagem);
    }
}
