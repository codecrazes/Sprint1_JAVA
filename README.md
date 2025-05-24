# 🏍️ MotoHub

MotoHub é uma API REST desenvolvida como parte de uma parceria acadêmica entre a **FIAP** e a empresa **Mottu**, com o objetivo de gerenciar dados relacionados a motos, intenções de compra e clientes. O projeto simula operações de cadastro, listagem, atualização e exclusão dessas entidades.

## 👨‍💻 Integrantes

- Caroline Assis Silva - RM 557596  
- Enzo de Moura Silva - RM 556532  
- Luis Henrique Gomes Cardoso - RM 558883  

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Maven
- JPA (Hibernate)
- Banco de dados H2 (em memória)
- Swagger/OpenAPI para documentação

---

## ▶️ Como Rodar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/codecrazes/Sprint1_JAVA.git
   cd Sprint1_JAVA

2. Compile e execute a aplicação:
    ```bash
    mvn spring-boot:run

## 🧪 Testando a API

Você pode usar ferramentas como **Postman** ou **Insomnia** para testar os endpoints abaixo. A API roda localmente em:  
`http://localhost:8080`

---

### 📍 1. Criar Cliente

**URL:** `POST http://localhost:8080/clientes`

**Exemplo de JSON:**
```json
{
  "nome": "Maria Oliveira",
  "email": "maria@email.com",
  "telefone": "11998765432"
}
````
📍 2. Criar Motos
URL: POST http://localhost:8080/motos

Exemplo de JSON - Moto 1:
```json
{
  "modelo": "MT-07",
  "marca": "Yamaha",
  "ano": 2023,
  "tipoUso": "VENDA"
}
```
Exemplo de JSON - Moto 2:
```json
{
  "modelo": "XRE 300",
  "marca": "Honda",
  "ano": 2022,
  "tipoUso": "ALUGUEL"
}
```

📍 3. Criar Intenção
URL: POST http://localhost:8080/intencao

Exemplo de JSON:
```json
{
  "cliente": {
    "id": 1
  },
  "moto": {
    "id": 1
  },
  "tipo": "VENDA"
}
```











  
