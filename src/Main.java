public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!\n");
        Funcionario funcionario = new Funcionario("Carlos", 3000);
        Gerente gerente = new Gerente("Ana", 8000);

        //Poliformismo, posso passar no mesmo metodo, "Classes diferentes"
        Chefe chefe = new Chefe();
        chefe.contratarFuncionario(funcionario);
        chefe.contratarFuncionario(gerente);
    }
}