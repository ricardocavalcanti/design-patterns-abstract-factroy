# 💡 Design Pattern: Abstract Factory (Java)

Este repositório demonstra a aplicação do padrão de projeto Factory Method com um exemplo de sistema de notificações utilizando Java puro.

---

## 🎯 Objetivo

O Factory Method define uma interface para criação de objetos, mas permite que as subclasses decidam qual classe instanciar. Ele promove:
- Baixo acoplamento entre classes;
- Maior extensibilidade (Open/Closed Principle);
- Substituição do uso de `new` por fábricas especializadas.

---

## 📁 Estrutura do Projeto

```
design-patterns-factory/
├── src/
│   └── br/
│       └── com/
│           └── pattern/
│               ├── factory/               <- Interface Notification, classes concretas e fábricas
│               ├── service/               <- Serviço que usa a factory
│               └── Main.java              <- Classe com o exemplo funcional
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
- mvn exec:java -Dexec.mainClass="br.com.pattern.factory.Main"

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







