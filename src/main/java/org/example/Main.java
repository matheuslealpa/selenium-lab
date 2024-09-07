package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        // Configura o WebDriver (navegador Chrome)
        var chromeDriver = new ChromeDriver();

        // Define o tempo máximo de espera implícita para localizar elementos no DOM (10 segundos)
        chromeDriver.manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        try {
            // Abre o site do Google
            chromeDriver.get("https://www.google.com");

            // Encontra o campo de busca na página pelo atributo "name"
            var webElement = chromeDriver.findElement(By.name("q"));

            // Insere o termo "Java" na caixa de busca
            webElement.sendKeys("Java");

            // Submete o formulário de busca
            webElement.submit();

            // Aguarda 6 segundos para visualizar os resultados antes de fechar o navegador
            Thread.sleep(6000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fecha o navegador para encerrar a sessão
            chromeDriver.quit();
        }
    }
}
