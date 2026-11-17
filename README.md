# 🎬 ScreenMatch - Desafio Frases Aleatórias

Um projeto full-stack desenvolvido para fornecer e exibir frases clássicas de filmes e séries de forma dinâmica. A aplicação consiste em uma API RESTful construída em **Java com Spring Boot** que consulta um banco de dados **PostgreSQL** para sortear frases, e uma interface web moderna e responsiva (Dark Mode / Estilo Cinema) desenvolvida com **HTML, JavaScript e Bootstrap**.

---

## ✨ Funcionalidades

- **Sorteio Dinâmico:** Retorna uma frase aleatória do banco de dados a cada requisição.
- **Interface Imersiva:** Design moderno focado na experiência do usuário, inspirado em plataformas de streaming, utilizando Bootstrap 5.
- **Integração Front-Back:** Comunicação assíncrona utilizando a Fetch API do JavaScript para consumir os endpoints do Spring Boot.
- **Configuração CORS:** API configurada para aceitar requisições do front-end com segurança.

---

## 🛠️ Tecnologias Utilizadas

### Back-end
- **Java** (JDK 17+)
- **Spring Boot**
- **Spring Data JPA** (Mapeamento Objeto-Relacional e persistência de dados)
- **PostgreSQL** (Banco de Dados Relacional)
- **Maven** (Gerenciamento de dependências)

### Front-end
- **HTML5 & CSS3**
- **JavaScript (ES6+)**
- **Bootstrap 5.3** (Layout responsivo e estilização via CDN)

---

## 🚀 Como executar o projeto localmente

### Pré-requisitos
Certifique-se de ter instalado em sua máquina:
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/)
- [PostgreSQL](https://www.postgresql.org/download/)
- Uma IDE de sua preferência (ex: IntelliJ IDEA para o back-end e VS Code para o front-end)

### 1. Configurando o Banco de Dados
Crie um banco de dados no seu PostgreSQL local. Você pode chamá-lo de `screenfrases`.
*O Spring Data JPA (Hibernate) está configurado para criar a tabela de frases automaticamente ao rodar a aplicação.*

### 2. Rodando o Back-end
1. Clone este repositório:
   ```bash
   git clone [https://github.com/Mateuscastelani/desafio-frases-aleatorias.git](https://github.com/Mateuscastelani/desafio-frases-aleatorias.git)
