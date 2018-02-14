public class TesteFuncionario {

    public static void main(String args[]) {

        Funcionario nico = new Gerente();
        nico.setNome("Nico Steppat");
        nico.setCpf("124234154");
        nico.setSalario(2600.0);

        System.out.println("Nome: "+ nico.getNome());
        System.out.println("Bonificação: " + nico.getBonificacao());

    }
}
