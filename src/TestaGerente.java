public class TestaGerente {

    public static void main(String args[]) {

        Autenticavel referencia = new Administrador();

        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("23546675656");
        g1.setSalario(5000);

        g1.setSenha(1111);
        boolean autenticou = g1.autentica(1111);

        System.out.println(g1.getNome());
        System.out.println(g1.getSalario());
        System.out.println(autenticou);
        System.out.println(g1.getBonificacao());

    }
}
