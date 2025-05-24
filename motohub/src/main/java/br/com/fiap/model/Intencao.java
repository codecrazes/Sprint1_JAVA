package br.com.fiap.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Intencao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Moto moto;

    @Enumerated(EnumType.STRING)
    private TipoUso tipo;

    private LocalDate data = LocalDate.now();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public TipoUso getTipo() {
        return tipo;
    }

    public void setTipo(TipoUso tipo) {
        this.tipo = tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
