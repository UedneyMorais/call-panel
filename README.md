📞 Painel de Chamadas em Tempo Real
Este projeto é um sistema simples de painel de senhas (estilo SUS) construído com Spring Boot e WebSocket, que permite exibir chamadas em tempo real em uma tela de painel. O frontend é construído com HTML, CSS e JavaScript puro e se conecta ao backend via WebSocket.

🛠️ Tecnologias Utilizadas
Backend
Java 17

Spring Boot 3.4.5

spring-boot-starter-web

spring-boot-starter-websocket

spring-boot-starter-data-jpa

PostgreSQL

Lombok

WebSocket (STOMP com SockJS)

Docker

Frontend
HTML5

CSS3 (com animações e efeitos visuais)

JavaScript (consumindo WebSocket com STOMP/SockJS)

📦 Estrutura do Projeto
bash
Copiar
Editar
call-panel/
│
├── src/
│   ├── main/
│   │   ├── java/com/example/call_panel/
│   │   │   ├── config/           # Configuração do WebSocket
│   │   │   ├── controller/       # Endpoint REST
│   │   │   ├── model/
│   │   │   │   ├── dto/          # Objeto de transferência (CallDTO)
│   │   │   │   ├── entity/       # Entidade Call
│   │   │   ├── repository/       # CallRepository
│   │   │   ├── service/          # CallService
│   ├── resources/
│   │   ├── static/               # index.html (Frontend)
│   │   ├── application.properties
│
├── Dockerfile
├── docker-compose.yml
└── pom.xml
🖥️ Funcionamento
O usuário faz uma chamada via POST em /call com nome e consultório.

O backend persiste a chamada e envia via WebSocket no tópico /topic/calls.

O frontend (HTML/CSS/JS) escuta esse tópico e exibe a chamada na tela.

Um histórico das últimas 5 chamadas também é exibido.

▶️ Executando Localmente
Requisitos
Java 17+

Maven

Docker + Docker Compose

Backend
bash
Copiar
Editar
# Clone o repositório
git clone https://github.com/seu-usuario/call-panel.git
cd call-panel

# Inicie o PostgreSQL com Docker
docker-compose up -d

# Compile e execute o backend
./mvnw spring-boot:run
Frontend
O frontend está em src/main/resources/static/index.html e é servido automaticamente pelo Spring Boot. Basta acessar:

arduino
Copiar
Editar
http://localhost:8080
📡 Testando a API
http
Copiar
Editar
POST /call
Content-Type: application/json

{
  "name": "João da Silva",
  "room": "Consultório 3"
}
⚙️ Configuração WebSocket
Endpoint: /ws

Tópico: /topic/calls

🐳 Docker
docker-compose.yml
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
📁 application.properties
properties
Copiar
Editar
spring.application.name=call-panel

# Datasource
spring.datasource.url=jdbc:postgresql://localhost:5432/call_panel
spring.datasource.username=postgres
spring.datasource.password=password

# Hibernate
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
📸 Preview
<!-- substitua por uma imagem do sistema se desejar -->

🙋‍♂️ Autor
Desenvolvido com 💙 por Uedney C. Morais
