![Java](https://img.shields.io/badge/Java-17-red?logo=java&style=flat-square)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4-brightgreen?logo=springboot&style=flat-square)
![WebSocket](https://img.shields.io/badge/WebSocket-Enabled-blueviolet?logo=websockets&style=flat-square)
![HTML](https://img.shields.io/badge/HTML-5-orange?logo=html5&style=flat-square)
![CSS](https://img.shields.io/badge/CSS-3-blue?logo=css3&style=flat-square)
![JavaScript](https://img.shields.io/badge/JavaScript-ES6-yellow?logo=javascript&style=flat-square)


# 📞 Painel de Chamadas em Tempo Real
<img width="1917" height="1080" alt="Screenshot from 2025-07-16 10-13-50" src="https://github.com/user-attachments/assets/ab7dd853-788e-4602-8467-b7dbd4c2ef98" />




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
```bash
{
  "name": "João da Silva",
  "room": "Consultório 3"
}
```

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
```bash
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
```
📸 Preview
https://imgur.com/a/Cxkf2dV

👤 Autor
Desenvolvido por Uedney C. Morais 🚀
