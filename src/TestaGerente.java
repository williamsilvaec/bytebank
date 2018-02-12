public class TestaGerente {

    public static void main(String args[]) {

        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("23546675656");
        g1.setSalario(5000);

        g1.setSenha(1111);
        boolean autenticou = g1.autentica(1111);

        System.out.println(g1.getNome());
        System.out.println(g1.getBonificacao());
        System.out.println(autenticou);
    }
}
