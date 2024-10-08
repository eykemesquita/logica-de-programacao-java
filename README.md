#### Este repositório contém todo o curso de lógica de programação Java da AlgaWorks, incluindo exemplos práticos e projetos desenvolvidos durante o curso. O objetivo é proporcionar uma compreensão sólida dos conceitos básicos de programação utilizando a linguagem Java.

### O projeto abaixo é de finalização do curso de Lógica de Programação em Java

# AlgaWorksContatos

Aplicação para o gerenciamento de contatos.

## Pré-requisitos

- Java 11
- Maven
- Um IDE de sua escolha (recomendado: Spring Tool Suite ou IntelliJ IDEA)

## Configuração do Projeto

1. Clone o repositório:
    ```sh
    git clone https://github.com/seu-usuario/algaworks-contatos.git
    ```
2. Navegue até o diretório do projeto:
    ```sh
    cd algaworks-contatos
    ```
3. Compile o projeto utilizando Maven:
    ```sh
    ./mvnw clean install
    ```

## Executando a Aplicação

1. Execute a aplicação:
    ```sh
    ./mvnw spring-boot:run
    ```
2. A aplicação estará disponível em `http://localhost:8080`.

## Utilizando a API

### 1. Utilizando GET

Para listar todos os contatos, faça uma requisição GET para o seguinte endpoint:
```sh
curl -X GET http://localhost:8080/contatos
```


### 2. Utilizando POST
```sh
curl -X POST http://localhost:8080/contatos -H "Content-Type: application/json" -d '{"nome": "João Silva", "email": "joao.silva@example.com"}'
```


### 3. Utilizando PUT
```sh
curl -X PUT http://localhost:8080/contatos/{id} -H "Content-Type: application/json" -d '{"nome": "João Silva", "email": "joao.silva@novoemail.com"}'
```


### 3. Utilizando DELETE
```sh
curl -X DELETE http://localhost:8080/contatos/{id}
```

## Licença

Este projeto está licenciado sob os termos da licença MIT. Veja o arquivo LICENSE para mais detalhes.

### Obrigado por visitar e ler meu repositório!

![Agradecimento](https://media.giphy.com/media/xT9IgG50Fb7Mi0prBC/giphy.gif)

<br></br>
CREDENCIAL:⬇️
<br></br>
[https://app.algaworks.com/certs/QDWLNM3WEX](https://app.algaworks.com/certs/MASR761014)

![Screenshot_3](https://github.com/user-attachments/assets/6ba14c05-8a92-4e84-99bb-2ebfae0e9f10)




