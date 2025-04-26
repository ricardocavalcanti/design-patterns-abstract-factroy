# 💡 Design Pattern: Abstract Factory (Java)

Este repositório demonstra a aplicação do padrão de projeto Abstract Factory com um exemplo de sistema de notificações utilizando Java puro.

---

## 🎯 Objetivo

Fornecer uma interface para criar famílias de objetos relacionados sem depender de classes concretas diretamente.
- Código aberto para extensão e fechado para modificação (OCP).
- Facilita a criação de sistemas multiplataforma.
- Alto desacoplamento entre cliente e produtos concretos.

---

## 📁 Estrutura do Projeto

```
design-patterns-abstract-factory/
├── src/
│   └── br/
│       └── com/
│           └── pattern/
│               ├── factory/                  <- Só as Abstract Factories e as Fábricas concretas
│               │   ├── NotificationFactory.java
│               │   ├── MobileNotificationFactory.java
│               │   └── WebNotificationFactory.java
│               ├── products/                 <- Produtos (interfaces e implementações concretas)
│               │   ├── MessageNotification.java
│               │   ├── AlertNotification.java
│               │   ├── SMSNotification.java
│               │   ├── PushNotification.java
│               │   ├── EmailNotification.java
│               │   ├── WebPushNotification.java
│               ├── service/                  <- Serviços que usam as factories
│               │   └── NotificationApplication.java
│               └── Main.java
├── .gitignore
├── README.md
```
---

## ⚙️ Tecnologias

- Java 17
- Maven

---

## ▶️ Como executar
### Compile
- mvn compile

### Execute
- mvn exec:java -Dexec.mainClass="br.com.pattern.Main"

---

## 🧪 Exemplo de saída
Enviando notificação por E-MAIL
Enviando notificação por SMS

---

## 📚 Conceitos aplicados

- Programação Orientada a Objetos: Estruturação do código com foco em classes, objetos e responsabilidades bem definidas.

- Encapsulamento de comportamentos: A lógica de envio de notificações está encapsulada nas implementações concretas da interface Notification.

- Interface como contrato: A interface Notification define o contrato que todas as notificações devem seguir.

- Inversão de dependência: As classes dependem de abstrações (NotificationFactory e Notification) ao invés de implementações concretas.

- Factory Method Pattern: Padrão utilizado para delegar a criação de objetos às subclasses.

- Princípio OCP (Open/Closed Principle): O sistema pode ser estendido com novos tipos de notificação sem modificar o código existente.

---







