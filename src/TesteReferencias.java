public class TesteReferencias {

    public static void main(String args[]) {

        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("23546675656");
        g1.setSalario(5000.0);

        Funcionario f1 = new Funcionario();
        f1.setNome("Nico Steppat");
        f1.setSalario(2000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        ControleBonificacao cb = new ControleBonificacao();
        cb.registra(g1);
        cb.registra(f1);
        cb.registra(ev);

        System.out.print(cb.getSoma());

    }
}
