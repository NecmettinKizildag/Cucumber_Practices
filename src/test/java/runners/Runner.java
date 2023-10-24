package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/reports/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@wip",
        dryRun = false
)
public class Runner {
    /*
        Runner class'i bos bir class'dir

        bu class'da asil isi

        Class'da kullandigimiz 2 notasyon yapar

        dryRun = true secildiginde
        Runer istenen feature/scenraio'yu calistirmaaya degil
        eksik adimlari bulmaya odaklanir

        eger eksik adim yoksa
        test PASSED der
        ama bu testin calisip , tum adimlarin gectigini gostemez
        SADECE eksik adim olmadigini gosterir

        EGER eksik adim bulma amacimiz yoksa
        testlerimizi normal olarak CALISTIRMAK istiyorsak
        dryRun = false secilmelidr
     */
}
