public class Cidade {

    private Integer cCodigo;
    private String descricao, UF, cidade;

    public Cidade() {
    }

    public Cidade(Integer codigo, String descricao, String UF, String cidade) {
        this.cCodigo = codigo;
        this.descricao = descricao;
        this.UF = UF;
        this.cidade = cidade;
    }

    public Integer getCCodigo() {
        return this.cCodigo;
    }

    public void setCCodigo(Integer cCodigo) {
        this.cCodigo = cCodigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUF() {
        return this.UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String toString(){  //chama método para exibir os dados
 
    return  " \n " + "\t*** CIDADE *** " + "\nCódigo da Cidade: " +getCCodigo() 
            + "\nDescrição: " +getDescricao() + "\nEstado: " +getUF() +
            "\n------------------------------------ ";
    }

}