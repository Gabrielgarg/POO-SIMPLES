//Herança, Aproveitamento de código
public class Gerente extends Funcionario{

    private long GSetorId;
    private long GEquipId;
    public Gerente(){
        super();
    }
    public Gerente(String nome, double salario){
        super(nome, salario);
    }
    public long getGSetorId() {
        return GSetorId;
    }
    public void setGSetorId(long setorId) {
        GSetorId = setorId;
    }
    public long getGEquipId() {
        return GEquipId;
    }
    public void setGEquipId(long equipId) {
        GEquipId = equipId;
    }

    //Sobrescrevendo o metodo para modificar o print do nome do funcionario
    @Override
    public void exibirFuncionario() {
        System.out.println("Nome: " + getNome() + " (Gerente)");
        System.out.println("Salário: " + getSalario());
        System.out.println("Bonificacao: " + getBonificacao());
    }

    public void exibirGerente() {
        exibirFuncionario();
        System.out.println("Equipe id: " + getGEquipId());
        System.out.println("Setor id: " + getGSetorId());
    }
}
