package TestBase;



import java.io.IOException;
import java.util.List;

public class BuscaDeEnderecos {

    public BuscaDados buscaDados;
    public Auxi auxi;

    public BuscaDeEnderecos() throws IOException {
        this.buscaDados = new BuscaDados();
        this.auxi = new Auxi();
    }

    public boolean verificaCEPNaAPI(String cep) {
        if (auxi.padraoValidoDeCEP(cep)) {
            Endereco endereco = buscaDados.getCEP();
            boolean enderecoCorreto = enderecoCorreto(endereco,cep);
            if (enderecoCorreto)
                return true;

        } else {
            return false;

        }
        return false;
    }
    private boolean enderecoCorreto(Endereco endereco, String cep) {
        if(endereco.cep.contentEquals(cep)) {

            return true;
        }
        return false;
    }
    public void retornaResultadosDaAPI() {
        List<Endereco> enderecos = buscaDados.getListaDeCEP();
    }

}
