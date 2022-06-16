public class Main {
    public static void main(String args[]){
        Cliente cliente = new Cliente("maria", 32, "maria@maria.com");

        cliente.exibirInformacoes();

        Funcionario funcionario = new Funcionario("juliana", "juliana@teste");

        funcionario.setHorasTrabalhadas("JANEIRO", 20);
        funcionario.setSalarioPorHora("janeiro", 50.0);

        Double salario = funcionario.retornarSalarioMensal("janeiro");

        System.out.println("salario: " + salario);

        //TELEVISOR

        Televisor televisor = new Televisor("teste", "teste");

        ControleRemoto controleRemoto = new ControleRemoto(televisor);

        Integer volumeAtual = controleRemoto.mudarVolume(true);

        System.out.println("volume atual: " + volumeAtual);

        controleRemoto.sintonizarCanal(3);
        controleRemoto.trocarCanal(3);

        System.out.println("canal atual " + televisor.getCanalAtual());

        Agenda agenda = new Agenda();

        agenda.adicionarContatos("cinthia", 5435435L);
        agenda.adicionarContatos("will", 5654654L);

        agenda.listarContatos();

        Sistema sistema = new Sistema();

        sistema.iniciarSistema();
    }
}
