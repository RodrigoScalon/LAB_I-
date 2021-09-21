
public class Estudante {

    private Integer codigo;
    private String nome, nascimento, email, senha, cidade;

    public Estudante() {
    }

    public Estudante(Integer codigo, String nome, String nascimento, String email, String senha, String cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;
    }

    public Integer getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String toString(){ //chama método exibir dados

        return "\n------------------------------------ " + " \n " + "\t*** ESTUDANTE MATRICULADO *** " + 
                "\nMatrícula: " +getCodigo() + "\nNome: " + getNome() + "\nData Nascimento: " + getNascimento()  
                +"\nE-mail: " + getEmail() + "\nCidade: " + getCidade()  
                + "\n------------------------------------ ";
    }
    
}






