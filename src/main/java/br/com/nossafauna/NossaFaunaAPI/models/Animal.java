package br.com.nossafauna.NossaFaunaAPI.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="animal")

public class Animal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_animal;

    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria id_categoria;

    private String nome;
    private String nome_cientifico;
    private String img_profile_url;
    private String caracteristica;
    private String alimentacao;
    private String reproducao;
    private String habitat;
    private String import_eco;
    private String pegada_img_url;
    private boolean encontrado;
    private boolean favorito;
    private String background_image;

    public Animal(long id_animal, Categoria id_categoria, String nome, String nome_cientifico, String img_profile_url, String caracteristica, String alimentacao, String reproducao, String habitat, String import_eco, String pegada_img_url, boolean encontrado, boolean favorito, String background_image) {
        this.id_animal = id_animal;
        this.id_categoria = id_categoria;
        this.nome = nome;
        this.nome_cientifico = nome_cientifico;
        this.img_profile_url = img_profile_url;
        this.caracteristica = caracteristica;
        this.alimentacao = alimentacao;
        this.reproducao = reproducao;
        this.habitat = habitat;
        this.import_eco = import_eco;
        this.pegada_img_url = pegada_img_url;
        this.encontrado = encontrado;
        this.favorito = favorito;
        this.background_image = background_image;
    }

    public Animal() {
    }

    public long getId_animal() {
        return id_animal;
    }

    public void setId_animal(long id_animal) {
        this.id_animal = id_animal;
    }

    public Categoria getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Categoria categoria) {
        this.id_categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_cientifico() {
        return nome_cientifico;
    }

    public void setNome_cientifico(String nome_cientifico) {
        this.nome_cientifico = nome_cientifico;
    }

    public String getImg_profile_url() {
        return img_profile_url;
    }

    public void setImg_profile_url(String img_profile_url) {
        this.img_profile_url = img_profile_url;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getReproducao() {
        return reproducao;
    }

    public void setReproducao(String reproducao) {
        this.reproducao = reproducao;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getImport_eco() {
        return import_eco;
    }

    public void setImport_eco(String import_eco) {
        this.import_eco = import_eco;
    }

    public String getPegada_img_url() {
        return pegada_img_url;
    }

    public void setPegada_img_url(String pegada_img_url) {
        this.pegada_img_url = pegada_img_url;
    }

    public boolean isEncontrado() {
        return encontrado;
    }

    public void setEncontrado(boolean encontrado) {
        this.encontrado = encontrado;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public String getBackground_image() {
        return background_image;
    }

    public void setBackground_image(String background_image) {
        this.background_image = background_image;
    }
}
