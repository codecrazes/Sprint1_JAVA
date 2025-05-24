package br.com.fiap.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Moto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String modelo;

    @NotBlank
    private String marca;

    private int ano;

    @Enumerated(EnumType.STRING)
    private TipoUso tipoUso;

    private boolean disponivel = true;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public TipoUso getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(TipoUso tipoUso) {
        this.tipoUso = tipoUso;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

