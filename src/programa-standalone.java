public class Main {
    public static void main(String[] args) {

        int totalEmprestimos = 2;
        int limiteEmprestimos = 3;
        int prazoDevolucao = 14;
        boolean exemplarDisponivel = true;

        if (totalEmprestimos < limiteEmprestimos && exemplarDisponivel) {

          System.out.println("Empréstimo permitido.");
	  System.out.println("Prazo: " + prazoDevolucao + "dias.");
          totalEmprestimos++;

        } else {

            System.out.println("Empréstimo não permitido.");

        }

        System.out.println("Total de empréstimos: " + totalEmprestimos);
    }
}