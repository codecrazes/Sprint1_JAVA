package br.com.fiap.dto;

import br.com.fiap.model.TipoUso;

public class MotoDto {

    private Long id;
    private String modelo;
    private String marca;
    private int ano;
    private TipoUso tipoUso;
    private boolean disponivel;

    public MotoDto() {
    }

    public MotoDto(Long id, String modelo, String marca, int ano, TipoUso tipoUso, boolean disponivel) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.tipoUso = tipoUso;
        this.disponivel = disponivel;
    }

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
