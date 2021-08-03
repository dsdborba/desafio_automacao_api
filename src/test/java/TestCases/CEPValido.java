package TestCases;



import TestBase.TestBase;
import junit.framework.Assert;
import org.testng.annotations.Test;


public class CEPValido extends TestBase {
	
	
	@Test
	public void testaCEPvalido() {
		String cep = informacoes.getProperty("cepValido");
		boolean cepEncontrado = buscaEndereco.verificaCEPNaAPI(cep);
		Assert.assertEquals(false, cepEncontrado);
		
		
	}


}
