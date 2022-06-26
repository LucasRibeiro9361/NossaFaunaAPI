package br.com.nossafauna.NossaFaunaAPI.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_categoria;
    private String titulo;
    private String url_img;

    public Categoria(long id_categoria, String titulo, String url_img) {
        this.id_categoria = id_categoria;
        this.titulo = titulo;
        this.url_img = url_img;
    }

    public Categoria() {
    }

    public long getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(long id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl_img() {
        return url_img;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }
}
