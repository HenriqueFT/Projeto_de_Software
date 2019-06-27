package projetoaterrizar.Control;

import java.util.HashMap;
import java.util.Map;
import projetoaterrizar.Model.Servico;
import projetoaterrizar.Model.Usuario;

public class Control {
  
    public Map <String, String> params;
    public Usuario usuarioAtual;

    // Método executado pra processar qualquer requisição que vier da view
    public void index(){
        this.loadParams();
        this.setUsuarioAtual();
        // this.callRequestMethod();
    }

    public void loadParams(){
        this.params = new HashMap<String, String>();
        // String jsonParamsFromView = getJSONFromView();
        // for param in jsonParamsFromView set this.params key with value
        // Procedimento não implementado que pegaria as informações passadas pela view
    }

    public String[] selectSenha() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String[] selectCpf() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String[] selectEmail() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setUsuarioAtual() {
        throw new UnsupportedOperationException("Not supported yet.");   
    }

    public  static void mostrarAviso(String cpf_jah_cadastrado, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public static Servico selectServico(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static Servico exibirTela(Servico servico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void save(Servico servico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

}
