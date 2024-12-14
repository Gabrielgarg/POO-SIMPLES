//Exemplo de "herança" multipla com interface + herança
public class Chefe extends Gerente implements Lideranca, Marketing{

    //Exemplo de composição(não precisava, porque já herda de gerente, só para mostrar)
    private Funcionario funcionario;
    private Gerente gerente;
    //---
    public Chefe(){
        super();
    }
    public Chefe(String nome, double salario){
        super(nome, salario);
    }

    //Poliformismo
    @Override
    public void contratarFuncionario(Funcionario funcionario){
        System.out.println("Contratando: " + funcionario.getNome());

        if (funcionario instanceof Gerente) {
            Gerente gerente = (Gerente) funcionario;
            gerente.setGEquipId(1);
            gerente.setGSetorId(1);
            gerente.exibirGerente();
        }
        else{
            funcionario.exibirFuncionario();
        }
    }
    //----

    @Override
    public void remanejarFuncionario(Funcionario funcionario, long equipeId, long setorId){
        System.out.println("O funcionário será remanejado para a equipe id: " + equipeId);

        if (funcionario instanceof Gerente) {
            Gerente gerente = (Gerente) funcionario;
            gerente.setGEquipId(equipeId);
            gerente.setGSetorId(setorId);
            gerente.exibirGerente();
        }
        else {
            funcionario.setEquipId(equipeId);
            funcionario.setSetorId(setorId);
            funcionario.exibirFuncionario();
        }
    }

    @Override
    public void publicarAdsFacebook(Publicacao publicacao){
        System.out.println("Publicando Ads Facebook");
    }
}
