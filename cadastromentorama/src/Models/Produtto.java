package Models;
import java.util.Date;

public class Produtto {
         private int id;
         private String descricao;
         private double preco;
         private Date dataValidade;

    public Produtto (int id, String descricao,double preco,Date dataValidade){
         this.id = id;
         this.descricao = descricao;
         this.preco = preco;
         this.dataValidade = dataValidade;
    }
    public double getPreco() {
         return preco;
    }
    public Date getDataValidade() {
         return dataValidade;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public int getId(){
        return id;
    }
    public String getDescricao(){
        return descricao;
    }

}
