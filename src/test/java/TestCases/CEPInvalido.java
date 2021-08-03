package TestCases;

import TestBase.TestBase;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class CEPInvalido extends TestBase {

	@Test
	public void ConsultaCEPInvalido() {
		String cep = informacoes.getProperty("cepInvalido");
		boolean cepInvalido = buscaEndereco.verificaCEPNaAPI(cep);
		Assert.assertEquals(false, cepInvalido);
	}
}
