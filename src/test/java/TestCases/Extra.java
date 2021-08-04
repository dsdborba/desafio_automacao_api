package TestCases;

import TestBase.TestBase;
import org.testng.annotations.Test;

public class Extra extends TestBase {
	
	@Test
	public void RetornaInformacoesDaAPI() {

		buscaEndereco.retornaResultadosDaAPI();
	}

}
