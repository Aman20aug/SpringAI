# 🤖 Spring AI - Ollama Chat Integration

This project demonstrates a simple REST API implementation using **Spring AI** to interact with a locally hosted LLM via **Ollama**.

## 📂 Project Structure

```bash
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── scribble/
│                   └── SpringAI/
│                       └── OllamaChatController.java
```

## 🚀 Features

* Exposes a `/chat` REST endpoint to interact with an LLM model.
* Uses Spring AI's `OllamaChatModel` to send user queries and return responses.
* Can be integrated with local LLMs via Ollama.

## 📦 Prerequisites

* Java 17+
* Maven or Gradle
* Ollama installed and running locally
* A model pulled and served via Ollama (e.g., `llama2`, `mistral`, `phi`)

```bash
ollama pull llama2
ollama run llama2
```

## 🛠️ Setup Instructions

1. **Clone the repository**:

   ```bash
   git clone https://github.com/Aman20aug/SpringAI
   cd SpringAI
   ```

2. **Configure Spring AI**:

   Add the required dependencies for Spring AI and Ollama integration in `pom.xml` or `build.gradle`.

   Example (Maven):

   ```xml
   <dependency>
       <groupId>org.springframework.ai</groupId>
       <artifactId>spring-ai-ollama-spring-boot-starter</artifactId>
       <version>0.7.0</version>
   </dependency>
   ```

3. **Update application properties** (`application.yml` or `application.properties`):

   ```yaml
   spring:
     ai:
       ollama:
         chat:
           model: llama2
           base-url: http://localhost:11434
   ```

4. **Run the Spring Boot application**:

   ```bash
   ./mvnw spring-boot:run
   ```

5. **Use the chat endpoint**:

   ```bash
   curl -X POST http://localhost:8080/chat -H "Content-Type: text/plain" -d "Tell me a joke"
   ```

## 📄 Example Request & Response

**Request**:

```bash
POST /chat
Content-Type: text/plain

What is the capital of France?
```

**Response**:

```json
"Paris is the capital of France."
```

## 👨‍💻 Author

Developed by \Aman deep Singh — feel free to connect or contribute!

---

Let me know if you'd like this customized for Gradle or with Docker integration.
