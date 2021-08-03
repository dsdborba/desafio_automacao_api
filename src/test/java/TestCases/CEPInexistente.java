package TestCases;

import TestBase.TestBase;
import com.aventstack.extentreports.Status;
import junit.framework.Assert;
import org.testng.annotations.Test;


public class CEPInexistente extends TestBase {
	
	@Test
	public void ConsultaCEPInexistente() {
		String cep = informacoes.getProperty("cepInexistente");
		boolean cepInexistente = buscaEndereco.verificaCEPNaAPI(cep);
		Assert.assertEquals(false, cepInexistente);
		
	}

}
