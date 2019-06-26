
package projetoaterrizar.Model;

import java.util.Date;

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
        return false;
    }
    
    public boolean alteraServiso(Usuario usuario){
        return false;
    }
    
    public Servico aleraDadosServiso(){
        return null;
    }
}
