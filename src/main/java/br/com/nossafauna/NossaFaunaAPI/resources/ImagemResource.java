package br.com.nossafauna.NossaFaunaAPI.resources;

import br.com.nossafauna.NossaFaunaAPI.models.Imagem;
import br.com.nossafauna.NossaFaunaAPI.repository.ImagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api")
public class ImagemResource {
    @Autowired
    ImagemRepository imagemRepository;
    @GetMapping("/imagesByAnimal/{id}")
    public List<Imagem> listarImagensByAnimal( @PathVariable(value="id") long id ){
        return imagemRepository.findImagesByAnimal( id );
    }
    @GetMapping("/imagens")
    public List<Imagem> listarImagens(){
        return imagemRepository.findAll();
    }
    @GetMapping("/imagem/{id}")
    public Optional<Imagem> listaImagemPorId(@PathVariable(value="id") long id ){
        return imagemRepository.findById(id);
    }
    @PostMapping("/imagem")
    public Imagem salvaImagem(@RequestBody Imagem imagem){
        return imagemRepository.save(imagem);
    }
    @DeleteMapping("/imagem/{id}")
    public void deletaImagem(@PathVariable(value="id") long id){
        imagemRepository.deleteById(id);
    }
    @PutMapping("/imagem")
    public Imagem atualizaImagem(@RequestBody Imagem imagem){
        return imagemRepository.save(imagem);
    }
}
