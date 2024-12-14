//Exemplo de encapsulamento, protejendo diretamente os atributos internos da classe
public class Funcionario {
    private long Id;
    private String Nome;
    private double Salario;

    private double Bonificacao;

    private long EquipeId;

    private long SetorId;

    public Funcionario() {
    }

    //Construtor de 2 parametros
    public Funcionario(String nome, double Salario) {
        this.Nome = nome;
        this.Salario = Salario;
    }

    public long getId() {
        return Id;
    }
    public void setId(long Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public double getBonificacao() {
        return Bonificacao;
    }

    public void setBonificacao(double Bonificacao) {
        this.Bonificacao = Bonificacao;
    }

    public long getSetorId() {
        return SetorId;
    }
    public void setSetorId(long setorId) {
        SetorId = setorId;
    }
    public long getEquipId() {
        return EquipeId;
    }
    public void setEquipId(long equipId) {
        EquipeId = equipId;
    }

    public void exibirFuncionario() {
        System.out.println("Nome: " + Nome);
        System.out.println("Salario: " + Salario);
        System.out.println("Bonificacao: " + Bonificacao + "\n");
    }
}
