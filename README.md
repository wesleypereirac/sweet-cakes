# SweetCakes — API REST

Projeto acadêmico desenvolvido para a disciplina de Desenvolvimento Web Back-End.

## Tecnologias

- Java
- Spring Boot
- Spring Data JPA
- Maven
- Banco de dados H2
- Postman

## Como executar

1. Instale uma versão do JDK compatível com o projeto.
2. Clone este repositório.
3. Abra o projeto no Eclipse usando **Existing Maven Projects**, selecionando a pasta que contém o `pom.xml`.
4. Aguarde o Maven baixar as dependências.
5. Execute a classe principal do Spring Boot.

## Endpoints

### Clientes
- `POST /clientes` — cadastrar cliente
- `GET /clientes` — listar clientes
- `GET /clientes/{id}` — consultar cliente por ID
- `DELETE /clientes/{id}` — apagar cliente

### Produtos
- `POST /produtos` — cadastrar produto
- `GET /produtos` — listar produtos
- `GET /produtos/{id}` — consultar produto por ID
- `DELETE /produtos/{id}` — apagar produto

### Pedidos
- `POST /pedidos` — cadastrar pedido
- `GET /pedidos` — listar pedidos
- `GET /pedidos/{id}` — consultar pedido por ID
- `DELETE /pedidos/{id}` — apagar pedido

## Console H2

Após iniciar a aplicação, pode acessar `http://localhost:8080/h2-console` para abrir o console do banco

A URL JDBC, o usuário e a senha devem corresponder às configurações de `application.properties`.

## Testes

Os endpoints podem ser testados utilizando o Postman, enviando e recebendo dados em JSON.
