
package projetoaterrizar.Model;

import java.util.Date;
import projetoaterrizar.Control.Control;

public class Servico {
    private int id;
    private double custo;
    private int vagas;
    private Date date;
    private String lugar;
    private double desconto;

    public int getId() {
        return id;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public boolean validaDadosServico(){
        if(this.custo < 0){return false;}
        if(this.vagas < 0){return false;}
        Date today = new Date();
        if(this.date.compareTo(today)< 0){return false;}
        if(this.desconto < 0){return false;}
        
        return true;
    }
    
    public boolean alteraServiso(Usuario usuario){
        Servico servico = Control.selectServico(usuario);
        Servico newServico = Control.exibirTela(servico);
        if (newServico.validaDadosServico()){
            servico.alteraDadosServiso(newServico);
        }else{
            Control.mostrarAviso("Informacao errada, confira edicoes feitas",1);
        }
        
        return false;
    }
    
    public void alteraDadosServiso(Servico servico){
        this.custo = servico.custo;
        this.vagas = servico.vagas;
        this.date = servico.date;
        this.lugar = servico.lugar;
        this.desconto = servico.desconto;
        Control.save(servico);
    }
}
