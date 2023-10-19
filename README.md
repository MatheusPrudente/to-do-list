<h2>
  Projeto To-do-list - Curso Online de Java - Rocketseat
</h2>

<p>
    <img src="https://img.shields.io/github/languages/count/MatheusPrudente/to-do-list"/>
    <img src="https://img.shields.io/github/repo-size/MatheusPrudente/to-do-list"/>
    <img src="https://img.shields.io/github/last-commit/MatheusPrudente/to-do-list"/>
    <img src="https://img.shields.io/github/issues/MatheusPrudente/to-do-list"/>
</p>


## Tecnologias 

Este projeto foi desenvolvido com as seguintes tecnologias : 

- Java (17)
- Spring Boot
- JPA / Hibernate
- Maven

## Projeto

  Projeto foi desenvolvido durante o curso *__Curso Online de Java__* oferecida pela [Rockeseat](https://www.rocketseat.com.br/). O projeto consiste em uma Api Rest de Gerenciamento de Tarefas

## Documentação da API

#### URL base

```https
  http://localhost:8080/to-do-list
```

#### Criar um usuario

```https
  POST /users/
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `userModel` | `UserModel` | **Obrigatório**. Objeto com dados referentes ao usuario |

#### Criar uma tarefa

```https
  POST /tasks/
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `taskModel` | `TaskModel` | **Obrigatório**. Objeto com dados referentes a tarefa |

#### Obter todas as tarefas pelo id de um usuario

```https
  GET /tasks/
```

#### Atualizar uma tarefa pelo id

```https
  PUT /tasks/{id}
```
| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `taskModel` | `TaskModel` | **Obrigatório**. Objeto com dados referentes a tarefa |
