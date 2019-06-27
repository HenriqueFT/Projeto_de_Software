package projetoaterrizar.Control;

public class Control {

    public Map<String, String> params;
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

    public void mostrarAviso(String cpf_jah_cadastrado, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
