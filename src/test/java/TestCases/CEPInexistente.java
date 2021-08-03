package TestCases;

import TestBase.TestBase;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import junit.framework.Assert;
import org.testng.annotations.Test;
import static org.testng.TestNGAntTask.Mode.junit;

public class CEPInexistente extends TestBase {

    @Test(expectedExceptions = UnrecognizedPropertyException.class)
    public void ConsultaCEPInexistente(){
        String cep = informacoes.getProperty("cepInexistente");
        boolean cepInexistente = buscaEndereco.verificaCEPNaAPI(cep);
        Assert.assertEquals(false, cep);
    }

}
