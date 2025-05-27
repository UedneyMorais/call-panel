# 📞 Painel de Chamadas em Tempo Real

Sistema simples de **painel de senhas** (estilo SUS), construído com **Spring Boot**, **WebSocket**, e **HTML/CSS/JS**. Permite exibir chamadas em tempo real em uma tela pública.

---

## 🛠️ Tecnologias Utilizadas

### Backend
- Java 17
- Spring Boot 3.4.5:
  - `spring-boot-starter-web`
  - `spring-boot-starter-websocket`
  - `spring-boot-starter-data-jpa`
- PostgreSQL
- WebSocket (STOMP com SockJS)
- Lombok
- Docker

### Frontend
- HTML5
- CSS3 (com animações visuais)
- JavaScript (STOMP/WebSocket)
- 
## 🚀 Como Executar

### Pré-requisitos
- Java 17+
- Maven
- Docker e Docker Compose

### Passos

```bash
# Clone o projeto
git clone https://github.com/seu-usuario/call-panel.git
cd call-panel
```
# Inicie o banco de dados
```bash
docker-compose up -d
```
# Compile e execute o backend
```bash
./mvnw spring-boot:run
```
Acesse o frontend no navegador:

http://localhost:8080
📡 WebSocket
Endpoint WebSocket: /ws

Tópico: /topic/calls

🧪 Testando a API
Endpoint: POST /call

Exemplo de payload:

json
Copiar
Editar
{
  "name": "João da Silva",
  "room": "Consultório 3"
}

⚙️ application.properties
```bash
spring.application.name=call-panel
spring.datasource.url=jdbc:postgresql://localhost:5432/call_panel
spring.datasource.username=postgres
spring.datasource.password=password

spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

🐳 docker-compose.yml
yaml
Copiar
Editar
version: '3.8'
services:
  db:
    image: postgres:15
    environment:
      POSTGRES_DB: call_panel
      POSTGRES_USER: postgres
      POSTGRES_PASSWORD: password
    ports:
      - "5432:5432"
📸 Preview
<!-- Substitua o link abaixo por uma imagem real do seu projeto -->

👤 Autor
Desenvolvido por Seu Nome 🚀
