import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AutomacaoE2e {

	private WebDriver driver;

	@Dado("^que estou acessando o menu dresses$")
	public void que_estou_acessando_o_menu_dresses() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Alan\\EclipseProject\\ExercicioCucumber\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")).click();
	}

	@Quando("^seleciono o produto Printed Dress$")
	public void seleciono_o_produto_Printed_Dress() throws Throwable {
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,850)", "");
		Actions builder = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(
				"//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
		builder.moveToElement(element).build().perform();
		driver.findElement(
				By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[2]/span[1]"))
				.click();
	}

	@Quando("^abro a página de detalhes do produto$")
	public void abro_a_página_de_detalhes_do_produto() throws Throwable {
		String texto = driver.findElement(By.xpath("//h3[contains(text(),'Data sheet')]")).getText();
		Assert.assertEquals("DATA SHEET", texto);
	}

	@Então("^os valores são exibidos no datasheet$")
	public void os_valores_são_exibidos_no_datasheet() throws Throwable {
		String textCompositions = driver.findElement(By.xpath("//td[contains(text(),'Cotton')]")).getText();
		Assert.assertEquals("Cotton", textCompositions);
		String textStyles = driver.findElement(By.xpath("//td[contains(text(),'Girly')]")).getText();
		Assert.assertEquals("Girly", textStyles);
		String textProperties = driver.findElement(By.xpath("//td[contains(text(),'Colorful Dress')]")).getText();
		Assert.assertEquals("Colorful Dress", textProperties);
	}

	@Dado("^que estou realizando um fluxo de compra$")
	public void que_estou_realizando_um_fluxo_de_compra() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^pesquiso$")
	public void pesquiso() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^coloco um produto no carrinho$")
	public void coloco_um_produto_no_carrinho() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^finalizo a compra$")
	public void finalizo_a_compra() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Então("^gero evidências de automação$")
	public void gero_evidências_de_automação() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}