package br.com.fiap.dto;

public class IntencaoDto {

    private Long id;
    private Long clienteId;
    private Long motoId;

    public IntencaoDto() {
    }

    public IntencaoDto(Long id, Long clienteId, Long motoId) {
        this.id = id;
        this.clienteId = clienteId;
        this.motoId = motoId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Long getMotoId() {
        return motoId;
    }

    public void setMotoId(Long motoId) {
        this.motoId = motoId;
    }
}
