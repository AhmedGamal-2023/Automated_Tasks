package Pages;

import static Step_Definitions.Hooks.driver;

import DDT.JSonDataReader;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.util.List;
public class P112_ComparePage {
    private final By tableLocator = By.cssSelector("table.compare-products-table");
    JSonDataReader Reader =new JSonDataReader();
    public String Assertion() {
        StringBuilder tableText = new StringBuilder();
        WebElement table = driver.findElement(tableLocator);
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                tableText.append(cell.getText()).append("\n");
            }
        }
        return tableText.toString();
    }
    public void PrintNameOfProducts() throws IOException, ParseException {
        Reader.jsonReader();
        WebElement table = driver.findElement(tableLocator);
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                if (cell.getText().equals(Reader.p1) || cell.getText().equals(Reader.p2)) {
                    System.out.println(cell.getText());
                }
            }
        }
    }
}
