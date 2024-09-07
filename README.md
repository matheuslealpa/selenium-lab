# selenium-lab

## Projeto de Automação com Selenium

Este projeto Java usa Selenium WebDriver para automatizar uma busca simples no Google pelo termo "Java".

## Pré-requisitos

Antes de rodar o projeto, certifique-se de que você tem:

1. **Java JDK 17+** instalado.
2. **Maven** configurado para gerenciamento de dependências.

### Dependências

No arquivo `pom.xml`, adicione a seguinte dependência para o Selenium WebDriver:

```xml
<dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>${selenium.version}</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-grid</artifactId>
            <version>${selenium.version}</version>
        </dependency>
    </dependencies>
```