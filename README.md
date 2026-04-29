# Entrega: Atividade 1 - Desenvolvimento 2
## Lucas Kluska Donini, n° 16 - 2ºH
## Link do repositório: [https://github.com/lucasdonini/atividade-spring1-ds2](https://github.com/lucasdonini/atividade-spring1-ds2)

Pacote raiz do projeto: `com.ds2.atv1`

### Estrutura do Projeto
O projeto é uma aplicação Spring Boot que implementa uma API para calcular o total de uma compra de produtos, com desconto para quantidades maiores que 10 kg. A arquitetura segue o padrão de camadas: Domínio, Aplicação e API.

#### Arquivos Principais:
- **Atv1Application.java**: Classe principal do Spring Boot.
- **Domain**:
  - `Product.java`: Enum com os produtos disponíveis (FRANGO, PERU, CHESTER) e seus preços.
  - `InvalidAmountException.java`: Exceção para quantidades inválidas (menor ou igual a 0).
  - `ProductNotFoundException.java`: Exceção para produtos não encontrados.
- **Application**:
  - `CalculatePurchaseTotalUseCase.java`: Caso de uso para calcular o total da compra com desconto.
- **API**:
  - `PurchaseController.java`: Controller REST para o endpoint `/compra`.
  - `ExceptionHandlerMiddleware.java`: Middleware para tratamento de exceções.

#### Dependências (pom.xml):
- Spring Boot Starter Web MVC (versão 4.0.6)
- Lombok
- Java 26
