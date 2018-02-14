
// não pode instanciar um objeto dessa classe porque ela é abstrata
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    // método sem corpo, não há implementação
    // As classes filhas são obrigadas a implementar esse método
    public abstract double getBonificacao();

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
