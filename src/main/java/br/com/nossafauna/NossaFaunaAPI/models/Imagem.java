package br.com.nossafauna.NossaFaunaAPI.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="imagem")

public class Imagem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_imagem;
    @ManyToOne
    @JoinColumn(name="id_animal")
    private Animal id_animal;
    private String url_imagem;

    public long getId_imagem() {
        return id_imagem;
    }

    public void setId_imagem(long id_imagem) {
        this.id_imagem = id_imagem;
    }

    public Animal getId_animal() {
        return id_animal;
    }

    public void setId_animal(Animal id_animal) {
        this.id_animal = id_animal;
    }

    public String getUrl_imagem() {
        return url_imagem;
    }

    public void setUrl_imagem(String url_imagem) {
        this.url_imagem = url_imagem;
    }
}
