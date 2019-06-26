package projetoaterrizar.Model;

import projetoaterrizar.Control.Control;

public class Usuario {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;

    public Usuario(String nome, String cpf, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        //this.id = DB.generateID(); Metodo competado pelo banco de dados 
    }
    
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        Control control = new Control();
        this.senha = control.makeHash(senha);
    }
    
    public void selfDestruct() throws Throwable{
        this.finalize();
    }
    
    public Cliente cadastrarCliente(String nome, String cpf, String email, String senha){
        Control control = new Control();
        
        if(this.validaDadosUsuario()){
            String senhaHash = control.makeHash(senha);
            Cliente cliente = new Cliente(nome,cpf,email,senhaHash);
            return cliente;
        }
        
        return null;
    }
    
    public boolean validaDadosUsuario(){
        if(validaUsuario(this.getCpf(),this.getEmail()) && validaSenha(this.getSenha())){return true;}
        return false;
    }
    
    public boolean validaSenha(String senha){
        Control control = new Control();
        if(senha.length() < 8){
            control.mostrarAviso("Senha deve conter pelo menos 8 caracteres",1);
            return false;
        }
        
        return true;
    }
    
    public boolean validaUsuario(String cpf, String email){
        Control control = new Control();
        String cpfs[] = control.selectCpf();
        String emails[] = control.selectEmail();
        
        for (int i = 0; i < cpfs.length; i++) {
            if(cpfs[i].equals(cpf)){
                control.mostrarAviso("CPF jah cadastrado",1);
                return false;
            }
        }
        for (int i = 0; i < emails.length; i++) {
           if(emails[i].equals(email)){
               control.mostrarAviso("Email jah cadastrado",1);
               return false;
           }
        }
        
        return false;
    }
    
}
