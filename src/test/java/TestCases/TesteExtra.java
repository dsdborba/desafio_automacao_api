package TestCases;

import TestBase.TestBase;
import org.testng.annotations.Test;

public class TesteExtra extends TestBase {
	
	@Test
	public void RetornaInformacoesDaAPI() {

		buscaEndereco.retornaResultadosDaAPI();
	}

}
