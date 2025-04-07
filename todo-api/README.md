# 📋 To-Do API

API RESTful simples para gerenciamento de tarefas (To-Do List), desenvolvida com Spring Boot e PostgreSQL.


## 🚀 Funcionalidades

- ✅ Criar tarefas
- 📃 Listar tarefas
- ✏️ Atualizar descrição
- ✅ Marcar como concluída
- 🗑️ Deletar tarefas


## 🔧 Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- Bean Validation
- PostgreSQL
- Maven



## ⚙️ Como rodar o projeto localmente

### Pré-requisitos:
- Java 17+
- PostgreSQL rodando
- Maven

### Passos:

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/todo-api.git
cd todo-api

2. Configure o banco de dados PostgreSQL:
```sql
CREATE DATABASE todo_db;
```

3. Altere `src/main/resources/application.properties` com seu usuário e senha:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/todo_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

4. Rode o projeto:

```bash
./mvnw spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

---

## 📂 Endpoints

| Método | Rota                  | Descrição                      |
|--------|-----------------------|--------------------------------|
| POST   | `/tarefas`            | Criar nova tarefa              |
| GET    | `/tarefas`            | Listar todas as tarefas        |
| PUT    | `/tarefas/{id}`       | Atualizar descrição            |
| PUT    | `/tarefas/{id}/concluir` | Marcar tarefa como concluída   |
| DELETE | `/tarefas/{id}`       | Deletar tarefa                 |


