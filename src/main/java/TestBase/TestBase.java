package TestBase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.Properties;

public class TestBase {
	
	protected Properties informacoes;
	protected BuscaDeEnderecos buscaEndereco;
	
	@BeforeClass
	public void setUp() throws IOException {
		
		informacoes = new Auxi().getProperties("config.properties");
		buscaEndereco = new BuscaDeEnderecos();
		
	}
	
	@AfterClass
	public void afterClass() {
		
	}

}
